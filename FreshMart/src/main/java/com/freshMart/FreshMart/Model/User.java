package com.freshMart.FreshMart.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;



@Entity
public class User {
	
	@javax.persistence.Id
	@Column(name="ID")
	public int id;
	
	@Column(name="userName", unique=true)
	public String userName;
	
	public String password;
	
	@Enumerated(value=EnumType.STRING)
	public Roles role;

	
	
	public User() {
		super();
	}

	public User(int id, String userName, String password, Roles role) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Roles getRole() {
		return role;
	}

	public void setRole(Roles role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", UserName=" + userName + ", password=" + password + ", role=" + role + "]";
	}
	
	
	
}
