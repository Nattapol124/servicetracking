package com.gtt.server.user.dao.impl;

import java.io.Serializable;

import com.core.dao.impl.CoreDaoImpl;
import com.gtt.server.user.dao.ProjectDao;
import com.gtt.server.user.entity.Project;

public class ProjectDaoImpl extends CoreDaoImpl<Project, Serializable> implements ProjectDao {
	public ProjectDaoImpl(Class<Project> entityClass) {
		super(entityClass);
	}
}
