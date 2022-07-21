package com.gtt.server.user.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.core.dao.impl.CoreDaoImpl;
import com.gtt.server.user.dao.UserDao;
import com.gtt.server.user.entity.User;

public class UserDaoImpl extends CoreDaoImpl<User, Serializable> implements UserDao{

	public UserDaoImpl(Class<User> entityClass) {
		super(entityClass);
	}
	
	@Override
	public List<User> findLogin(String username, String password) throws DataAccessException {
		String sql = "SELECT id_user,username, password FROM user WHERE username='"+username+"' AND password='"+password+"'";
		  List<User> results = new ArrayList<User>();
		  List<Object[]> objectList = getSession().createSQLQuery(sql).list();
		  if(objectList != null && objectList.size()>0 ) {
		   for(Object[] obj : objectList){
		   User item = new User(Integer.parseInt(String.valueOf(obj[0])));
		   item.setUsername(String.valueOf(obj[1]));
		   item.setPassword(String.valueOf(obj[2]));
		   results.add(item);
		  }
		 }
		  return results;
		}
}
