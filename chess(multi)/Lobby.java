import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Lobby {
	String iconPath = Main.class.getClassLoader().getResource("./Image/icon.png").getPath();
	String backroundPath = Main.class.getClassLoader().getResource("./Image/lobby_back.png").getPath();
	
	//JFrame lobbyFrame;
	JPanel lobbyPanel = new JPanel();
	
	JLayeredPane lobbyLayeredPane = new JLayeredPane();
	JLabel back = new JLabel();
	JLabel wait = new JLabel("按下按鈕開始配對!");
	JButton waitButton = new JButton("配對玩家");
	JButton logout = new JButton("←");
	
	public void setframeLobby()
	{
		ImageIcon background = new ImageIcon(backroundPath);
		back.setIcon(background);
		lobbyPanel.setBounds(0, -5, 600, 700);
		lobbyPanel.add(back);
		lobbyLayeredPane.add(lobbyPanel, JLayeredPane.DEFAULT_LAYER);
		
		wait.setBounds(190, 360, 250, 30);
		wait.setFont(new java.awt.Font("標楷體", 1, 25));
		lobbyPanel.add(wait);
		lobbyLayeredPane.add(wait, JLayeredPane.PALETTE_LAYER);
		
		waitButton.setBounds(220, 480, 150, 50);
		waitButton.setFont(new java.awt.Font("標楷體", 1, 25));
		lobbyPanel.add(waitButton);
		lobbyLayeredPane.add(waitButton, JLayeredPane.PALETTE_LAYER);
		
		logout.setBounds(10, 590, 60, 50);
		logout.setFont(new java.awt.Font("標楷體", 1, 20));
		lobbyPanel.add(logout);
		lobbyLayeredPane.add(logout, JLayeredPane.PALETTE_LAYER);
	}
}
