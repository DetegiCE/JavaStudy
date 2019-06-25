import javax.swing.*;

public class MyFrameEx extends JFrame {
	MyFrameEx() {
		setTitle("My First Frame");
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrameEx mfx = new MyFrameEx();
	}
}
