package com.gtt.server.user.service.impl;

import java.io.Serializable;
import java.util.List;

import com.core.service.impl.CoreServiceImpl;
import com.gtt.server.user.dao.UserDao;
import com.gtt.server.user.entity.User;
import com.gtt.server.user.service.UserService;

public class UserServiceImpl extends CoreServiceImpl<User, Serializable> implements UserService{
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		super(userDao);
		
		this.userDao = userDao;
	}

	@Override
	public List<User> getLogin(String username, String password) {
		return userDao.findLogin(username, password);
	}


}
