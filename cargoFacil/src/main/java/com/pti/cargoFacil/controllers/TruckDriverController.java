package com.pti.cargoFacil.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pti.models.TruckDriverModel;

public class TruckDriverController {
	@RequestMapping(value = "/insertTruckDriverAndLicense", method = RequestMethod.POST)
	public String insertTruckDriverAndLicense(@RequestParam(value="dni") String dni, 
								 @RequestParam(value="expirationDate") String expirationDate, 
								 @RequestParam(value="licenseType") String licenseType,
								 @RequestParam(value="emergencyNumber") String emergencyNumber) {
		return (TruckDriverModel.insertTruckDriverAndLicense(dni, expirationDate, licenseType, emergencyNumber) ? "Ok" : "Error");
    }
}
