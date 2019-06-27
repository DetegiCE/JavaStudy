import java.awt.*;
import javax.swing.*;

public class JButtonEx extends JFrame {
	JButtonEx() {
		setTitle("JButton 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon nIcon = new ImageIcon("image/jungbo1.png");
		ImageIcon rIcon = new ImageIcon("image/jungbo2.png");
		ImageIcon pIcon = new ImageIcon("image/jungbo3.png");
		
		JButton b = new JButton("과준위", nIcon);
		b.setRolloverIcon(rIcon);
		b.setPressedIcon(pIcon);
		
		c.add(b);
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JButtonEx();
	}
}
