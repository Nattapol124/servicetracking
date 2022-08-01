package com.gtt.server.user.dao.impl;


import java.io.Serializable;

import com.core.dao.impl.CoreDaoImpl;
import com.gtt.server.user.dao.UserPrefixDao;
import com.gtt.server.user.entity.UserPrefix;





public class UserPrefixDaoImpl extends CoreDaoImpl<UserPrefix, Serializable> implements UserPrefixDao{

	public UserPrefixDaoImpl(Class<UserPrefix> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}
	
}
