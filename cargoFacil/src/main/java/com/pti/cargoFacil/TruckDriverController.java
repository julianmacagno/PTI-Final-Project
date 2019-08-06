package com.pti.cargoFacil;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pti.truckDriver.TruckDriverUser;
import com.pti.truckDriver.TruckDriverUserHelper;

@RestController
public class TruckDriverController {
	
	@RequestMapping(value = "/truckDriver", method = RequestMethod.GET)
	public List<TruckDriverUser> truckDriverGET(@RequestParam(value="name", defaultValue="World") String name, 
												@RequestParam(value="type", defaultValue="World") String type) {
		return TruckDriverUserHelper.getTruckDriverUserFromDB();
    }
	
//	@RequestMapping(value = "/truckDriver", method = RequestMethod.POST)
//	public List<TruckDriverUser> truckDriverPost(@RequestParam(value="name", defaultValue="World") String name) {
//		// llamada a funcion que resuelva pegarle a la base de datos
//  }
	
	//mas rutas
	
	
	//mas rutas
}
