import java.awt.*;
import javax.swing.*;

public class JCheckBoxEx extends JFrame {
	JCheckBoxEx() {
		setTitle("CheckBox 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox cp = new JCheckBox("컴프");
		JCheckBox la = new JCheckBox("전수", true);
		JCheckBox aa = new JCheckBox("아잉");
		
		c.add(cp);
		c.add(la);
		c.add(aa);
		
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JCheckBoxEx();
	}
}
