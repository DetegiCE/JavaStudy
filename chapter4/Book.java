
public class Book {
	String title;
	String author;
	public Book(String t) {
		title = t;
		author = "작자미상";
	}
	public Book(String t, String a) {
		title = t;
		author = a;
	}
	
	public static void main(String[] args) {
		Book bookLA = new Book("Linear Algebra");
		Book bookCP = new Book("C Programming", "Yoon");
	}
}
