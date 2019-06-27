import java.awt.*;
import javax.swing.*;

public class JMenuEx extends JFrame {
	JMenuEx() {
		setTitle("Menu 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		createMenu();
		
		setSize(250,200);
		setVisible(true);
	}
	
	void createMenu() {
		JMenuBar mb = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		fileMenu.add(new JMenuItem("New"));
		fileMenu.add(new JMenuItem("Open File"));
		fileMenu.add(new JMenuItem("Save"));
		fileMenu.addSeparator();
		fileMenu.add(new JMenuItem("Exit"));
		
		mb.add(fileMenu);
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Source"));
		mb.add(new JMenu("Refactor"));
		mb.add(new JMenu("Navigate"));
		
		setJMenuBar(mb);
	}
	
	public static void main(String[] args) {
		new JMenuEx();
	}
}
