package com.gtt.server.user.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.core.dao.CoreDao;
import com.gtt.server.user.entity.User;

public interface UserDao extends CoreDao<User, Serializable>{

	public List findLogin(String username, String password) throws DataAccessException;

}
