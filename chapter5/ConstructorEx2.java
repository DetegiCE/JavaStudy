class alpha {
	public alpha() {
		System.out.println("생성자alpha");
	}
	public alpha(int x) {
		System.out.println("매개변수생성자alpha");
	}
}

class beta extends alpha {
	public beta() {
		System.out.println("생성자beta");
	}
	public beta(int x) {
		System.out.println("매개변수생성자beta");
	}
}

public class ConstructorEx2 {
	public static void main(String[] args) {
		beta b = new beta(1);
	}
}
