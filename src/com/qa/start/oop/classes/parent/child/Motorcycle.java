package com.qa.start.oop.classes.parent.child;

import com.qa.start.oop.classes.parent.Vehicle;

public class Motorcycle extends Vehicle {
	
	public Motorcycle() {
		this("unknown", "unknown", 2);
	}
	public Motorcycle(String brand, String color, int numOfWheel) {
		super(brand,color, numOfWheel);
	}

	
}
