package com.tyss.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Book {
	private String bookName;

	@Autowired
	@Qualifier("book")
	private Author author;

	public Book(String bookName, Author author) {
		super();
		this.bookName = bookName;
		this.author = author;
	}

	public Book() {
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
}
