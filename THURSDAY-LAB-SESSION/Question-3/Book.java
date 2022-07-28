class Book {
	
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
		System.out.println("Question: _____________________________________________________________________________________________");
		System.out.println("We have to calculate the percentage of marks obtained in three subjects (each out of\r\n"
				+ "100) by student A and in four subjects (each out of 100) by student B. Create an abstract\r\n"
				+ "class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other\r\n"
				+ "classes 'A' and 'B' each having a method with the same name which returns the\r\n"
				+ "percentage of the students. The constructor of student A takes the marks in three\r\n"
				+ "subjects as its parameters and the marks in four subjects as its parameters for student\r\n"
				+ "B. Create an object for eac of the two classes and print the percentage of marks for both\r\n"
				+ "the students.");
		Book b = new Book("Information Technology", "SN00235", "Stanley Wright", "Express Publishing");
		System.out.println("_______________________________________________________________________________________________________");
		System.out.println("Solution: ");
		System.out.println(b.getBookInfo());
	}
	

}
