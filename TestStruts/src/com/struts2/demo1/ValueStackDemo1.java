package com.struts2.demo1;

import org.apache.struts2.ServletActionContext;

import com.javabean.UserBean;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class ValueStackDemo1 extends ActionSupport{

	@Override
	public String execute() throws Exception {
		//通过ActionContext获得
		ValueStack valueStack1 = ActionContext.getContext().getValueStack();
		//通过request对象获得
		ValueStack valueStack2 = (ValueStack) ServletActionContext.getRequest().getAttribute(ServletActionContext.STRUTS_VALUESTACK_KEY);
		valueStack1.push(new UserBean("aaapush", "123push"));
		valueStack2.set("user1", new UserBean("aaa", "123"));
		valueStack2.set("user2", new UserBean("bbb", "321"));
		return SUCCESS;
	}
	
}
