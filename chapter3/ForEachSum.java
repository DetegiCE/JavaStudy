import java.util.Scanner;

public class ForEachSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		for(int i=0 ; i<5 ; i++) {
			arr[i] = sc.nextInt();	
		}
		
		int sum=0;
		for(int k : arr){
			sum+=k;
		}
		
		System.out.println(sum);
	}
}
