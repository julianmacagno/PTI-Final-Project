package com.pti.beans;

import java.io.Serializable;

public class UserTypeBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private int userTypeId;
	private String userType;

	public UserTypeBean() {
		super();
	}
	
	public UserTypeBean(int userId, String type) {
		super();
		this.userTypeId = userId;
		this.userType = type;
	}

	@Override
	public String toString() {
		return "UserTypeBean [userTypeId=" + userTypeId + ", userType=" + userType + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userType == null) ? 0 : userType.hashCode());
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
		if (userType == null) {
			if (other.userType != null)
				return false;
		} else if (!userType.equals(other.userType))
			return false;
		if (userTypeId != other.userTypeId)
			return false;
		return true;
	}

	public int getUserTypeId() {
		return this.userTypeId;
	}

	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
	}
	
	public String getUserType() {
		return this.userType;
	}
	
	public void setUserType(String userType) {
		this.userType = userType;
	}
}
