import java.awt.*;
import javax.swing.*;

public class JLabelEx extends JFrame {
	JLabelEx() {
		setTitle("JLabel 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("고려대학교");
		
		ImageIcon img = new ImageIcon("image/korea.jpg");
		JLabel imageLabel = new JLabel(img);
		
		ImageIcon img2 = new ImageIcon("image/infor.png");
		JLabel mixLabel = new JLabel("정보대학", img2, SwingConstants.CENTER);
		
		c.add(textLabel);
		c.add(imageLabel);
		c.add(mixLabel);
		
		setSize(300,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JLabelEx();
	}
}
