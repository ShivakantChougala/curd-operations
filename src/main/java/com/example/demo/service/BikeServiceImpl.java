package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Bike;
import com.example.demo.repository.BikeRepository;

@Service
public class BikeServiceImpl implements  BikeService{
	
	BikeRepository bikeRepository;
	
 public BikeServiceImpl(BikeRepository bikeRepository) {
		super();
		this.bikeRepository= bikeRepository;
	}

	@Override
	public Bike createBike(Bike bike) {
		
		return bikeRepository.save(bike);
	}

	@Override
	public Bike readBike(String regNumber) {
		
		System.out.println("--------->serviceImlp-----");
		Bike b1=bikeRepository.findById(regNumber).get();
		
		return b1;
		//return bikeRepository.findById(regNumber).get();
	}

	@Override
	public List<Bike> readAllBike() {
		List<Bike> bikeList=bikeRepository.findAll();
		return bikeList;
	}

	@Override
	public Bike updateBike(Bike bike) {
		Bike b1=bikeRepository.save(bike);
		return b1;
	}

	@Override
	public String deleteBike(String RegNumber) {
		
		bikeRepository.deleteById(RegNumber);
		
		return " bike deteate";
	}

	@Override
	public String deleteAll() {
		bikeRepository.deleteAll();
		return "delete all";
	}

}
