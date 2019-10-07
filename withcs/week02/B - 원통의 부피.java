import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double l = sc.nextDouble();
		double a = r*r*3.14159;
		double v = a*l;
		System.out.printf("%.1f\n", Math.floor(a*10.0)/10.0);
		System.out.printf("%.1f", Math.floor(v*10.0)/10.0);
	}
}
