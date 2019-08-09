package com.pti.cargoFacil.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pti.models.TruckDriverModel;

@RestController
public class TruckDriverController {
	@RequestMapping(value = "/insertTruckDriverAndLicense", method = RequestMethod.POST)
	public String insertTruckDriverAndLicense(@RequestParam(value="dni") String dni, 
								 @RequestParam(value="expirationDate") String expirationDate, 
								 @RequestParam(value="licenseType") String licenseType,
								 @RequestParam(value="emergencyNumber") String emergencyNumber) {
		return (TruckDriverModel.insertTruckDriverAndLicense(dni, expirationDate, licenseType, emergencyNumber) ? "Ok" : "Error");
    }
}
