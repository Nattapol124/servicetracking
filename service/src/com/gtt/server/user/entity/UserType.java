package com.gtt.server.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usertype")
public class UserType extends CoreEntity{
	private static final long serialVeraionUID = 1L;
	
	@Id
	@Column(name = "id_user_type")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "type_name")
	private String name;

	public UserType() {
	}

	public UserType(int id) {
		this.setId(id);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
