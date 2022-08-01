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
@Table(name = "UserPosition")
public class UserPosition extends CoreEntity {
	private static final long serialVersionUID = 1L;

=======
@Entity
@Table(name="userposition")
public class UserPosition extends CoreEntity {
	private static final long serialVersionUID = 1L;
	
>>>>>>> bank
	@Id
	@Column(name = "id_user_position")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
<<<<<<< HEAD
	@Column (name = "position_name")
	private String position_name;
	
	
	public UserPosition(){
		
	}

=======
	
	@Column(name = "position_name")
	private String name;
>>>>>>> bank

	public int getId() {
		return id;
	}

<<<<<<< HEAD

=======
>>>>>>> bank
	public void setId(int id) {
		this.id = id;
	}

<<<<<<< HEAD

	public String getPosition_name() {
		return position_name;
	}


	public void setPosition_name(String position_name) {
		this.position_name = position_name;
=======
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
>>>>>>> bank
	}
	
	
}
