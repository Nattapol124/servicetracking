package com.gtt.server.user.dao.impl;

import java.io.Serializable;

import com.core.dao.impl.CoreDaoImpl;
import com.gtt.server.user.dao.RequestStatusDao;
<<<<<<< HEAD
import com.gtt.server.user.entity.RequestStatus;

public class RequestStatusDaoImpl extends CoreDaoImpl<RequestStatus, Serializable> 
implements RequestStatusDao{

=======
import com.gtt.server.user.entity.Request;
import com.gtt.server.user.entity.RequestStatus;

public class RequestStatusDaoImpl extends CoreDaoImpl<RequestStatus, Serializable> implements RequestStatusDao{
	
>>>>>>> bank
	public RequestStatusDaoImpl(Class<RequestStatus> entityClass) {
		super(entityClass);
	}
}
