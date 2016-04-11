package com.djx.Test;

import static org.junit.Assert.*;

import org.apache.catalina.User;
import org.apache.catalina.core.ApplicationContext;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.djx.impl.UserServiceImpl;

public class Test {

	@Before
	public void setUp() throws Exception {
	}

	@org.junit.Test
	public void test() {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		UserServiceImpl service=(UserServiceImpl) context.getBean("userService");
		com.djx.model.User user=new com.djx.model.User();
		user.setUsername("≤‚ ‘”√ªß");
		user.setPassword("1234");
		service.add(user);
	}

}
