import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JMenuAction extends JFrame {
	JLabel imgLabel = new JLabel();
	
	JMenuAction() {
		setTitle("정문사진");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(imgLabel, BorderLayout.CENTER);
		
		menuSetting();
		
		setSize(806,500);
		setVisible(true);
	}
	
	void menuSetting() {
		JMenuBar mb = new JMenuBar();
		
		JMenu picture = new JMenu("Picture");
		
		JMenuItem mi[] = new JMenuItem[4];
		String mens[] = {"KOREA", "Hide", "YONSEI", "Exit"};
		
		for(int i=0 ; i<mens.length ; i++) {
			mi[i] = new JMenuItem(mens[i]);
			mi[i].addActionListener(new MenuActionListener());
			picture.add(mi[i]);
		}
		
		mb.add(picture);
		
		
		setJMenuBar(mb);
		
	}
	
	class MenuActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JMenuItem mi = (JMenuItem)e.getSource();
			
			String name = mi.getActionCommand();
			
			if(name.equals("KOREA")) {
				imgLabel.setVisible(true);
				imgLabel.setIcon(new ImageIcon("image/koreauniv.jpg"));
			}
			else if(name.equals("Hide")) {
				imgLabel.setVisible(false);
			}
			else if(name.equals("YONSEI")) {
				imgLabel.setVisible(true);
				imgLabel.setIcon(new ImageIcon("image/yonseiuniv.jpg"));
			}
			else {
				System.exit(0);
			}
		}
	}
	
	public static void main(String[] args) {
		new JMenuAction();
	}
}
