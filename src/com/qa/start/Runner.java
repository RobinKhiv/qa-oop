package com.qa.start;

import com.qa.start.oop.inheritance.Book;
import com.qa.start.oop.inheritance.Person;
import com.qa.start.oop.inheritance.person.employee.Manager;
import com.qa.start.oop.inheritance.person.employee.Trainee;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an instance of a Person who has a name.
		Person p1 = new Person("John");
		//Create an instance of a Book with a title
		Book b1 = new Book("Introduction To Algorithms");

		
		//implement a read method in the Person class
		//use your instance of Person to read the book - so that:
		//"{person name} reads: {book title here}"
		p1.reads(b1.getTitle());
		
		//INHERITANCE
		Manager m = new Manager("Rob");
		Trainee t = new Trainee("Derek");
		Trainee t2 = new Trainee("John");
		
		m.addEmployee(t);
		m.addEmployee(t2);
		System.out.println(m.employeeUnderManager());
		
		m.removeEmployee("John");
		System.out.println(m.employeeUnderManager());
		
	}

}
