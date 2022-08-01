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
@Table(name = "userproject")
public class UserProject extends CoreEntity {
	
=======
@Entity
@Table(name = "userproject")
public class UserProject extends CoreEntity{
>>>>>>> bank
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_user_project")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
<<<<<<< HEAD
	@ManyToOne
	@JoinColumn(name = "id_user")
	private User id_user;
	@ManyToOne
	@JoinColumn(name = "id_project")
	private Project id_project;

	public UserProject() {
		
=======
	
	@ManyToOne
	@JoinColumn(name = "id_user")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "id_project")
	private Project project;
	
	public UserProject() {
	}

	public UserProject(int id) {
		this.setId(id);
>>>>>>> bank
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

<<<<<<< HEAD
	public User getId_user() {
		return id_user;
	}

	public void setId_user(User id_user) {
		this.id_user = id_user;
	}

	public Project getId_project() {
		return id_project;
	}

	public void setId_project(Project id_project) {
		this.id_project = id_project;
	}
	


=======
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
>>>>>>> bank
}
