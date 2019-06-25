import java.util.ArrayList;
import java.util.Scanner;

public class NameArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> a = new ArrayList<String>(4);
		
		String lname="";
		for(int i=0 ; i<4 ; i++) {
			String name = sc.nextLine();
			a.add(name);
			if(lname.length() < a.get(i).length()) {
				lname = a.get(i);
			}
		}
		
		for(int i=0 ; i<a.size() ; i++) {
			System.out.print(a.get(i)+" ");
		}
		System.out.println();
		System.out.println("Longest : "+lname);
	}
}
