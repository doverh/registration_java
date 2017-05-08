package com.dover.authentication.service;

import com.dover.authentication.dao.UserDao;
import com.dover.authentication.model.Login;
import com.dover.authentication.model.User;

public class UserServiceImpl implements UserService {
	
	//Create an userDao object to use methods
	UserDao userDao;
	@Override
	public void register(User user) {
		userDao.register(user);
	}

	@Override
	public User validateUser(Login login) {
		// TODO Auto-generated method stub
		return userDao.validateUser(login);
	}

}
