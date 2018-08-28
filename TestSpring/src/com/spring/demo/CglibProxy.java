package com.spring.demo;

import java.lang.reflect.Method;

import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import com.javabean.CarImpl;

public class CglibProxy {
	public CarImpl carimpl;
	public Object testcglib(CarImpl car) {
		this.carimpl = car;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(carimpl.getClass());
		enhancer.setCallback(new MethodInterceptor() {
			
			@Override
			public Object intercept(Object proxy, Method method, Object[] obj, MethodProxy methodProxy) throws Throwable {
				if(method.getName().equals("stop")) {
					System.out.println("proxy stop");
					return methodProxy.invokeSuper(proxy, obj);
				}
				return methodProxy.invokeSuper(proxy, obj);
			}
		});
		Object createproxy = enhancer.create();
		return createproxy;
	}
	
	@Test
	public void testcglibproxy() {
		CarImpl carimpl = (CarImpl) new CglibProxy().testcglib(new CarImpl());
		carimpl.run();
		carimpl.stop();
	}
}
