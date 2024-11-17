package com.assignment.bookExchanger.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "userDetails")
public class UserDetails {
	@Id
	private String userName;
	
	private String fullName;
	
	private String email;
	
	private String Location;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public UserDetails(String userName, String fullName, String email, String location) {
		super();
		this.userName = userName;
		this.fullName = fullName;
		this.email = email;
		Location = location;
	}
	
	public UserDetails() {
		
	}
	
}