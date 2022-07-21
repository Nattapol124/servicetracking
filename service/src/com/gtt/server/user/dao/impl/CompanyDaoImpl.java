package com.gtt.server.user.dao.impl;

import java.io.Serializable;

import com.core.dao.impl.CoreDaoImpl;
import com.gtt.server.user.dao.CompanyDao;
import com.gtt.server.user.entity.Company;

public class CompanyDaoImpl extends CoreDaoImpl<Company, Serializable> implements CompanyDao{
	public CompanyDaoImpl(Class<Company> entityClass) {
		super(entityClass);
	}
}
