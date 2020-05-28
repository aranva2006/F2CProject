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
	private String id;

	@Column(name="CURRENT_CONNECTIONS")
	private BigInteger currentConnections;

	private String email;

	@Column(name="email_verified")
	private byte emailVerified;

	private String firstname;

	@Column(name="image_url")
	private String imageUrl;

	private String lastname;

	private String name;

	private String password;

	@Column(name="phone_number")
	private String phoneNumber;

	private String provider;

	@Column(name="provider_id")
	private String providerId;

	@Column(name="TOTAL_CONNECTIONS")
	private BigInteger totalConnections;

	private String user;

	private String usertype;

	//bi-directional many-to-one association to ContactInformation
	@OneToMany(mappedBy="user")
	private List<ContactInformation> contactInformations;

	//bi-directional many-to-one association to SocietyDetail
	@ManyToOne
	@JoinColumn(name="scoceity_id")
	private SocietyDetail societyDetail;

	public User() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigInteger getCurrentConnections() {
		return this.currentConnections;
	}

	public void setCurrentConnections(BigInteger currentConnections) {
		this.currentConnections = currentConnections;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte getEmailVerified() {
		return this.emailVerified;
	}

	public void setEmailVerified(byte emailVerified) {
		this.emailVerified = emailVerified;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getProvider() {
		return this.provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getProviderId() {
		return this.providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public BigInteger getTotalConnections() {
		return this.totalConnections;
	}

	public void setTotalConnections(BigInteger totalConnections) {
		this.totalConnections = totalConnections;
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getUsertype() {
		return this.usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public List<ContactInformation> getContactInformations() {
		return this.contactInformations;
	}

	public void setContactInformations(List<ContactInformation> contactInformations) {
		this.contactInformations = contactInformations;
	}

	public ContactInformation addContactInformation(ContactInformation contactInformation) {
		getContactInformations().add(contactInformation);
		contactInformation.setUser(this);

		return contactInformation;
	}

	public ContactInformation removeContactInformation(ContactInformation contactInformation) {
		getContactInformations().remove(contactInformation);
		contactInformation.setUser(null);

		return contactInformation;
	}

	public SocietyDetail getSocietyDetail() {
		return this.societyDetail;
	}

	public void setSocietyDetail(SocietyDetail societyDetail) {
		this.societyDetail = societyDetail;
	}

}