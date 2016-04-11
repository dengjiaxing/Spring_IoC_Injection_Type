package com.djx.impl;

import org.apache.catalina.User;

import com.djx.dao.UserDao;
import com.djx.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(com.djx.model.User user){
		// TODO Auto-generated method stub
		userDao.Save(user);
	}

}
