package com.pti.controllers;

import java.util.HashMap;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pti.models.AuthModel;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class AuthController {
	
	@RequestMapping(value = "/loginUser", method = RequestMethod.GET)
	public HashMap<String, String> loginUser(@RequestParam(value="username") String username, 
							@RequestParam(value="password") String password) {
		HashMap<String, String> map = new HashMap<>();
		
		if(AuthModel.loginUser(username, password)) {
	    	map.put("status", "Exists");
	    } else {
	    	map.put("status", "Not exists");
	    }
	    return map;
    }
	
	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public HashMap<String, String> registerUser(@RequestParam(value="name") String name, 
								 @RequestParam(value="surname") String surname, 
								 @RequestParam(value="dni") String dni,
								 @RequestParam(value="birthDate") String birthDate,
								 @RequestParam(value="userType") String userType,
								 @RequestParam(value="cuil_cuit") String cuil_cuit,
								 @RequestParam(value="email") String email,
								 @RequestParam(value="username") String username,
								 @RequestParam(value="password") String password,
								 @RequestParam(value="phoneNumber") String phoneNumber,
								 @RequestParam(value="address") String address,
								 @RequestParam(value="rating", defaultValue = "0") String rating,
								 @RequestParam(value="bussinesName") String bussinesName) {
		HashMap<String, String> map = new HashMap<>();
		
		if(AuthModel.registerUser(name, surname, dni, birthDate, userType, cuil_cuit, email, username, password, phoneNumber, address, rating, bussinesName)) {
	    	map.put("status", "Ok");
	    } else {
	    	map.put("status", "Error");
	    }
	    return map;
    }
}
