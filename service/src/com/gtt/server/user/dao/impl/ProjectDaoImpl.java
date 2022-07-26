package com.gtt.server.user.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.core.dao.impl.CoreDaoImpl;
import com.gtt.server.user.dao.ProjectDao;
import com.gtt.server.user.entity.Company;
import com.gtt.server.user.entity.Project;

public class ProjectDaoImpl extends CoreDaoImpl<Project, Serializable> implements ProjectDao {
	public ProjectDaoImpl(Class<Project> entityClass) {
		super(entityClass);
	}

	@Override
	public List<Project> getProject(String customerId, String userId) throws DataAccessException{
		String sql = "select project.project_name, project.id_customer from user "
				+ "inner join project on user.id_customer = project.id_customer "
				+ "where user.id_customer = "+customerId + " and user.id_user =" + userId;
		
		List<Project> results = new ArrayList<Project>();
		List<Object[]> objectList = getSession().createSQLQuery(sql).list();
		if(objectList != null && objectList.size()>0) {
			for(Object[] obj : objectList) {
				Project project = new Project();
				project.setName(String.valueOf(obj[0]));
				Company customer = new Company();
				customer.setId(Integer.parseInt(String.valueOf(obj[1])));
				project.setCustomer(customer);
				results.add(project);
			}
		}
		
		return results;
		
	}
}
