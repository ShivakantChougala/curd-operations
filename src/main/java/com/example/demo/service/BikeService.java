package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Bike;

public interface BikeService {
	

	//create and store bike object
	
	Bike createBike(Bike bike);
	
	//read bike for a specific reNumber
	
	Bike readBike(String RegNumber);
	
	//read all bikes
	
	 List<Bike>  readAllBike();
	
	//update bike
	
	 Bike updateBike(Bike bike);
	 
	//delete bike
	 
	 String deleteBike(String RegNumber);

	String deleteAll();

}
