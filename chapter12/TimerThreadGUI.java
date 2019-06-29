import java.awt.*;
import javax.swing.*;

class TimerThreads extends Thread {
	JLabel timeLabel;
	public TimerThreads(JLabel timeLabel) {
		this.timeLabel = timeLabel;
	}
	
	public void run() {
		int n = 0;
		while(true) {
			timeLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class TimerThreadGUI extends JFrame {

	public TimerThreadGUI() {
		setTitle("GUI 타이머");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timeLabel = new JLabel("0");
		timeLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timeLabel);
		
		TimerThreads th = new TimerThreads(timeLabel);
		
		setSize(250,150);
		setVisible(true);
		
		th.start();
	}
	
	public static void main(String[] args) {
		new TimerThreadGUI();
	}
}
