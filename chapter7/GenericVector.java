class GVector<T> {
	int size;
	Object arr[];
	public GVector() {
		size = 0;
		arr = new Object[100];
	}
	public void push(T val) {
		if(size == 100) {
			return;
		}
		arr[size++]=val;
	}
	public T get(int val) {
		return (T)arr[val];
	}
}

public class GenericVector {
	public static void main(String[] args) {
		GVector<String> gs = new GVector<String>();
		
		gs.push("hello");
		gs.push("c");
		gs.push("java");
		
		System.out.println(gs.get(1));
		
		GVector<Integer> gi = new GVector<Integer>();
		
		gi.push(1);
		gi.push(100);
		gi.push(-127);
		gi.push(858);
		
		System.out.println(gi.get(2));
	}
}
