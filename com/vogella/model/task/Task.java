/**
 * Copyright (c) 2020 by fluxmeister. All rights reserved. 
 * vektorwebsolutions.com/determinator
 * 
 */
package com.vogella.model.task;

import java.util.Date;

/**
 * @author fluxmeister
 *
 */
public class Task {
	private final long id;
	private String summary = "";
	private String description = "";
	private boolean done = false;
	private Date dueDate;

	public Task(long id) {
		this.id = id;
	}

	public Task(long id, String summary, String description, boolean done, Date dueDate) {
		super();
		this.id = id;
		this.summary = summary;
		this.description = description;
		this.done = done;
		this.dueDate = dueDate;
	}
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}


	/**
	 * @return the summary
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * @param summary the summary to set
	 */
	public void setSummary(String summary) {
		this.summary = summary;
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
	 * @return the done
	 */
	public boolean isDone() {
		return done;
	}

	/**
	 * @param done the done to set
	 */
	public void setDone(boolean done) {
		this.done = done;
	}

	/**
	 * @return the dueDate
	 */
	public Date getDueDate() {
		return dueDate;
	}

	/**
	 * @param dueDate the dueDate to set
	 */
	public void setDueDate(Date dueDate) {
		this.dueDate = new Date(dueDate.getTime());
	}

	
	
	
}
