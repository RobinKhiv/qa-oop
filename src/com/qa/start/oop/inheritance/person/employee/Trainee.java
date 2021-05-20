package com.qa.start.oop.inheritance.person.employee;

import java.util.List;

import com.qa.start.oop.inheritance.person.Employee;

import java.util.ArrayList;

public class Trainee extends Employee{
	//a field bursary of type double
	private double bursary;
	//a list of subjects learned as a field called subjectsLearned
	List<String> subjectsLearned;
	public Trainee(){
		this("unknown");
	}
	public Trainee(String name) {
		this(name, 0);
	}
	public Trainee(String name, double bursary) {
		super(name);
		this.bursary = bursary;
		this.subjectsLearned = new ArrayList<String>();
	}
	//a method addSubject() for adding a new subject to the list.
	public void addSubject(String sub) {
		subjectsLearned.add(sub);
	}
	public String getSubjects() {
		String result = super.getName() + " has taken: ";
		
		for(String sub: subjectsLearned)
			result= result + sub + ", "; 
		
		result = result.substring(0, result.length() - 2);
		result+= ".";
		return result;
	}
}
