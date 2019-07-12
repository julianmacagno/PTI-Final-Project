package com.pti.cargoFacil;

public class userType {
	
	private int userTypeId;

	public userType() {
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
		userType other = (userType) obj;
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
