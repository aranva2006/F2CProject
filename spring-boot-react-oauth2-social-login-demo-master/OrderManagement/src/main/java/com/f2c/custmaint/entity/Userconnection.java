package com.f2c.custmaint.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the userconnection database table.
 * 
 */
@Entity
@NamedQuery(name="Userconnection.findAll", query="SELECT u FROM Userconnection u")
public class Userconnection implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UserconnectionPK id;

	private String accesstoken;

	private String displayname;

	private BigInteger expiretime;

	private String imageurl;

	private String profileurl;

	private int rank;

	private String refreshtoken;

	private String secret;

	public Userconnection() {
	}

	public UserconnectionPK getId() {
		return this.id;
	}

	public void setId(UserconnectionPK id) {
		this.id = id;
	}

	public String getAccesstoken() {
		return this.accesstoken;
	}

	public void setAccesstoken(String accesstoken) {
		this.accesstoken = accesstoken;
	}

	public String getDisplayname() {
		return this.displayname;
	}

	public void setDisplayname(String displayname) {
		this.displayname = displayname;
	}

	public BigInteger getExpiretime() {
		return this.expiretime;
	}

	public void setExpiretime(BigInteger expiretime) {
		this.expiretime = expiretime;
	}

	public String getImageurl() {
		return this.imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public String getProfileurl() {
		return this.profileurl;
	}

	public void setProfileurl(String profileurl) {
		this.profileurl = profileurl;
	}

	public int getRank() {
		return this.rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getRefreshtoken() {
		return this.refreshtoken;
	}

	public void setRefreshtoken(String refreshtoken) {
		this.refreshtoken = refreshtoken;
	}

	public String getSecret() {
		return this.secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

}