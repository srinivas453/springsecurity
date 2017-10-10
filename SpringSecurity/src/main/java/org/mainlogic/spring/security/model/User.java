
package org.mainlogic.spring.security.model;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

/**
 * Application user model. Contains basic user information.
 */

@SuppressWarnings("serial")
public class User implements Serializable {

	private boolean loggedIn = false;

	private String userName;

	private String password;

	private String firstName;
	private String lastName;
	private String emailAddress;

	private boolean active = false;
	private boolean systemAccount = false;

	private Date lastAccessed;

	@Override
	public String toString() {

		return "User [" + userName + "]";
	}

	public String getUserName() {

		return userName;
	}

	public void setUserName(String userName) {

		this.userName = userName;
	}

	public String getPassword() {

		return password;
	}

	public void setPassword(String password) {

		this.password = password;
	}

	public String getFirstName() {

		return firstName;
	}

	public void setFirstName(String firstName) {

		this.firstName = firstName;
	}

	public String getLastName() {

		return lastName;
	}

	public void setLastName(String lastName) {

		this.lastName = lastName;
	}

	public String getEmailAddress() {

		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {

		this.emailAddress = emailAddress;
	}

	public boolean isActive() {

		return active;
	}

	public void setActive(boolean active) {

		this.active = active;
	}

	public boolean isSystemAccount() {

		return systemAccount;
	}

	public void setSystemAccount(boolean systemAccount) {

		this.systemAccount = systemAccount;
	}

	public Date getLastAccessed() {

		return lastAccessed;
	}

	public void setLastAccessed(Date lastAccessed) {

		this.lastAccessed = lastAccessed;
	}

	public User() {

		super();
	}

	public boolean isLoggedIn() {

		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {

		this.loggedIn = loggedIn;
	}

	public String getUserDisplayName() {

		if (StringUtils.isBlank(this.getUserName()) && StringUtils.isBlank(this.getLastName()) && StringUtils.isBlank(this.getFirstName()))
			return "Unknown User";

		if (StringUtils.isBlank(this.getLastName()))
			return this.getFirstName();

		if (StringUtils.isBlank(this.getFirstName()))
			return this.getLastName();

		return this.getLastName() + " " + this.getFirstName();
	}
}