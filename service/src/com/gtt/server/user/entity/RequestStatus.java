package com.gtt.server.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "requeststatus")
public class RequestStatus extends CoreEntity{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_request_status")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "status_name")
	private String name;

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
