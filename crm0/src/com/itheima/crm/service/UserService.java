package com.itheima.crm.service;

import com.itheima.crm.domain.User;

/**
 * 用户管理的Service的接口
 * @author jt
 *
 */
public interface UserService {

	void regist(User user);

	User login(User user);
}
