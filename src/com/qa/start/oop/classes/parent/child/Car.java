package com.qa.start.oop.classes.parent.child;

import com.qa.start.oop.classes.parent.Vehicle;

public class Car extends Vehicle {
    
	public Car(){
		this("unknown","unknown",0);
	}
	public Car(String brand, String color, int numOfWheel) {
		super(brand, color, numOfWheel);
	}

}
