class PointA {
	private int x, y;
	PointA() {
		this.x = 0;
		this.y = 0;
	}
	PointA(int x, int y){
		this.x = x;
		this.y = y;
	}
	void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}

class ColorPointA extends PointA {
	private String color;
	ColorPointA(int x,int y, String color){
		super(x,y);
		this.color = color;
	}
	void showColorPoint() {
		System.out.print(color+" ");
		showPoint();
	}
}

public class SuperPoint {
	public static void main(String[] args) {
		ColorPointA cp = new ColorPointA(4,5,"crimson");
		cp.showColorPoint();
	}
}
