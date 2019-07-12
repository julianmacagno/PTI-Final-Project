package com.pti.cargoFacil;

public class userTravel {
	
	private int userTravelId;
	private int truckQuantity;
	private int shipment;
	private int loadType;
	private int product;
	
	public userTravel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Integer getId() {
		return userTravelId;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + loadType;
		result = prime * result + product;
		result = prime * result + shipment;
		result = prime * result + truckQuantity;
		result = prime * result + userTravelId;
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
		userTravel other = (userTravel) obj;
		if (loadType != other.loadType)
			return false;
		if (product != other.product)
			return false;
		if (shipment != other.shipment)
			return false;
		if (truckQuantity != other.truckQuantity)
			return false;
		if (userTravelId != other.userTravelId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "userTravel [id=" + userTravelId + ", truckQuantity=" + truckQuantity + ", shipment=" + shipment + ", loadType="
				+ loadType + ", product=" + product + "]";
	}

	public void setId(Integer id) {
		this.userTravelId = id;
	}
	public Integer getTruckQuantity() {
		return truckQuantity;
	}
	public void setTruckQuantity(Integer truckQuantity) {
		this.truckQuantity = truckQuantity;
	}
	public Integer getShipment() {
		return shipment;
	}
	public void setShipment(Integer shipment) {
		this.shipment = shipment;
	}
	public Integer getLoadType() {
		return loadType;
	}
	public void setLoadType(Integer loadType) {
		this.loadType = loadType;
	}
	public Integer getProduct() {
		return product;
	}
	public void setProduct(Integer product) {
		this.product = product;
	}
}
