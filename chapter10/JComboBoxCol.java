import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComboBoxCol extends JFrame {
	String cols[] = {"정보대학", "이과대학", "문과대학"};
	ImageIcon img[] = { new ImageIcon("image/jungbo.png"),
						new ImageIcon("image/eegwa.png"),
						new ImageIcon("image/mungwa.png") };
	JLabel imgLabel = new JLabel(new ImageIcon("image/jungbo.png"));
	
	JComboBoxCol() {
		setTitle("ComboBox 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox cb = new JComboBox(cols);
		cb.addActionListener(new MyActionListener());
		
		c.add(cb);
		c.add(imgLabel);
		
		setSize(300,250);
		setVisible(true);
	}
	
	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JComboBox t = (JComboBox)e.getSource();
			int idx = t.getSelectedIndex();
			imgLabel.setIcon(img[idx]);
		}
	}
	
	public static void main(String[] args) {
		new JComboBoxCol();
	}
}
