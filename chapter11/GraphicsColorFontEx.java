import java.awt.*;
import javax.swing.*;

public class GraphicsColorFontEx extends JFrame {
	GraphicsColorFontEx() {
		setTitle("Color Font Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new MyPanel());
		
		setSize(300, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.BLUE);
			g.drawString("고려대학교 합격!", 30, 30);
			
			g.setColor(new Color(255,0,0));
			g.setFont(new Font("NanumMyeongjo", Font.ITALIC, 25));
			g.drawString("컴퓨터학과 합격!", 30, 70);
			
			g.setColor(new Color(0x00ff00ff));
			for(int i=1 ; i<=4 ; i++) {
				g.setFont(new Font("NanumGothic", Font.BOLD, i*10));
				g.drawString("좋냐?", 30, 60+i*40);
			}
		}
	}
	
	public static void main(String[] args) {
		new GraphicsColorFontEx();
	}
}
