package com.pti.cargoFacil.beans;

import java.io.Serializable;
import java.sql.Date;

public class ShipmentBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private int shipmentId;
	private String origin;
	private String destination;
	private short distance;
	private Date initDate;
	private Date arrivalDate;
	
	public ShipmentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Shipment [shipmentId=" + shipmentId + ", origin=" + origin + ", destination=" + destination
				+ ", distance=" + distance + ", initDate=" + initDate + ", arrivalDate=" + arrivalDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arrivalDate == null) ? 0 : arrivalDate.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + distance;
		result = prime * result + ((initDate == null) ? 0 : initDate.hashCode());
		result = prime * result + ((origin == null) ? 0 : origin.hashCode());
		result = prime * result + shipmentId;
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
		ShipmentBean other = (ShipmentBean) obj;
		if (arrivalDate == null) {
			if (other.arrivalDate != null)
				return false;
		} else if (!arrivalDate.equals(other.arrivalDate))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (distance != other.distance)
			return false;
		if (initDate == null) {
			if (other.initDate != null)
				return false;
		} else if (!initDate.equals(other.initDate))
			return false;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		if (shipmentId != other.shipmentId)
			return false;
		return true;
	}

	public int getShipmentId() {
		return shipmentId;
	}

	public void setShipmentId(int shipmentId) {
		this.shipmentId = shipmentId;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public short getDistance() {
		return distance;
	}

	public void setDistance(short distance) {
		this.distance = distance;
	}

	public Date getInitDate() {
		return initDate;
	}

	public void setInitDate(Date initDate) {
		this.initDate = initDate;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	
	
}
