package com.gtt.server.user.service.impl;

import java.io.Serializable;

import com.core.service.impl.CoreServiceImpl;
import com.gtt.server.user.dao.UserTypeDao;
import com.gtt.server.user.entity.UserType;
import com.gtt.server.user.service.UserTypeService;

<<<<<<< HEAD
public class UserTypeServiceImpl extends CoreServiceImpl<UserType,Serializable> 
implements UserTypeService{
	
	private UserTypeDao userTypeDao;
	public UserTypeServiceImpl(UserTypeDao userTypeDao) {
		super(userTypeDao);
		this.userTypeDao = userTypeDao;
		
	}

=======
public class UserTypeServiceImpl extends CoreServiceImpl<UserType, Serializable> implements UserTypeService{
	private UserTypeDao userTypeDao;
	
	public UserTypeServiceImpl(UserTypeDao userTypeDao) {
		super(userTypeDao);
		
		this.userTypeDao = userTypeDao;
	}
>>>>>>> bank
}
