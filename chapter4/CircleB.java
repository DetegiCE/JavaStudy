
public class CircleB {
	int radius;
	public CircleB(int radius) {
		this.radius = radius;
	}
	void set(int radius) {
		this.radius = radius;
	}
	
	public static void main(String[] args) {
		CircleB ob1 = new CircleB(1);
		CircleB ob2 = new CircleB(2);
		CircleB ob3 = new CircleB(3);
		
		ob1.set(4);
		ob2.set(5);
		ob3.set(6);
	}
}
