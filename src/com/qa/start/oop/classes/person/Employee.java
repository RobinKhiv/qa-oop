package com.qa.start.oop.classes.person;

import com.qa.start.oop.classes.Person;

public class Employee extends Person {
	//a field annualSalary of type double
	private double annualSalary;
	//a field weeklySalary of type double
	private double weeklySalary;
	//a method calculateWeeklySalary() which makes use of the formula weeklySalary = annualSalary / 52.
	
	public Employee() {
		this("unknown");
	}
	public Employee(String name){
		this(name, 0);
	}
	public Employee(String name, double annualSalary) {
		super(name);
		this.annualSalary = annualSalary;
		this.weeklySalary = calculateWeeklySalary();
	}
	public double calculateWeeklySalary() {
		return annualSalary/52;
	}
}
