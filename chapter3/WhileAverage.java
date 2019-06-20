import java.util.Scanner;

public class WhileAverage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int count=0;
		int sum=0;
		while((n = sc.nextInt())!=0) {
			count++;
			sum+=n;
		}
		System.out.println("평균 : "+(double)sum/count);
	}
}
