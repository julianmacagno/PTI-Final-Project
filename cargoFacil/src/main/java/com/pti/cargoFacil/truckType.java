package com.pti.cargoFacil;

public class truckType {
	
	private int truckTypeId;

	public truckType() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "truckType [truckTypeId=" + truckTypeId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + truckTypeId;
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
		truckType other = (truckType) obj;
		if (truckTypeId != other.truckTypeId)
			return false;
		return true;
	}

	public int getTruckTypeId() {
		return truckTypeId;
	}

	public void setTruckTypeId(int truckTypeId) {
		this.truckTypeId = truckTypeId;
	}
	
	
}
