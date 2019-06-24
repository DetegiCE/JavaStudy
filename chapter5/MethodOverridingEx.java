class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}

class Circ extends Shape {
	public void draw() {
		System.out.println("Circ");
	}
}

public class MethodOverridingEx {
	static void paint(Shape p) {
		p.draw();
	}
	
	public static void main(String[] args) {
		Line line = new Line();
		paint(line); 		//Line
		paint(new Shape()); //Shape
		paint(new Line());	//Line
		paint(new Rect());	//Rect
		paint(new Circ());	//Circ
	}
}
