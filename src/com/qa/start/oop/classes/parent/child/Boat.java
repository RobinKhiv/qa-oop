package com.qa.start.oop.classes.parent.child;

import com.qa.start.oop.classes.parent.Vehicle;

public class Boat extends Vehicle {
	private boolean isOnWater;
	public Boat(){
		this("unknown");
	}
	public Boat(String brand) {
		this(brand, "unknown");
	}
	public Boat(String brand, String color) {
		super(brand, color, 0);
		this.isOnWater = false;
	}
	public void driveBoat(boolean b) {
		this.isOnWater = b;
	}
	public boolean isFloating() {
		return isOnWater;
	}
}
