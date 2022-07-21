package com.gtt.server.user.dao.impl;

import java.io.Serializable;

import com.core.dao.impl.CoreDaoImpl;
import com.gtt.server.user.dao.UserTypeDao;
import com.gtt.server.user.entity.UserType;

public class UserTypeDaoImpl extends CoreDaoImpl<UserType, Serializable> implements UserTypeDao{

	public UserTypeDaoImpl(Class<UserType> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}
	
}
