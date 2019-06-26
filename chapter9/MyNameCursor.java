import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyNameCursor extends JFrame {
	JLabel name = new JLabel("김류빈");
	
	MyNameCursor() {
		setTitle("커서이름");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(null);
		c.addMouseListener(new MyMouseListener());
		
		name.setSize(100,20);
		name.setLocation(250,250);
		
		c.add(name);
		
		setSize(500,500);
		setVisible(true);
	}
	
	class MyMouseListener implements MouseListener {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			name.setLocation(x,y);
		}

		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}
	
	public static void main(String[] args) {
		new MyNameCursor();
	}
}
