package com.gtt.server.user.service;
<<<<<<< HEAD
import java.io.Serializable;
=======

import java.io.Serializable;
import java.util.List;

import org.springframework.dao.DataAccessException;
>>>>>>> bank

import com.core.service.CoreService;
import com.gtt.server.user.entity.UserProject;

<<<<<<< HEAD

public interface UserProjectService extends CoreService<UserProject, Serializable>{
	

=======
public interface UserProjectService extends CoreService<UserProject, Serializable>{
	public List getProjectById(String userId) throws DataAccessException;
>>>>>>> bank
}
