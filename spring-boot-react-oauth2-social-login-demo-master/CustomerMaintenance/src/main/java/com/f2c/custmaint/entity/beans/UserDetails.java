package com.f2c.custmaint.entity.beans;

import java.io.Serializable;


public class UserDetails implements Serializable {
	private static final long serialVersionUID = 1L;
	private String phonenumber;
	private String firstname;
	private String lastname;
	private ContactInformation contactInformation;
	private SocietyDetail societyDetail;
	private UserType userType;

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
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
