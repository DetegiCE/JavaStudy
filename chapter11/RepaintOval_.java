import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RepaintOval_ extends JFrame {
	Point start = null;
	Point end = null;
	
	RepaintOval_() {
		setTitle("타원 리사이즈");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new MyPanels());
		
		setSize(300,300);
		setVisible(true);
	}
	
	class MyPanels extends JPanel {
		
		public MyPanels() {
			MyMouseListener mml = new MyMouseListener();
			
			addMouseListener(mml);
			addMouseMotionListener(mml);
		}
		
		class MyMouseListener extends MouseAdapter {
			public void mousePressed(MouseEvent e) {
				start = e.getPoint();
			}
			public void mouseDragged(MouseEvent e) {
				end = e.getPoint();
				repaint();
			}
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponents(g);
			
			if(start == null) return;
			
			g.setColor(Color.BLUE);
			int x = Math.min(start.x, end.x);
			int y = Math.min(start.y, end.y);
			int width = Math.abs(start.x-end.x);
			int height = Math.abs(start.y-end.y);
			
			g.drawOval(x, y, width, height);
			
		}
	}
	
	
	
	public static void main(String[] args) {
		new RepaintOval_();
	}
}
