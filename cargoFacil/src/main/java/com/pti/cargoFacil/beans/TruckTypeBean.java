package com.pti.cargoFacil.beans;

import java.io.Serializable;

public class TruckTypeBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private int truckTypeId;

	public TruckTypeBean() {
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
		TruckTypeBean other = (TruckTypeBean) obj;
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
