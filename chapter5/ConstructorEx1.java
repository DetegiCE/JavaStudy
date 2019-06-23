class AA {
	public AA(int x) {
		System.out.println("생성자AA");
	}
}

class BB extends AA {
	public BB() {
		System.out.println("생성자B");
	}
}

public class ConstructorEx1 {
	public static void main(String[] args) {
		BB bb = new BB();
	}
}
