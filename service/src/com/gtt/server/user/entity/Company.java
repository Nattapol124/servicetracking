package com.gtt.server.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

<<<<<<< HEAD
import com.core.entity.CoreEntity;



@Entity
@Table(name = "company")
public class Company extends CoreEntity{
	private static final long serialVersionUID = 1L;
=======
@Entity
@Table(name = "company")

public class Company extends CoreEntity{
	private static final long serialVersionUID = 1L;
	
>>>>>>> bank

	@Id
	@Column(name = "id_company")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
<<<<<<< HEAD
	@ManyToOne
	@JoinColumn(name = "id_company_type")
	private CompanyType id_company_type;
	@Column(name = "company_name")
	private String company_name;
	@Column(name = "company_address")
	private String company_address;
	@Column(name = "company_phone")
	private String company_phone;
	@Column(name = "company_fax")
	private String company_fax;
	@Column(name = "company_email")
	private String company_email;
	
	
	
	
	
	public Company() {
	
	}


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getCompany_name() {
		return company_name;
	}



	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}



	public String getCompany_address() {
		return company_address;
	}



	public void setCompany_address(String company_address) {
		this.company_address = company_address;
	}



	public String getCompany_phone() {
		return company_phone;
	}



	public void setCompany_phone(String company_phone) {
		this.company_phone = company_phone;
	}



	public String getCompany_fax() {
		return company_fax;
	}



	public void setCompany_fax(String company_fax) {
		this.company_fax = company_fax;
	}



	public String getCompany_email() {
		return company_email;
	}



	public void setCompany_email(String company_email) {
		this.company_email = company_email;
	}



	public CompanyType getId_company_type() {
		return id_company_type;
	}



	public void setId_company_type(CompanyType id_company_type) {
		this.id_company_type = id_company_type;
	}
	
=======
	
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
>>>>>>> bank
	
}
