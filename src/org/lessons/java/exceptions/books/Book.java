package org.lessons.java.exceptions.books;

public class Book {
	
	String title;
	int pagesNumber;
	String author;
	String publisher;
	
	public Book(String title, int pagesNumber, String author, String publisher) throws Exception {
		setTitle(title);
		setPagesNumber(pagesNumber);
		setAuthor(author);
		setPublisher(publisher);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws Exception {
		if (title == null || title.isEmpty() || title.length() <= 3) 
			throw new TitleException("title must be longer then 3 characters");
		
		this.title = title;
	}

	public int getPagesNumber() {
		return pagesNumber;
	}

	public void setPagesNumber(int pagesNumber) throws Exception {
		if (pagesNumber  < 1) 
			throw new PagesException("pagesNumber must be more then 0");
		
		this.pagesNumber = pagesNumber;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) throws Exception {
		if (author == null || author.isEmpty() || author.length() <= 3) 
			throw new AuthorException("author must be longer then 3 characters");
		
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) throws Exception {
		if (publisher == null || publisher.isEmpty() || publisher.length() <= 3) 
			throw new PublisherException("author must be longer then 3 characters");
		
		this.publisher = publisher;
	}
	
	@Override
	public String toString() {
		
		return  "Book:\n"
				+ "Title: " + getTitle() + "\n"
				+ "Pages number code: " + getPagesNumber() + "\n"
				+ "Author: " + getAuthor() + "\n"
				+ "Publisher: " + getPublisher() + "\n";
				
	}
}
