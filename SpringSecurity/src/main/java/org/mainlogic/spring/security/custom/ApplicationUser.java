package org.mainlogic.spring.security.custom;

import java.util.Collection;

import javax.persistence.Entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

@SuppressWarnings("serial")
@Entity
public class ApplicationUser extends User {

	public ApplicationUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
	}
}
