package com.qa.start;

import com.qa.start.oop.classes.Person;
import com.qa.start.oop.classes.Book;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("John");
		Book b1 = new Book("Introduction To Algorithms");
		
		System.out.println(p1.getName() + " reads: " + b1.getTitle());
	}

}
