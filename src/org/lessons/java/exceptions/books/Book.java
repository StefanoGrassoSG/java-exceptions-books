package org.lessons.java.exceptions.books;

public class Book {
	
	String title;
	int pagesNumber;
	String author;
	String publisher;
	
	public Book(String title, int pagesNumber, String author, String publisher) {
		setTitle(title);
		setPagesNumber(pagesNumber);
		setAuthor(author);
		setPublisher(publisher);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPagesNumber() {
		return pagesNumber;
	}

	public void setPagesNumber(int pagesNumber) {
		this.pagesNumber = pagesNumber;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	@Override
	public String toString() {
		
		return  "Book:\n"
				+ "Title: " + getTitle() + "\n"
				+ "Pages number code: " + getPagesNumber() + "\n"
				+ "Author: " + getAuthor() + "\n"
				+ "Publisher: " + getPublisher();
	}
}
