import java.util.Scanner;

public class ArrayAverage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intArray[] = new int[5];
		double sum = 0;
		
		for(int i=0 ; i<intArray.length ; i++) {
			intArray[i] = sc.nextInt();
			sum += intArray[i];
		}
		
		System.out.println(sum/intArray.length);
	}
}
