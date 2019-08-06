package com.pti.cargoFacil.beans;

import java.io.Serializable;
import java.sql.Date;

public class PersonBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private int personId;
	private String name;
	private String surname;
	private int dni;
	private Date birthDate;
	private int userType;
	private String cuil_cuit;
	private String email;
	private String userName;
	private String phoneNumber;
	private String address;
	private int rating;
	private String bussinessName;
	
	public PersonBean() {
		super();	
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", surname=" + surname + ", dni=" + dni
				+ ", birthDate=" + birthDate + ", userType=" + userType + ", cuil_cuit=" + cuil_cuit + ", email="
				+ email + ", userName=" + userName + ", phoneNumber=" + phoneNumber + ", address=" + address
				+ ", rating=" + rating + ", bussinessName=" + bussinessName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + ((bussinessName == null) ? 0 : bussinessName.hashCode());
		result = prime * result + ((cuil_cuit == null) ? 0 : cuil_cuit.hashCode());
		result = prime * result + dni;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + personId;
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + rating;
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + userType;
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
		PersonBean other = (PersonBean) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (bussinessName == null) {
			if (other.bussinessName != null)
				return false;
		} else if (!bussinessName.equals(other.bussinessName))
			return false;
		if (cuil_cuit == null) {
			if (other.cuil_cuit != null)
				return false;
		} else if (!cuil_cuit.equals(other.cuil_cuit))
			return false;
		if (dni != other.dni)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (personId != other.personId)
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (rating != other.rating)
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userType != other.userType)
			return false;
		return true;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	public String getCuil_cuit() {
		return cuil_cuit;
	}

	public void setCuil_cuit(String cuil_cuit) {
		this.cuil_cuit = cuil_cuit;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getBussinessName() {
		return bussinessName;
	}

	public void setBussinessName(String bussinessName) {
		this.bussinessName = bussinessName;
	}
	
	
}
