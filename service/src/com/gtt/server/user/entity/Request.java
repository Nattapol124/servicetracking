package com.gtt.server.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.core.entity.CoreEntity;

@Entity
@Table(name = "request")
public class Request extends CoreEntity{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_request")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@ManyToOne
	@JoinColumn(name = "id_user")
	private User id_user;
	@ManyToOne
	@JoinColumn(name = "id_user_process")
	private User id_user_process;
	@Column(name = "id_request_status")
	private int id_request_status;
	@Column(name = "id_request_type")
	private int id_request_type;
	@Column(name = "id_project")
	private int id_project;
	@Column(name = "request_remark")
	private String request_remark;
	@Column(name = "request_date")
	private String request_date;
	@Column(name = "request_file")
	private String request_file;
	@Column(name = "request_dateStart")
	private String request_dateStart;
	@Column(name = "request_dateEnd")
	private String request_dateEnd;
	@Column(name = "request_title")
	private String request_title;
	
	public Request() {
		
	}

	public Request(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getId_user() {
		return id_user;
	}

	public void setId_user(User id_user) {
		this.id_user = id_user;
	}

	public User getId_user_process() {
		return id_user_process;
	}

	public void setId_user_process(User id_user_process) {
		this.id_user_process = id_user_process;
	}

	public int getId_request_status() {
		return id_request_status;
	}

	public void setId_request_status(int id_request_status) {
		this.id_request_status = id_request_status;
	}

	public int getId_request_type() {
		return id_request_type;
	}

	public void setId_request_type(int id_request_type) {
		this.id_request_type = id_request_type;
	}

	public int getId_project() {
		return id_project;
	}

	public void setId_project(int id_project) {
		this.id_project = id_project;
	}

	public String getRequest_remark() {
		return request_remark;
	}

	public void setRequest_remark(String request_remark) {
		this.request_remark = request_remark;
	}

	public String getRequest_date() {
		return request_date;
	}

	public void setRequest_date(String request_date) {
		this.request_date = request_date;
	}

	public String getRequest_file() {
		return request_file;
	}

	public void setRequest_file(String request_file) {
		this.request_file = request_file;
	}

	public String getRequest_dateStart() {
		return request_dateStart;
	}

	public void setRequest_dateStart(String request_dateStart) {
		this.request_dateStart = request_dateStart;
	}

	public String getRequest_dateEnd() {
		return request_dateEnd;
	}

	public void setRequest_dateEnd(String request_dateEnd) {
		this.request_dateEnd = request_dateEnd;
	}

	public String getRequest_title() {
		return request_title;
	}

	public void setRequest_title(String request_title) {
		this.request_title = request_title;
	}

	
	
}
