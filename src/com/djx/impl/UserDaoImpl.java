package com.djx.impl;

import org.apache.catalina.User;

import com.djx.dao.UserDao;

public class UserDaoImpl implements UserDao {

	@Override
	public void Save(com.djx.model.User user) {
		// Ϊ�˼򻯽���ӡUser������û�������δ�������������ݿ������
		System.out.println("username:"+user.getUsername()+"saved in Oracle!");
	}

}
