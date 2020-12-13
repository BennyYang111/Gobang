import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class InfoMsg
{
	
	String iconPath = Main.class.getClassLoader().getResource("./Image/icon.png").getPath();
	String blankPath = Main.class.getClassLoader().getResource("./Image/blankMsg.png").getPath();
	
	JFrame msg;
	JPanel msgPanel;
	JLayeredPane msgLayeredPane = new JLayeredPane();
	
	JLabel Blank = new JLabel();
	JLabel restartMsg = new JLabel("", JLabel.CENTER);
	JButton yes = new JButton("確認");
	JButton no = new JButton("取消");
	
	public void Info()
	{
		msg = new JFrame("五子棋");
		msg.setLayout(null);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		
		msgPanel = new JPanel();
		
		/*msg.setLayeredPane(msgLayeredPane);
		msg.setSize(350, 280);		//設置視窗大小
		msg.setLocation((int)screen.getWidth() / 3, (int)screen.getHeight() / 3);		//設置視窗位置
		msg.setIconImage(msg.getToolkit().getImage(iconPath));		//設置視窗圖示
		msg.setDefaultCloseOperation(msg.DISPOSE_ON_CLOSE);
		msg.setVisible(true);		//讓視窗可見
		msg.setResizable(false);		//不可調整視窗大小*/
		
		ImageIcon blank = new ImageIcon(blankPath);
		Blank.setIcon(blank);
		Blank.setBounds(0, -5, 350, 280);
		msgPanel.add(Blank);
		msgLayeredPane.add(Blank, JLayeredPane.DEFAULT_LAYER);
		//msgLayeredPane.add(msgPanel, JLayeredPane.DEFAULT_LAYER);
		
		restartMsg.setText("對方已經登出!!");
		restartMsg.setFont(new java.awt.Font("標楷體", 1, 25));
		restartMsg.setBounds(50, 70, 230, 30);
		msgPanel.add(restartMsg);
		msgLayeredPane.add(restartMsg, JLayeredPane.PALETTE_LAYER);
		//msg.add(restartMsg);
		
		yes.setBounds(115, 150, 90, 30);
		msgPanel.add(yes);
		msgLayeredPane.add(yes, JLayeredPane.PALETTE_LAYER);
		//msg.add(yes);
		
		/*yes.setBounds(50, 150, 90, 30);
		msg.add(yes);*/
		
		//no.setBounds(190, 150, 90, 30);
		//msg.add(no);
		
		msg.setLayeredPane(msgLayeredPane);
		msg.setSize(350, 280);		//設置視窗大小
		msg.setLocation(100, 300);		//設置視窗位置
		//msg.setLocation((int)screen.getWidth() / 3, (int)screen.getHeight() / 3);		//設置視窗位置
		msg.setIconImage(msg.getToolkit().getImage(iconPath));		//設置視窗圖示
		msg.setDefaultCloseOperation(msg.DISPOSE_ON_CLOSE);
		msg.setVisible(true);		//讓視窗可見
		msg.setResizable(false);
	}
}
