package com.struts2.demo1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Struds2demo1 extends ActionSupport{
	@Override
	public String execute() throws Exception {
		System.out.println("执行ActionDemo1");
		ActionContext context = ActionContext.getContext();
		//调用ActionContext中的方法
		//类似于Map<String,String[]> request.getParameterMap();
		Map<String, Object> parameters = context.getParameters();
		Set<String> keySet = parameters.keySet();
		Iterator<String> iterator = keySet.iterator();
		for(;iterator.hasNext();) {
			String key = iterator.next();
			String object[] = (String[]) parameters.get(key);
			System.out.println(key+"---"+Arrays.toString(object));
		}
		
		//二，向域对象中存入数据
		context.put("reqName", "reqValue");
		context.getSession().put("sessionName", "sessionValue");
		context.getApplication().put("appName", "appValue");
		return SUCCESS;
	}
	
	public String servletapi() {
		System.out.println("servletapi方法");
		HttpServletRequest request = ServletActionContext.getRequest();
		Map<String, String[]> parameterMap = request.getParameterMap();
		Set<String> keySet = parameterMap.keySet();
		for (String string : keySet) {
			String[] strings = parameterMap.get(string);
			System.out.println(string+"---"+Arrays.toString(strings));
		}
		
		//向域对象中保存数据
		//向request中保存数据
		request.setAttribute("reqName", "value");
		//想session域中保存数据
		request.getSession().setAttribute("sessionName", "sessionValue");
		//向servletcontext中存数据
		request.getServletContext().setAttribute("appName", "contextValue");
		return SUCCESS;
	}
	
	public String find() {
		System.out.println("执行find方法");
		return NONE;
	}
	
	public String update() {
		System.out.println("执行update方法");
		return NONE;
		
	}
}
