import java.awt.Color;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	MainFrame(){
		
		this.setSize(613, 785);
		this.getContentPane().setBackground(new Color(225, 225, 225));
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
}