
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameFrame {

	JPanel gmPnl;
	
	JLabel lfLbl;
	JLabel scrLbl;
	static JLabel askLbl;

	static JButton btn[] = {new JButton(), new JButton(), new JButton(), new JButton()};
	
	
	
	GameFrame() {
		
//		in game panel
		gmPnl = new JPanel();
		gmPnl.setBounds(10, 10, 580, 730);
		gmPnl.setBackground(new Color(47, 45, 45));
		gmPnl.setLayout(null);
		
//		Life label
		lfLbl = new JLabel();
		lfLbl.setFont(new Font("Inter", Font.BOLD, 35));
		lfLbl.setForeground(new Color(225, 225, 225));
		lfLbl.setBounds(20, 20, 121, 42);
		
//		Score label
		scrLbl = new JLabel();
		scrLbl.setFont(new Font("Inter", Font.BOLD, 35));
		scrLbl.setForeground(new Color(225, 225, 225));
		scrLbl.setBounds(399, 20, 161, 42);
		
//		ask label
		askLbl = new JLabel("color");
		askLbl.setFont(new Font("Inter", Font.BOLD, 90));
		askLbl.setForeground(new Color(225, 225, 225));
		askLbl.setHorizontalAlignment(JLabel.CENTER);
		askLbl.setBounds(154, 134, 272, 114);
		
//		button 1
		btn[0].setBounds(5, 353, 282, 183);
		btn[0].setFont(new Font("Inter", Font.BOLD, 40));
		btn[0].setFocusable(false);
		btn[0].setForeground(new Color(225, 225, 225));
		
//		button 2
		btn[1].setBounds(293, 353, 282, 183);
		btn[1].setFont(new Font("Inter", Font.BOLD, 40));
		btn[1].setFocusable(false);
		btn[1].setForeground(new Color(225, 225, 225));
		
//		button 3
		btn[2].setBounds(5, 542, 282, 183);
		btn[2].setFont(new Font("Inter", Font.BOLD, 40));
		btn[2].setFocusable(false);
		btn[2].setForeground(new Color(225, 225, 225));
		
//		button 4
		btn[3].setBounds(293, 542, 282, 183);
		btn[3].setFont(new Font("Inter", Font.BOLD, 40));
		btn[3].setFocusable(false);
		btn[3].setForeground(new Color(225, 225, 225));
		
//		add components to the panel
		gmPnl.add(lfLbl);
		gmPnl.add(scrLbl);
		gmPnl.add(askLbl);
		gmPnl.add(btn[0]);
		gmPnl.add(btn[1]);
		gmPnl.add(btn[2]);
		gmPnl.add(btn[3]);
		
	}
	
	static String [] colorStr = {"blue","red","violet","green"};
	static Color [] color = {new Color(11, 110, 233), new Color(217, 31, 13), new Color(137, 0, 221), new Color(19, 182, 35)};
	//responsible for randomizing the colors and labels of the buttons
	public static void randomize() {
		
		int[] acs = new int[btn.length];
		for (int i = 0; i < acs.length; i++) acs[i] = acs.length;
		int rd = (int) (Math.random()*4);
		int cnt = 0;
		boolean exst = false;
	//The label (askLbl) is set to a random color name from colorStr.	
		askLbl.setText(colorStr[(int) (Math.random()*4)]);
		askLbl.setForeground(color[(int) (Math.random()*4)]);
		
		do {
			
			rd = (int) (Math.random()*4);
			for(int i: acs) {
				if (i == rd) {
					exst = true;
					break;
				}
				else exst = false;
			}
			if(!exst)acs[cnt++] = rd;
		}while(exst || cnt != 4);
		
		for(int i = 0; i < 4; i++) btn[i].setBackground(color[acs[i]]);
		
		for (int i = 0; i < acs.length; i++) acs[i] = acs.length;
		
		cnt = 0;
		
		do {
			
			rd = (int) (Math.random()*4);
			for(int i: acs) {
				if (i == rd) {
					exst = true;
					break;
				}
				else exst = false;
			}
			if(!exst)acs[cnt++] = rd;
		}while(exst || cnt != 4);
		
		for(int i = 0; i < 4; i++) btn[i].setText(colorStr[acs[i]]);
		
	}
	
	public static boolean check(JButton b) {
		String chkstr = askLbl.getText();
		int chkindx = 0;
		for(int i = 0; i < btn.length; i++) 
			if (colorStr[i].equals(chkstr)) {
				chkindx = i;
				break;
			}
		return (color[chkindx] == b.getBackground());
	}
	
}
