import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double sum = 0;
		for(int i=0 ; i<6 ; i++) {
			sum += n;
			sum*=1.00417;
		}
		
		System.out.printf("%.1f",Math.floor(sum*10.0)/10.0);
	}
}
