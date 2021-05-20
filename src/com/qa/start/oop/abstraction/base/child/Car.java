package com.qa.start.oop.abstraction.base.child;

import com.qa.start.oop.abstraction.base.Vehicle;

public class Car extends Vehicle {
    
	public Car(){
		this("unknown","unknown",0);
	}
	public Car(String brand, String color, int numOfWheel) {
		super(brand, color, numOfWheel);
	}
	@Override
	public void accelerating() {
		System.out.println(model + " is accelerating");
		
	}
	@Override
	public void braking() {
		System.out.println(model + " is braking");
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
}
