package com.xdf.service.user;

import java.util.List;

import com.xdf.bean.Easybuy_User;

public interface UserService {

	/**
	 * 注册
	 * @param user
	 */
	public void register(Easybuy_User user);

	/**
	 * 登陆
	 */
	public Easybuy_User login(String userName, String password);

	/**
	 * 查询所有
	 */
	List<Easybuy_User> findAllUsers(Object... params);

	/**
	 * 新增用户
	 */
	public boolean addUser(Easybuy_User user);

}
