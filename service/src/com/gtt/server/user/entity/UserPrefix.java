package com.gtt.server.user.entity;
<<<<<<< HEAD
=======

>>>>>>> bank
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

<<<<<<< HEAD
import com.core.entity.CoreEntity;

@Entity
@Table(name = "userprefix")
public class UserPrefix extends CoreEntity{
=======
@Entity
@Table(name = "userprefix")
public class UserPrefix extends CoreEntity {
	
>>>>>>> bank
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_user_prefix")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
<<<<<<< HEAD
	@Column(name = "prefix_name")
	private String prefix_name;
	
=======
	
	@Column(name = "prefix_name")
	private String name;
>>>>>>> bank
	
	public UserPrefix() {
	}

<<<<<<< HEAD
=======
	public UserPrefix(int id) {
		this.setId(id);
	}
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

	public String getPrefix_name() {
		return prefix_name;
	}


	public void setPrefix_name(String prefix_name) {
		this.prefix_name = prefix_name;
	}
	
}
=======
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
>>>>>>> bank
