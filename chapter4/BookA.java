public class BookA {
	String title;
	String author;
	
	public BookA() {
		this("", "");
	}
	
	public BookA(String title) {
		this(title, "작자미상");
	}

	public BookA(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	BookA java = new BookA("명품자바프로그래밍","황기태");
	BookA bible = new BookA("Bible");
	BookA emptyBook = new BookA();
}
