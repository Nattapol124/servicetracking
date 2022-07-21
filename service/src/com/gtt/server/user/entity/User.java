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
@Table(name = "user")
public class User extends CoreEntity{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_user")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "id_user_type")
	private UserType userType;
	
	@ManyToOne
	@JoinColumn(name = "id_user_prefix")
	private UserPrefix userPrefix;
	
	@ManyToOne
	@JoinColumn(name = "id_user_position")
	private UserPosition userPosition;
	
	@ManyToOne
	@JoinColumn(name = "id_company")
	private Company company;
	
	
	@Column(name = "user_nickname")
	private String nickname;
	
	@Column(name = "user_firstname")
	private String firstname;
	
	@Column(name = "user_lastname")
	private String lastname;
	
	@Column(name = "user_phone")
	private String phone;
	
	@Column(name = "user_email")
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "id_customer")
	private Company customer;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	
	public User() {
	}

	public User(int id) {
		this.setId(id);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public UserPrefix getUserPrefix() {
		return userPrefix;
	}

	public void setUserPrefix(UserPrefix userPrefix) {
		this.userPrefix = userPrefix;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserPosition getUserPosition() {
		return userPosition;
	}

	public void setUserPosition(UserPosition userPosition) {
		this.userPosition = userPosition;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Company getCustomer() {
		return customer;
	}

	public void setCustomer(Company customer) {
		this.customer = customer;
	}

	

	
	
}
