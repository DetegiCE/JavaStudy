import java.util.Scanner;

public class MyInfoScan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String school = sc.next();
		int age = sc.nextInt();
		double gpa = sc.nextDouble();
		boolean marry = sc.nextBoolean();
		System.out.println(name+" "+school+" "+age+" "+gpa+" "+marry);
	}
}
