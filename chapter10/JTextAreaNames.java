import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTextAreaNames extends JFrame {
	JTextField tf = new JTextField(20);
	JTextArea ta = new JTextArea(7, 20);
	
	JTextAreaNames() {
		setTitle("TextArea 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.BLACK);
		
		JLabel la = new JLabel("입력 후 Enter를 입력하세요.");
		la.setForeground(Color.WHITE);
		
		tf.addActionListener(new MyActionListener());
		
		c.add(la);
		c.add(tf);
		c.add(new JScrollPane(ta));
		
		setSize(300,300);
		setVisible(true);
	}
	
	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JTextField t = (JTextField)e.getSource();
			
			ta.append(t.getText()+"\n");
			tf.setText("");
		}	
	}
	
	public static void main(String[] args) {
		new JTextAreaNames();
	}
}
