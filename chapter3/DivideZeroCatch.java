import java.util.Scanner;

public class DivideZeroCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dividend;
		int divisor;
		
		System.out.print("Input Dividend: ");
		dividend = sc.nextInt();
		System.out.print("Input Divisor: ");
		divisor = sc.nextInt();
		try {
			System.out.println("Answer : "+dividend/divisor);
		}
		catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		sc.close();
	}
}
