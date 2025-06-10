package com.va.week6.model;

import java.sql.Date;

/*
 * @author - each teammeber who wrote this has to write this..
 * @date -
 * Description - This is model class for student.. has firstname...
 * 
 */

public class Student {

	private String userName;
	private String userEmail;
	private String password;
	private String preferredName;
	private String name;
	

	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPreferredName() {
		return preferredName;
	}
	public void setPreferredName(String preferredName) {
		this.preferredName = preferredName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



}
