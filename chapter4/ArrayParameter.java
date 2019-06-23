
public class ArrayParameter {
	
	static void replace(char a[]) {
		for(int i=0 ; i<a.length ; i++) {
			if(a[i]==' ') {
				a[i]=',';
			}
		}
	}
	
	static void print(char a[]) {
		for(int i=0 ; i<a.length ; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		char c[] = {'I',' ','h','a','t','e',' ','c','o','d','i','n','g','.'};
		print(c);
		replace(c);
		print(c);
	}
}
