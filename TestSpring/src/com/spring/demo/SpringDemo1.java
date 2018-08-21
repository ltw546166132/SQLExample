package com.spring.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.dao.UserDao;

public class SpringDemo1 {
	
	@Test
	public void demoSave() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userdao = (UserDao) applicationContext.getBean("userDao");
		userdao.save();
	}
}
