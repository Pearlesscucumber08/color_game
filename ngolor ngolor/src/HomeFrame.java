import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class HomeFrame {

	JPanel hmPnl;
	
	JLabel ngo1Lbl;
	JLabel lor1Lbl;
	JLabel ngo2Lbl;
	JLabel lor2Lbl;
	
	JButton strBtn;
	JButton extBtn;
	
	HomeFrame() {
		
//		home panel
		hmPnl = new JPanel();
		hmPnl.setBounds(10, 10, 580, 730);
		hmPnl.setBackground(new Color(47, 45, 45));
		hmPnl.setLayout(null);
		
//		NGO 1 label
		ngo1Lbl = new JLabel("NGO");
		ngo1Lbl.setFont(new Font("Inter", Font.BOLD, 84));
		ngo1Lbl.setForeground(new Color(11, 110, 233));
		ngo1Lbl.setBounds(98, 100, 192, 100);
		
//		LOR 1 label
		lor1Lbl = new JLabel("LOR");
		lor1Lbl.setFont(new Font("Inter", Font.BOLD, 84));
		lor1Lbl.setForeground(new Color(217, 31, 13));
		lor1Lbl.setBounds(290, 100, 192, 100);
		
//		NGO 2 label
		ngo2Lbl = new JLabel("NGO");
		ngo2Lbl.setFont(new Font("Inter", Font.BOLD, 84));
		ngo2Lbl.setForeground(new Color(137, 0, 221));
		ngo2Lbl.setBounds(98, 200, 192, 100);
		
//		LOR 2 label
		lor2Lbl = new JLabel("LOR");
		lor2Lbl.setFont(new Font("Inter", Font.BOLD, 84));
		lor2Lbl.setForeground(new Color(19, 182, 35));
		lor2Lbl.setBounds(290, 200, 192, 100);
		
//		START button
		strBtn = new JButton("START");
		strBtn.setFont(new Font("Inter", Font.BOLD, 35));
		strBtn.setForeground(new Color(0, 0, 0));
		strBtn.setBackground(new Color(254, 244, 0));
		strBtn.setFocusable(false);
		strBtn.setBounds(171, 407, 238, 67);
		
//		EXIT button
		extBtn = new JButton("EXIT");
		extBtn.setFont(new Font("Inter", Font.BOLD, 35));
		extBtn.setForeground(new Color(254, 244, 0));
		extBtn.setBackground(new Color(47, 45, 45));
		extBtn.setFocusable(false);
		extBtn.setBounds(171, 503, 238, 67);
		extBtn.setBorder(new LineBorder(new Color(254, 244, 0), 5, true));
		
		hmPnl.add(ngo1Lbl);
		hmPnl.add(lor1Lbl);
		hmPnl.add(ngo2Lbl);
		hmPnl.add(lor2Lbl);
		hmPnl.add(strBtn);
		hmPnl.add(extBtn);
	}

}
