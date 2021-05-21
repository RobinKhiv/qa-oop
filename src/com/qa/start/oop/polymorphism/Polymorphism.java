package com.qa.start.oop.polymorphism;

import com.qa.start.oop.classes.parent.Vehicle;
import com.qa.start.oop.classes.parent.child.Boat;
import com.qa.start.oop.classes.parent.child.Car;
import com.qa.start.oop.classes.parent.child.Motorcycle;

public class Polymorphism {
	public static void start() {
		//1). Using Vehicle as a base class, create three derived classes (car, motorcycle etc.), 
		//	each derived class should have its own attributes in addition to the normal Vehicle attributes. 
		Vehicle car1 = new Car("Mazda");
		Vehicle moto = new Motorcycle("harley");
		Vehicle boat = new Boat("Sea Ray");
		Vehicle moto2 = new Motorcycle("Ducati");
		//2). Using a List implementation, store all your vehicles in a Garage class.
		
		Garage g = new Garage();
		
		double bill = 0d;
		g.add(car1);
		g.add(moto);
		g.add(boat);
		g.add(moto2);
		bill = g.getBill();
		System.out.println("Garage bill: $" + bill );
		
		g.removeById(0);
		bill = g.getBill();
		System.out.println("Garage bill w/o car: $" + bill);
		
		g.add(car1);
		g.removeByType(moto);
		System.out.println("Garage bill w/o motorcycles: " + bill);
		
		g.emptyGarage();
		bill = g.getBill();
		System.out.println("Garage bill w/ no vehicles: $" + bill);
		
	}
}
