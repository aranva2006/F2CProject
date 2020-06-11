package com.f2c.order.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the userconnection database table.
 * 
 */
@Embeddable
public class UserconnectionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String userid;

	private String provideruserid;

	private String providerid;

	public UserconnectionPK() {
	}
	public String getUserid() {
		return this.userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getProvideruserid() {
		return this.provideruserid;
	}
	public void setProvideruserid(String provideruserid) {
		this.provideruserid = provideruserid;
	}
	public String getProviderid() {
		return this.providerid;
	}
	public void setProviderid(String providerid) {
		this.providerid = providerid;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UserconnectionPK)) {
			return false;
		}
		UserconnectionPK castOther = (UserconnectionPK)other;
		return 
			this.userid.equals(castOther.userid)
			&& this.provideruserid.equals(castOther.provideruserid)
			&& this.providerid.equals(castOther.providerid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userid.hashCode();
		hash = hash * prime + this.provideruserid.hashCode();
		hash = hash * prime + this.providerid.hashCode();
		
		return hash;
	}
}