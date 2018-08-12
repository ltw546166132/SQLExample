package com.struts2;

public class HelloAction {
	/**
	 * 提供方法:
	 * 方法名固定
	 * 共有的 返回值是String类型，方法名execute 方法中不能有参数
	 * @return
	 */
	public String execute() {
		System.out.println("Action执行了。。。");
		return null;
	}
}
