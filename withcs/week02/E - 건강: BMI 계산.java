import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		
		double kg = w*0.45359237;
		double me = h*0.0254;
		
		System.out.printf("%.2f",Math.floor(kg/me/me*100.0)/100.0);
	}
}
