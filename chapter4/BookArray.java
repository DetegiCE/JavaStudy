import java.util.Scanner;

class BookB {
	String title;
	String author;
	
	public BookB(String t, String a) {
		this.title = t;
		this.author = a;
	}
	
	public void print() {
		System.out.println("제목 : "+title+" 저자 : "+author);
	}
}

public class BookArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BookB b[] = new BookB[2];
		String title, author;
		for(int i=0 ; i<b.length ; i++) {
			title = sc.nextLine();
			author = sc.nextLine();
			b[i] = new BookB(title, author);
		}
		
		for(int i=0 ; i<b.length ; i++) {
			b[i].print();
		}
	}
}
