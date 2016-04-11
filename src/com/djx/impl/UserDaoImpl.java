package com.djx.impl;

import org.apache.catalina.User;

import com.djx.dao.UserDao;

public class UserDaoImpl implements UserDao {

	@Override
	public void Save(com.djx.model.User user) {
		// 为了简化仅打印User对象的用户名，并未进行真正的数据库操作。
		System.out.println("username:"+user.getUsername()+"saved in Oracle!");
	}

}
