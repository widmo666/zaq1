package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mdl_user")
public class MoodleUser {

	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "password")
	private String password;

	@Column(name = "username")
	private String username;

	public Long getId() {
		return id;
	}

	public String getPassword() {
		return password;
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

	public void setUsername(String username) {
		this.username = username;
	}
}
