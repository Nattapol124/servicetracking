package com.gtt.server.user.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.core.service.impl.CoreServiceImpl;
import com.gtt.server.user.dao.ProjectDao;
import com.gtt.server.user.entity.Project;
import com.gtt.server.user.service.ProjectService;

public class ProjectServiceImpl extends CoreServiceImpl<Project, Serializable> implements ProjectService {
	private ProjectDao projectDao;
	
	public ProjectServiceImpl(ProjectDao projectDao) {
		super(projectDao);
		
		this.projectDao = projectDao;
	}
	
	@Override
	public List getProject(String customerId, String userId) throws DataAccessException {
		return projectDao.getProject(customerId, userId);
	}

}
