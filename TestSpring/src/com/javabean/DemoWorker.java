package com.javabean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.orm.hibernate5.support.OpenSessionInViewFilter;

public class DemoWorker {
	private String name;
	private Car car;
	@Override
	public String toString() {
		return "DemoWorker [name=" + name + ", car=" + car + "]";
	}
	public String getName() {
		return name;
	}
	@Value("王东1111")
	public void setName(String name) {
		this.name = name;
	}
	public Car getCar() {
		return car;
	}
	@Autowired
	@Qualifier(value="Car")
	public void setCar(Car car) {
		this.car = car;
	}
}
