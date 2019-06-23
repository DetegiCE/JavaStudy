
public class MethodEx {
	public int getSum(int i, int j) {
		return i+j;
	}
	public int getSum(int i, int j, int k) {
		return i+j+k;
	}
	public double getSum(double i, double j) {
		return i+j;
	}
	public static void main(String[] args) {
		MethodEx a = new MethodEx();
		
		int k = a.getSum(1, 2);
		int m = a.getSum(1, 2, 3);
		double n = a.getSum(1.1, 2.2);
		
		System.out.println(k+" "+m+" "+n);
	}
}
