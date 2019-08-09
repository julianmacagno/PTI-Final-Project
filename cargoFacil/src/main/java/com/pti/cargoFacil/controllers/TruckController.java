package com.pti.cargoFacil.controllers;

import java.util.LinkedList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pti.cargoFacil.beans.TruckTypeBean;
import com.pti.models.TruckModel;

public class TruckController {
	@RequestMapping(value = "/getTruckTypes", method = RequestMethod.POST)
	public LinkedList<TruckTypeBean> getUserTypes() {
		return TruckModel.getTruckTypes();
	}
	
	
	@RequestMapping(value = "/insertTruck", method = RequestMethod.POST)
	public String insertTruck(@RequestParam(value="owner") String owner, 
							  @RequestParam(value="plate") String plate, 
							  @RequestParam(value="brand") String brand,
							  @RequestParam(value="model") String model,
							  @RequestParam(value="year") String year,
							  @RequestParam(value="tare") String tare,
							  @RequestParam(value="maxWeigth") String maxWeigth,
							  @RequestParam(value="maxVolume") String maxVolume,
							  @RequestParam(value="axleNum") String axleNum,
							  @RequestParam(value="chassisNum") String chassisNum,
							  @RequestParam(value="truckType") String truckType) {
		return (TruckModel.insertTruck(owner, plate, brand, model, year, tare, maxWeigth, maxVolume, axleNum, chassisNum, truckType) ? "Ok" : "Error");
    }
}
