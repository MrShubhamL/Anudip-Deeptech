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
		Book b = new Book("Information Technology", "SN00235", "Stanley Wright", "Express Publishing");
		System.out.println(b.getBookInfo());

	}
	

}
