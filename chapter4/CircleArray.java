class CircleC {
	int radius;
	public CircleC(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}

public class CircleArray {
	public static void main(String[] args) {
		CircleC c[] = new CircleC[5];
		for(int i=0 ; i<c.length ; i++) {
			c[i] = new CircleC(i);
		}
		for(int i=0 ; i<c.length ; i++) {
			System.out.println("면적 = "+c[i].getArea());
		}
	}
}
