import java.util.InputMismatchException;
import java.util.Scanner;

public class IntSumCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum=0, n=0;
		for(int i=0 ; i<3 ; i++) {
			try {
				System.out.print("Input Integer : ");
				n = sc.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("Not an integer");
				i--;
				sc.next(); //입력 스트림을 비움
				continue;
			}
			sum+=n;
		}
		System.out.println("Sum = "+sum);
	}
}
