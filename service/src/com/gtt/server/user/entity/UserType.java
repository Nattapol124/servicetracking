package com.gtt.server.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

<<<<<<< HEAD
import com.core.entity.CoreEntity;

@Entity
@Table(name = "usertype")
public class UserType extends CoreEntity{
	
	private static final long serialVersionUID = 1L;
=======
@Entity
@Table(name = "usertype")
public class UserType extends CoreEntity{
	private static final long serialVeraionUID = 1L;
>>>>>>> bank
	
	@Id
	@Column(name = "id_user_type")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
<<<<<<< HEAD
	@Column(name = "type_name")
	private String type_name;

	public UserType() {
		
	}

=======
	
	@Column(name = "type_name")
	private String name;

	public UserType() {
	}

	public UserType(int id) {
		this.setId(id);
	}
	
>>>>>>> bank
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

<<<<<<< HEAD
	public String getType_name() {
		return type_name;
	}

	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
	

	
=======
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
>>>>>>> bank
	
}
