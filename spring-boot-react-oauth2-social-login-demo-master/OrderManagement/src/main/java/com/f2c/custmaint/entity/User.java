package com.f2c.custmaint.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;


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
	@Column(name="PHONE_NUMBER")
	private String phoneNumber;

	private String firstname;

	private String lastname;

	//bi-directional many-to-one association to SocietyDetail
	@ManyToOne
	@JoinColumn(name="SCOCEITY_ID")
	private SocietyDetail societyDetail;

	//bi-directional many-to-one association to ContactInformation
	@ManyToOne
	@JoinColumn(name="CONTACT_ID")
	private ContactInformation contactInformation;

	//bi-directional many-to-one association to UserType
	@ManyToOne
	@JoinColumn(name="USER_TYPE_ID")
	private UserType userType;

	@OneToMany(mappedBy = "user")
	private Set<CustomerOrder> customerOrders;
	
	public User() {
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public SocietyDetail getSocietyDetail() {
		return this.societyDetail;
	}

	public void setSocietyDetail(SocietyDetail societyDetail) {
		this.societyDetail = societyDetail;
	}

	public ContactInformation getContactInformation() {
		return this.contactInformation;
	}

	public void setContactInformation(ContactInformation contactInformation) {
		this.contactInformation = contactInformation;
	}

	public UserType getUserType() {
		return this.userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public Set<CustomerOrder> getCustomerOrders() {
		return customerOrders;
	}

	public void setCustomerOrders(Set<CustomerOrder> customerOrders) {
		this.customerOrders = customerOrders;
	}

}