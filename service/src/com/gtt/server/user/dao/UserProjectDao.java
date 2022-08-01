package com.gtt.server.user.dao;
<<<<<<< HEAD
import java.io.Serializable;

=======

import java.io.Serializable;
import java.util.List;

import org.springframework.dao.DataAccessException;
>>>>>>> bank

import com.core.dao.CoreDao;
import com.gtt.server.user.entity.UserProject;

<<<<<<< HEAD


public interface UserProjectDao extends CoreDao<UserProject, Serializable> {


}
=======
public interface UserProjectDao extends CoreDao<UserProject, Serializable>{
	public List getProjectById(String userId) throws DataAccessException;
}
>>>>>>> bank
