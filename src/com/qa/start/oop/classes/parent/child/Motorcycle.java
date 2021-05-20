package com.qa.start.oop.classes.parent.child;

import com.qa.start.oop.classes.parent.Vehicle;

public class Motorcycle extends Vehicle {
	boolean hasPassengerSeat;
	
	public Motorcycle() {
		this("unknown");
	}
	public Motorcycle(String brand) {
		this(brand, "unknown", 2);
	}
	public Motorcycle(String brand, String color, int numOfWheel) {
		super(brand,color, numOfWheel);
		this.hasPassengerSeat = false;
	}
	public void setPassengerSeat(boolean hasPassengerSeat) {
		this.hasPassengerSeat = hasPassengerSeat;
	}
	public boolean hasPassengerSeat() {
		return hasPassengerSeat;
	}
}
