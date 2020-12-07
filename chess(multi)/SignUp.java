import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;
import javax.swing.border.Border;

public class SignUp {
	
	String iconPath = Main.class.getClassLoader().getResource("./Image/icon.png").getPath();
	String backroundPath = Main.class.getClassLoader().getResource("./Image/sign_up_back.png").getPath();
	
	//JFrame signUpFrame;
	JPanel signUpPanel = new JPanel();
	
	JLayeredPane signUpLayeredPane = new JLayeredPane();
	JLabel back = new JLabel();
	JLabel info = new JLabel();
	JLabel acc = new JLabel("�b��");
	JLabel pass = new JLabel("�K�X");
	JButton send = new JButton("���U");
	JButton backSignIn = new JButton("��^");
	JTextField account = new JTextField();
	JPasswordField password = new JPasswordField();
	
	public void setframeSignUp()
	{
		//signUpFrame = new JFrame("���l��");
		//signUpFrame.setLayout(null);
		//Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		
		//signUpPanel = new JPanel();
		
		ImageIcon background = new ImageIcon(backroundPath);
		back.setIcon(background);
		signUpPanel.setBounds(0, -5, 600, 700);
		signUpPanel.add(back);
		signUpLayeredPane.add(signUpPanel, JLayeredPane.DEFAULT_LAYER);
		
		acc.setBounds(155, 358, 60, 30);
		acc.setFont(new java.awt.Font("�з���", 1, 25));
		signUpPanel.add(acc);
		signUpLayeredPane.add(acc, JLayeredPane.PALETTE_LAYER);
		
		account.setFont(new java.awt.Font("", 1, 25));
		account.setBounds(230, 360, 190, 30);
		signUpPanel.add(account);
		signUpLayeredPane.add(account, JLayeredPane.PALETTE_LAYER);
		
		pass.setBounds(155, 400, 60, 30);
		pass.setFont(new java.awt.Font("�з���", 1, 25));
		signUpPanel.add(pass);
		signUpLayeredPane.add(pass, JLayeredPane.PALETTE_LAYER);
		
		password.setFont(new java.awt.Font("", 1, 25));
		password.setBounds(230, 400, 190, 30);
		signUpPanel.add(password);
		signUpLayeredPane.add(password, JLayeredPane.PALETTE_LAYER);
		
		info.setForeground(Color.RED);
		info.setBounds(230, 440, 200, 30);
		info.setFont(new java.awt.Font("�з���", 1, 20));
		signUpPanel.add(info);
		signUpLayeredPane.add(info, JLayeredPane.PALETTE_LAYER);
		
		send.setBounds(350, 480, 80, 30);
		send.setFont(new java.awt.Font("�з���", 1, 18));
		signUpPanel.add(send);
		signUpLayeredPane.add(send, JLayeredPane.PALETTE_LAYER);
		
		backSignIn.setBounds(180, 480, 80, 30);
		backSignIn.setFont(new java.awt.Font("�з���", 1, 18));
		signUpPanel.add(backSignIn);
		signUpLayeredPane.add(backSignIn, JLayeredPane.PALETTE_LAYER);
		
		//signUpFrame.setLayeredPane(signUpLayeredPane);
		//signUpFrame.setSize(600, 700);		//�]�m�����j�p
		//signUpFrame.setLocation((int)screen.getWidth() / 4, (int)screen.getHeight() / 6);		//�]�m������m
		//signUpFrame.setIconImage(signUpFrame.getToolkit().getImage(iconPath));		//�]�m�����ϥ�
		//signUpFrame.setDefaultCloseOperation(signUpFrame.DISPOSE_ON_CLOSE);
		//signUpFrame.setVisible(true);		//�������i��
		//signUpFrame.setResizable(false);		//���i�վ�����j�p
	}
}
