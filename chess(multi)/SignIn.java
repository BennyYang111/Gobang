import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;
import javax.swing.border.Border;

public class SignIn {
	
	String iconPath = Main.class.getClassLoader().getResource("./Image/icon.png").getPath();
	String backroundPath = Main.class.getClassLoader().getResource("./Image/sign_in_back.png").getPath();
	
	//JFrame signInFrame;
	JPanel signInPanel = new JPanel();
	
	JLayeredPane signInLayeredPane = new JLayeredPane();
	JLabel back = new JLabel();
	JLabel info = new JLabel();
	JLabel acc = new JLabel("�b��");
	JLabel pass = new JLabel("�K�X");
	JLabel signUp = new JLabel("�e�����U");
	JButton send = new JButton("�n�J");
	JButton noSignUp = new JButton("���U");
	JTextField account = new JTextField();
	JPasswordField password = new JPasswordField();
	
	public void setframeSignIn()
	{
		//signInFrame = new JFrame("���l��");
		//signInFrame.setLayout(null);
		//Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		
		//signInPanel = new JPanel();
		
		ImageIcon background = new ImageIcon(backroundPath);
		back.setIcon(background);
		signInPanel.setBounds(0, -5, 600, 700);
		signInPanel.add(back);
		signInLayeredPane.add(signInPanel, JLayeredPane.DEFAULT_LAYER);
		
		acc.setBounds(155, 358, 60, 30);
		acc.setFont(new java.awt.Font("�з���", 1, 25));
		signInPanel.add(acc);
		signInLayeredPane.add(acc, JLayeredPane.PALETTE_LAYER);
		
		account.setFont(new java.awt.Font("", 1, 25));
		account.setBounds(230, 360, 190, 30);
		signInPanel.add(account);
		signInLayeredPane.add(account, JLayeredPane.PALETTE_LAYER);
		
		pass.setBounds(155, 400, 60, 30);
		pass.setFont(new java.awt.Font("�з���", 1, 25));
		signInPanel.add(pass);
		signInLayeredPane.add(pass, JLayeredPane.PALETTE_LAYER);
		
		password.setFont(new java.awt.Font("", 1, 25));
		password.setBounds(230, 400, 190, 30);
		signInPanel.add(password);
		signInLayeredPane.add(password, JLayeredPane.PALETTE_LAYER);
		
		signUp.setBounds(155, 550, 120, 30);
		signUp.setFont(new java.awt.Font("�з���", 1, 20));
		signInPanel.add(signUp);
		signInLayeredPane.add(signUp, JLayeredPane.PALETTE_LAYER);
		
		info.setForeground(Color.RED);
		info.setBounds(230, 440, 200, 30);
		info.setFont(new java.awt.Font("�з���", 1, 20));
		signInPanel.add(info);
		signInLayeredPane.add(info, JLayeredPane.PALETTE_LAYER);
		
		send.setBounds(260, 480, 80, 30);
		send.setFont(new java.awt.Font("�з���", 1, 18));
		signInPanel.add(send);
		signInLayeredPane.add(send, JLayeredPane.PALETTE_LAYER);
		
		noSignUp.setBounds(260, 550, 80, 30);
		noSignUp.setFont(new java.awt.Font("�з���", 1, 18));
		signInPanel.add(noSignUp);
		signInLayeredPane.add(noSignUp, JLayeredPane.PALETTE_LAYER);
		
		//signInFrame.setLayeredPane(signInLayeredPane);
		//signInFrame.setSize(600, 700);		//�]�m�����j�p
		//signInFrame.setLocation((int)screen.getWidth() / 4, (int)screen.getHeight() / 6);		//�]�m������m
		//signInFrame.setIconImage(signInFrame.getToolkit().getImage(iconPath));		//�]�m�����ϥ�
		//signInFrame.setDefaultCloseOperation(signInFrame.DISPOSE_ON_CLOSE);
		//signInFrame.setVisible(true);		//�������i��
		//signInFrame.setResizable(false);		//���i�վ�����j�p
	}
}
