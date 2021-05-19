package com.qa.start.oop.classes;

public class Person {
	private String name; 
	public int age;
	public String gender;
	public boolean isBreathing;
	
	Person(String name){
		this(name, 0, "");
	}
	Person(String name, int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return this.name;
	}
}
