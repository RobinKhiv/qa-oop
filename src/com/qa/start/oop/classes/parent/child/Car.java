package com.qa.start.oop.classes.parent.child;

import com.qa.start.oop.classes.parent.Vehicle;

public class Car extends Vehicle {
    private int numOfAirbag;
    
	public Car(){
		this("unknown","unknown",0);
	}
	public Car(String brand, String color, int numOfWheel) {
		super(brand, color, numOfWheel);
		this.numOfAirbag = 0;
	}
	public void setNumOfAirbag(int i) {
		this.numOfAirbag = i;
	}
	public int getAirbagCount() {
		return numOfAirbag;
	}
}
