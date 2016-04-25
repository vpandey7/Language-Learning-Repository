package oops;

public class Book {
	String name;
	Author author;
	double price;
	int qtyInStock;
	
	public Book(String name, Author author, double price){
		
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public Book(String name, Author author, double price, int qtyInStock) {
		
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}
	
	public String getAuthorName(){
		return author.getName();
	}
	
	public String getAuthorEmail(){
		return author.getEmail();
		
	}
	
	public char getAuthorGender() {
		return author.getGender();
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + "]";
	}
	
	
	

}
