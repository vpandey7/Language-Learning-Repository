package oops;

public class TestBook {
	public static void main(String[] args) {
		
		Author anAuthor = new Author("Bob Saget", "bob.saget@abc.com", 'm');
		
		Book aBook = new Book("more Java for Dummy", anAuthor, 23.5, 2);
		
		System.out.println(aBook.getAuthor().getName());
		System.out.println(aBook.getAuthor().getEmail());
		System.out.println(aBook.getName());
		System.out.println(aBook.getAuthorName());
		System.out.println(aBook.getAuthorGender());
		
		
	}

}
