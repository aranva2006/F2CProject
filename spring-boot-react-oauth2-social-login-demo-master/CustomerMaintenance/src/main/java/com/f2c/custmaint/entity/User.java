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
	@Column(name="mail_id")
	private String mailId;
	
	private String firstname;

	private String lastname;

	@ManyToOne
	@JoinColumn(name="SCOCEITY_ID")
	private SocietyDetail societyDetail;

	@ManyToOne
	@JoinColumn(name="CONTACT_ID")
	private ContactInformation contactInformation;

	@ManyToOne
	@JoinColumn(name="USER_TYPE_ID")
	private UserType userType;
	
	@OneToMany(mappedBy = "user")
	private Set<CustomerOrder> customerOrders;

	@Column(name = "UC_USER_NAME")
	private String userConnUserName;
	
	@Column(name = "APP_USER_NAME")
	private String appUserName;
	
	public User() {
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

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public Set<CustomerOrder> getCustomerOrders() {
		return customerOrders;
	}

	public void setCustomerOrders(Set<CustomerOrder> customerOrders) {
		this.customerOrders = customerOrders;
	}

	public String getUserConnUserName() {
		return userConnUserName;
	}

	public void setUserConnUserName(String userConnUserName) {
		this.userConnUserName = userConnUserName;
	}

	public String getAppUserName() {
		return appUserName;
	}

	public void setAppUserName(String appUserName) {
		this.appUserName = appUserName;
	}

}