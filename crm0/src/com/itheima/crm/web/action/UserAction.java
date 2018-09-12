package com.itheima.crm.web.action;

import com.itheima.crm.domain.User;
import com.itheima.crm.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
/**
 * 用户管理的Action的类
 * @author jt
 *
 */
public class UserAction extends ActionSupport implements ModelDriven<User> {
	// 模型驱动使用的对象
	private User user = new User();
	@Override
	public User getModel() {
		return user;
	}

	// 注入Service:
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * 用户注册的方法:regist
	 */
	public String regist(){
		userService.regist(user);
		return "LOGIN";
	}
	
	//用户登录方法
	public String login() {
		User existUser = userService.login(user);
		if(existUser==null) {
			//用户不存在，登录失败
			this.addActionError("用户不存在");
			return "LOGIN";
		}else {
			//登录成功
			ActionContext.getContext().getSession().put("existUser", existUser);
			return "SUCCESS";
		}
		
	}
}
