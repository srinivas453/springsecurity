package org.mainlogic.spring.security.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//@Service
//@Transactional
public class ApplicationUserDetailsService implements UserDetailsService {
	
	//@Autowired
	private ApplicationUserDao applicationUserDao;

	public void setApplicationUserDao(ApplicationUserDao applicationUserDao) {
		this.applicationUserDao = applicationUserDao;
	}

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		return applicationUserDao.findByUserName(userName);
	}

}
