package uk.ac.belfastmet.NewTask.domain;

public class Task {

	String description;
	String name;
	String user;
	String priority;
	Boolean completionStatus;
	
	public Task(String description, String name, String user, String priority, Boolean completionStatus) {
		super();
		this.description = description;
		this.name = name;
		this.user = user;
		this.priority = priority;
		this.completionStatus = completionStatus;
	
	}
	

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the priority
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(String priority) {
		this.priority = priority;
	}

	/**
	 * @return the completionStatus
	 */
	public Boolean getCompletionStatus() {
		return completionStatus;
	}

	/**
	 * @param completionStatus the completionStatus to set
	 */
	public void setCompletionStatus(Boolean completionStatus) {
		this.completionStatus = completionStatus;
	}
	}

