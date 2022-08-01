package com.gtt.server.user.service.impl;

import java.io.Serializable;
<<<<<<< HEAD
=======
import java.util.List;

import org.springframework.dao.DataAccessException;
>>>>>>> bank

import com.core.service.impl.CoreServiceImpl;
import com.gtt.server.user.dao.UserProjectDao;
import com.gtt.server.user.entity.UserProject;
import com.gtt.server.user.service.UserProjectService;

<<<<<<< HEAD
public class UserProjectServiceImpl extends CoreServiceImpl<UserProject, Serializable>
implements UserProjectService{
	private UserProjectDao userprojectDao;
	public UserProjectServiceImpl(UserProjectDao userprojectDao) {
		super(userprojectDao);
		this.userprojectDao = userprojectDao;
		// TODO Auto-generated constructor stub
	}

=======
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
	
	
>>>>>>> bank
}
