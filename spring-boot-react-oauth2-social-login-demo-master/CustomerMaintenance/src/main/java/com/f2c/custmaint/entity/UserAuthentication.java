package com.f2c.custmaint.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user_authentication database table.
 * 
 */
@Entity
@Table(name="user_authentication")
@NamedQuery(name="UserAuthentication.findAll", query="SELECT u FROM UserAuthentication u")
public class UserAuthentication implements Serializable {
	private static final long serialVersionUID = 1L;

	private String password;

	//bi-directional many-to-one association to User
	@ManyToOne
	private User user;

	public UserAuthentication() {
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}