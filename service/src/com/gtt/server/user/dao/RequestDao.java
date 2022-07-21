package com.gtt.server.user.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.core.dao.CoreDao;
import com.gtt.server.user.entity.Request;

public interface RequestDao extends CoreDao<Request, Serializable>{
	public List findReqByUser(String userId) throws DataAccessException;

}
