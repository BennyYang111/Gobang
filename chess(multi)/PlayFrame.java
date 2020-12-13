import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class PlayFrame
{
	String winPath = Main.class.getClassLoader().getResource("./Image/Win.png").getPath();
	String losePath = Main.class.getClassLoader().getResource("./Image/Lose.png").getPath();
	String iconPath = Main.class.getClassLoader().getResource("./Image/icon.png").getPath();
	String blankPath = Main.class.getClassLoader().getResource("./Image/blank.png").getPath();
	String boardPath = Main.class.getClassLoader().getResource("./Image/board.png").getPath();
	String readyPath = Main.class.getClassLoader().getResource("./Image/ready.png").getPath();
	String blackTurnPath = Main.class.getClassLoader().getResource("./Image/black_turn.png").getPath();
	String whiteTurnPath = Main.class.getClassLoader().getResource("./Image/white_turn.png").getPath();
	
	//JFrame playFrame;
	JPanel playPanel;
	
	JLayeredPane playLayeredPane = new JLayeredPane();
	JLabel Turn = new JLabel();
	JLabel Blank = new JLabel();
	JLabel timeOutMsg = new JLabel();
	JLabel round = new JLabel("回合：1");
	JLabel whiteMsg = new JLabel();
	JLabel blackMsg = new JLabel();
	JLabel background = new JLabel();
	JLabel name = new JLabel("玩家:");
	JLabel playerName = new JLabel();
	JLabel chess = new JLabel();
	JButton clean = new JButton("再來一把");
	//JButton back = new JButton("悔棋");
	JButton logout = new JButton("←");
	
	public void setFrame()
	{		
		//playFrame = new JFrame("五子棋");
		//playFrame.setLayout(null);
		//Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		
		playPanel = new JPanel();
		
		ImageIcon blank = new ImageIcon(blankPath);
		Blank.setIcon(blank);
		playPanel.setBounds(0, -5, 600, 700);
		playPanel.add(Blank);
		playLayeredPane.add(playPanel, JLayeredPane.DEFAULT_LAYER);
		
		ImageIcon board = new ImageIcon(boardPath);
		background.setIcon(board);
		background.setBounds(75, 160, 435, 449);
		playPanel.add(background);
		playLayeredPane.add(background, JLayeredPane.PALETTE_LAYER);
		
		ImageIcon turn = new ImageIcon(blackTurnPath);
		Turn.setIcon(turn);
		Turn.setBounds(267, 80, 57, 57);
		playPanel.add(Turn);
		playLayeredPane.add(Turn, JLayeredPane.PALETTE_LAYER);
		
		blackMsg.setBounds(145, 80, 57, 57);
		playPanel.add(blackMsg);
		playLayeredPane.add(blackMsg, JLayeredPane.PALETTE_LAYER);
		
		whiteMsg.setBounds(380, 80, 57, 57);
		playPanel.add(whiteMsg);
		playLayeredPane.add(whiteMsg, JLayeredPane.PALETTE_LAYER);
		
		clean.setBounds(420, 10, 140, 50);
		clean.setFont(new java.awt.Font("標楷體", 1, 25));
		//playPanel.add(clean);
		//playLayeredPane.add(clean, JLayeredPane.PALETTE_LAYER);
		
		//ImageIcon white = new ImageIcon(Main.frame.winPath);
		//Main.frame.whiteMsg.setIcon(white);
		//ImageIcon black = new ImageIcon(Main.frame.losePath);
		//Main.frame.blackMsg.setIcon(black);
		
		timeOutMsg.setBounds(240, 130, 190, 50);
		timeOutMsg.setFont(new java.awt.Font("標楷體", 1, 25));
		playPanel.add(timeOutMsg);
		playLayeredPane.add(timeOutMsg, JLayeredPane.MODAL_LAYER);
		
		//back.setBounds(10, 10, 120, 50);
		//back.setFont(new java.awt.Font("標楷體", 1, 25));
		//playPanel.add(back);
		//playLayeredPane.add(back, JLayeredPane.PALETTE_LAYER);
		
		name.setBounds(10, 10, 100, 50);
		name.setFont(new java.awt.Font("標楷體", 1, 25));
		playPanel.add(name);
		playLayeredPane.add(name, JLayeredPane.PALETTE_LAYER);
		
		chess.setBounds(10, 60, 29, 29);
		playPanel.add(chess);
		playLayeredPane.add(chess, JLayeredPane.PALETTE_LAYER);
		
		playerName.setBounds(50, 50, 120, 50);
		playerName.setFont(new java.awt.Font("標楷體", 1, 25));
		playPanel.add(playerName);
		playLayeredPane.add(playerName, JLayeredPane.PALETTE_LAYER);
		
		logout.setBounds(10, 590, 60, 50);
		logout.setFont(new java.awt.Font("標楷體", 1, 20));
		playPanel.add(logout);
		playLayeredPane.add(logout, JLayeredPane.PALETTE_LAYER);
		
		round.setBounds(253, 10, 120, 50);
		round.setFont(new java.awt.Font("標楷體", 1, 25));
		playPanel.add(round);
		playLayeredPane.add(round, JLayeredPane.PALETTE_LAYER);
		
		//playFrame.setLayeredPane(playLayeredPane);
		//playFrame.setSize(600, 700);		//設置視窗大小
		//playFrame.setLocation((int)screen.getWidth() / 4, (int)screen.getHeight() / 6);		//設置視窗位置
		//playFrame.setIconImage(playFrame.getToolkit().getImage(iconPath));		//設置視窗圖示
		//playFrame.setDefaultCloseOperation(playFrame.EXIT_ON_CLOSE);
		//playFrame.setVisible(true);		//讓視窗可見
		//playFrame.setResizable(false);		//不可調整視窗大小
	}
}
