package com.pti.beans;

import java.io.Serializable;

public class TruckTypeBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private int truckTypeId;
	private String truckType;

	public TruckTypeBean() {
		super();
	}
	
	public TruckTypeBean(int truckTypeId, String truckType) {
		super();
		this.truckTypeId = truckTypeId;
		this.truckType = truckType;
	}

	@Override
	public String toString() {
		return "TruckTypeBean [truckTypeId=" + truckTypeId + ", truckType=" + truckType + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((truckType == null) ? 0 : truckType.hashCode());
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
		if (truckType == null) {
			if (other.truckType != null)
				return false;
		} else if (!truckType.equals(other.truckType))
			return false;
		if (truckTypeId != other.truckTypeId)
			return false;
		return true;
	}

	public int getTruckTypeId() {
		return this.truckTypeId;
	}

	public void setTruckTypeId(int truckTypeId) {
		this.truckTypeId = truckTypeId;
	}

	public String getTruckType() {
		return this.truckType;
	}

	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}	
}
