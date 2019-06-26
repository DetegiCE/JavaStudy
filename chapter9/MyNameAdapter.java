import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyNameAdapter extends JFrame {
	JLabel name = new JLabel("김류빈");
	
	MyNameAdapter() {
		setTitle("커서이름");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(null);
		c.addMouseListener(new MyMouseAdapter());
		
		name.setSize(100,20);
		name.setLocation(250,250);
		
		c.add(name);
		
		setSize(500,500);
		setVisible(true);
	}
	
	class MyMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			name.setLocation(x,y);
		}
	}
	
	public static void main(String[] args) {
		new MyNameAdapter();
	}
}
