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
	JButton yes = new JButton("�T�{");
	JButton no = new JButton("����");
	
	public void Info()
	{
		msg = new JFrame("���l��");
		msg.setLayout(null);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		
		msg.setSize(350, 280);		//�]�m�����j�p
		msg.setLocation((int)screen.getWidth() / 3, (int)screen.getHeight() / 3);		//�]�m������m
		msg.setIconImage(msg.getToolkit().getImage(iconPath));		//�]�m�����ϥ�
		msg.setDefaultCloseOperation(msg.DISPOSE_ON_CLOSE);
		
		restartMsg.setText("�u���n���s�}�l��?");
		restartMsg.setFont(new java.awt.Font("", 1, 25));
		restartMsg.setBounds(50, 50, 230, 30);
		msg.add(restartMsg);
		
		yes.setBounds(50, 150, 90, 30);
		msg.add(yes);
		
		no.setBounds(190, 150, 90, 30);
		msg.add(no);
		
		msg.setVisible(true);		//�������i��
		msg.setResizable(false);
	}
}
