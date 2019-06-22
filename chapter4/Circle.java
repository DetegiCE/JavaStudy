public class Circle {
	int radius; // 원의 반지름을 저장하는 멤버 변수
	String name; // 원의 이름을 저장하는 멤버 변수
	
	public double getArea() { // 멤버 메소드
		return 3.14 * radius * radius;
	}
	
	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle(); // Circle 객체 생성
		pizza.radius = 10; // 피자의 반지름을 10으로 설정
		pizza.name = "미스터피자"; // 피자의 이름 설정
		double area = pizza.getArea(); // 면적 알아내기
		System.out.println(pizza.name+"의 면적은 "+area);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "크리스피크림";
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);
	}
}
