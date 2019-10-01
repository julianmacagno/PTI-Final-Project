package com.pti.controllers;

import java.util.LinkedList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pti.models.ShipmentModel;

@RestController
public class ShipmentController {
	@RequestMapping(value = "/registerRandomShipment", method = RequestMethod.GET)
	public LinkedList<String> registerRandomShipment() {
		return ShipmentModel.RegisterRandomShipmentFromFile();
    }
}
