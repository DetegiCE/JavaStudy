class Points {
	int x, y;
	public Points(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public boolean equals(Points p) {
		if(x == p.x && y == p.y) return true;
		else return false;
	}
}

public class EqualsEx {
	public static void main(String[] args) {
		Points a = new Points(2, 3);
		Points b = new Points(2, 3);
		Points c = new Points(3, 4);
		
		if(a==b) System.out.println("a==b");
		if(a.equals(b)) System.out.println("a equals b");
		if(a.equals(c)) System.out.println("a equals c");
	}
}
