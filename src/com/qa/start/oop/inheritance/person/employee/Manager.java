package com.qa.start.oop.inheritance.person.employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.qa.start.oop.inheritance.person.Employee;

public class Manager extends Employee{
	//Create a Manager class that derives from Employee. This class must have:
	//a list of employees under their supervision in a field called employeesUnderManager
	List<Employee> employeeUnderManager;
	//a method addEmployee() that can add an employee to the list
	public Manager() {
		this("unknown");
	}
	public Manager(String name) {
		super(name);
		employeeUnderManager = new ArrayList<Employee>();
	}
	public void addEmployee(Employee emp) {
		employeeUnderManager.add(emp);
	}
	//a method removeEmployee() that can remove an employee from a list
	public void removeEmployee(String name) {
		Iterator<Employee> iter = employeeUnderManager.listIterator();
		Employee e;
		while(iter.hasNext()) {
			e = iter.next();
			if(e.getName() == name)
				iter.remove();
		}
	}
	public String employeeUnderManager() {
		String result = super.getName() + " is managing: ";
		for(Employee emp: employeeUnderManager) 
			result = result + emp.getName() + ", ";
		result = result.substring(0, result.length() - 2);
		result+= ".";
		return result;
	}
	
}
