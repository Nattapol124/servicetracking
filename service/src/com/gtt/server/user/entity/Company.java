package com.gtt.server.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "company")

public class Company extends CoreEntity{
	private static final long serialVersionUID = 1L;
	

	@Id
	@Column(name = "id_company")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "company_name")
	private String name;
	
	@Column(name = "company_address")
	private String address;
	
	@Column(name = "company_phone")
	private String phone;
	
	@Column(name = "company_fax")
	private String fax;
	
	@Column(name = "company_email")
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "id_company_type")
	private CompanyType companyType;
	
	
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public CompanyType getCompanyType() {
		return companyType;
	}
	public void setCompanyType(CompanyType companyType) {
		this.companyType = companyType;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
