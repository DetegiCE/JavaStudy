import java.awt.*;
import javax.swing.*;

public class DrawImageYMilk extends JFrame {
	DrawImageYMilk() {
		setTitle("사진 크기 바꾸기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new MyPanel());
		
		setSize(500,500);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		ImageIcon img = new ImageIcon("image/yonseimilk.jpg");
		Image im = img.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(im, 0, 0, getWidth(), getHeight(), this);
		}
		
	}
	
	public static void main(String[] args) {
		new DrawImageYMilk();
	}
}
