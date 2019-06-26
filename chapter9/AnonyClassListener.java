import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonyClassListener extends JFrame {
	AnonyClassListener() {
		setTitle("익명 클래스 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton b = new JButton("등록금");
		c.add(b);
		
		b.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				
				if(b.getText().equals("등록금")) 
					b.setText("황금열쇠");
				
				else
					b.setText("등록금");
			}
		});
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new AnonyClassListener();
	}
}
