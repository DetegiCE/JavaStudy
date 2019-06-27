import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBoxGrade extends JFrame {
	JLabel la = new JLabel("과목을 선택해주세요.");
	JCheckBox jcb[] = new JCheckBox[3];
	String subj[] = {"컴프", "전수", "아잉"};
	double grade[] = {4.5, 4.0, 3.5};
	
	double sum = 0.0;
	int cnt = 0;
	
	JCheckBoxGrade() {
		setTitle("CheckBox 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		for(int i=0 ; i<3 ; i++) {
			jcb[i] = new JCheckBox(subj[i]);
			jcb[i].addItemListener(new MyItemListener());
			c.add(jcb[i]);
		}
		
		c.add(la);
		
		setSize(250,200);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener {

		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == jcb[0]) {
					sum += grade[0];
					cnt++;
				}
				else if(e.getItem() == jcb[1]) {
					sum += grade[1];
					cnt++;
				}
				else{
					sum += grade[2];
					cnt++;
				}
			}
			else {
				if(e.getItem() == jcb[0]) {
					sum -= grade[0];
					cnt--;
				}
				else if(e.getItem() == jcb[1]) {
					sum -= grade[1];
					cnt--;
				}
				else{
					sum -= grade[2];
					cnt--;
				}
			}
			
			if(cnt==0)
				la.setText("과목을 선택해주세요.");
			else
				la.setText("과목 평균은 "+sum/cnt+" 입니다. (과목 수 : "+cnt+")");
		}
		
	}
	
	
	public static void main(String[] args) {
		new JCheckBoxGrade();
	}
}
