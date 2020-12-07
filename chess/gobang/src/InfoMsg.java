import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class InfoMsg
{
	
	String iconPath = Main.class.getClassLoader().getResource("./Image/icon.png").getPath();
	
	JFrame msg;
	JLabel restartMsg = new JLabel("", JLabel.CENTER);
	JButton yes = new JButton("確認");
	JButton no = new JButton("取消");
	
	public void Info()
	{
		msg = new JFrame("五子棋");
		msg.setLayout(null);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		
		msg.setSize(350, 280);		//設置視窗大小
		msg.setLocation((int)screen.getWidth() / 3, (int)screen.getHeight() / 3);		//設置視窗位置
		msg.setIconImage(msg.getToolkit().getImage(iconPath));		//設置視窗圖示
		msg.setDefaultCloseOperation(msg.DISPOSE_ON_CLOSE);
		
		restartMsg.setText("真的要重新開始嗎?");
		restartMsg.setFont(new java.awt.Font("", 1, 25));
		restartMsg.setBounds(50, 50, 230, 30);
		msg.add(restartMsg);
		
		yes.setBounds(50, 150, 90, 30);
		msg.add(yes);
		
		no.setBounds(190, 150, 90, 30);
		msg.add(no);
		
		msg.setVisible(true);		//讓視窗可見
		msg.setResizable(false);
	}
}
