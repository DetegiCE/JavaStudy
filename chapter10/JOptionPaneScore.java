import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JOptionPaneScore extends JFrame {
	JButton jb[] = new JButton[3];
	String butname[] = {"Input Score", "Confirm", "Message"};
	JTextField tf = new JTextField(10);
	
	JOptionPaneScore() {
		setTitle("OptionPane 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout());
		
		for(int i=0 ; i<butname.length ; i++) {
			jb[i] = new JButton(butname[i]);
			jb[i].addActionListener(new ButtonActionListener());
			jp.add(jb[i]);
		}
		jp.add(tf);
		
		c.add(jp,BorderLayout.NORTH);
		
		setSize(500, 200);
		setVisible(true);
	}
	
	class ButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			String butstr = b.getText();
			if(butstr.equals("Input Score")) {
				String score = JOptionPane.showInputDialog("점수를 입력하세요.");
				tf.setText(score);
			}
			else if(butstr.equals("Confirm")) {
				int ok = JOptionPane.showConfirmDialog(null, "점수를 확정하시겠습니까?", "Check Score", JOptionPane.YES_NO_OPTION);
				if(ok == JOptionPane.YES_OPTION) {
					jb[0].setEnabled(false);
					jb[1].setEnabled(false);
					tf.setEnabled(false);
				}
			}
			else {
				String score = tf.getText();
				int is = Integer.parseInt(score);
				if(is>=70) {
					JOptionPane.showMessageDialog(null, "좋은 점수입니다.", "Good Score", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null, "나쁜 점수입니다.", "Bad Score", JOptionPane.WARNING_MESSAGE);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new JOptionPaneScore();
	}
}
