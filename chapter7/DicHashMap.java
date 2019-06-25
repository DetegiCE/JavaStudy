import java.util.*;

public class DicHashMap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, String> h = new HashMap<String,String>();
		
		for(int i=0 ; i<3 ; i++) {
			System.out.print("영단어 입력 : ");
			String eng = sc.next();
			System.out.print("한글 단어 입력 : ");
			String kor = sc.next();
			
			h.put(eng, kor);
		}
		
		System.out.println("검색할 영단어 입력 : ");
		String search = sc.next();
		
		String ans = h.get(search);
		if(ans==null) {
			System.out.println("존재하지 않습니다.");
		}
		else {
			System.out.println("뜻 : "+ans);
		}
		
	}
}
