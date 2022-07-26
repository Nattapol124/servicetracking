package com.gtt.server.user.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.core.service.CoreService;
import com.gtt.server.user.entity.Request;

public interface RequestService extends CoreService<Request, Serializable>
{
	public List getRequestList(String request_title,String request_file,String request_remark,String request_dateStart,String request_dateEnd,String reqeust_status)throws DataAccessException;
}
