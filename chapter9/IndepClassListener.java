import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IndepClassListener extends JFrame {
	IndepClassListener() {
		setTitle("독립 클래스 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton b = new JButton("Action");
		b.addActionListener(new MyActionListener());
		
		c.add(b);
		setSize(300,200);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new IndepClassListener();
	}
}

class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		
		if(b.getText().equals("Action"))
			b.setText("액숀");
		else
			b.setText("Action");
	}
}
