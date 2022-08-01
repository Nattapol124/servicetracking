package com.gtt.server.user.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.core.service.CoreService;
import com.gtt.server.user.entity.Request;

<<<<<<< HEAD
public interface RequestService extends CoreService<Request, Serializable>
{
	public List getRequestList(String id)throws DataAccessException;
=======
public interface RequestService extends CoreService<Request, Serializable>{

	public List getReqByCustomer(String customerId) throws DataAccessException;
>>>>>>> bank
}
