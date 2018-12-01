package cn.hgu.service;

import cn.hgu.model.Users;

public interface UserService {
	/**
	 * 注册
	 */
	void register(Users user) throws Exception;
	/**
	 * 登录
	 */
	Users login(Users user) throws Exception;
}
