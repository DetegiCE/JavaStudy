import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a[] = new double[6];
		for(int i=0 ; i<a.length ; i++) {
			a[i] = sc.nextDouble();
		}
		double side[] = new double[3];
		for(int i=0 ; i<3 ; i++) {
			double xdif = (a[(i*2)%6]-a[(i*2+2)%6])*(a[(i*2)%6]-a[(i*2+2)%6]);
			double ydif = (a[(i*2+1)%6]-a[(i*2+3)%6])*(a[(i*2+1)%6]-a[(i*2+3)%6]);
			side[i] = Math.sqrt(xdif+ydif);
		}
		double s = side[0]+side[1]+side[2];
		s /= 2.0;
		
		double ar = Math.sqrt(s*(s-side[0])*(s-side[1])*(s-side[2]));
		
		System.out.printf("%.1f",Math.floor(ar*10.0)/10.0);
	}
}
