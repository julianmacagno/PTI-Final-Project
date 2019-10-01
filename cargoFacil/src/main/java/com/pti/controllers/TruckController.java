package com.pti.controllers;

import java.util.HashMap;
import java.util.LinkedList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pti.beans.TruckTypeBean;
import com.pti.models.TruckModel;

@RestController
public class TruckController {
	@RequestMapping(value = "/getTruckTypes", method = RequestMethod.GET)
	public LinkedList<TruckTypeBean> getUserTypes() {
		return TruckModel.getTruckTypes();
	}
	
	
	@RequestMapping(value = "/insertTruck", method = RequestMethod.POST)
	public HashMap<String, String> insertTruck(@RequestParam(value="owner") String owner, 
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
		HashMap<String, String> map = new HashMap<String, String>();
		if(TruckModel.insertTruck(owner, plate, brand, model, year, tare, maxWeigth, maxVolume, axleNum, chassisNum, truckType)) {
			map.put("status", "Ok");
		} else {
			map.put("status", "Error");
		}
		return map;
    }
}
