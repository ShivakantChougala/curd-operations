
package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Bike;
import com.example.demo.service.BikeService;

@RestController
@RequestMapping("/bike")
public class ControllerBike {
	
	 BikeService bikeService;
	
	public ControllerBike(BikeService bikeService) {
		super();
		this.bikeService=bikeService;
	}
	
	//create and store bike object
	@PostMapping
	public Bike createBike(@RequestBody Bike bike) {
		
		return bikeService.createBike(bike);
		
	}
	
	//read bike for a specific reNumber
	
	@GetMapping("{regNumber}")
	public Bike getBikeById(@PathVariable String regNumber) {
		System.out.println("--------->controller-----");
		
		Bike b1=bikeService.readBike(regNumber);
		return b1;
	}
	//read all bikes
	
	@GetMapping
	public List<Bike> redAllBike(){
		List<Bike> bikeList=bikeService.readAllBike();
		
		return bikeList;
	}
	
	//update bike
	
	@PutMapping
	public Bike updateBike(@RequestBody Bike bike
			) {
		
		Bike bike1=bikeService.updateBike(bike);
		return  bike1;
	}
	
	//delete bike
	
	@DeleteMapping("{regNumber}")
	 public String deleteBike(@PathVariable String regNumber) {
		
		String msg=bikeService.deleteBike(regNumber);
		
		return msg;
	}
	
	@DeleteMapping
	
	public String deleteAll(){
		
		String b1=bikeService.deleteAll();
		return b1;
	}

}
