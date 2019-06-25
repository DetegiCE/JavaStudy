import java.awt.*;
import javax.swing.*;
import java.util.*;

public class NullLayoutRand extends JFrame {
	NullLayoutRand() {
		setTitle("NullLayout이다!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Random r = new Random();
		Container cp = getContentPane();
		cp.setLayout(null);
		
		for(int i=0 ; i<10 ; i++) {
			int rand = r.nextInt(10000)+1;
			int rx = r.nextInt(601);
			int ry = r.nextInt(651);
			
			JButton b = new JButton(Integer.toString(rand));
			b.setSize(100,50);
			b.setLocation(rx,ry);
			cp.add(b);
		}
		
		setSize(700,700);
		setVisible(true);
	}
	public static void main(String[] args) {
		NullLayoutRand nlr = new NullLayoutRand();
	}
}
