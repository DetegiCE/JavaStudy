import java.awt.*;
import javax.swing.*;

public class ThreeButtonFrame extends JFrame {
	ThreeButtonFrame() {
		setTitle("ContentPane연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		
		JButton b1 = new JButton("OK");
		JButton b2 = new JButton("Cancel");
		JButton b3 = new JButton("Ignore");
		
		cp.setLayout(new FlowLayout());
		cp.add(b1);
		cp.add(b2);
		cp.add(b3);
		
		setSize(300,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ThreeButtonFrame tbf = new ThreeButtonFrame();
	}
}
