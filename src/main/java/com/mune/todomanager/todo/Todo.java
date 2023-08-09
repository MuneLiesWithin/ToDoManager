package com.mune.todomanager.todo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

@Entity
public class Todo {
	
	@Id
	@GeneratedValue
	private int id;
	private String username;
	@Size(min=5, message="Enter at least 5 characters")
	private String description;
	private String localDate;
	private boolean done;
	
	public Todo() {
		
	}
	
	public Todo(int id, String username, String description, String localDate, boolean done) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.localDate = localDate;
		this.done = done;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocalDate() {
		return localDate;
	}

	public void setLocalDate(String localDate) {
		this.localDate = localDate;
	}

	public boolean getDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + username + ", description=" + description + ", localDate=" + localDate
				+ ", done=" + done + "]";
	}
}
