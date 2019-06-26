import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class KeyAllocDalloc extends JFrame {
	JLabel la = new JLabel("<Enter>키로 배경색이 바뀝니다");
	
	KeyAllocDalloc() {
		setTitle("알록달록");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		c.add(la);
		c.addKeyListener(new MyKeyListener());
		
		setSize(300,200);
		setVisible(true);
		
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			Random r = new Random();
			if(e.getKeyChar() == '\n') {
				int red = r.nextInt(256);
				int green = r.nextInt(256);
				int blue = r.nextInt(256);
				
				getContentPane().setBackground(new Color(red, green, blue));
			
				la.setText("r = "+red+", g = "+green+", b = "+blue);
			}
			else if(e.getKeyChar() == 'q') {
				System.exit(0);
			}
		}
	}
	
	public static void main(String[] args) {
		new KeyAllocDalloc();
	}
}
