package com.qa.start.oop.classes;

public class Book {
	private String title;
	private String author;
	private String genre;
	private String edition;
	private int pageCount;
	private boolean isOpen;

	public Book(String title) {
		this(title, 0, "");
	}
	public Book(String title, int pageCount, String edition) {
		this.title = title;
		this.pageCount = pageCount;
		this.edition = edition;
		this.isOpen = false;
	}
	public void open() {
		this.isOpen = true;
	}
	public void close() {
		this.isOpen = false;
	}
}
