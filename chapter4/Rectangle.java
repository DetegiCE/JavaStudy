public class Rectangle {
	int width;
	int height;
	int getArea() {
		return width*height;
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.width = 4;
		r.height = 5;
		System.out.println("사각형의 면적은 "+r.getArea());
	}
}
