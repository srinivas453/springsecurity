package org.mainlogic.spring.security.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

//@Component("applicationAuthenticationProvider")
public class ApplicationAuthenticationProvider implements AuthenticationProvider {

	// @Autowired
	private ApplicationUserDetailsService applicationUserDetailsService;

	public void setApplicationUserDetailsService(ApplicationUserDetailsService applicationUserDetailsService) {
		this.applicationUserDetailsService = applicationUserDetailsService;
	}

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		UserDetails user = null;
		
		try {
		String userName = authentication.getName();

		user = applicationUserDetailsService.loadUserByUsername(userName);
		
		if(user == null || user.getPassword() != null && !user.getPassword().equals(authentication.getCredentials().toString()))
			throw new BadCredentialsException("Invalid credentials");
		
		} catch (Exception ex) {
			
			System.out.println("Exception:" + ex.getMessage());
		}
		
		return new UsernamePasswordAuthenticationToken(user, authentication.getCredentials());
	}

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return true;
	}

}
