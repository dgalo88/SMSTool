package com.venebel.smstool.database;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name = "user")
@Proxy(lazy = false)
public class User {

	private int id;
	private String username;
	private String password;
	private String role;  
	
	public User() { }
	
	public User(String username, String password, String role) {
		this.username = username;
		this.password = password;
		this.role = role;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {  
		return role;  
	}

	public void setRole(String role) {  
		this.role = role;  
	}
	
}
