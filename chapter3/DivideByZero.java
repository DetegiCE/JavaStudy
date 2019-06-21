import java.util.Scanner;

public class DivideByZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dividend;
		int divisor;
		
		System.out.print("Input Dividend: ");
		dividend = sc.nextInt();
		System.out.print("Input Divisor: ");
		divisor = sc.nextInt();
		System.out.println("Answer : "+dividend/divisor);
		
		sc.close();
	}
}
