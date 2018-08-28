package com.spring.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.junit.Test;
import com.javabean.Car;
import com.javabean.CarImpl;

public class JDKProxy {
	public Car car;
	public Object carjdkproxy(Car car) {
		this.car = car;
		Object newProxyInstance = Proxy.newProxyInstance(car.getClass().getClassLoader(), car.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				if(method.getName().equals("run")) {
					System.out.println("car run start");
					return method.invoke(car, args);
				}
				return method.invoke(car, args);
			}
		});
		return newProxyInstance;
	}
	
	@Test
	public void testjdkproxy() {
		Car carjdkproxy = (Car) new JDKProxy().carjdkproxy(new CarImpl());
		carjdkproxy.run();
		carjdkproxy.stop();
	}
	
}
