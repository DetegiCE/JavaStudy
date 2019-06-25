import java.util.Vector;

class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "("+x+","+y+")";
	}
}

public class PointVector {
	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>(20);
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(4, 5);
		Point p3 = new Point(6, 7);
		
		v.add(p1);
		v.add(p2);
		v.add(p3);
		
		int n = v.size();
		int c = v.capacity();
		System.out.println("size : "+n+" capacity : "+c);
		
		v.add(2, new Point(3, 4));
		
		Point obj = v.get(1);
		System.out.println(obj);
		
		v.remove(2);
		n = v.size();
		System.out.println("size : "+n);
		
		Point last = v.lastElement();
		System.out.println(last);
		
		v.removeAllElements();
	}
}
