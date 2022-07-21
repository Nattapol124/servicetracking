package com.gtt.server.user.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "id_user_process")
	private User userproc;
	
	@ManyToOne
	@JoinColumn(name = "id_request_status")
	private RequestStatus request_status;

	@ManyToOne
	@JoinColumn(name = "id_request_type")
	private RequestType request_type;
	
	@ManyToOne
	@JoinColumn(name = "id_project")
	private Project project;
	
	@Column(name = "request_title")
	private String title;
	
	@Column(name = "request_remark")
	private String remark;
	
	@Column(name = "request_date")
	private Date date;
	
	@Column(name = "request_file")
	private String file;
	



	public Request(int parseInt) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getUserproc() {
		return userproc;
	}

	public void setUserproc(User userproc) {
		this.userproc = userproc;
	}

	public RequestStatus getRequest_status() {
		return request_status;
	}

	public void setRequest_status(RequestStatus request_status) {
		this.request_status = request_status;
	}

	public RequestType getRequest_type() {
		return request_type;
	}

	public void setRequest_type(RequestType request_type) {
		this.request_type = request_type;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}



	

	
	
}
