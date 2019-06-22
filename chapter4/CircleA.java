
public class CircleA {
	int radius;
	String name;
	
	public CircleA() {
		radius = 1;
		name = "";
	}
	
	public CircleA(int r, String n) {
		radius = r;
		name = n;
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	public static void main(String[] args) {
		CircleA pizza = new CircleA(10, "미스터피자");
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);
		
		CircleA donut = new CircleA();
		donut.name = "도넛피자";
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);
	}
}
