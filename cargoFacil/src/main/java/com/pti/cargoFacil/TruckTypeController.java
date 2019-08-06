package com.pti.cargoFacil;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pti.truckType.TruckType;
import com.pti.truckType.TruckTypeHelper;

@RestController
public class TruckTypeController {
	@RequestMapping(value="/truckType", method = RequestMethod.GET)
	public List<TruckType> truckTypesGET(@RequestParam(value="name", defaultValue="World") String name) {
        return TruckTypeHelper.getTruckTypeFromDB();
    }
	
	//mas rutas
	
	//mas rutas

}
