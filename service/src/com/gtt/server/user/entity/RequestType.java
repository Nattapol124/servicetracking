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
@Table(name = "requesttype")
public class RequestType extends CoreEntity {
	private static final long serialVersionUID = 1L;
		
		@Id
		@Column(name = "id_request_type")
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		@Column(name = "request_type_name")
		private int request_type_name;
		
		
		
		public RequestType() {
			
		}



		public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		public int getRequest_type_name() {
			return request_type_name;
		}



		public void setRequest_type_name(int request_type_name) {
			this.request_type_name = request_type_name;
		}
		
		
}

=======
@Entity
@Table(name = "requesttype")
public class RequestType extends CoreEntity{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_request_type")
	@GeneratedValue(strategy = GenerationType.AUTO)
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
>>>>>>> bank
