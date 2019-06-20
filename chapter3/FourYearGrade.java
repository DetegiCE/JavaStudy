import java.util.Scanner;

public class FourYearGrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double grade[][] = new double[4][2];
		double sum=0;
		
		for(int i=0 ; i<4 ; i++) {
			for(int j=0 ; j<2 ; j++) {
				grade[i][j] = sc.nextDouble();
				sum += grade[i][j];
			}
		}
		
		System.out.println(sum/(grade.length*grade[0].length));
	}
}
