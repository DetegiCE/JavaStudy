class Point {
	int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "Point("+x+","+y+")";
	}
}


public class ToStringEx {
	public static void main(String[] args) {
		Point a = new Point(4,5);
		System.out.println(a.toString());
		System.out.println(a);
	}
}
