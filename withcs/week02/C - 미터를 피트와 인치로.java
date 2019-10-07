import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double m = sc.nextDouble();
		int f = (int)(m*3.2808);
		int i = (int)(m*39.3701);
		System.out.println(f+"\n"+i%12);
	}
}
