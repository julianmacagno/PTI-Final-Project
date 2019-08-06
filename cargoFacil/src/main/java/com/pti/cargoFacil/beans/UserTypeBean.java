package com.pti.cargoFacil.beans;

import java.io.Serializable;

public class UserTypeBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private int userTypeId;

	public UserTypeBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "userType [userTypeId=" + userTypeId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + userTypeId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserTypeBean other = (UserTypeBean) obj;
		if (userTypeId != other.userTypeId)
			return false;
		return true;
	}

	public int getUserTypeId() {
		return userTypeId;
	}

	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
	}
	
}
