package com.venebel.smstool.database;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name = "person")
@Proxy(lazy = false)
public class Person {

	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String gender;
	private String actions;
	
	private User user;
	
	public Person() { }

	public Person(String firstname, String lastname, String email, String gender, User user) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.gender = gender;
		this.user = user;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getActions() {
		return actions;
	}

	public void setActions(String actions) {
		this.actions = actions;
	}
	
	@OneToOne
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "{\"person\":[{ \"id\":" + "\"" + id + "\", " + 
						"\"firstname\":" + "\"" + firstname + "\", "  +
						"\"lastname\":" + "\"" + lastname + "\", " +
						"\"email\":" + "\"" + email + "\", " +
						"\"gender\":" + "\"" + gender + "\"}" +
						"]}";
	}

}
