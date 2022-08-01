package com.gtt.server.user.entity;

<<<<<<< HEAD
=======
import java.sql.Date;

>>>>>>> bank
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

=======
>>>>>>> bank
@Entity
@Table(name = "request")
public class Request extends CoreEntity{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_request")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
<<<<<<< HEAD
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
	@ManyToOne
	@JoinColumn(name = "id_project")
	private Project id_project;
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
=======
	
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
	
	@Column(name = "request_dateStart")
	private String dateStart;
	
	@Column(name = "request_dateEnd")
	private String dateEnd;
	



	public String getDateStart() {
		return dateStart;
	}

	public void setDateStart(String dateStart) {
		this.dateStart = dateStart;
	}

	public String getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(String dateEnd) {
		this.dateEnd = dateEnd;
	}

	public Request() {
		// TODO Auto-generated constructor stub
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

	

	public Project getId_project() {
		return id_project;
	}

	public void setId_project(Project id_project) {
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

=======
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



	

>>>>>>> bank
	
	
}
