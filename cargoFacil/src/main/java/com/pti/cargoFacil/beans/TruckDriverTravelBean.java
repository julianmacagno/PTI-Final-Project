package com.pti.cargoFacil.beans;

import java.io.Serializable;

public class TruckDriverTravelBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private int truckDriverTravelId;
	private int truck;
	private int shipment;

	public TruckDriverTravelBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "truckDriverTravel [truckDriverTravelId=" + truckDriverTravelId + ", truck=" + truck + ", shipment="
				+ shipment + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + shipment;
		result = prime * result + truck;
		result = prime * result + truckDriverTravelId;
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
		TruckDriverTravelBean other = (TruckDriverTravelBean) obj;
		if (shipment != other.shipment)
			return false;
		if (truck != other.truck)
			return false;
		if (truckDriverTravelId != other.truckDriverTravelId)
			return false;
		return true;
	}

	public Integer getTruckDriverTravelId() {
		return truckDriverTravelId;
	}

	public void setTruckDriverTravelId(Integer truckDriverTravelId) {
		this.truckDriverTravelId = truckDriverTravelId;
	}

	public Integer getTruck() {
		return truck;
	}

	public void setTruck(Integer truck) {
		this.truck = truck;
	}

	public Integer getShipment() {
		return shipment;
	}

	public void setShipment(Integer shipment) {
		this.shipment = shipment;
	}
	
}
