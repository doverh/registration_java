package com.dover.authentication.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dover.authentication.model.Login;
import com.dover.authentication.model.User;

public class UserDaoImpl implements UserDao {
	
	SessionFactory sessionFactory;
	@Override
	public void register(User user) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(user);
	}

	@Override
	public User validateUser(Login login) {
		// TODO Auto-generated method stub
		List<User> users = new ArrayList<User>();
		users = sessionFactory.getCurrentSession()
		.createQuery("from User where username=? and password=?")
		.setParameter(0, login.getUsername())
		.setParameter(1, login.getPassword())
		.list();

		if (users.size() > 0) {
				return users.get(0);
			} else {
				return null;
			}
	}

}
