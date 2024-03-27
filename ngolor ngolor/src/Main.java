import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Main {
	// score and life, are defined to keep track of the player's score and remaining lives.
	static int score = 0;
	static int life = 3;
	
	public static void main(String[] args) {
		
		MainFrame mainFrame = new MainFrame();
		HomeFrame homeFrame = new HomeFrame();
		GameFrame gameFrame = new GameFrame();
		OverFrame overFrame = new OverFrame();
		
		int correctAnswer;
		
		mainFrame.add(homeFrame.hmPnl);
		
		homeFrame.strBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
			//homeFrame panel is hidden.
				homeFrame.hmPnl.setVisible(false);
			//The labels in the gameFrame are updated with the current score and remaining life.
				gameFrame.lfLbl.setText("Life: " + life);
				gameFrame.scrLbl.setText("Score: " + score);
			//The randomize() method is called on the gameFrame to set random colors and labels for the buttons.
				gameFrame.randomize();
				mainFrame.add(gameFrame.gmPnl);
				gameFrame.gmPnl.setVisible(true);
				
			}
		});
		//When the "extBtn" (exit button) is clicked, the mainFrame is disposed of, effectively closing the application.
		homeFrame.extBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				
				mainFrame.dispose();
				
			}
		});
		
		gameFrame.btn[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
			//check() method is called on the gameFrame to check if the button's background
				//color matches the current color label.
				if (gameFrame.check(gameFrame.btn[0])) {
			//If the colors match:
			//	The score is incremented, and the score label is updated.
			//	The randomize() method is called on the gameFrame to set new random colors and labels for the buttons.
					gameFrame.scrLbl.setText("Score: " + ++score);
					gameFrame.randomize();
				}
				else {
			//If the colors do not match:
			//	The life is decremented, and the life label is updated.	
					life--;
					gameFrame.lfLbl.setText("Life: " + life);
					gameFrame.randomize();
					if (life == 0) {
			//If the life becomes zero:
			//	The gameFrame panel is hidden.
			//	The score is displayed on the overFrame panel.
			//	The overFrame panel is added to the mainFrame, and it becomes visible./		
						gameFrame.gmPnl.setVisible(false);
						overFrame.scrLbl.setText("Score: " + score);
						mainFrame.add(overFrame.ovrPnl);
						overFrame.ovrPnl.setVisible(true);
					}
				}
			}
		});
		gameFrame.btn[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				if (gameFrame.check(gameFrame.btn[1])) {
					gameFrame.scrLbl.setText("Score: " + ++score);
					gameFrame.randomize();
				}
				else {
					life--;
					gameFrame.lfLbl.setText("Life: " + life);
					gameFrame.randomize();
					if (life == 0) {
						gameFrame.gmPnl.setVisible(false);
						overFrame.scrLbl.setText("Score: " + score);
						mainFrame.add(overFrame.ovrPnl);
						overFrame.ovrPnl.setVisible(true);
					}
				}
			}
		});
		gameFrame.btn[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				if (gameFrame.check(gameFrame.btn[2])) {
					gameFrame.scrLbl.setText("Score: " + ++score);
					gameFrame.randomize();
				}
				else {
					life--;
					gameFrame.lfLbl.setText("Life: " + life);
					gameFrame.randomize();
					if (life == 0) {
						gameFrame.gmPnl.setVisible(false);
						overFrame.scrLbl.setText("Score: " + score);
						mainFrame.add(overFrame.ovrPnl);
						overFrame.ovrPnl.setVisible(true);
					}
				}
			}
		});
		gameFrame.btn[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				if (gameFrame.check(gameFrame.btn[3])) {
					gameFrame.scrLbl.setText("Score: " + ++score);
					gameFrame.randomize();
				}
				else {
					life--;
					gameFrame.lfLbl.setText("Life: " + life);
					gameFrame.randomize();
					if (life == 0) {
						gameFrame.gmPnl.setVisible(false);
						overFrame.scrLbl.setText("Score: " + score);
						mainFrame.add(overFrame.ovrPnl);
						overFrame.ovrPnl.setVisible(true);
					}
				}
			}
		});
		
		overFrame.hmBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				score = 0;
				life = 3;
				overFrame.ovrPnl.setVisible(false);
				homeFrame.hmPnl.setVisible(true);
			}
		});
	}

	
}
