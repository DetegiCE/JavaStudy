abstract class Calculator {
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
}

class GoodCalc extends Calculator {
	public int add(int a, int b) { return a + b; }
	public int subtract(int a, int b) { return a - b; }
	public double average(int[] a) {
		double sum=0;
		for(int i=0 ; i<a.length ; i++) {
			sum+=a[i];
		}
		return sum/a.length;
	}
}

public class AbstractCalc {
	public static void main(String[] args) {
		GoodCalc gc = new GoodCalc();
		int a[] = {1, 3, 5, 8};
		System.out.println(gc.add(3, 4));
		System.out.println(gc.subtract(7, 2));
		System.out.println(gc.average(a));
	}
}
