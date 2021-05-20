package com.qa.start.oop.inheritance;

public class Person {
	private String name; 
	public int age;
	public String gender;
	public boolean isBreathing;
	
	public Person() {
        this("Unknown");
	}
	public Person(String name){
		this(name, 0, "");
	}
	public Person(String name, int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
	public void reads(String b) {
		System.out.println(this.name + " reads: " + b);
	}
}
