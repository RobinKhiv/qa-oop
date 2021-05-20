package com.qa.start.oop.abstraction.base;

public abstract class Vehicle implements Drivable {
	private String brand;
	private String color;
	private int numOfWheel;
	
	public Vehicle() {
		this("unknown","unknown", 0);
	}
	public Vehicle(String brand, String color, int numOfWheel) {
		this.color = color;
		this.brand = brand;
		this.numOfWheel = numOfWheel;
	}
	public void accelerating() {
		System.out.println( this.brand + " is accelerating");
		
	}
	public void braking() {
		System.out.println(this.brand + " is braking");
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setWheel(int w) {
		this.numOfWheel = w;
	}
	public int getWheel() {
		return numOfWheel;
	}
	
}
