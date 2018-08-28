package com.spring.demo;

import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.ContextLoaderListener;

import com.dao.UserDao;
import com.javabean.Car;
import com.javabean.DemoWorker;
import com.service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo1 {
	
	@Test
	public void demoSave() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userdao = (UserDao) applicationContext.getBean("userDao");
		userdao.save();
	}
	
	@Test
	public void democar() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car car = (Car) applicationContext.getBean("Car");
		System.out.println(car);
	}
	
	//SpEL注入对象属性
	@Test
	public void TestSpEL() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		DemoWorker worker = (DemoWorker)applicationContext.getBean("worker");
		System.out.println(worker);
	}
	
	//AOP测试
	@Resource(name="Car")
	private Car car;
	@Test
	public void TestAOP() {
		car.run();
		car.stop();
	}
	
	//Test转账
	@Resource(name="AccountService")
	private AccountService accountService;
	@Test
	public void testtransfer() {
		accountService.transfer("lisi", "zhangsan", 100);
	}
}
