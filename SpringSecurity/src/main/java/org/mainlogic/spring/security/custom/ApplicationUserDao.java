package org.mainlogic.spring.security.custom;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.mainlogic.spring.security.entity.User;
import org.mainlogic.spring.security.entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//@Repository
public class ApplicationUserDao {

	// @Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public ApplicationUser findByUserName(String userName) {
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		User user = session.find(User.class, userName);
		Set<UserRole> roles = user.getRoles();
		
		tx.commit();
		session.close();

		return new ApplicationUser(user.getUserName(), user.getPassword(), roles);
	}
}
