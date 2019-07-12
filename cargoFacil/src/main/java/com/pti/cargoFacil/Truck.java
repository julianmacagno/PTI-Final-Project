package com.pti.cargoFacil;

public class Truck {
	
	private int truckId;
	private int owner;
	private String plate;
	private String brand;
	private String model;
	private short year;
	private short tare;
	private int maxWeight;
	private int maxVolume;
	private int axlesNum;
	private int chassisNum;
	private int truckType;
	
	public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Truck [truckId=" + truckId + ", owner=" + owner + ", plate=" + plate + ", brand=" + brand + ", model="
				+ model + ", year=" + year + ", tare=" + tare + ", maxWeight=" + maxWeight + ", maxVolume=" + maxVolume
				+ ", axlesNum=" + axlesNum + ", chassisNum=" + chassisNum + ", truckType=" + truckType + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + axlesNum;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + chassisNum;
		result = prime * result + maxVolume;
		result = prime * result + maxWeight;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + owner;
		result = prime * result + ((plate == null) ? 0 : plate.hashCode());
		result = prime * result + tare;
		result = prime * result + truckId;
		result = prime * result + truckType;
		result = prime * result + year;
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
		Truck other = (Truck) obj;
		if (axlesNum != other.axlesNum)
			return false;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (chassisNum != other.chassisNum)
			return false;
		if (maxVolume != other.maxVolume)
			return false;
		if (maxWeight != other.maxWeight)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (owner != other.owner)
			return false;
		if (plate == null) {
			if (other.plate != null)
				return false;
		} else if (!plate.equals(other.plate))
			return false;
		if (tare != other.tare)
			return false;
		if (truckId != other.truckId)
			return false;
		if (truckType != other.truckType)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	public int getTruckId() {
		return truckId;
	}

	public void setTruckId(int truckId) {
		this.truckId = truckId;
	}

	public int getOwner() {
		return owner;
	}

	public void setOwner(int owner) {
		this.owner = owner;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public short getYear() {
		return year;
	}

	public void setYear(short year) {
		this.year = year;
	}

	public short getTare() {
		return tare;
	}

	public void setTare(short tare) {
		this.tare = tare;
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	public int getMaxVolume() {
		return maxVolume;
	}

	public void setMaxVolume(int maxVolume) {
		this.maxVolume = maxVolume;
	}

	public int getAxlesNum() {
		return axlesNum;
	}

	public void setAxlesNum(int axlesNum) {
		this.axlesNum = axlesNum;
	}

	public int getChassisNum() {
		return chassisNum;
	}

	public void setChassisNum(int chassisNum) {
		this.chassisNum = chassisNum;
	}

	public int getTruckType() {
		return truckType;
	}

	public void setTruckType(int truckType) {
		this.truckType = truckType;
	}
	
}
