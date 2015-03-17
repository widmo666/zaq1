package com.beingjavaguys.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	@Column(name = "password")
	private String password;

	@Column
	private String test0924;

	@Column(name = "username")
	private String username;

	public Long getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getTest0924() {
		return test0924;
	}

	public String getUsername() {
		return username;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setTest0924(String test0924) {
		this.test0924 = test0924;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
