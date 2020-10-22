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
public class TaskBuilder {

	private long id;
	private String summary = "";
	private String description = "";
	private boolean done = false;
	private Date dueDate;

	public TaskBuilder(long id, String summary, String description, boolean done, Date dueDate) {
		this.id = id;
		this.summary = summary;
		this.description = description;
		this.done = done;
		this.dueDate = dueDate;
	}

//	public TaskBuilder setId(long id) {
//		this.id = id;
//		return this;
//	}
	
	/**
	 * @param summary the summary to set
	 */
	public TaskBuilder setSummary(String summary) {
		this.summary = summary;
		return this;
	}

	/**
	 * @param description the description to set
	 */
	public TaskBuilder setDescription(String description) {
		this.description = description;
		return this;
	}

	/**
	 * @param done the done to set
	 */
	public TaskBuilder setDone(boolean done) {
		this.done = done;
		return this;
	}

	/**
	 * @param dueDate the dueDate to set
	 */
	public TaskBuilder setDueDate(Date dueDate) {
		this.dueDate = new Date(dueDate.getTime());
		return this;
	}

	/**
	 * @rbuild that Task
	 */
	public Task build() {
		return new Task(id, summary, description, done, dueDate);

	}

}
