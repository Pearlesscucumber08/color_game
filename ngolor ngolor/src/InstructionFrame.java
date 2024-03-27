import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class InstructionFrame {

		JPanel jpnlIns;
	InstructionFrame() {
		jpnlIns = new JPanel();
		jpnlIns.setBounds(10, 10, 580, 730);
		jpnlIns.setBackground(new Color(47, 45, 45));
		jpnlIns.setLayout(null);
		
	
		JTextPane  ins = new JTextPane();
		SimpleAttributeSet att = new SimpleAttributeSet();
		StyleConstants.setBold(att, true);
		ins.setCharacterAttributes(att, true);
		ins.setText(" ");
		att = new SimpleAttributeSet();
		StyleConstants.setItalic(att, true);
	}
	
	//jpnlIns.add(gmPnl);
}
