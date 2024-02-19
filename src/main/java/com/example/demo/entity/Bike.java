package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bike {
	
	@Id
	String regNumber;
	String module;
	double cost;
	public Bike() {
		super();
	}
	public Bike(String regNumber, String module, double cost) {
		super();
		this.regNumber = regNumber;
		this.module = module;
		this.cost = cost;
	}
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Bike [regNumber=" + regNumber + ", module=" + module + ", cost=" + cost + "]";
	}
	
	
	

}
