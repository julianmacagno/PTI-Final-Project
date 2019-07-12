package com.pti.cargoFacil;

public class truckDriver {

	private int truckDriverId;
	private int personId;
	private int licenseId;
	
	public truckDriver() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "truckDriver [truckDriverId=" + truckDriverId + ", personId=" + personId + ", licenseId=" + licenseId
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + licenseId;
		result = prime * result + personId;
		result = prime * result + truckDriverId;
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
		truckDriver other = (truckDriver) obj;
		if (licenseId != other.licenseId)
			return false;
		if (personId != other.personId)
			return false;
		if (truckDriverId != other.truckDriverId)
			return false;
		return true;
	}

	public int getTruckDriverId() {
		return truckDriverId;
	}

	public void setTruckDriverId(int truckDriverId) {
		this.truckDriverId = truckDriverId;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public int getLicenseId() {
		return licenseId;
	}

	public void setLicenseId(int licenseId) {
		this.licenseId = licenseId;
	}
	
}
