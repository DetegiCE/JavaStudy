import java.util.Scanner;

public class ArrayMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		int max=-1;
		for(int i=0 ; i<5 ; i++) {
			arr[i] = sc.nextInt();
			if(max<arr[i]) max = arr[i];
		}
		
		System.out.println(max);
	}
}
