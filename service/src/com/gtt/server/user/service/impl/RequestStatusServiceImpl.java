package com.gtt.server.user.service.impl;

import java.io.Serializable;

<<<<<<< HEAD
import com.core.dao.CoreDao;
=======
>>>>>>> bank
import com.core.service.impl.CoreServiceImpl;
import com.gtt.server.user.dao.RequestStatusDao;
import com.gtt.server.user.entity.RequestStatus;
import com.gtt.server.user.service.RequestStatusService;

<<<<<<< HEAD
public class RequestStatusServiceImpl extends CoreServiceImpl<RequestStatus, Serializable>
implements RequestStatusService{
	private RequestStatusDao requestStatusDao;
	public RequestStatusServiceImpl(RequestStatusDao requestStatusDao) {
		super(requestStatusDao);
		this.requestStatusDao = requestStatusDao;
		// TODO Auto-generated constructor stub
	}

=======
public class RequestStatusServiceImpl extends CoreServiceImpl<RequestStatus, Serializable> implements RequestStatusService{
	private RequestStatusDao requestStatus;
	
	public RequestStatusServiceImpl(RequestStatusDao requestStatusDao) {
		super(requestStatusDao);
		this.requestStatus = requestStatusDao;
	}
>>>>>>> bank
}
