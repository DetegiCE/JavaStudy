class SharedPrinter {
	synchronized void print(String text) {
		for(int i=0 ; i<text.length() ; i++) {
			System.out.print(text.charAt(i));
		}
		System.out.println();
	}
}

class WorkerThread extends Thread {
	SharedPrinter p;
	String[] text;
	WorkerThread(SharedPrinter p, String[] text){
		this.p = p;
		this.text = text;
	}
	
	public void run() {
		for(int i=0 ; i<text.length ; i++) {
			p.print(text[i]);
		}
	}
}

public class SynchronizedEx_ {
	public static void main(String[] args) {
		SharedPrinter p = new SharedPrinter();
		String[] engSong = {"Hey Jude, don't make it bad",
							"Take a sad song and make it better",
							"Remember to let her into your heart",
							"Then you can start to make it better",
							"Hey Jude, don't be afraid",
							"You were made to go out and get her",
							"The minute you let her under your skin",
							"Then you begin to make it better"};
		String[] korSong = {"저 푸른 바다 끝까지 말을 달리면",
							"소금 같은 별이 떠있고",
							"사막엔 낙타만이 가는길 무수한 사랑",
							"길이 되어 열어 줄거야",
							"낡은 하모니카 손에 익은 기타 유얼 멜로디",
							"어린왕자 유얼 멜로디 찾아 떠날래",
							"퐈러웨이- 열마-선샤인, 위월 투게덜",
							"나는 사랑보다 좋은 추억 알게 될거야"};
		
		Thread th1 = new WorkerThread(p, engSong);
		Thread th2 = new WorkerThread(p, korSong);
		
		th1.start();
		th2.start();
	}
}
