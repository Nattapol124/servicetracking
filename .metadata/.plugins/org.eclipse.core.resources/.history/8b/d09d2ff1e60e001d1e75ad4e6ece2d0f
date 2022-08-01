package com.gtt.server.user.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.core.dao.impl.CoreDaoImpl;
import com.gtt.server.user.dao.UserDao;
import com.gtt.server.user.entity.Company;
import com.gtt.server.user.entity.User;
import com.gtt.server.user.entity.UserPosition;

public class UserDaoImpl extends CoreDaoImpl<User, Serializable> implements UserDao{

	public UserDaoImpl(Class<User> entityClass) {
		super(entityClass);
	}
	
	@Override
	public List<User> findLogin(String username, String password) throws DataAccessException {
		String sql = "SELECT user.id_user, userposition.position_name, user.id_customer, user.username, user.password, user.user_firstname FROM user "
				+ "inner join userposition on user.id_user_position = userposition.id_user_position "
				+ "WHERE username='"+username+"' AND password='"+password+"'";
		  List<User> results = new ArrayList<User>();
		  List<Object[]> objectList = getSession().createSQLQuery(sql).list();
		  if(objectList != null && objectList.size()>0 ) {
		   for(Object[] obj : objectList){
		   User item = new User(Integer.parseInt(String.valueOf(obj[0])));
		   Company customer = new Company();
		   UserPosition userP = new UserPosition();
		   userP.setName(String.valueOf(obj[1]));
		   item.setUserPosition(userP);
		   customer.setId(Integer.parseInt(String.valueOf(obj[2])));
		   item.setCustomer(customer);
		   item.setUsername(String.valueOf(obj[3]));
		   item.setPassword(String.valueOf(obj[4]));
		   item.setFirstname(String.valueOf(obj[5]));
		   results.add(item);
		  }
		 }
		  return results;
		}
	
	
}
