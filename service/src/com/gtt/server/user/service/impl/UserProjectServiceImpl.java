package com.gtt.server.user.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.core.service.impl.CoreServiceImpl;
import com.gtt.server.user.dao.UserProjectDao;
import com.gtt.server.user.entity.UserProject;
import com.gtt.server.user.service.UserProjectService;

public class UserProjectServiceImpl extends CoreServiceImpl<UserProject, Serializable> implements UserProjectService{

	private UserProjectDao userProjectDao;
	
	public UserProjectServiceImpl(UserProjectDao userProjectDao) {
		super(userProjectDao);
		
		this.userProjectDao = userProjectDao;
		// TODO Auto-generated constructor stub
	}

	@Override
	public List getProjectById(String userId) throws DataAccessException {
		return userProjectDao.getProjectById(userId);
	}
	
	
}
