class Rect {
	int width, height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public boolean equals(Rect r) {
		if(width*height == r.width*r.height) return true;
		else return false;
	}
}

public class RectEx {
	public static void main(String[] args) {
		Rect a = new Rect(3,4);
		Rect b = new Rect(3,5);
		Rect c = new Rect(6,2);
		
		if(a.equals(b)) System.out.println("a equals b");
		if(a.equals(c)) System.out.println("a equals c");
	}
}
