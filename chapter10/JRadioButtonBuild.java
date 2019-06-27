import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JRadioButtonBuild extends JFrame {
	JRadioButton rb[] = new JRadioButton[3];
	String build[] = {"과학도서관", "우정정보관", "이학관별관"};
	JLabel la = new JLabel("건물을 선택해주세요.");
	
	JRadioButtonBuild() {
		setTitle("RadioButton 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ButtonGroup bg = new ButtonGroup();
		for(int i=0 ; i<build.length ; i++) {
			rb[i] = new JRadioButton(build[i]);
			rb[i].addItemListener(new MyItemListener());
			bg.add(rb[i]);
			c.add(rb[i]);
		}
		
		c.add(la);
		
		setSize(350,200);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				for(int i=0 ; i<build.length ; i++) {
					if(e.getItem() == rb[i]) {
						la.setText(build[i]+"을 선택하셨습니다.");
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new JRadioButtonBuild();
	}
}
