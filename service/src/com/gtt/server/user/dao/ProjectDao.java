package com.gtt.server.user.dao;
import java.io.Serializable;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.core.dao.CoreDao;
import com.gtt.server.user.entity.Project;



public interface ProjectDao extends CoreDao<Project, Serializable> {

//	public List findProjectList(String id_project, String id_company, String project_name) throws DataAccessException;

}