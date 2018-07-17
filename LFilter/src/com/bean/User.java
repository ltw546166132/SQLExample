package com.bean;

import java.io.Serializable;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

public class User implements Serializable,HttpSessionActivationListener{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void sessionWillPassivate(HttpSessionEvent se) {
	}
	@Override
	public void sessionDidActivate(HttpSessionEvent se) {
	}
}
