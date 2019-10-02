package uk.ac.belfastmet.NewTask.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//kevin - javadoc to describe classes as well as methods
@Entity
@Table (name = "task")
public class Task {

	private long id;
	private String description;
	private String name;
	private String user;
	private String priority;
	//private Boolean completionStatus;

/**
 * 
 * @param description
 * @param name
 * @param user
 * @param priority
 * All needed within the constructor
 */
	public Task() {
	}

	public Task(String description, String name, String user, String priority) {
		super();
		this.description = description;
		this.name = name;
		this.user = user;
		this.priority = priority;
	//	this.completionStatus = completionStatus;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return identifies the return with the field name within the database
	 */
	@Column(name = "description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Column(name = "name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "user")
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	@Column(name = "priority")
	public String getPriority() {
		return priority;
	}
	
	public void setPriority(String priority) {
		this.priority = priority;
	}
	/*@Column(name = "completion")
	public Boolean setCompletionStatus() {
		return completionStatus;
	}
	public void getCompletionStatus(Boolean completionStatus) {
		this.completionStatus = completionStatus;
	}
	*/
	public String toString() {
		return this.description + ""+ this.name +" "+ this.user + "" + this.priority;
	}
	
}

