package com.javabean;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CarEnhance {
	@Before(value="CarEnhance.before()")
	public void enhancerun() {
		System.out.println("驱动前路况检测");
	}
	
	@Around(value="CarEnhance.aroundstop()")
	public Object enhancestop(ProceedingJoinPoint pj) throws Throwable {
		System.out.println("环绕通知前");
		Object obj = pj.proceed();
		System.out.println("环绕通知后");
		return obj;
	}
	
	@Pointcut(value="execution(* com.javabean.CarImpl.run(..))")
	public void before() {}
	
	@Pointcut(value="execution(* com.javabean.CarImpl.stop(..))")
	public void aroundstop() {}
}
