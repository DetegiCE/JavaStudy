import java.util.Scanner;

public class Grading {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		char grade;
		if(score>=90) grade = 'A';
		else if(score>=80) grade = 'B';
		else if(score>=70) grade = 'C';
		else if(score>=60) grade = 'D';
		else grade = 'F';
		
		System.out.println("당신의 학점은 "+grade+"입니다.");
	}
}
