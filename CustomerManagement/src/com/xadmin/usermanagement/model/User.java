package com.xadmin.usermanagement.model;

/**
 * User.java
 * This is a model class represents a User entity
 * @author Ramesh Fadatare
 *
 */
public class User {
	protected int id;
	protected String first_name;
	protected String last_name;
	protected String email;
	
	public User() {
	}
	
	public User(String first_name, String last_name, String email) {
		super();
		this.name = first_name;
		this.last_name = last_name;
		this.email = email;
	}

	public User(int id, String first_name, String last_name, String email) {
		super();
		this.id = id;
		this.name = first_name;
		this.last_name = last_name;
		this.email = email;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_Name() {
		return first_name;
	}
	public void setName(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_Name() {
		return last_name;
	}
	public void setName(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	