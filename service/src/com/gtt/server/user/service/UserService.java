package com.gtt.server.user.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.core.service.CoreService;
import com.gtt.server.user.entity.User;

public interface UserService extends CoreService<User, Serializable>{

	public List getLogin(String username, String password) throws DataAccessException;

		
}
