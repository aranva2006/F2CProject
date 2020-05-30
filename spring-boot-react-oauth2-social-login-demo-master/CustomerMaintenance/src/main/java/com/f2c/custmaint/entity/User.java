package com.f2c.custmaint.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="phone_number")
	private String phone_number;
	
	@Column(name="firstname")
	private String firstname;

	@Column(name="lastname")
	private String lastname;
	
	@Column(name="usertype")
	private String userType;

	@OneToMany(mappedBy="user")
	private List<ContactInformation> contactInformations;

	@ManyToOne
	@JoinColumn(name="scoceity_id")
	private SocietyDetail societyDetail;

	public User() {
	}

}