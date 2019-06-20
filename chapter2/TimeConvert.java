import java.util.Scanner;

public class TimeConvert {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time = sc.nextInt();
		
		int hour = time/60/60;
		int min = time/60%60;
		int sec = time%60;
		
		System.out.println(time+"초 = "+hour+"시간 "+min+"분 "+sec+"초");
	}
}
