package com.gtt.server.user.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.core.service.impl.CoreServiceImpl;
import com.gtt.server.user.dao.RequestDao;
import com.gtt.server.user.entity.Request;
import com.gtt.server.user.service.RequestService;

public class RequestServiceImpl extends CoreServiceImpl<Request, Serializable> implements RequestService{

	private RequestDao requestDao;
	
	public RequestServiceImpl(RequestDao requestDao) {
		super(requestDao);
		
		this.requestDao = requestDao;
	}
	
	@Override
	public List getReqByUser(String userId) throws DataAccessException {
		return requestDao.findReqByUser(userId);
	}
}
