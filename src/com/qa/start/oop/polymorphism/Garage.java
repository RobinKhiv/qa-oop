package com.qa.start.oop.polymorphism;

import java.util.ArrayList;
import java.util.List;

import com.qa.start.oop.classes.parent.Vehicle;
import com.qa.start.oop.classes.parent.child.Car;
import com.qa.start.oop.classes.parent.child.Motorcycle;

public class Garage {
	// Using a List implementation, store all your vehicles in a Garage class.
	List<Vehicle> storage;
	public Garage() {
		storage = new ArrayList<Vehicle>();
	}
	//Create a method in Garage that iterates through each Vehicle, calculating
	//	a bill for each type of Vehicle in a different way, depending on the type 
	//	of vehicle it is.  You can decide how this bill is calculated based on 
	//	any attributes you see fit. (You do not get extra marks for making the 
	//	calculation overly complex) 
	public double getBill() {
		double total = 0d;
		
		for(Vehicle v: storage) {
			if(v instanceof Car)
				total+= 500d;
			else if (v instanceof Motorcycle)
				total+= 200d;
			else
				total+= 100d;
		}
		
		return total;
	}
	 
	//Garage should have methods that add Vehicle, remove Vehicle(s)
	//	(By ID, By Vehicle Type) fix Vehicle (Calculate bill) and empty the garage
	public void add(Vehicle v) {
		storage.add(v);
	}
	public void remove(Vehicle v) {
		storage.remove(v);
	}
}
