import java.awt.*;
import javax.swing.*;

class TimeRunnable implements Runnable {
	JLabel la;
	public TimeRunnable(JLabel la) {
		this.la = la;
	}
	
	public void run() {
		int n = 0;
		while(true) {
			la.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class RunnableTimer extends JFrame {
	public RunnableTimer() {
		setTitle("GUI 타이머");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel la = new JLabel();
		la.setFont(new Font("Gothic", Font.ITALIC, 80));
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(la);
		
		TimeRunnable tr = new TimeRunnable(la);
		Thread th = new Thread(tr);
		
		setSize(250,150);
		setVisible(true);
		th.start();
	}
	public static void main(String[] args) {
		new RunnableTimer();
	}
}
