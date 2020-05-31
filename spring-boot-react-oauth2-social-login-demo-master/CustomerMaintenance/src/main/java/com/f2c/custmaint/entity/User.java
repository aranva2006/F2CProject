package com.f2c.custmaint.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;


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

	@OneToOne
	@JoinColumn(name="scoceity_id")
	private SocietyDetail societyDetail;
	
	@OneToOne
	@JoinColumn(name="contact_id")
	private ContactInformation contactInformation;
	
	@ManyToOne
	@JoinColumn(name="user_type_id")
	private UserType userType;
	
	public User() {
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
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

	public ContactInformation getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(ContactInformation contactInformation) {
		this.contactInformation = contactInformation;
	}

	public SocietyDetail getSocietyDetail() {
		return societyDetail;
	}

	public void setSocietyDetail(SocietyDetail societyDetail) {
		this.societyDetail = societyDetail;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

}