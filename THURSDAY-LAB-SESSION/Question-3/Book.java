package com.student_result;

public class Book {
	
	private String bookName;
	private String isbnNumber;
	private String authorName;
	private String publisher;
	
	public Book(String bookName, String isbnNumber, String authorName, String publisher) {
		this.bookName = bookName;
		this.isbnNumber = isbnNumber;
		this.authorName = authorName;
		this.publisher = publisher;
	}
	

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	public void setIsbnNumber(String isbnNumber) {
		this.isbnNumber = isbnNumber;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String getBookInfo() {
		String description = "Book Name: " + getBookName() + "\n" +
								"ISBN Number: " + getIsbnNumber() + "\n" +
								"Author Name: " + getAuthorName() + "\n" +
								"Publisher: " + getPublisher();
		return description;
	}
	
	public static void main(String[] args) {
		System.out.println("Question: _______________________________________________________________________________________________________");
		System.out.println("Create a class called Book to represent a book. A Book should include four pieces of information\r\n"
				+ "as instance variables‐a book name, an ISBN number, an author name and a publisher. Your class\r\n"
				+ "should have a constructor that initializes the four instance variables. Provide a mutator method\r\n"
				+ "and accessor method (query method) for each instance variable. In addition, provide a method\r\n"
				+ "named getBookInfo that returns the description of the book as a String (the description should\r\n"
				+ "include all the information about the book). You should use this keyword in member methods\r\n"
				+ "and constructor. Write a test application named BookTest to create an array of object for 30\r\n"
				+ "elements for class Book to demonstrate the class Book's capabilities.");
		System.out.println("_______________________________________________________________________________________________________");
		System.out.println("Solution: ");
		
		
		Book b = new Book("Information Technology", "SN00235", "Stanley Wright", "Express Publishing");
		System.out.println(b.getBookInfo());
	}
	

}
