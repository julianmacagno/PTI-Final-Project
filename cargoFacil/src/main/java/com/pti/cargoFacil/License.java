package com.pti.cargoFacil;

import java.sql.Date;

public class License {

	private int licenseId;
	private Date expirationDate;
	private String licenseType;
	private String emergencyNumber;
	
	public License() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "License [licenseId=" + licenseId + ", expirationDate=" + expirationDate + ", licenseType=" + licenseType
				+ ", emergencyNumber=" + emergencyNumber + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emergencyNumber == null) ? 0 : emergencyNumber.hashCode());
		result = prime * result + ((expirationDate == null) ? 0 : expirationDate.hashCode());
		result = prime * result + licenseId;
		result = prime * result + ((licenseType == null) ? 0 : licenseType.hashCode());
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
		License other = (License) obj;
		if (emergencyNumber == null) {
			if (other.emergencyNumber != null)
				return false;
		} else if (!emergencyNumber.equals(other.emergencyNumber))
			return false;
		if (expirationDate == null) {
			if (other.expirationDate != null)
				return false;
		} else if (!expirationDate.equals(other.expirationDate))
			return false;
		if (licenseId != other.licenseId)
			return false;
		if (licenseType == null) {
			if (other.licenseType != null)
				return false;
		} else if (!licenseType.equals(other.licenseType))
			return false;
		return true;
	}

	public int getLicenseId() {
		return licenseId;
	}

	public void setLicenseId(int licenseId) {
		this.licenseId = licenseId;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getLicenseType() {
		return licenseType;
	}

	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}

	public String getEmergencyNumber() {
		return emergencyNumber;
	}

	public void setEmergencyNumber(String emergencyNumber) {
		this.emergencyNumber = emergencyNumber;
	}
	
}
