import java.awt.*;
import javax.swing.*;

public class JTextFieldInfo extends JFrame {
	JPanel panel[] = new JPanel[3];
	JLabel label[] = new JLabel[3];
	JTextField tf[] = new JTextField[3];
	String field[] = {"이름", "학과", "주소"};
	
	JTextFieldInfo() {
		setTitle("TextField 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(3, 1, 0, 10));
		
		for(int i=0 ; i<field.length ; i++) {
			panel[i] = new JPanel();
			label[i] = new JLabel(field[i]);
			tf[i] = new JTextField(20);
			
			panel[i].setLayout(new FlowLayout());
			panel[i].add(label[i]);
			panel[i].add(tf[i]);
			
			c.add(panel[i]);
		}
		
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JTextFieldInfo();
	}
}
