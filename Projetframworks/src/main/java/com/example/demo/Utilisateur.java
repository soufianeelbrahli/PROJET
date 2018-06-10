package com.example.demo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Utilisateur implements Serializable {
	@Id @GeneratedValue
	int id;
	String username;
	String password;
	
	
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
	
	public Utilisateur(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public Utilisateur() {
		super();
	}
	
	
	
}
