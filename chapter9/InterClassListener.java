import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InterClassListener extends JFrame {
	InterClassListener() {
		setTitle("내부 클래스 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton b = new JButton("Banana");
		b.addActionListener(new MyActionListener());
		
		c.add(b);
		setSize(300,200);
		setVisible(true);
	}
	
	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			
			if(b.getText().equals("Banana"))
				b.setText("버네눠");
			else
				b.setText("Banana");
		}
	}
	
	public static void main(String[] args) {
		new InterClassListener();
	}
}
