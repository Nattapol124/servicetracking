package com.gtt.server.user.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.core.dao.impl.CoreDaoImpl;
import com.gtt.server.user.dao.UserProjectDao;
import com.gtt.server.user.entity.Project;
import com.gtt.server.user.entity.UserProject;

public class UserProjectDaoImpl extends CoreDaoImpl<UserProject, Serializable> implements UserProjectDao{

	public UserProjectDaoImpl(Class<UserProject> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List getProjectById(String userId) throws DataAccessException {
		String sql = "select userproject.id_user_project, project.project_name from userproject "
				+ "inner join project on userproject.id_project = project.id_project "
				+ "where userproject.id_user ="+userId;
		
		List<UserProject> results = new ArrayList<UserProject>();
		List<Object[]> objectList = getSession().createSQLQuery(sql).list();
		
		if(objectList != null && objectList.size()>0) {
			for(Object[] obj : objectList) {
				Project project = new Project();
				UserProject userProject = new UserProject(Integer.parseInt(String.valueOf(obj[0])));
				project.setName(String.valueOf(obj[1]));
				userProject.setProject(project);
				results.add(userProject);
			}
			
		}
		return results;
	}
	
}
