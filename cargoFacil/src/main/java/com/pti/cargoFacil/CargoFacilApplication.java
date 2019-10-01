package com.pti.cargoFacil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.pti.cargoFacil","com.pti.controllers"} )
public class CargoFacilApplication {
	public static void main(String[] args) {
		SpringApplication.run(CargoFacilApplication.class, args);
	}
}
