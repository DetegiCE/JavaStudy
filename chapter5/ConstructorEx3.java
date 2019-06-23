class 가 {
	public 가() {
		System.out.println("생성자 가");
	}
	public 가(int x) {
		System.out.println("매개변수생성자 가 "+x);
	}
}

class 나 extends 가 {
	public 나() {
		System.out.println("생성자 나");
	}
	public 나(int x) {
		super(x);
		System.out.println("매개변수생성자 나 "+x);
	}
}

public class ConstructorEx3 {
	public static void main(String[] args) {
		나 ㄴ = new 나(1);
	}
}
