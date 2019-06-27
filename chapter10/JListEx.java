import java.awt.*;
import javax.swing.*;

public class JListEx extends JFrame {
	JListEx() {
		setTitle("JList 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		String[] building = {"과학도서관", "우정정보관", "아산이학관", "이학관별관", 
							 "애기능학생회관", "애기능생활관", "창의관", "하나과학관"};
		JList strlist = new JList(building);
		
		ImageIcon[] img = { new ImageIcon("image/jungbo1.png"), 
							new ImageIcon("image/jungbo2.png"),
							new ImageIcon("image/jungbo3.png") };
		JList imglist = new JList(img);
		JList scrolllist = new JList(building);
		
		c.add(strlist);
		c.add(imglist);
		c.add(new JScrollPane(scrolllist));
		
		setSize(500,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JListEx();
	}
}
