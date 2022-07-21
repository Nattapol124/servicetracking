package com.gtt.server.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "companytype")
public class CompanyType extends CoreEntity{
	
	private static final long serialVersionUID = 1L;
	
	@Id 
	@Column(name = "id_company_type")
	private int id;
	
	@Column(name = "type_name")
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
