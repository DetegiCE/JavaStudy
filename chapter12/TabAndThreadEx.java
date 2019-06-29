import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyLabel extends JLabel {
	int barSize = 0;
	int maxBarSize;
	
	MyLabel(int maxBarSize) {
		this.maxBarSize = maxBarSize;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.MAGENTA);
		
		int width = (int)(((double)(this.getWidth()))/maxBarSize*barSize);
		if(width == 0) return;	
		g.fillRect(0, 0, width, this.getHeight());
	}
	
	synchronized int fill() {
		if(barSize == maxBarSize) {
			try {
				wait();
			}
			catch (InterruptedException e) {
				return barSize;
			}
		}
		barSize++;
		repaint();
		notify();
		return barSize;
	}
	
	synchronized void consume() {
		if(barSize == 0) {
			try {
				wait();
			}
			catch (InterruptedException e) {
				return;
			}
		}
		barSize--;
		repaint();
		notify();
	}
}

class ConsumerThread extends Thread {
	MyLabel bar;
	ConsumerThread(MyLabel bar){
		this.bar = bar;
	}
	public void run() {
		while(true) {
			try {
				sleep(200);
				bar.consume();
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class TabAndThreadEx extends JFrame {
	MyLabel bar = new MyLabel(100);
	JLabel la = new JLabel();
	TabAndThreadEx(String title){
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		bar.setBackground(Color.ORANGE);
		bar.setOpaque(true);
		bar.setLocation(20,50);
		bar.setSize(300,20);
		c.add(bar);
		
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int len = bar.fill();
				la.setText(Integer.toString(len));
			}
		});
	
		la.setLocation(20,10);
		la.setSize(50,10);
		c.add(la);
		
		
		setSize(350,200);
		setVisible(true);
		
		c.requestFocus();
		ConsumerThread th = new ConsumerThread(bar);
		th.start();
	}
	
	public static void main(String[] args) {
		new TabAndThreadEx("Press Any Key");
	}
}
