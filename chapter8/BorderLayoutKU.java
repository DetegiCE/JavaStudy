import java.awt.*;
import javax.swing.*;

public class BorderLayoutKU extends JFrame {
	BorderLayoutKU() {
		super("BorderLayout이다!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		
		cp.setLayout(new BorderLayout(30, 20));
		cp.add(new JButton("SKMirae"), BorderLayout.EAST);
		cp.add(new JButton("Gyoyang"), BorderLayout.WEST);
		cp.add(new JButton("Hakgwan"), BorderLayout.SOUTH);
		cp.add(new JButton("Gukje"), BorderLayout.NORTH);
		cp.add(new JButton("Minju"), BorderLayout.CENTER);
		
		setSize(350,250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		BorderLayoutKU blk = new BorderLayoutKU();
	}
}
