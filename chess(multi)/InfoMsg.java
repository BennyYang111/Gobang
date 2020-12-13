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
	JButton yes = new JButton("�T�{");
	JButton no = new JButton("����");
	
	public void Info()
	{
		msg = new JFrame("���l��");
		msg.setLayout(null);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		
		msgPanel = new JPanel();
		
		/*msg.setLayeredPane(msgLayeredPane);
		msg.setSize(350, 280);		//�]�m�����j�p
		msg.setLocation((int)screen.getWidth() / 3, (int)screen.getHeight() / 3);		//�]�m������m
		msg.setIconImage(msg.getToolkit().getImage(iconPath));		//�]�m�����ϥ�
		msg.setDefaultCloseOperation(msg.DISPOSE_ON_CLOSE);
		msg.setVisible(true);		//�������i��
		msg.setResizable(false);		//���i�վ�����j�p*/
		
		ImageIcon blank = new ImageIcon(blankPath);
		Blank.setIcon(blank);
		Blank.setBounds(0, -5, 350, 280);
		msgPanel.add(Blank);
		msgLayeredPane.add(Blank, JLayeredPane.DEFAULT_LAYER);
		//msgLayeredPane.add(msgPanel, JLayeredPane.DEFAULT_LAYER);
		
		restartMsg.setText("���w�g�n�X!!");
		restartMsg.setFont(new java.awt.Font("�з���", 1, 25));
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
		msg.setSize(350, 280);		//�]�m�����j�p
		msg.setLocation(100, 300);		//�]�m������m
		//msg.setLocation((int)screen.getWidth() / 3, (int)screen.getHeight() / 3);		//�]�m������m
		msg.setIconImage(msg.getToolkit().getImage(iconPath));		//�]�m�����ϥ�
		msg.setDefaultCloseOperation(msg.DISPOSE_ON_CLOSE);
		msg.setVisible(true);		//�������i��
		msg.setResizable(false);
	}
}
