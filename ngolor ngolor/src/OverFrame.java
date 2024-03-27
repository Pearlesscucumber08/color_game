import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OverFrame {
	
	JPanel ovrPnl;
	
	JLabel ngo1Lbl;
	JLabel lor1Lbl;
	JLabel ngo2Lbl;
	JLabel lor2Lbl;
	
	JLabel ovrLbl;
	JLabel scrLbl;
	
	JButton hmBtn;
	
	OverFrame() {
		
		ovrPnl = new JPanel();
		ovrPnl.setBounds(10, 10, 580, 730);
		ovrPnl.setBackground(new Color(47, 45, 45));
		ovrPnl.setLayout(null);
		
//		NGO 1 label
		ngo1Lbl = new JLabel("NGO");
		ngo1Lbl.setFont(new Font("Inter", Font.BOLD, 54));
		ngo1Lbl.setForeground(new Color(11, 110, 233));
		ngo1Lbl.setBounds(38, 115, 124, 50);
		
//		LOR 1 label
		lor1Lbl = new JLabel("LOR");
		lor1Lbl.setFont(new Font("Inter", Font.BOLD, 54));
		lor1Lbl.setForeground(new Color(217, 31, 13));
		lor1Lbl.setBounds(162, 115, 115, 50);
		
//		NGO 2 label
		ngo2Lbl = new JLabel("NGO");
		ngo2Lbl.setFont(new Font("Inter", Font.BOLD, 54));
		ngo2Lbl.setForeground(new Color(137, 0, 221));
		ngo2Lbl.setBounds(310, 115, 124, 50);
		
//		LOR 2 label
		lor2Lbl = new JLabel("LOR");
		lor2Lbl.setFont(new Font("Inter", Font.BOLD, 54));
		lor2Lbl.setForeground(new Color(19, 182, 35));
		lor2Lbl.setBounds(434, 115, 115, 50);
		
//		GAME OVER label
		ovrLbl = new JLabel("GAME OVER");
		ovrLbl.setFont(new Font("Inter", Font.BOLD, 70));
		ovrLbl.setForeground(new Color(225, 225, 225));
		ovrLbl.setBounds(74, 269, 432, 75);
		
//		Score Label
		scrLbl = new JLabel();
		scrLbl.setFont(new Font("Inter", Font.BOLD, 50));
		scrLbl.setForeground(new Color(225, 225, 225));
		scrLbl.setBounds(153, 365, 274, 73);
		
//		HOME button
		hmBtn = new JButton("HOME");
		hmBtn.setFont(new Font("Inter", Font.BOLD, 35));
		hmBtn.setForeground(new Color(0, 0, 0));
		hmBtn.setBackground(new Color(254, 244, 0));
		hmBtn.setFocusable(false);
		hmBtn.setBounds(185, 535, 210, 65);
		
		ovrPnl.add(ngo1Lbl);
		ovrPnl.add(lor1Lbl);
		ovrPnl.add(ngo2Lbl);
		ovrPnl.add(lor2Lbl);
		ovrPnl.add(ovrLbl);
		ovrPnl.add(scrLbl);
		ovrPnl.add(hmBtn);
		
	}
	
}
