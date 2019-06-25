import java.util.Iterator;
import java.util.Vector;
import java.util.Scanner;

public class SumIterator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vector<Integer> v = new Vector<Integer>(4);
		
		for(int i=0 ; i<v.capacity() ; i++) {
			int n = sc.nextInt();
			v.add(n);
		}
		
		Iterator<Integer> it = v.iterator();
		int sum = 0;
		while(it.hasNext()) {
			int k = it.next();
			sum += k;
		}
		
		System.out.println("합 = "+sum);
	}
}
