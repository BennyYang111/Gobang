import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Location extends Main
{
	String blackLeftUpPath = Main.class.getClassLoader().getResource("./Image/black_left_up.png").getPath();
	String blackMiddleUpPath = Main.class.getClassLoader().getResource("./Image/black_middle_up.png").getPath();
	String blackRightUpPath = Main.class.getClassLoader().getResource("./Image/black_right_up.png").getPath();
	String blackMiddleLeftPath = Main.class.getClassLoader().getResource("./Image/black_middle_Left.png").getPath();
	String blackLeftDownPath = Main.class.getClassLoader().getResource("./Image/black_left_down.png").getPath();
	String blackMiddleDownPath = Main.class.getClassLoader().getResource("./Image/black_middle_down.png").getPath();
	String blackRightDownPath = Main.class.getClassLoader().getResource("./Image/black_right_down.png").getPath();
	String blackMiddleRightPath = Main.class.getClassLoader().getResource("./Image/black_middle_right.png").getPath();
	String blackPath = Main.class.getClassLoader().getResource("./Image/black.png").getPath();
	
	String whiteLeftUpPath = Main.class.getClassLoader().getResource("./Image/white_left_up.png").getPath();
	String whiteMiddleUpPath = Main.class.getClassLoader().getResource("./Image/white_middle_up.png").getPath();
	String whiteRightUpPath = Main.class.getClassLoader().getResource("./Image/white_right_up.png").getPath();
	String whiteMiddleLeftPath = Main.class.getClassLoader().getResource("./Image/white_middle_Left.png").getPath();
	String whiteLeftDownPath = Main.class.getClassLoader().getResource("./Image/white_left_down.png").getPath();
	String whiteMiddleDownPath = Main.class.getClassLoader().getResource("./Image/white_middle_down.png").getPath();
	String whiteRightDownPath = Main.class.getClassLoader().getResource("./Image/white_right_down.png").getPath();
	String whiteMiddleRightPath = Main.class.getClassLoader().getResource("./Image/white_middle_right.png").getPath();
	String whitePath = Main.class.getClassLoader().getResource("./Image/white.png").getPath();
	
	String leftUpPath = Main.class.getClassLoader().getResource("./Image/left_up.png").getPath();
	String middleUpPath = Main.class.getClassLoader().getResource("./Image/middle_up.png").getPath();
	String rightUpPath = Main.class.getClassLoader().getResource("./Image/right_up.png").getPath();
	String middleLeftPath = Main.class.getClassLoader().getResource("./Image/middle_Left.png").getPath();
	String leftDownPath = Main.class.getClassLoader().getResource("./Image/left_down.png").getPath();
	String middleDownPath = Main.class.getClassLoader().getResource("./Image/middle_down.png").getPath();
	String rightDownPath = Main.class.getClassLoader().getResource("./Image/right_down.png").getPath();
	String middleRightPath = Main.class.getClassLoader().getResource("./Image/middle_right.png").getPath();
	String middlePath = Main.class.getClassLoader().getResource("./Image/middle.png").getPath();
	String middleDotPath = Main.class.getClassLoader().getResource("./Image/middle_dot.png").getPath();
	
	JLabel loc_A15 = new JLabel();	JLabel loc_B15 = new JLabel();	JLabel loc_C15 = new JLabel();
	JLabel loc_D15 = new JLabel();	JLabel loc_E15 = new JLabel();	JLabel loc_F15 = new JLabel();
	JLabel loc_G15 = new JLabel();	JLabel loc_H15 = new JLabel();	JLabel loc_J15 = new JLabel();
	JLabel loc_K15 = new JLabel();	JLabel loc_L15 = new JLabel();	JLabel loc_M15 = new JLabel();
	JLabel loc_N15 = new JLabel();	JLabel loc_O15 = new JLabel();	JLabel loc_P15 = new JLabel();
	JLabel loc_A14 = new JLabel();	JLabel loc_B14 = new JLabel();	JLabel loc_C14 = new JLabel();
	JLabel loc_D14 = new JLabel();	JLabel loc_E14 = new JLabel();	JLabel loc_F14 = new JLabel();
	JLabel loc_G14 = new JLabel();	JLabel loc_H14 = new JLabel();	JLabel loc_J14 = new JLabel();
	JLabel loc_K14 = new JLabel();	JLabel loc_L14 = new JLabel();	JLabel loc_M14 = new JLabel();
	JLabel loc_N14 = new JLabel();	JLabel loc_O14 = new JLabel();	JLabel loc_P14 = new JLabel();
	JLabel loc_A13 = new JLabel();	JLabel loc_B13 = new JLabel();	JLabel loc_C13 = new JLabel();
	JLabel loc_D13 = new JLabel();	JLabel loc_E13 = new JLabel();	JLabel loc_F13 = new JLabel();
	JLabel loc_G13 = new JLabel();	JLabel loc_H13 = new JLabel();	JLabel loc_J13 = new JLabel();
	JLabel loc_K13 = new JLabel();	JLabel loc_L13 = new JLabel();	JLabel loc_M13 = new JLabel();
	JLabel loc_N13 = new JLabel();	JLabel loc_O13 = new JLabel();	JLabel loc_P13 = new JLabel();
	JLabel loc_A12 = new JLabel();	JLabel loc_B12 = new JLabel();	JLabel loc_C12 = new JLabel();
	JLabel loc_D12 = new JLabel();	JLabel loc_E12 = new JLabel();	JLabel loc_F12 = new JLabel();
	JLabel loc_G12 = new JLabel();	JLabel loc_H12 = new JLabel();	JLabel loc_J12 = new JLabel();
	JLabel loc_K12 = new JLabel();	JLabel loc_L12 = new JLabel();	JLabel loc_M12 = new JLabel();
	JLabel loc_N12 = new JLabel();	JLabel loc_O12 = new JLabel();	JLabel loc_P12 = new JLabel();
	JLabel loc_A11 = new JLabel();	JLabel loc_B11 = new JLabel();	JLabel loc_C11 = new JLabel();
	JLabel loc_D11 = new JLabel();	JLabel loc_E11 = new JLabel();	JLabel loc_F11 = new JLabel();
	JLabel loc_G11 = new JLabel();	JLabel loc_H11 = new JLabel();	JLabel loc_J11 = new JLabel();
	JLabel loc_K11 = new JLabel();	JLabel loc_L11 = new JLabel();	JLabel loc_M11 = new JLabel();
	JLabel loc_N11 = new JLabel();	JLabel loc_O11 = new JLabel();	JLabel loc_P11 = new JLabel();
	JLabel loc_A10 = new JLabel();	JLabel loc_B10 = new JLabel();	JLabel loc_C10 = new JLabel();
	JLabel loc_D10 = new JLabel();	JLabel loc_E10 = new JLabel();	JLabel loc_F10 = new JLabel();
	JLabel loc_G10 = new JLabel();	JLabel loc_H10 = new JLabel();	JLabel loc_J10 = new JLabel();
	JLabel loc_K10 = new JLabel();	JLabel loc_L10 = new JLabel();	JLabel loc_M10 = new JLabel();
	JLabel loc_N10 = new JLabel();	JLabel loc_O10 = new JLabel();	JLabel loc_P10 = new JLabel();
	JLabel loc_A9 = new JLabel();	JLabel loc_B9 = new JLabel();	JLabel loc_C9 = new JLabel();
	JLabel loc_D9 = new JLabel();	JLabel loc_E9 = new JLabel();	JLabel loc_F9 = new JLabel();
	JLabel loc_G9 = new JLabel();	JLabel loc_H9 = new JLabel();	JLabel loc_J9 = new JLabel();
	JLabel loc_K9 = new JLabel();	JLabel loc_L9 = new JLabel();	JLabel loc_M9 = new JLabel();
	JLabel loc_N9 = new JLabel();	JLabel loc_O9 = new JLabel();	JLabel loc_P9 = new JLabel();
	JLabel loc_A8 = new JLabel();	JLabel loc_B8 = new JLabel();	JLabel loc_C8 = new JLabel();
	JLabel loc_D8 = new JLabel();	JLabel loc_E8 = new JLabel();	JLabel loc_F8 = new JLabel();
	JLabel loc_G8 = new JLabel();	JLabel loc_H8 = new JLabel();	JLabel loc_J8 = new JLabel();
	JLabel loc_K8 = new JLabel();	JLabel loc_L8 = new JLabel();	JLabel loc_M8 = new JLabel();
	JLabel loc_N8 = new JLabel();	JLabel loc_O8 = new JLabel();	JLabel loc_P8 = new JLabel();
	JLabel loc_A7 = new JLabel();	JLabel loc_B7 = new JLabel();	JLabel loc_C7 = new JLabel();
	JLabel loc_D7 = new JLabel();	JLabel loc_E7 = new JLabel();	JLabel loc_F7 = new JLabel();
	JLabel loc_G7 = new JLabel();	JLabel loc_H7 = new JLabel();	JLabel loc_J7 = new JLabel();
	JLabel loc_K7 = new JLabel();	JLabel loc_L7 = new JLabel();	JLabel loc_M7 = new JLabel();
	JLabel loc_N7 = new JLabel();	JLabel loc_O7 = new JLabel();	JLabel loc_P7 = new JLabel();
	JLabel loc_A6 = new JLabel();	JLabel loc_B6 = new JLabel();	JLabel loc_C6 = new JLabel();
	JLabel loc_D6 = new JLabel();	JLabel loc_E6 = new JLabel();	JLabel loc_F6 = new JLabel();
	JLabel loc_G6 = new JLabel();	JLabel loc_H6 = new JLabel();	JLabel loc_J6 = new JLabel();
	JLabel loc_K6 = new JLabel();	JLabel loc_L6 = new JLabel();	JLabel loc_M6 = new JLabel();
	JLabel loc_N6 = new JLabel();	JLabel loc_O6 = new JLabel();	JLabel loc_P6 = new JLabel();
	JLabel loc_A5 = new JLabel();	JLabel loc_B5 = new JLabel();	JLabel loc_C5 = new JLabel();
	JLabel loc_D5 = new JLabel();	JLabel loc_E5 = new JLabel();	JLabel loc_F5 = new JLabel();
	JLabel loc_G5 = new JLabel();	JLabel loc_H5 = new JLabel();	JLabel loc_J5 = new JLabel();
	JLabel loc_K5 = new JLabel();	JLabel loc_L5 = new JLabel();	JLabel loc_M5 = new JLabel();
	JLabel loc_N5 = new JLabel();	JLabel loc_O5 = new JLabel();	JLabel loc_P5 = new JLabel();
	JLabel loc_A4 = new JLabel();	JLabel loc_B4 = new JLabel();	JLabel loc_C4 = new JLabel();
	JLabel loc_D4 = new JLabel();	JLabel loc_E4 = new JLabel();	JLabel loc_F4 = new JLabel();
	JLabel loc_G4 = new JLabel();	JLabel loc_H4 = new JLabel();	JLabel loc_J4 = new JLabel();
	JLabel loc_K4 = new JLabel();	JLabel loc_L4 = new JLabel();	JLabel loc_M4 = new JLabel();
	JLabel loc_N4 = new JLabel();	JLabel loc_O4 = new JLabel();	JLabel loc_P4 = new JLabel();
	JLabel loc_A3 = new JLabel();	JLabel loc_B3 = new JLabel();	JLabel loc_C3 = new JLabel();
	JLabel loc_D3 = new JLabel();	JLabel loc_E3 = new JLabel();	JLabel loc_F3 = new JLabel();
	JLabel loc_G3 = new JLabel();	JLabel loc_H3 = new JLabel();	JLabel loc_J3 = new JLabel();
	JLabel loc_K3 = new JLabel();	JLabel loc_L3 = new JLabel();	JLabel loc_M3 = new JLabel();
	JLabel loc_N3 = new JLabel();	JLabel loc_O3 = new JLabel();	JLabel loc_P3 = new JLabel();
	JLabel loc_A2 = new JLabel();	JLabel loc_B2 = new JLabel();	JLabel loc_C2 = new JLabel();
	JLabel loc_D2 = new JLabel();	JLabel loc_E2 = new JLabel();	JLabel loc_F2 = new JLabel();
	JLabel loc_G2 = new JLabel();	JLabel loc_H2 = new JLabel();	JLabel loc_J2 = new JLabel();
	JLabel loc_K2 = new JLabel();	JLabel loc_L2 = new JLabel();	JLabel loc_M2 = new JLabel();
	JLabel loc_N2 = new JLabel();	JLabel loc_O2 = new JLabel();	JLabel loc_P2 = new JLabel();
	JLabel loc_A1 = new JLabel();	JLabel loc_B1 = new JLabel();	JLabel loc_C1 = new JLabel();
	JLabel loc_D1 = new JLabel();	JLabel loc_E1 = new JLabel();	JLabel loc_F1 = new JLabel();
	JLabel loc_G1 = new JLabel();	JLabel loc_H1 = new JLabel();	JLabel loc_J1 = new JLabel();
	JLabel loc_K1 = new JLabel();	JLabel loc_L1 = new JLabel();	JLabel loc_M1 = new JLabel();
	JLabel loc_N1 = new JLabel();	JLabel loc_O1 = new JLabel();	JLabel loc_P1 = new JLabel();
	
	public void clean()
	{
		loc_A15.setIcon(null);	loc_A14.setIcon(null);	loc_A13.setIcon(null);	loc_A12.setIcon(null);	loc_A11.setIcon(null);	loc_A10.setIcon(null);	loc_A9.setIcon(null);	loc_A8.setIcon(null);	loc_A7.setIcon(null);	loc_A6.setIcon(null);	loc_A5.setIcon(null);	loc_A4.setIcon(null);	loc_A3.setIcon(null);	loc_A2.setIcon(null);	loc_A1.setIcon(null);
		loc_B15.setIcon(null);	loc_B14.setIcon(null);	loc_B13.setIcon(null);	loc_B12.setIcon(null);	loc_B11.setIcon(null);	loc_B10.setIcon(null);	loc_B9.setIcon(null);	loc_B8.setIcon(null);	loc_B7.setIcon(null);	loc_B6.setIcon(null);	loc_B5.setIcon(null);	loc_B4.setIcon(null);	loc_B3.setIcon(null);	loc_B2.setIcon(null);	loc_B1.setIcon(null);
		loc_C15.setIcon(null);	loc_C14.setIcon(null);	loc_C13.setIcon(null);	loc_C12.setIcon(null);	loc_C11.setIcon(null);	loc_C10.setIcon(null);	loc_C9.setIcon(null);	loc_C8.setIcon(null);	loc_C7.setIcon(null);	loc_C6.setIcon(null);	loc_C5.setIcon(null);	loc_C4.setIcon(null);	loc_C3.setIcon(null);	loc_C2.setIcon(null);	loc_C1.setIcon(null);
		loc_D15.setIcon(null);	loc_D14.setIcon(null);	loc_D13.setIcon(null);	loc_D12.setIcon(null);	loc_D11.setIcon(null);	loc_D10.setIcon(null);	loc_D9.setIcon(null);	loc_D8.setIcon(null);	loc_D7.setIcon(null);	loc_D6.setIcon(null);	loc_D5.setIcon(null);	loc_D4.setIcon(null);	loc_D3.setIcon(null);	loc_D2.setIcon(null);	loc_D1.setIcon(null);
		loc_E15.setIcon(null);	loc_E14.setIcon(null);	loc_E13.setIcon(null);	loc_E12.setIcon(null);	loc_E11.setIcon(null);	loc_E10.setIcon(null);	loc_E9.setIcon(null);	loc_E8.setIcon(null);	loc_E7.setIcon(null);	loc_E6.setIcon(null);	loc_E5.setIcon(null);	loc_E4.setIcon(null);	loc_E3.setIcon(null);	loc_E2.setIcon(null);	loc_E1.setIcon(null);
		loc_F15.setIcon(null);	loc_F14.setIcon(null);	loc_F13.setIcon(null);	loc_F12.setIcon(null);	loc_F11.setIcon(null);	loc_F10.setIcon(null);	loc_F9.setIcon(null);	loc_F8.setIcon(null);	loc_F7.setIcon(null);	loc_F6.setIcon(null);	loc_F5.setIcon(null);	loc_F4.setIcon(null);	loc_F3.setIcon(null);	loc_F2.setIcon(null);	loc_F1.setIcon(null);
		loc_G15.setIcon(null);	loc_G14.setIcon(null);	loc_G13.setIcon(null);	loc_G12.setIcon(null);	loc_G11.setIcon(null);	loc_G10.setIcon(null);	loc_G9.setIcon(null);	loc_G8.setIcon(null);	loc_G7.setIcon(null);	loc_G6.setIcon(null);	loc_G5.setIcon(null);	loc_G4.setIcon(null);	loc_G3.setIcon(null);	loc_G2.setIcon(null);	loc_G1.setIcon(null);
		loc_H15.setIcon(null);	loc_H14.setIcon(null);	loc_H13.setIcon(null);	loc_H12.setIcon(null);	loc_H11.setIcon(null);	loc_H10.setIcon(null);	loc_H9.setIcon(null);	loc_H8.setIcon(null);	loc_H7.setIcon(null);	loc_H6.setIcon(null);	loc_H5.setIcon(null);	loc_H4.setIcon(null);	loc_H3.setIcon(null);	loc_H2.setIcon(null);	loc_H1.setIcon(null);
		loc_J15.setIcon(null);	loc_J14.setIcon(null);	loc_J13.setIcon(null);	loc_J12.setIcon(null);	loc_J11.setIcon(null);	loc_J10.setIcon(null);	loc_J9.setIcon(null);	loc_J8.setIcon(null);	loc_J7.setIcon(null);	loc_J6.setIcon(null);	loc_J5.setIcon(null);	loc_J4.setIcon(null);	loc_J3.setIcon(null);	loc_J2.setIcon(null);	loc_J1.setIcon(null);
		loc_K15.setIcon(null);	loc_K14.setIcon(null);	loc_K13.setIcon(null);	loc_K12.setIcon(null);	loc_K11.setIcon(null);	loc_K10.setIcon(null);	loc_K9.setIcon(null);	loc_K8.setIcon(null);	loc_K7.setIcon(null);	loc_K6.setIcon(null);	loc_K5.setIcon(null);	loc_K4.setIcon(null);	loc_K3.setIcon(null);	loc_K2.setIcon(null);	loc_K1.setIcon(null);
		loc_L15.setIcon(null);	loc_L14.setIcon(null);	loc_L13.setIcon(null);	loc_L12.setIcon(null);	loc_L11.setIcon(null);	loc_L10.setIcon(null);	loc_L9.setIcon(null);	loc_L8.setIcon(null);	loc_L7.setIcon(null);	loc_L6.setIcon(null);	loc_L5.setIcon(null);	loc_L4.setIcon(null);	loc_L3.setIcon(null);	loc_L2.setIcon(null);	loc_L1.setIcon(null);
		loc_M15.setIcon(null);	loc_M14.setIcon(null);	loc_M13.setIcon(null);	loc_M12.setIcon(null);	loc_M11.setIcon(null);	loc_M10.setIcon(null);	loc_M9.setIcon(null);	loc_M8.setIcon(null);	loc_M7.setIcon(null);	loc_M6.setIcon(null);	loc_M5.setIcon(null);	loc_M4.setIcon(null);	loc_M3.setIcon(null);	loc_M2.setIcon(null);	loc_M1.setIcon(null);
		loc_N15.setIcon(null);	loc_N14.setIcon(null);	loc_N13.setIcon(null);	loc_N12.setIcon(null);	loc_N11.setIcon(null);	loc_N10.setIcon(null);	loc_N9.setIcon(null);	loc_N8.setIcon(null);	loc_N7.setIcon(null);	loc_N6.setIcon(null);	loc_N5.setIcon(null);	loc_N4.setIcon(null);	loc_N3.setIcon(null);	loc_N2.setIcon(null);	loc_N1.setIcon(null);
		loc_O15.setIcon(null);	loc_O14.setIcon(null);	loc_O13.setIcon(null);	loc_O12.setIcon(null);	loc_O11.setIcon(null);	loc_O10.setIcon(null);	loc_O9.setIcon(null);	loc_O8.setIcon(null);	loc_O7.setIcon(null);	loc_O6.setIcon(null);	loc_O5.setIcon(null);	loc_O4.setIcon(null);	loc_O3.setIcon(null);	loc_O2.setIcon(null);	loc_O1.setIcon(null);
		loc_P15.setIcon(null);	loc_P14.setIcon(null);	loc_P13.setIcon(null);	loc_P12.setIcon(null);	loc_P11.setIcon(null);	loc_P10.setIcon(null);	loc_P9.setIcon(null);	loc_P8.setIcon(null);	loc_P7.setIcon(null);	loc_P6.setIcon(null);	loc_P5.setIcon(null);	loc_P4.setIcon(null);	loc_P3.setIcon(null);	loc_P2.setIcon(null);	loc_P1.setIcon(null);
	}
	
	public void place()
	{
		Main.frame.playPanel.add(loc_A15);	Main.frame.playPanel.add(loc_B15);	Main.frame.playPanel.add(loc_C15);	Main.frame.playLayeredPane.add(loc_A15, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_B15, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_C15, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_D15);	Main.frame.playPanel.add(loc_E15);	Main.frame.playPanel.add(loc_F15);	Main.frame.playLayeredPane.add(loc_D15, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_E15, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_F15, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_G15);	Main.frame.playPanel.add(loc_H15);	Main.frame.playPanel.add(loc_J15);	Main.frame.playLayeredPane.add(loc_G15, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_H15, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_J15, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_K15);	Main.frame.playPanel.add(loc_L15);	Main.frame.playPanel.add(loc_M15);	Main.frame.playLayeredPane.add(loc_K15, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_L15, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_M15, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_N15);	Main.frame.playPanel.add(loc_O15);	Main.frame.playPanel.add(loc_P15);	Main.frame.playLayeredPane.add(loc_N15, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_O15, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_P15, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_A14);	Main.frame.playPanel.add(loc_B14);	Main.frame.playPanel.add(loc_C14);	Main.frame.playLayeredPane.add(loc_A14, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_B14, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_C14, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_D14);	Main.frame.playPanel.add(loc_E14);	Main.frame.playPanel.add(loc_F14);	Main.frame.playLayeredPane.add(loc_D14, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_E14, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_F14, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_G14);	Main.frame.playPanel.add(loc_H14);	Main.frame.playPanel.add(loc_J14);	Main.frame.playLayeredPane.add(loc_G14, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_H14, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_J14, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_K14);	Main.frame.playPanel.add(loc_L14);	Main.frame.playPanel.add(loc_M14);	Main.frame.playLayeredPane.add(loc_K14, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_L14, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_M14, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_N14);	Main.frame.playPanel.add(loc_O14);	Main.frame.playPanel.add(loc_P14);	Main.frame.playLayeredPane.add(loc_N14, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_O14, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_P14, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_A13);	Main.frame.playPanel.add(loc_B13);	Main.frame.playPanel.add(loc_C13);	Main.frame.playLayeredPane.add(loc_A13, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_B13, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_C13, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_D13);	Main.frame.playPanel.add(loc_E13);	Main.frame.playPanel.add(loc_F13);	Main.frame.playLayeredPane.add(loc_D13, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_E13, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_F13, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_G13);	Main.frame.playPanel.add(loc_H13);	Main.frame.playPanel.add(loc_J13);	Main.frame.playLayeredPane.add(loc_G13, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_H13, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_J13, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_K13);	Main.frame.playPanel.add(loc_L13);	Main.frame.playPanel.add(loc_M13);	Main.frame.playLayeredPane.add(loc_K13, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_L13, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_M13, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_N13);	Main.frame.playPanel.add(loc_O13);	Main.frame.playPanel.add(loc_P13);	Main.frame.playLayeredPane.add(loc_N13, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_O13, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_P13, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_A12);	Main.frame.playPanel.add(loc_B12);	Main.frame.playPanel.add(loc_C12);	Main.frame.playLayeredPane.add(loc_A12, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_B12, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_C12, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_D12);	Main.frame.playPanel.add(loc_E12);	Main.frame.playPanel.add(loc_F12);	Main.frame.playLayeredPane.add(loc_D12, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_E12, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_F12, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_G12);	Main.frame.playPanel.add(loc_H12);	Main.frame.playPanel.add(loc_J12);	Main.frame.playLayeredPane.add(loc_G12, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_H12, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_J12, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_K12);	Main.frame.playPanel.add(loc_L12);	Main.frame.playPanel.add(loc_M12);	Main.frame.playLayeredPane.add(loc_K12, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_L12, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_M12, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_N12);	Main.frame.playPanel.add(loc_O12);	Main.frame.playPanel.add(loc_P12);	Main.frame.playLayeredPane.add(loc_N12, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_O12, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_P12, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_A11);	Main.frame.playPanel.add(loc_B11);	Main.frame.playPanel.add(loc_C11);	Main.frame.playLayeredPane.add(loc_A11, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_B11, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_C11, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_D11);	Main.frame.playPanel.add(loc_E11);	Main.frame.playPanel.add(loc_F11);	Main.frame.playLayeredPane.add(loc_D11, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_E11, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_F11, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_G11);	Main.frame.playPanel.add(loc_H11);	Main.frame.playPanel.add(loc_J11);	Main.frame.playLayeredPane.add(loc_G11, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_H11, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_J11, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_K11);	Main.frame.playPanel.add(loc_L11);	Main.frame.playPanel.add(loc_M11);	Main.frame.playLayeredPane.add(loc_K11, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_L11, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_M11, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_N11);	Main.frame.playPanel.add(loc_O11);	Main.frame.playPanel.add(loc_P11);	Main.frame.playLayeredPane.add(loc_N11, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_O11, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_P11, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_A10);	Main.frame.playPanel.add(loc_B10);	Main.frame.playPanel.add(loc_C10);	Main.frame.playLayeredPane.add(loc_A10, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_B10, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_C10, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_D10);	Main.frame.playPanel.add(loc_E10);	Main.frame.playPanel.add(loc_F10);	Main.frame.playLayeredPane.add(loc_D10, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_E10, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_F10, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_G10);	Main.frame.playPanel.add(loc_H10);	Main.frame.playPanel.add(loc_J10);	Main.frame.playLayeredPane.add(loc_G10, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_H10, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_J10, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_K10);	Main.frame.playPanel.add(loc_L10);	Main.frame.playPanel.add(loc_M10);	Main.frame.playLayeredPane.add(loc_K10, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_L10, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_M10, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_N10);	Main.frame.playPanel.add(loc_O10);	Main.frame.playPanel.add(loc_P10);	Main.frame.playLayeredPane.add(loc_N10, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_O10, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_P10, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_A9);	Main.frame.playPanel.add(loc_B9);	Main.frame.playPanel.add(loc_C9);	Main.frame.playLayeredPane.add(loc_A9, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_B9, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_C9, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_D9);	Main.frame.playPanel.add(loc_E9);	Main.frame.playPanel.add(loc_F9);	Main.frame.playLayeredPane.add(loc_D9, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_E9, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_F9, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_G9);	Main.frame.playPanel.add(loc_H9);	Main.frame.playPanel.add(loc_J9);	Main.frame.playLayeredPane.add(loc_G9, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_H9, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_J9, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_K9);	Main.frame.playPanel.add(loc_L9);	Main.frame.playPanel.add(loc_M9);	Main.frame.playLayeredPane.add(loc_K9, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_L9, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_M9, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_N9);	Main.frame.playPanel.add(loc_O9);	Main.frame.playPanel.add(loc_P9);	Main.frame.playLayeredPane.add(loc_N9, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_O9, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_P9, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_A8);	Main.frame.playPanel.add(loc_B8);	Main.frame.playPanel.add(loc_C8);	Main.frame.playLayeredPane.add(loc_A8, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_B8, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_C8, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_D8);	Main.frame.playPanel.add(loc_E8);	Main.frame.playPanel.add(loc_F8);	Main.frame.playLayeredPane.add(loc_D8, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_E8, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_F8, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_G8);	Main.frame.playPanel.add(loc_H8);	Main.frame.playPanel.add(loc_J8);	Main.frame.playLayeredPane.add(loc_G8, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_H8, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_J8, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_K8);	Main.frame.playPanel.add(loc_L8);	Main.frame.playPanel.add(loc_M8);	Main.frame.playLayeredPane.add(loc_K8, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_L8, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_M8, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_N8);	Main.frame.playPanel.add(loc_O8);	Main.frame.playPanel.add(loc_P8);	Main.frame.playLayeredPane.add(loc_N8, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_O8, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_P8, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_A7);	Main.frame.playPanel.add(loc_B7);	Main.frame.playPanel.add(loc_C7);	Main.frame.playLayeredPane.add(loc_A7, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_B7, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_C7, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_D7);	Main.frame.playPanel.add(loc_E7);	Main.frame.playPanel.add(loc_F7);	Main.frame.playLayeredPane.add(loc_D7, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_E7, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_F7, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_G7);	Main.frame.playPanel.add(loc_H7);	Main.frame.playPanel.add(loc_J7);	Main.frame.playLayeredPane.add(loc_G7, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_H7, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_J7, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_K7);	Main.frame.playPanel.add(loc_L7);	Main.frame.playPanel.add(loc_M7);	Main.frame.playLayeredPane.add(loc_K7, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_L7, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_M7, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_N7);	Main.frame.playPanel.add(loc_O7);	Main.frame.playPanel.add(loc_P7);	Main.frame.playLayeredPane.add(loc_N7, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_O7, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_P7, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_A6);	Main.frame.playPanel.add(loc_B6);	Main.frame.playPanel.add(loc_C6);	Main.frame.playLayeredPane.add(loc_A6, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_B6, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_C6, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_D6);	Main.frame.playPanel.add(loc_E6);	Main.frame.playPanel.add(loc_F6);	Main.frame.playLayeredPane.add(loc_D6, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_E6, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_F6, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_G6);	Main.frame.playPanel.add(loc_H6);	Main.frame.playPanel.add(loc_J6);	Main.frame.playLayeredPane.add(loc_G6, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_H6, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_J6, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_K6);	Main.frame.playPanel.add(loc_L6);	Main.frame.playPanel.add(loc_M6);	Main.frame.playLayeredPane.add(loc_K6, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_L6, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_M6, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_N6);	Main.frame.playPanel.add(loc_O6);	Main.frame.playPanel.add(loc_P6);	Main.frame.playLayeredPane.add(loc_N6, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_O6, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_P6, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_A5);	Main.frame.playPanel.add(loc_B5);	Main.frame.playPanel.add(loc_C5);	Main.frame.playLayeredPane.add(loc_A5, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_B5, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_C5, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_D5);	Main.frame.playPanel.add(loc_E5);	Main.frame.playPanel.add(loc_F5);	Main.frame.playLayeredPane.add(loc_D5, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_E5, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_F5, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_G5);	Main.frame.playPanel.add(loc_H5);	Main.frame.playPanel.add(loc_J5);	Main.frame.playLayeredPane.add(loc_G5, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_H5, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_J5, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_K5);	Main.frame.playPanel.add(loc_L5);	Main.frame.playPanel.add(loc_M5);	Main.frame.playLayeredPane.add(loc_K5, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_L5, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_M5, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_N5);	Main.frame.playPanel.add(loc_O5);	Main.frame.playPanel.add(loc_P5);	Main.frame.playLayeredPane.add(loc_N5, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_O5, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_P5, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_A4);	Main.frame.playPanel.add(loc_B4);	Main.frame.playPanel.add(loc_C4);	Main.frame.playLayeredPane.add(loc_A4, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_B4, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_C4, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_D4);	Main.frame.playPanel.add(loc_E4);	Main.frame.playPanel.add(loc_F4);	Main.frame.playLayeredPane.add(loc_D4, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_E4, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_F4, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_G4);	Main.frame.playPanel.add(loc_H4);	Main.frame.playPanel.add(loc_J4);	Main.frame.playLayeredPane.add(loc_G4, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_H4, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_J4, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_K4);	Main.frame.playPanel.add(loc_L4);	Main.frame.playPanel.add(loc_M4);	Main.frame.playLayeredPane.add(loc_K4, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_L4, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_M4, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_N4);	Main.frame.playPanel.add(loc_O4);	Main.frame.playPanel.add(loc_P4);	Main.frame.playLayeredPane.add(loc_N4, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_O4, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_P4, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_A3);	Main.frame.playPanel.add(loc_B3);	Main.frame.playPanel.add(loc_C3);	Main.frame.playLayeredPane.add(loc_A3, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_B3, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_C3, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_D3);	Main.frame.playPanel.add(loc_E3);	Main.frame.playPanel.add(loc_F3);	Main.frame.playLayeredPane.add(loc_D3, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_E3, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_F3, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_G3);	Main.frame.playPanel.add(loc_H3);	Main.frame.playPanel.add(loc_J3);	Main.frame.playLayeredPane.add(loc_G3, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_H3, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_J3, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_K3);	Main.frame.playPanel.add(loc_L3);	Main.frame.playPanel.add(loc_M3);	Main.frame.playLayeredPane.add(loc_K3, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_L3, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_M3, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_N3);	Main.frame.playPanel.add(loc_O3);	Main.frame.playPanel.add(loc_P3);	Main.frame.playLayeredPane.add(loc_N3, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_O3, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_P3, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_A2);	Main.frame.playPanel.add(loc_B2);	Main.frame.playPanel.add(loc_C2);	Main.frame.playLayeredPane.add(loc_A2, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_B2, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_C2, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_D2);	Main.frame.playPanel.add(loc_E2);	Main.frame.playPanel.add(loc_F2);	Main.frame.playLayeredPane.add(loc_D2, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_E2, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_F2, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_G2);	Main.frame.playPanel.add(loc_H2);	Main.frame.playPanel.add(loc_J2);	Main.frame.playLayeredPane.add(loc_G2, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_H2, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_J2, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_K2);	Main.frame.playPanel.add(loc_L2);	Main.frame.playPanel.add(loc_M2);	Main.frame.playLayeredPane.add(loc_K2, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_L2, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_M2, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_N2);	Main.frame.playPanel.add(loc_O2);	Main.frame.playPanel.add(loc_P2);	Main.frame.playLayeredPane.add(loc_N2, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_O2, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_P2, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_A1);	Main.frame.playPanel.add(loc_B1);	Main.frame.playPanel.add(loc_C1);	Main.frame.playLayeredPane.add(loc_A1, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_B1, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_C1, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_D1);	Main.frame.playPanel.add(loc_E1);	Main.frame.playPanel.add(loc_F1);	Main.frame.playLayeredPane.add(loc_D1, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_E1, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_F1, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_G1);	Main.frame.playPanel.add(loc_H1);	Main.frame.playPanel.add(loc_J1);	Main.frame.playLayeredPane.add(loc_G1, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_H1, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_J1, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_K1);	Main.frame.playPanel.add(loc_L1);	Main.frame.playPanel.add(loc_M1);	Main.frame.playLayeredPane.add(loc_K1, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_L1, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_M1, JLayeredPane.MODAL_LAYER);
		Main.frame.playPanel.add(loc_N1);	Main.frame.playPanel.add(loc_O1);	Main.frame.playPanel.add(loc_P1);	Main.frame.playLayeredPane.add(loc_N1, JLayeredPane.MODAL_LAYER); 	Main.frame.playLayeredPane.add(loc_O1, JLayeredPane.MODAL_LAYER); Main.frame.playLayeredPane.add(loc_P1, JLayeredPane.MODAL_LAYER);
	}
	
	public void StepBack()
	{
		ImageIcon leftUp = new ImageIcon(leftUpPath);
		ImageIcon middleUp = new ImageIcon(middleUpPath);
		ImageIcon rightUp = new ImageIcon(rightUpPath);
		ImageIcon middleLeft = new ImageIcon(middleLeftPath);
		ImageIcon leftDown = new ImageIcon(leftDownPath);
		ImageIcon middleDown = new ImageIcon(middleDownPath);
		ImageIcon rightDown = new ImageIcon(rightDownPath);
		ImageIcon middleRight = new ImageIcon(middleRightPath);
		ImageIcon middle = new ImageIcon(middlePath);
		ImageIcon middleDot = new ImageIcon(middleDotPath);
		
		int X = position[2];
		int Y = position[3];
		
		if (X == 0 && Y == 0) loc_A15.setIcon(leftUp);
		else if (X == 1 && Y == 0) loc_A14.setIcon(middleLeft);
		else if (X == 2 && Y == 0) loc_A13.setIcon(middleLeft);
		else if (X == 3 && Y == 0) loc_A12.setIcon(middleLeft);
		else if (X == 4 && Y == 0) loc_A11.setIcon(middleLeft);
		else if (X == 5 && Y == 0) loc_A10.setIcon(middleLeft);
		else if (X == 6 && Y == 0) loc_A9.setIcon(middleLeft);
		else if (X == 7 && Y == 0) loc_A8.setIcon(middleLeft);
		else if (X == 8 && Y == 0) loc_A7.setIcon(middleLeft);
		else if (X == 9 && Y == 0) loc_A6.setIcon(middleLeft);
		else if (X == 10 && Y == 0) loc_A5.setIcon(middleLeft);
		else if (X == 11 && Y == 0) loc_A4.setIcon(middleLeft);
		else if (X == 12 && Y == 0) loc_A3.setIcon(middleLeft);
		else if (X == 13 && Y == 0) loc_A2.setIcon(middleLeft);
		else if (X == 14 && Y == 0) loc_A1.setIcon(leftDown);
		else if (X == 0 && Y == 1) loc_B15.setIcon(middleUp);
		else if (X == 1 && Y == 1) loc_B14.setIcon(middle);
		else if (X == 2 && Y == 1) loc_B13.setIcon(middle);
		else if (X == 3 && Y == 1) loc_B12.setIcon(middle);
		else if (X == 4 && Y == 1) loc_B11.setIcon(middle);
		else if (X == 5 && Y == 1) loc_B10.setIcon(middle);
		else if (X == 6 && Y == 1) loc_B9.setIcon(middle);
		else if (X == 7 && Y == 1) loc_B8.setIcon(middle);
		else if (X == 8 && Y == 1) loc_B7.setIcon(middle);
		else if (X == 9 && Y == 1) loc_B6.setIcon(middle);
		else if (X == 10 && Y == 1) loc_B5.setIcon(middle);
		else if (X == 11 && Y == 1) loc_B4.setIcon(middle);
		else if (X == 12 && Y == 1) loc_B3.setIcon(middle);
		else if (X == 13 && Y == 1) loc_B2.setIcon(middle);
		else if (X == 14 && Y == 1) loc_B1.setIcon(middleDown);
		else if (X == 0 && Y == 2) loc_C15.setIcon(middleUp);
		else if (X == 1 && Y == 2) loc_C14.setIcon(middle);
		else if (X == 2 && Y == 2) loc_C13.setIcon(middle);
		else if (X == 3 && Y == 2) loc_C12.setIcon(middle);
		else if (X == 4 && Y == 2) loc_C11.setIcon(middle);
		else if (X == 5 && Y == 2) loc_C10.setIcon(middle);
		else if (X == 6 && Y == 2) loc_C9.setIcon(middle);
		else if (X == 7 && Y == 2) loc_C8.setIcon(middle);
		else if (X == 8 && Y == 2) loc_C7.setIcon(middle);
		else if (X == 9 && Y == 2) loc_C6.setIcon(middle);
		else if (X == 10 && Y == 2) loc_C5.setIcon(middle);
		else if (X == 11 && Y == 2) loc_C4.setIcon(middle);
		else if (X == 12 && Y == 2) loc_C3.setIcon(middle);
		else if (X == 13 && Y == 2) loc_C2.setIcon(middle);
		else if (X == 14 && Y == 2) loc_C1.setIcon(middleDown);
		else if (X == 0 && Y == 3) loc_D15.setIcon(middleUp);
		else if (X == 1 && Y == 3) loc_D14.setIcon(middle);
		else if (X == 2 && Y == 3) loc_D13.setIcon(middle);
		else if (X == 3 && Y == 3) loc_D12.setIcon(middleDot);
		else if (X == 4 && Y == 3) loc_D11.setIcon(middle);
		else if (X == 5 && Y == 3) loc_D10.setIcon(middle);
		else if (X == 6 && Y == 3) loc_D9.setIcon(middle);
		else if (X == 7 && Y == 3) loc_D8.setIcon(middle);
		else if (X == 8 && Y == 3) loc_D7.setIcon(middle);
		else if (X == 9 && Y == 3) loc_D6.setIcon(middle);
		else if (X == 10 && Y == 3) loc_D5.setIcon(middle);
		else if (X == 11 && Y == 3) loc_D4.setIcon(middleDot);
		else if (X == 12 && Y == 3) loc_D3.setIcon(middle);
		else if (X == 13 && Y == 3) loc_D2.setIcon(middle);
		else if (X == 14 && Y == 3) loc_D1.setIcon(middleDown);
		else if (X == 0 && Y == 4) loc_E15.setIcon(middleUp);
		else if (X == 1 && Y == 4) loc_E14.setIcon(middle);
		else if (X == 2 && Y == 4) loc_E13.setIcon(middle);
		else if (X == 3 && Y == 4) loc_E12.setIcon(middle);
		else if (X == 4 && Y == 4) loc_E11.setIcon(middle);
		else if (X == 5 && Y == 4) loc_E10.setIcon(middle);
		else if (X == 6 && Y == 4) loc_E9.setIcon(middle);
		else if (X == 7 && Y == 4) loc_E8.setIcon(middle);
		else if (X == 8 && Y == 4) loc_E7.setIcon(middle);
		else if (X == 9 && Y == 4) loc_E6.setIcon(middle);
		else if (X == 10 && Y == 4) loc_E5.setIcon(middle);
		else if (X == 11 && Y == 4) loc_E4.setIcon(middle);
		else if (X == 12 && Y == 4) loc_E3.setIcon(middle);
		else if (X == 13 && Y == 4) loc_E2.setIcon(middle);
		else if (X == 14 && Y == 4) loc_E1.setIcon(middleDown);
		else if (X == 0 && Y == 5) loc_F15.setIcon(middleUp);
		else if (X == 1 && Y == 5) loc_F14.setIcon(middle);
		else if (X == 2 && Y == 5) loc_F13.setIcon(middle);
		else if (X == 3 && Y == 5) loc_F12.setIcon(middle);
		else if (X == 4 && Y == 5) loc_F11.setIcon(middle);
		else if (X == 5 && Y == 5) loc_F10.setIcon(middle);
		else if (X == 6 && Y == 5) loc_F9.setIcon(middle);
		else if (X == 7 && Y == 5) loc_F8.setIcon(middle);
		else if (X == 8 && Y == 5) loc_F7.setIcon(middle);
		else if (X == 9 && Y == 5) loc_F6.setIcon(middle);
		else if (X == 10 && Y == 5) loc_F5.setIcon(middle);
		else if (X == 11 && Y == 5) loc_F4.setIcon(middle);
		else if (X == 12 && Y == 5) loc_F3.setIcon(middle);
		else if (X == 13 && Y == 5) loc_F2.setIcon(middle);
		else if (X == 14 && Y == 5) loc_F1.setIcon(middleDown);
		else if (X == 0 && Y == 6) loc_G15.setIcon(middleUp);
		else if (X == 1 && Y == 6) loc_G14.setIcon(middle);
		else if (X == 2 && Y == 6) loc_G13.setIcon(middle);
		else if (X == 3 && Y == 6) loc_G12.setIcon(middle);
		else if (X == 4 && Y == 6) loc_G11.setIcon(middle);
		else if (X == 5 && Y == 6) loc_G10.setIcon(middle);
		else if (X == 6 && Y == 6) loc_G9.setIcon(middle);
		else if (X == 7 && Y == 6) loc_G8.setIcon(middle);
		else if (X == 8 && Y == 6) loc_G7.setIcon(middle);
		else if (X == 9 && Y == 6) loc_G6.setIcon(middle);
		else if (X == 10 && Y == 6) loc_G5.setIcon(middle);
		else if (X == 11 && Y == 6) loc_G4.setIcon(middle);
		else if (X == 12 && Y == 6) loc_G3.setIcon(middle);
		else if (X == 13 && Y == 6) loc_G2.setIcon(middle);
		else if (X == 14 && Y == 6) loc_G1.setIcon(middleDown);
		else if (X == 0 && Y == 7) loc_H15.setIcon(middleUp);
		else if (X == 1 && Y == 7) loc_H14.setIcon(middle);
		else if (X == 2 && Y == 7) loc_H13.setIcon(middle);
		else if (X == 3 && Y == 7) loc_H12.setIcon(middle);
		else if (X == 4 && Y == 7) loc_H11.setIcon(middle);
		else if (X == 5 && Y == 7) loc_H10.setIcon(middle);
		else if (X == 6 && Y == 7) loc_H9.setIcon(middle);
		else if (X == 7 && Y == 7) loc_H8.setIcon(middleDot);
		else if (X == 8 && Y == 7) loc_H7.setIcon(middle);
		else if (X == 9 && Y == 7) loc_H6.setIcon(middle);
		else if (X == 10 && Y == 7) loc_H5.setIcon(middle);
		else if (X == 11 && Y == 7) loc_H4.setIcon(middle);
		else if (X == 12 && Y == 7) loc_H3.setIcon(middle);
		else if (X == 13 && Y == 7) loc_H2.setIcon(middle);
		else if (X == 14 && Y == 7) loc_H1.setIcon(middleDown);
		else if (X == 0 && Y == 8) loc_J15.setIcon(middleUp);
		else if (X == 1 && Y == 8) loc_J14.setIcon(middle);
		else if (X == 2 && Y == 8) loc_J13.setIcon(middle);
		else if (X == 3 && Y == 8) loc_J12.setIcon(middle);
		else if (X == 4 && Y == 8) loc_J11.setIcon(middle);
		else if (X == 5 && Y == 8) loc_J10.setIcon(middle);
		else if (X == 6 && Y == 8) loc_J9.setIcon(middle);
		else if (X == 7 && Y == 8) loc_J8.setIcon(middle);
		else if (X == 8 && Y == 8) loc_J7.setIcon(middle);
		else if (X == 9 && Y == 8) loc_J6.setIcon(middle);
		else if (X == 10 && Y == 8) loc_J5.setIcon(middle);
		else if (X == 11 && Y == 8) loc_J4.setIcon(middle);
		else if (X == 12 && Y == 8) loc_J3.setIcon(middle);
		else if (X == 13 && Y == 8) loc_J2.setIcon(middle);
		else if (X == 14 && Y == 8) loc_J1.setIcon(middleDown);
		else if (X == 0 && Y == 9) loc_K15.setIcon(middleUp);
		else if (X == 1 && Y == 9) loc_K14.setIcon(middle);
		else if (X == 2 && Y == 9) loc_K13.setIcon(middle);
		else if (X == 3 && Y == 9) loc_K12.setIcon(middle);
		else if (X == 4 && Y == 9) loc_K11.setIcon(middle);
		else if (X == 5 && Y == 9) loc_K10.setIcon(middle);
		else if (X == 6 && Y == 9) loc_K9.setIcon(middle);
		else if (X == 7 && Y == 9) loc_K8.setIcon(middle);
		else if (X == 8 && Y == 9) loc_K7.setIcon(middle);
		else if (X == 9 && Y == 9) loc_K6.setIcon(middle);
		else if (X == 10 && Y == 9) loc_K5.setIcon(middle);
		else if (X == 11 && Y == 9) loc_K4.setIcon(middle);
		else if (X == 12 && Y == 9) loc_K3.setIcon(middle);
		else if (X == 13 && Y == 9) loc_K2.setIcon(middle);
		else if (X == 14 && Y == 9) loc_K1.setIcon(middleDown);
		else if (X == 0 && Y == 10) loc_L15.setIcon(middleUp);
		else if (X == 1 && Y == 10) loc_L14.setIcon(middle);
		else if (X == 2 && Y == 10) loc_L13.setIcon(middle);
		else if (X == 3 && Y == 10) loc_L12.setIcon(middle);
		else if (X == 4 && Y == 10) loc_L11.setIcon(middle);
		else if (X == 5 && Y == 10) loc_L10.setIcon(middle);
		else if (X == 6 && Y == 10) loc_L9.setIcon(middle);
		else if (X == 7 && Y == 10) loc_L8.setIcon(middle);
		else if (X == 8 && Y == 10) loc_L7.setIcon(middle);
		else if (X == 9 && Y == 10) loc_L6.setIcon(middle);
		else if (X == 10 && Y == 10) loc_L5.setIcon(middle);
		else if (X == 11 && Y == 10) loc_L4.setIcon(middle);
		else if (X == 12 && Y == 10) loc_L3.setIcon(middle);
		else if (X == 13 && Y == 10) loc_L2.setIcon(middle);
		else if (X == 14 && Y == 10) loc_L1.setIcon(middleDown);
		else if (X == 0 && Y == 11) loc_M15.setIcon(middleUp);
		else if (X == 1 && Y == 11) loc_M14.setIcon(middle);
		else if (X == 2 && Y == 11) loc_M13.setIcon(middle);
		else if (X == 3 && Y == 11) loc_M12.setIcon(middleDot);
		else if (X == 4 && Y == 11) loc_M11.setIcon(middle);
		else if (X == 5 && Y == 11) loc_M10.setIcon(middle);
		else if (X == 6 && Y == 11) loc_M9.setIcon(middle);
		else if (X == 7 && Y == 11) loc_M8.setIcon(middle);
		else if (X == 8 && Y == 11) loc_M7.setIcon(middle);
		else if (X == 9 && Y == 11) loc_M6.setIcon(middle);
		else if (X == 10 && Y == 11) loc_M5.setIcon(middle);
		else if (X == 11 && Y == 11) loc_M4.setIcon(middleDot);
		else if (X == 12 && Y == 11) loc_M3.setIcon(middle);
		else if (X == 13 && Y == 11) loc_M2.setIcon(middle);
		else if (X == 14 && Y == 11) loc_M1.setIcon(middleDown);
		else if (X == 0 && Y == 12) loc_N15.setIcon(middleUp);
		else if (X == 1 && Y == 12) loc_N14.setIcon(middle);
		else if (X == 2 && Y == 12) loc_N13.setIcon(middle);
		else if (X == 3 && Y == 12) loc_N12.setIcon(middle);
		else if (X == 4 && Y == 12) loc_N11.setIcon(middle);
		else if (X == 5 && Y == 12) loc_N10.setIcon(middle);
		else if (X == 6 && Y == 12) loc_N9.setIcon(middle);
		else if (X == 7 && Y == 12) loc_N8.setIcon(middle);
		else if (X == 8 && Y == 12) loc_N7.setIcon(middle);
		else if (X == 9 && Y == 12) loc_N6.setIcon(middle);
		else if (X == 10 && Y == 12) loc_N5.setIcon(middle);
		else if (X == 11 && Y == 12) loc_N4.setIcon(middle);
		else if (X == 12 && Y == 12) loc_N3.setIcon(middle);
		else if (X == 13 && Y == 12) loc_N2.setIcon(middle);
		else if (X == 14 && Y == 12) loc_N1.setIcon(middleDown);
		else if (X == 0 && Y == 13) loc_O15.setIcon(middleUp);
		else if (X == 1 && Y == 13) loc_O14.setIcon(middle);
		else if (X == 2 && Y == 13) loc_O13.setIcon(middle);
		else if (X == 3 && Y == 13) loc_O12.setIcon(middle);
		else if (X == 4 && Y == 13) loc_O11.setIcon(middle);
		else if (X == 5 && Y == 13) loc_O10.setIcon(middle);
		else if (X == 6 && Y == 13) loc_O9.setIcon(middle);
		else if (X == 7 && Y == 13) loc_O8.setIcon(middle);
		else if (X == 8 && Y == 13) loc_O7.setIcon(middle);
		else if (X == 9 && Y == 13) loc_O6.setIcon(middle);
		else if (X == 10 && Y == 13) loc_O5.setIcon(middle);
		else if (X == 11 && Y == 13) loc_O4.setIcon(middle);
		else if (X == 12 && Y == 13) loc_O3.setIcon(middle);
		else if (X == 13 && Y == 13) loc_O2.setIcon(middle);
		else if (X == 14 && Y == 13) loc_O1.setIcon(middleDown);
		else if (X == 0 && Y == 14) loc_P15.setIcon(rightUp);
		else if (X == 1 && Y == 14) loc_P14.setIcon(middleRight);
		else if (X == 2 && Y == 14) loc_P13.setIcon(middleRight);
		else if (X == 3 && Y == 14) loc_P12.setIcon(middleRight);
		else if (X == 4 && Y == 14) loc_P11.setIcon(middleRight);
		else if (X == 5 && Y == 14) loc_P10.setIcon(middleRight);
		else if (X == 6 && Y == 14) loc_P9.setIcon(middleRight);
		else if (X == 7 && Y == 14) loc_P8.setIcon(middleRight);
		else if (X == 8 && Y == 14) loc_P7.setIcon(middleRight);
		else if (X == 9 && Y == 14) loc_P6.setIcon(middleRight);
		else if (X == 10 && Y == 14) loc_P5.setIcon(middleRight);
		else if (X == 11 && Y == 14) loc_P4.setIcon(middleRight);
		else if (X == 12 && Y == 14) loc_P3.setIcon(middleRight);
		else if (X == 13 && Y == 14) loc_P2.setIcon(middleRight);
		else if (X == 14 && Y == 14) loc_P1.setIcon(rightDown);
		
		place();
	}
	
	public int[][] location(int X, int Y, int player, int[][] win)
	{	
		ImageIcon blackLeftUp = new ImageIcon(blackLeftUpPath);
		ImageIcon blackMiddleUp = new ImageIcon(blackMiddleUpPath);
		ImageIcon blackRightUp = new ImageIcon(blackRightUpPath);
		ImageIcon blackMiddleLeft = new ImageIcon(blackMiddleLeftPath);
		ImageIcon blackLeftDown = new ImageIcon(blackLeftDownPath);
		ImageIcon blackMiddleDown = new ImageIcon(blackMiddleDownPath);
		ImageIcon blackRightDown = new ImageIcon(blackRightDownPath);
		ImageIcon blackMiddleRight = new ImageIcon(blackMiddleRightPath);
		ImageIcon black = new ImageIcon(blackPath);
		
		ImageIcon whiteLeftUp = new ImageIcon(whiteLeftUpPath);
		ImageIcon whiteMiddleUp = new ImageIcon(whiteMiddleUpPath);
		ImageIcon whiteRightUp = new ImageIcon(whiteRightUpPath);
		ImageIcon whiteMiddleLeft = new ImageIcon(whiteMiddleLeftPath);
		ImageIcon whiteLeftDown = new ImageIcon(whiteLeftDownPath);
		ImageIcon whiteMiddleDown = new ImageIcon(whiteMiddleDownPath);
		ImageIcon whiteRightDown = new ImageIcon(whiteRightDownPath);
		ImageIcon whiteMiddleRight = new ImageIcon(whiteMiddleRightPath);
		ImageIcon white = new ImageIcon(whitePath);
		
		if (X <= 107 + 9 && X >= 107 - 9 && Main.put == 0)
		{
			if (Y <= 225 + 9 && Y >= 225 - 9 && win[0][0] == -1)
			{
				if (player == 0)
				{
					loc_A15.setIcon(blackLeftUp);
					win[0][0] = 0;
				}
				else
				{
					loc_A15.setIcon(whiteLeftUp);
					win[0][0] = 1;
				}
				loc_A15.setBounds(84, 173, 29, 29);
				Main.Check.check(win, 0, 0);
				Main.position[2] = 0;
				Main.position[3] = 0;
				Main.put = 1;
			}
			else if (Y <= 253 + 9 && Y >= 253 - 9  && win[1][0] == -1)
			{
				if (player == 0)
				{
					loc_A14.setIcon(blackMiddleLeft);
					win[1][0] = 0;
				}
				else
				{
					loc_A14.setIcon(whiteMiddleLeft);
					win[1][0] = 1;
				}
				loc_A14.setBounds(84, 202, 29, 29);
				Main.Check.check(win, 1, 0);
				Main.position[2] = 1;
				Main.position[3] = 0;
				Main.put = 1;
			}
			else if (Y <= 281 + 9 && Y >= 281 - 9 && win[2][0] == -1)
			{
				if (player == 0)
				{
					loc_A13.setIcon(blackMiddleLeft);
					win[2][0] = 0;
				}
				else
				{
					loc_A13.setIcon(whiteMiddleLeft);
					win[2][0] = 1;
				}
				loc_A13.setBounds(84, 230, 29, 29);
				Main.Check.check(win, 2, 0);
				Main.position[2] = 2;
				Main.position[3] = 0;
				Main.put = 1;
			}
			else if (Y <= 310 + 9 && Y >= 310 - 9 && win[3][0] == -1)
			{
				if (player == 0)
				{
					loc_A12.setIcon(blackMiddleLeft);
					win[3][0] = 0;
				}
				else
				{
					loc_A12.setIcon(whiteMiddleLeft);
					win[3][0] = 1;
				}
				loc_A12.setBounds(84, 258, 29, 29);
				Main.Check.check(win, 3, 0);
				Main.position[2] = 3;
				Main.position[3] = 0;
				Main.put = 1;
			}
			else if (Y <= 337 + 9 && Y >= 337 - 9 && win[4][0] == -1)
			{
				if (player == 0)
				{
					loc_A11.setIcon(blackMiddleLeft);
					win[4][0] = 0;
				}
				else
				{
					loc_A11.setIcon(whiteMiddleLeft);
					win[4][0] = 1;
				}
				loc_A11.setBounds(84, 286, 29, 29);
				Main.Check.check(win, 4, 0);
				Main.position[2] = 4;
				Main.position[3] = 0;
				Main.put = 1;
			}
			else if (Y <= 367 + 9 && Y >= 367 - 9 && win[5][0] == -1)
			{
				if (player == 0)
				{
					loc_A10.setIcon(blackMiddleLeft);
					win[5][0] = 0;
				}
				else
				{
					loc_A10.setIcon(whiteMiddleLeft);
					win[5][0] = 1;
				}
				loc_A10.setBounds(84, 314, 29, 29);
				Main.Check.check(win, 5, 0);
				Main.position[2] = 5;
				Main.position[3] = 0;
				Main.put = 1;
			}
			else if (Y <= 394 + 9 && Y >= 394 - 9 && win[6][0] == -1)
			{
				if (player == 0)
				{
					loc_A9.setIcon(blackMiddleLeft);
					win[6][0] = 0;
				}
				else
				{
					loc_A9.setIcon(whiteMiddleLeft);
					win[6][0] = 1;
				}
				loc_A9.setBounds(84, 342, 29, 29);
				Main.Check.check(win, 6, 0);
				Main.position[2] = 6;
				Main.position[3] = 0;
				Main.put = 1;
			}
			else if (Y <= 422 + 9 && Y >= 422 - 9 && win[7][0] == -1)
			{
				if (player == 0)
				{
					loc_A8.setIcon(blackMiddleLeft);
					win[7][0] = 0;
				}
				else
				{
					loc_A8.setIcon(whiteMiddleLeft);
					win[7][0] = 1;
				}
				loc_A8.setBounds(84, 370, 29, 29);
				Main.Check.check(win, 7, 0);
				Main.position[2] = 7;
				Main.position[3] = 0;
				Main.put = 1;
			}
			else if (Y <= 450 + 9 && Y >= 450 - 9 && win[8][0] == -1)
			{
				if (player == 0)
				{
					loc_A7.setIcon(blackMiddleLeft);
					win[8][0] = 0;
				}
				else
				{
					loc_A7.setIcon(whiteMiddleLeft);
					win[8][0] = 1;
				}
				loc_A7.setBounds(84, 398, 29, 29);
				Main.Check.check(win, 8, 0);
				Main.position[2] = 8;
				Main.position[3] = 0;
				Main.put = 1;
			}
			else if (Y <= 477 + 9 && Y >= 477 - 9 && win[9][0] == -1)
			{
				if (player == 0)
				{
					loc_A6.setIcon(blackMiddleLeft);
					win[9][0] = 0;
				}
				else
				{
					loc_A6.setIcon(whiteMiddleLeft);
					win[9][0] = 1;
				}
				loc_A6.setBounds(84, 426, 29, 29);
				Main.Check.check(win, 9, 0);
				Main.position[2] = 9;
				Main.position[3] = 0;
				Main.put = 1;
			}
			else if (Y <= 505 + 9 && Y >= 505 - 9 && win[10][0] == -1)
			{
				if (player == 0)
				{
					loc_A5.setIcon(blackMiddleLeft);
					win[10][0] = 0;
				}
				else
				{
					loc_A5.setIcon(whiteMiddleLeft);
					win[10][0] = 1;
				}
				loc_A5.setBounds(84, 454, 29, 29);
				Main.Check.check(win, 10, 0);
				Main.position[2] = 10;
				Main.position[3] = 0;
				Main.put = 1;
			}
			else if (Y <= 533 + 9 && Y >= 533 - 9 && win[11][0] == -1)
			{
				if (player == 0)
				{
					loc_A4.setIcon(blackMiddleLeft);
					win[11][0] = 0;
				}
				else
				{
					loc_A4.setIcon(whiteMiddleLeft);
					win[11][0] = 1;
				}
				loc_A4.setBounds(84, 482, 29, 29);
				Main.Check.check(win, 11, 0);
				Main.position[2] = 11;
				Main.position[3] = 0;
				Main.put = 1;
			}
			else if (Y <= 562 + 9 && Y >= 562 - 9 && win[12][0] == -1)
			{
				if (player == 0)
				{
					loc_A3.setIcon(blackMiddleLeft);
					win[12][0] = 0;
				}
				else
				{
					loc_A3.setIcon(whiteMiddleLeft);
					win[12][0] = 1;
				}
				loc_A3.setBounds(84, 510, 29, 29);
				Main.Check.check(win, 12, 0);
				Main.position[2] = 12;
				Main.position[3] = 0;
				Main.put = 1;
			}
			else if (Y <= 589 + 9 && Y >= 589 - 9 && win[13][0] == -1)
			{
				if (player == 0)
				{
					loc_A2.setIcon(blackMiddleLeft);
					win[13][0] = 0;
				}
				else
				{
					loc_A2.setIcon(whiteMiddleLeft);
					win[13][0] = 1;
				}
				loc_A2.setBounds(84, 538, 29, 29);
				Main.Check.check(win, 13, 0);
				Main.position[2] = 13;
				Main.position[3] = 0;
				Main.put = 1;
			}
			else if (Y <= 618 + 9 && Y >= 618 - 9 && win[14][0] == -1)
			{
				if (player == 0)
				{
					loc_A1.setIcon(blackLeftDown);
					win[14][0] = 0;
				}
				else
				{
					loc_A1.setIcon(whiteLeftDown);
					win[14][0] = 1;
				}
				loc_A1.setBounds(84, 567, 29, 29);
				Main.Check.check(win, 14, 0);
				Main.position[2] = 14;
				Main.position[3] = 0;
				Main.put = 1;
			}
		}
		else if (X <= 136 + 8 && X >= 136 - 9 && Main.put == 0)
		{
			if (Y <= 225 + 9 && Y >= 225 - 9 && win[0][1] == -1)
			{
				if (player == 0)
				{
					loc_B15.setIcon(blackMiddleUp);
					win[0][1] = 0;
				}
				else
				{
					loc_B15.setIcon(whiteMiddleUp);
					win[0][1] = 1;
				}
				loc_B15.setBounds(113, 173, 29, 29);
				Main.Check.check(win, 0, 1);
				Main.position[2] = 0;
				Main.position[3] = 1;
				Main.put = 1;
			}
			else if (Y <= 253 + 9 && Y >= 253 - 9 && win[1][1] == -1)
			{
				if (player == 0)
				{
					loc_B14.setIcon(black);
					win[1][1] = 0;
				}
				else
				{
					loc_B14.setIcon(white);
					win[1][1] = 1;
				}
				loc_B14.setBounds(113, 202, 29, 29);
				Main.Check.check(win, 1, 1);
				Main.position[2] = 1;
				Main.position[3] = 1;
				Main.put = 1;
			}
			else if (Y <= 281 + 9 && Y >= 281 - 9 && win[2][1] == -1)
			{
				if (player == 0)
				{
					loc_B13.setIcon(black);
					win[2][1] = 0;
				}
				else
				{
					loc_B13.setIcon(white);
					win[2][1] = 1;
				}
				loc_B13.setBounds(113, 230, 29, 29);
				Main.Check.check(win, 2, 1);
				Main.position[2] = 2;
				Main.position[3] = 1;
				Main.put = 1;
			}
			else if (Y <= 310 + 9 && Y >= 310 - 9 && win[3][1] == -1)
			{
				if (player == 0)
				{
					loc_B12.setIcon(black);
					win[3][1] = 0;
				}
				else
				{
					loc_B12.setIcon(white);
					win[3][1] = 1;
				}
				loc_B12.setBounds(113, 258, 29, 29);
				Main.Check.check(win, 3, 1);
				Main.position[2] = 3;
				Main.position[3] = 1;
				Main.put = 1;
			}
			else if (Y <= 337 + 9 && Y >= 337 - 9 && win[4][1] == -1)
			{
				if (player == 0)
				{
					loc_B11.setIcon(black);
					win[4][1] = 0;
				}
				else
				{
					loc_B11.setIcon(white);
					win[4][1] = 1;
				}
				loc_B11.setBounds(113, 286, 29, 29);
				Main.Check.check(win, 4, 1);
				Main.position[2] = 4;
				Main.position[3] = 1;
				Main.put = 1;
			}
			else if (Y <= 367 + 9 && Y >= 367 - 9 && win[5][1] == -1)
			{
				if (player == 0)
				{
					loc_B10.setIcon(black);
					win[5][1] = 0;
				}
				else
				{
					loc_B10.setIcon(white);
					win[5][1] = 1;
				}
				loc_B10.setBounds(113, 314, 29, 29);
				Main.Check.check(win, 5, 1);
				Main.position[2] = 5;
				Main.position[3] = 1;
				Main.put = 1;
			}
			else if (Y <= 394 + 9 && Y >= 394 - 9 && win[6][1] == -1)
			{
				if (player == 0)
				{
					loc_B9.setIcon(black);
					win[6][1] = 0;
				}
				else
				{
					loc_B9.setIcon(white);
					win[6][1] = 1;
				}
				loc_B9.setBounds(113, 342, 29, 29);
				Main.Check.check(win, 6, 1);
				Main.position[2] = 6;
				Main.position[3] = 1;
				Main.put = 1;
			}
			else if (Y <= 422 + 9 && Y >= 422 - 9 && win[7][1] == -1)
			{
				if (player == 0)
				{
					loc_B8.setIcon(black);
					win[7][1] = 0;
				}
				else
				{
					loc_B8.setIcon(white);
					win[7][1] = 1;
				}
				loc_B8.setBounds(113, 370, 29, 29);
				Main.Check.check(win, 7, 1);
				Main.position[2] = 7;
				Main.position[3] = 1;
				Main.put = 1;
			}
			else if (Y <= 450 + 9 && Y >= 450 - 9 && win[8][1] == -1)
			{
				if (player == 0)
				{
					loc_B7.setIcon(black);
					win[8][1] = 0;
				}
				else
				{
					loc_B7.setIcon(white);
					win[8][1] = 1;
				}
				loc_B7.setBounds(113, 398, 29, 29);
				Main.Check.check(win, 8, 1);
				Main.position[2] = 8;
				Main.position[3] = 1;
				Main.put = 1;
			}
			else if (Y <= 477 + 9 && Y >= 477 - 9 && win[9][1] == -1)
			{
				if (player == 0)
				{
					loc_B6.setIcon(black);
					win[9][1] = 0;
				}
				else
				{
					loc_B6.setIcon(white);
					win[9][1] = 1;
				}
				loc_B6.setBounds(113, 426, 29, 29);
				Main.Check.check(win, 9, 1);
				Main.position[2] = 9;
				Main.position[3] = 1;
				Main.put = 1;
			}
			else if (Y <= 505 + 9 && Y >= 505 - 9 && win[10][1] == -1)
			{
				if (player == 0)
				{
					loc_B5.setIcon(black);
					win[10][1] = 0;
				}
				else
				{
					loc_B5.setIcon(white);
					win[10][1] = 1;
				}
				loc_B5.setBounds(113, 454, 29, 29);
				Main.Check.check(win, 10, 1);
				Main.position[2] = 10;
				Main.position[3] = 1;
				Main.put = 1;
			}
			else if (Y <= 533 + 9 && Y >= 533 - 9 && win[11][1] == -1)
			{
				if (player == 0)
				{
					loc_B4.setIcon(black);
					win[11][1] = 0;
				}
				else
				{
					loc_B4.setIcon(white);
					win[11][1] = 1;
				}
				loc_B4.setBounds(113, 482, 29, 29);
				Main.Check.check(win, 11, 1);
				Main.position[2] = 11;
				Main.position[3] = 1;
				Main.put = 1;
			}
			else if (Y <= 562 + 9 && Y >= 562 - 9 && win[12][1] == -1)
			{
				if (player == 0)
				{
					loc_B3.setIcon(black);
					win[12][1] = 0;
				}
				else
				{
					loc_B3.setIcon(white);
					win[12][1] = 1;
				}
				loc_B3.setBounds(113, 510, 29, 29);
				Main.Check.check(win, 12, 1);
				Main.position[2] = 12;
				Main.position[3] = 1;
				Main.put = 1;
			}
			else if (Y <= 589 + 9 && Y >= 589 - 9 && win[13][1] == -1)
			{
				if (player == 0)
				{
					loc_B2.setIcon(black);
					win[13][1] = 0;
				}
				else
				{
					loc_B2.setIcon(white);
					win[13][1] = 1;
				}
				loc_B2.setBounds(113, 538, 29, 29);
				Main.Check.check(win, 13, 1);
				Main.position[2] = 13;
				Main.position[3] = 1;
				Main.put = 1;
			}
			else if (Y <= 618 + 9 && Y >= 618 - 9 && win[14][1] == -1)
			{
				if (player == 0)
				{
					loc_B1.setIcon(blackMiddleDown);
					win[14][1] = 0;
				}
				else
				{
					loc_B1.setIcon(whiteMiddleDown);
					win[14][1] = 0;
				}
				loc_B1.setBounds(113, 567, 29, 29);
				Main.Check.check(win, 14, 1);
				Main.position[2] = 14;
				Main.position[3] = 1;
				Main.put = 1;
			}
		}
		else if (X <= 163 + 8 && X >= 163 - 9 && Main.put == 0)
		{
			if (Y <= 225 + 9 && Y >= 225 - 9 && win[0][2] == -1)
			{
				if (player == 0)
				{
					loc_C15.setIcon(blackMiddleUp);
					win[0][2] = 0;
				}
				else
				{
					loc_C15.setIcon(whiteMiddleUp);
					win[0][2] = 1;
				}
				loc_C15.setBounds(141, 173, 29, 29);
				Main.Check.check(win, 0, 2);
				Main.position[2] = 0;
				Main.position[3] = 2;
				Main.put = 1;
			}
			else if (Y <= 253 + 9 && Y >= 253 - 9 && win[1][2] == -1)
			{
				if (player == 0)
				{
					loc_C14.setIcon(black);
					win[1][2] = 0;
				}
				else
				{
					loc_C14.setIcon(white);
					win[1][2] = 1;
				}
				loc_C14.setBounds(141, 202, 29, 29);
				Main.Check.check(win, 1, 2);
				Main.position[2] = 1;
				Main.position[3] = 2;
				Main.put = 1;
			}
			else if (Y <= 281 + 9 && Y >= 281 - 9 && win[2][2] == -1)
			{
				if (player == 0)
				{
					loc_C13.setIcon(black);
					win[2][2] = 0;
				}
				else
				{
					loc_C13.setIcon(white);
					win[2][2] = 1;
				}
				loc_C13.setBounds(141, 230, 29, 29);
				Main.Check.check(win, 2, 2);
				Main.position[2] = 2;
				Main.position[3] = 2;
				Main.put = 1;
			}
			else if (Y <= 310 + 9 && Y >= 310 - 9 && win[3][2] == -1)
			{
				if (player == 0)
				{
					loc_C12.setIcon(black);
					win[3][2] = 0;
				}
				else
				{
					loc_C12.setIcon(white);
					win[3][2] = 1;
				}
				loc_C12.setBounds(141, 258, 29, 29);
				Main.Check.check(win, 3, 2);
				Main.position[2] = 3;
				Main.position[3] = 2;
				Main.put = 1;
			}
			else if (Y <= 337 + 9 && Y >= 337 - 9 && win[4][2] == -1)
			{
				if (player == 0)
				{
					loc_C11.setIcon(black);
					win[4][2] = 0;
				}
				else
				{
					loc_C11.setIcon(white);
					win[4][2] = 1;
				}
				loc_C11.setBounds(141, 286, 29, 29);
				Main.Check.check(win, 4, 2);
				Main.position[2] = 4;
				Main.position[3] = 2;
				Main.put = 1;
			}
			else if (Y <= 367 + 9 && Y >= 367 - 9 && win[5][2] == -1)
			{
				if (player == 0)
				{
					loc_C10.setIcon(black);
					win[5][2] = 0;
				}
				else
				{
					loc_C10.setIcon(white);
					win[5][2] = 1;
				}
				loc_C10.setBounds(141, 314, 29, 29);
				Main.Check.check(win, 5, 2);
				Main.position[2] = 5;
				Main.position[3] = 2;
				Main.put = 1;
			}
			else if (Y <= 394 + 9 && Y >= 394 - 9 && win[6][2] == -1)
			{
				if (player == 0)
				{
					loc_C9.setIcon(black);
					win[6][2] = 0;
				}
				else
				{
					loc_C9.setIcon(white);
					win[6][2] = 1;
				}
				loc_C9.setBounds(141, 342, 29, 29);
				Main.Check.check(win, 6, 2);
				Main.position[2] = 6;
				Main.position[3] = 2;
				Main.put = 1;
			}
			else if (Y <= 422 + 9 && Y >= 422 - 9 && win[7][2] == -1)
			{
				if (player == 0)
				{
					loc_C8.setIcon(black);
					win[7][2] = 0;
				}
				else
				{
					loc_C8.setIcon(white);
					win[7][2] = 1;
				}
				loc_C8.setBounds(141, 370, 29, 29);
				Main.Check.check(win, 7, 2);
				Main.position[2] = 7;
				Main.position[3] = 2;
				Main.put = 1;
			}
			else if (Y <= 450 + 9 && Y >= 450 - 9 && win[8][2] == -1)
			{
				if (player == 0)
				{
					loc_C7.setIcon(black);
					win[8][2] = 0;
				}
				else
				{
					loc_C7.setIcon(white);
					win[8][2] = 1;
				}
				loc_C7.setBounds(141, 398, 29, 29);
				Main.Check.check(win, 8, 2);
				Main.position[2] = 8;
				Main.position[3] = 2;
				Main.put = 1;
			}
			else if (Y <= 477 + 9 && Y >= 477 - 9 && win[9][2] == -1)
			{
				if (player == 0)
				{
					loc_C6.setIcon(black);
					win[9][2] = 0;
				}
				else
				{
					loc_C6.setIcon(white);
					win[9][2] = 1;
				}
				loc_C6.setBounds(141, 426, 29, 29);
				Main.Check.check(win, 9, 2);
				Main.position[2] = 9;
				Main.position[3] = 2;
				Main.put = 1;
			}
			else if (Y <= 505 + 9 && Y >= 505 - 9 && win[10][2] == -1)
			{
				if (player == 0)
				{
					loc_C5.setIcon(black);
					win[10][2] = 0;
				}
				else
				{
					loc_C5.setIcon(white);
					win[10][2] = 1;
				}
				loc_C5.setBounds(141, 454, 29, 29);
				Main.Check.check(win, 10, 2);
				Main.position[2] = 10;
				Main.position[3] = 2;
				Main.put = 1;
			}
			else if (Y <= 533 + 9 && Y >= 533 - 9 && win[11][2] == -1)
			{
				if (player == 0)
				{
					loc_C4.setIcon(black);
					win[11][2] = 0;
				}
				else
				{
					loc_C4.setIcon(white);
					win[11][2] = 1;
				}
				loc_C4.setBounds(141, 482, 29, 29);
				Main.Check.check(win, 11, 2);
				Main.position[2] = 11;
				Main.position[3] = 2;
				Main.put = 1;
			}
			else if (Y <= 562 + 9 && Y >= 562 - 9 && win[12][2] == -1)
			{
				if (player == 0)
				{
					loc_C3.setIcon(black);
					win[12][2] = 0;
				}
				else
				{
					loc_C3.setIcon(white);
					win[12][2] = 1;
				}
				loc_C3.setBounds(141, 510, 29, 29);
				Main.Check.check(win, 12, 2);
				Main.position[2] = 12;
				Main.position[3] = 2;
				Main.put = 1;
			}
			else if (Y <= 589 + 9 && Y >= 589 - 9 && win[13][2] == -1)
			{
				if (player == 0)
				{
					loc_C2.setIcon(black);
					win[13][2] = 0;
				}
				else
				{
					loc_C2.setIcon(white);
					win[13][2] = 1;
				}
				loc_C2.setBounds(141, 538, 29, 29);
				Main.Check.check(win, 13, 2);
				Main.position[2] = 13;
				Main.position[3] = 2;
				Main.put = 1;
			}
			else if (Y <= 618 + 9 && Y >= 618 - 9 && win[14][2] == -1)
			{
				if (player == 0)
				{
					loc_C1.setIcon(blackMiddleDown);
					win[14][2] = 0;
				}
				else
				{
					loc_C1.setIcon(whiteMiddleDown);
					win[14][2] = 1;
				}
				loc_C1.setBounds(141, 567, 29, 29);
				Main.Check.check(win, 14, 2);
				Main.position[2] = 14;
				Main.position[3] = 2;
				Main.put = 1;
			}
		}
		else if (X <= 193 + 8 && X >= 193 - 9 && Main.put == 0)
		{
			if (Y <= 225 + 9 && Y >= 225 - 9 && win[0][3] == -1)
			{
				if (player == 0)
				{
					loc_D15.setIcon(blackMiddleUp);
					win[0][3] = 0;
				}
				else
				{
					loc_D15.setIcon(whiteMiddleUp);
					win[0][3] = 1;
				}
				loc_D15.setBounds(169, 173, 29, 29);
				Main.Check.check(win, 0, 3);
				Main.position[2] = 0;
				Main.position[3] = 3;
				Main.put = 1;
			}
			else if (Y <= 253 + 9 && Y >= 253 - 9 && win[1][3] == -1)
			{
				if (player == 0)
				{
					loc_D14.setIcon(black);
					win[1][3] = 0;
				}
				else
				{
					loc_D14.setIcon(white);
					win[1][3] = 1;
				}
				loc_D14.setBounds(169, 202, 29, 29);
				Main.Check.check(win, 1, 3);
				Main.position[2] = 1;
				Main.position[3] = 3;
				Main.put = 1;
			}
			else if (Y <= 281 + 9 && Y >= 281 - 9 && win[2][3] == -1)
			{
				if (player == 0)
				{
					loc_D13.setIcon(black);
					win[2][3] = 0;
				}
				else
				{
					loc_D13.setIcon(white);
					win[2][3] = 1;
				}
				loc_D13.setBounds(169, 230, 29, 29);
				Main.Check.check(win, 2, 3);
				Main.position[2] = 2;
				Main.position[3] = 3;
				Main.put = 1;
			}
			else if (Y <= 310 + 9 && Y >= 310 - 9 && win[3][3] == -1)
			{
				if (player == 0)
				{
					loc_D12.setIcon(black);
					win[3][3] = 0;
				}
				else
				{
					loc_D12.setIcon(white);
					win[3][3] = 1;
				}
				loc_D12.setBounds(169, 258, 29, 29);
				Main.Check.check(win, 3, 3);
				Main.position[2] = 3;
				Main.position[3] = 3;
				Main.put = 1;
			}
			else if (Y <= 337 + 9 && Y >= 337 - 9 && win[4][3] == -1)
			{
				if (player == 0)
				{
					loc_D11.setIcon(black);
					win[4][3] = 0;
				}
				else
				{
					loc_D11.setIcon(white);
					win[4][3] = 1;
				}
				loc_D11.setBounds(169, 286, 29, 29);
				Main.Check.check(win, 4, 3);
				Main.position[2] = 4;
				Main.position[3] = 3;
				Main.put = 1;
			}
			else if (Y <= 367 + 9 && Y >= 367 - 9 && win[5][3] == -1)
			{
				if (player == 0)
				{
					loc_D10.setIcon(black);
					win[5][3] = 0;
				}
				else
				{
					loc_D10.setIcon(white);
					win[5][3] = 1;
				}
				loc_D10.setBounds(169, 314, 29, 29);
				Main.Check.check(win, 5, 3);
				Main.position[2] = 5;
				Main.position[3] = 3;
				Main.put = 1;
			}
			else if (Y <= 394 + 9 && Y >= 394 - 9 && win[6][3] == -1)
			{
				if (player == 0)
				{
					loc_D9.setIcon(black);
					win[6][3] = 0;
				}
				else
				{
					loc_D9.setIcon(white);
					win[6][3] = 1;
				}
				loc_D9.setBounds(169, 342, 29, 29);
				Main.Check.check(win, 6, 3);
				Main.position[2] = 6;
				Main.position[3] = 3;
				Main.put = 1;
			}
			else if (Y <= 422 + 9 && Y >= 422 - 9 && win[7][3] == -1)
			{
				if (player == 0)
				{
					loc_D8.setIcon(black);
					win[7][3] = 0;
				}
				else
				{
					loc_D8.setIcon(white);
					win[7][3] = 1;
				}
				loc_D8.setBounds(169, 370, 29, 29);
				Main.Check.check(win, 7, 3);
				Main.position[2] = 7;
				Main.position[3] = 3;
				Main.put = 1;
			}
			else if (Y <= 450 + 9 && Y >= 450 - 9 && win[8][3] == -1)
			{
				if (player == 0)
				{
					loc_D7.setIcon(black);
					win[8][3] = 0;
				}
				else
				{
					loc_D7.setIcon(white);
					win[8][3] = 1;
				}
				loc_D7.setBounds(169, 398, 29, 29);
				Main.Check.check(win, 8, 3);
				Main.position[2] = 8;
				Main.position[3] = 3;
				Main.put = 1;
			}
			else if (Y <= 477 + 9 && Y >= 477 - 9 && win[9][3] == -1)
			{
				if (player == 0)
				{
					loc_D6.setIcon(black);
					win[9][3] = 0;
				}
				else
				{
					loc_D6.setIcon(white);
					win[9][3] = 1;
				}
				loc_D6.setBounds(169, 426, 29, 29);
				Main.Check.check(win, 9, 3);
				Main.position[2] = 9;
				Main.position[3] = 3;
				Main.put = 1;
			}
			else if (Y <= 505 + 9 && Y >= 505 - 9 && win[10][3] == -1)
			{
				if (player == 0)
				{
					loc_D5.setIcon(black);
					win[10][3] = 0;
				}
				else
				{
					loc_D5.setIcon(white);
					win[10][3] = 1;
				}
				loc_D5.setBounds(169, 454, 29, 29);
				Main.Check.check(win, 10, 3);
				Main.position[2] = 10;
				Main.position[3] = 3;
				Main.put = 1;
			}
			else if (Y <= 533 + 9 && Y >= 533 - 9 && win[11][3] == -1)
			{
				if (player == 0)
				{
					loc_D4.setIcon(black);
					win[11][3] = 0;
				}
				else
				{
					loc_D4.setIcon(white);
					win[11][3] = 1;
				}
				loc_D4.setBounds(169, 482, 29, 29);
				Main.Check.check(win, 11, 3);
				Main.position[2] = 11;
				Main.position[3] = 3;
				Main.put = 1;
			}
			else if (Y <= 562 + 9 && Y >= 562 - 9 && win[12][3] == -1)
			{
				if (player == 0)
				{
					loc_D3.setIcon(black);
					win[12][3] = 0;
				}
				else
				{
					loc_D3.setIcon(white);
					win[12][3] = 1;
				}
				loc_D3.setBounds(169, 510, 29, 29);
				Main.Check.check(win, 12, 3);
				Main.position[2] = 12;
				Main.position[3] = 3;
				Main.put = 1;
			}
			else if (Y <= 589 + 9 && Y >= 589 - 9 && win[13][3] == -1)
			{
				if (player == 0)
				{
					loc_D2.setIcon(black);
					win[13][3] = 0;
				}
				else
				{
					loc_D2.setIcon(white);
					win[13][3] = 1;
				}
				loc_D2.setBounds(169, 538, 29, 29);
				Main.Check.check(win, 13, 3);
				Main.position[2] = 13;
				Main.position[3] = 3;
				Main.put = 1;
			}
			else if (Y <= 618 + 9 && Y >= 618 - 9 && win[14][3] == -1)
			{
				if (player == 0)
				{
					loc_D1.setIcon(blackMiddleDown);
					win[14][3] = 0;
				}
				else
				{
					loc_D1.setIcon(whiteMiddleDown);
					win[14][3] = 1;
				}
				loc_D1.setBounds(169, 567, 29, 29);
				Main.Check.check(win, 14, 3);
				Main.position[2] = 14;
				Main.position[3] = 3;
				Main.put = 1;
			}
		}
		else if (X <= 220 + 8 && X >= 220 - 9 && Main.put == 0)
		{
			if (Y <= 225 + 9 && Y >= 225 - 9 && win[0][4] == -1)
			{
				if (player == 0)
				{
					loc_E15.setIcon(blackMiddleUp);
					win[0][4] = 0;
				}
				else
				{
					loc_E15.setIcon(whiteMiddleUp);
					win[0][4] = 1;
				}
				loc_E15.setBounds(197, 173, 29, 29);
				Main.Check.check(win, 0, 4);
				Main.position[2] = 0;
				Main.position[3] = 4;
				Main.put = 1;
			}
			else if (Y <= 253 + 9 && Y >= 253 - 9 && win[1][4] == -1)
			{
				if (player == 0)
				{
					loc_E14.setIcon(black);
					win[1][4] = 0;
				}
				else
				{
					loc_E14.setIcon(white);
					win[1][4] = 1;
				}
				loc_E14.setBounds(197, 202, 29, 29);
				Main.Check.check(win, 1, 4);
				Main.position[2] = 1;
				Main.position[3] = 4;
				Main.put = 1;
			}
			else if (Y <= 281 + 9 && Y >= 281 - 9 && win[2][4] == -1)
			{
				if (player == 0)
				{
					loc_E13.setIcon(black);
					win[2][4] = 0;
				}
				else
				{
					loc_E13.setIcon(white);
					win[2][4] = 1;
				}
				loc_E13.setBounds(197, 230, 29, 29);
				Main.Check.check(win, 2, 4);
				Main.position[2] = 2;
				Main.position[3] = 4;
				Main.put = 1;
			}
			else if (Y <= 310 + 9 && Y >= 310 - 9 && win[3][4] == -1)
			{
				if (player == 0)
				{
					loc_E12.setIcon(black);
					win[3][4] = 0;
				}
				else
				{
					loc_E12.setIcon(white);
					win[3][4] = 1;
				}
				loc_E12.setBounds(197, 258, 29, 29);
				Main.Check.check(win, 3, 4);
				Main.position[2] = 3;
				Main.position[3] = 4;
				Main.put = 1;
			}
			else if (Y <= 337 + 9 && Y >= 337 - 9 && win[4][4] == -1)
			{
				if (player == 0)
				{
					loc_E11.setIcon(black);
					win[4][4] = 0;
				}
				else
				{
					loc_E11.setIcon(white);
					win[4][4] = 1;
				}
				loc_E11.setBounds(197, 286, 29, 29);
				Main.Check.check(win, 4, 4);
				Main.position[2] = 4;
				Main.position[3] = 4;
				Main.put = 1;
			}
			else if (Y <= 367 + 9 && Y >= 367 - 9 && win[5][4] == -1)
			{
				if (player == 0)
				{
					loc_E10.setIcon(black);
					win[5][4] = 0;
				}
				else
				{
					loc_E10.setIcon(white);
					win[5][4] = 1;
				}
				loc_E10.setBounds(197, 314, 29, 29);
				Main.Check.check(win, 5, 4);
				Main.position[2] = 5;
				Main.position[3] = 4;
				Main.put = 1;
			}
			else if (Y <= 394 + 9 && Y >= 394 - 9 && win[6][4] == -1)
			{
				if (player == 0)
				{
					loc_E9.setIcon(black);
					win[6][4] = 0;
				}
				else
				{
					loc_E9.setIcon(white);
					win[6][4] = 1;
				}
				loc_E9.setBounds(197, 342, 29, 29);
				Main.Check.check(win, 6, 4);
				Main.position[2] = 6;
				Main.position[3] = 4;
				Main.put = 1;
			}
			else if (Y <= 422 + 9 && Y >= 422 - 9 && win[7][4] == -1)
			{
				if (player == 0)
				{
					loc_E8.setIcon(black);
					win[7][4] = 0;
				}
				else
				{
					loc_E8.setIcon(white);
					win[7][4] = 1;
				}
				loc_E8.setBounds(197, 370, 29, 29);
				Main.Check.check(win, 7, 4);
				Main.position[2] = 7;
				Main.position[3] = 4;
				Main.put = 1;
			}
			else if (Y <= 450 + 9 && Y >= 450 - 9 && win[8][4] == -1)
			{
				if (player == 0)
				{
					loc_E7.setIcon(black);
					win[8][4] = 0;
				}
				else
				{
					loc_E7.setIcon(white);
					win[8][4] = 1;
				}
				loc_E7.setBounds(197, 398, 29, 29);
				Main.Check.check(win, 8, 4);
				Main.position[2] = 8;
				Main.position[3] = 4;
				Main.put = 1;
			}
			else if (Y <= 477 + 9 && Y >= 477 - 9 && win[9][4] == -1)
			{
				if (player == 0)
				{
					loc_E6.setIcon(black);
					win[9][4] = 0;
				}
				else
				{
					loc_E6.setIcon(white);
					win[9][4] = 1;
				}
				loc_E6.setBounds(197, 426, 29, 29);
				Main.Check.check(win, 9, 4);
				Main.position[2] = 9;
				Main.position[3] = 4;
				Main.put = 1;
			}
			else if (Y <= 505 + 9 && Y >= 505 - 9 && win[10][4] == -1)
			{
				if (player == 0)
				{
					loc_E5.setIcon(black);
					win[10][4] = 0;
				}
				else
				{
					loc_E5.setIcon(white);
					win[10][4] = 1;
				}
				loc_E5.setBounds(197, 454, 29, 29);
				Main.Check.check(win, 10, 4);
				Main.position[2] = 10;
				Main.position[3] = 4;
				Main.put = 1;
			}
			else if (Y <= 533 + 9 && Y >= 533 - 9 && win[11][4] == -1)
			{
				if (player == 0)
				{
					loc_E4.setIcon(black);
					win[11][4] = 0;
				}
				else
				{
					loc_E4.setIcon(white);
					win[11][4] = 1;
				}
				loc_E4.setBounds(197, 482, 29, 29);
				Main.Check.check(win, 11, 4);
				Main.position[2] = 11;
				Main.position[3] = 4;
				Main.put = 1;
			}
			else if (Y <= 562 + 9 && Y >= 562 - 9 && win[12][4] == -1)
			{
				if (player == 0)
				{
					loc_E3.setIcon(black);
					win[12][4] = 0;
				}
				else
				{
					loc_E3.setIcon(white);
					win[12][4] = 1;
				}
				loc_E3.setBounds(197, 510, 29, 29);
				Main.Check.check(win, 12, 4);
				Main.position[2] = 12;
				Main.position[3] = 4;
				Main.put = 1;
			}
			else if (Y <= 589 + 9 && Y >= 589 - 9 && win[13][4] == -1)
			{
				if (player == 0)
				{
					loc_E2.setIcon(black);
					win[13][4] = 0;
				}
				else
				{
					loc_E2.setIcon(white);
					win[13][4] = 1;
				}
				loc_E2.setBounds(197, 538, 29, 29);
				Main.Check.check(win, 13, 4);
				Main.position[2] = 13;
				Main.position[3] = 4;
				Main.put = 1;
			}
			else if (Y <= 618 + 9 && Y >= 618 - 9 && win[14][4] == -1)
			{
				if (player == 0)
				{
					loc_E1.setIcon(blackMiddleDown);
					win[14][4] = 0;
				}
				else
				{
					loc_E1.setIcon(whiteMiddleDown);
					win[14][4] = 1;
				}
				loc_E1.setBounds(197, 567, 29, 29);
				Main.Check.check(win, 14, 4);
				Main.position[2] = 14;
				Main.position[3] = 4;
				Main.put = 1;
			}
		}
		else if (X <= 249 + 8 && X >= 249 - 9 && Main.put == 0)
		{
			if (Y <= 225 + 9 && Y >= 225 - 9 && win[0][5] == -1)
			{
				if (player == 0)
				{
					loc_F15.setIcon(blackMiddleUp);
					win[0][5] = 0;
				}
				else
				{
					loc_F15.setIcon(whiteMiddleUp);
					win[0][5] = 1;
				}
				loc_F15.setBounds(225, 173, 29, 29);
				Main.Check.check(win, 0, 5);
				Main.position[2] = 0;
				Main.position[3] = 5;
				Main.put = 1;
			}
			else if (Y <= 253 + 9 && Y >= 253 - 9 && win[1][5] == -1)
			{
				if (player == 0)
				{
					loc_F14.setIcon(black);
					win[1][5] = 0;
				}
				else
				{
					loc_F14.setIcon(white);
					win[1][5] = 1;
				}
				loc_F14.setBounds(225, 202, 29, 29);
				Main.Check.check(win, 1, 5);
				Main.position[2] = 1;
				Main.position[3] = 5;
				Main.put = 1;
			}
			else if (Y <= 281 + 9 && Y >= 281 - 9 && win[2][5] == -1)
			{
				if (player == 0)
				{
					loc_F13.setIcon(black);
					win[2][5] = 0;
				}
				else
				{
					loc_F13.setIcon(white);
					win[2][5] = 1;
				}
				loc_F13.setBounds(225, 230, 29, 29);
				Main.Check.check(win, 2, 5);
				Main.position[2] = 2;
				Main.position[3] = 5;
				Main.put = 1;
			}
			else if (Y <= 310 + 9 && Y >= 310 - 9 && win[3][5] == -1)
			{
				if (player == 0)
				{
					loc_F12.setIcon(black);
					win[3][5] = 0;
				}
				else
				{
					loc_F12.setIcon(white);
					win[3][5] = 1;
				}
				loc_F12.setBounds(225, 258, 29, 29);
				Main.Check.check(win, 3, 5);
				Main.position[2] = 3;
				Main.position[3] = 5;
				Main.put = 1;
			}
			else if (Y <= 337 + 9 && Y >= 337 - 9 && win[4][5] == -1)
			{
				if (player == 0)
				{
					loc_F11.setIcon(black);
					win[4][5] = 0;
				}
				else
				{
					loc_F11.setIcon(white);
					win[4][5] = 1;
				}
				loc_F11.setBounds(225, 286, 29, 29);
				Main.Check.check(win, 4, 5);
				Main.position[2] = 4;
				Main.position[3] = 5;
				Main.put = 1;
			}
			else if (Y <= 367 + 9 && Y >= 367 - 9 && win[5][5] == -1)
			{
				if (player == 0)
				{
					loc_F10.setIcon(black);
					win[5][5] = 0;
				}
				else
				{
					loc_F10.setIcon(white);
					win[5][5] = 1;
				}
				loc_F10.setBounds(225, 314, 29, 29);
				Main.Check.check(win, 5, 5);
				Main.position[2] = 5;
				Main.position[3] = 5;
				Main.put = 1;
			}
			else if (Y <= 394 + 9 && Y >= 394 - 9 && win[6][5] == -1)
			{
				if (player == 0)
				{
					loc_F9.setIcon(black);
					win[6][5] = 0;
				}
				else
				{
					loc_F9.setIcon(white);
					win[6][5] = 1;
				}
				loc_F9.setBounds(225, 342, 29, 29);
				Main.Check.check(win, 6, 5);
				Main.position[2] = 6;
				Main.position[3] = 5;
				Main.put = 1;
			}
			else if (Y <= 422 + 9 && Y >= 422 - 9 && win[7][5] == -1)
			{
				if (player == 0)
				{
					loc_F8.setIcon(black);
					win[7][5] = 0;
				}
				else
				{
					loc_F8.setIcon(white);
					win[7][5] = 1;
				}
				loc_F8.setBounds(225, 370, 29, 29);
				Main.Check.check(win, 7, 5);
				Main.position[2] = 7;
				Main.position[3] = 5;
				Main.put = 1;
			}
			else if (Y <= 450 + 9 && Y >= 450 - 9 && win[8][5] == -1)
			{
				if (player == 0)
				{
					loc_F7.setIcon(black);
					win[8][5] = 0;
				}
				else
				{
					loc_F7.setIcon(white);
					win[8][5] = 1;
				}
				loc_F7.setBounds(225, 398, 29, 29);
				Main.Check.check(win, 8, 5);
				Main.position[2] = 8;
				Main.position[3] = 5;
				Main.put = 1;
			}
			else if (Y <= 477 + 9 && Y >= 477 - 9 && win[9][5] == -1)
			{
				if (player == 0)
				{
					loc_F6.setIcon(black);
					win[9][5] = 0;
				}
				else
				{
					loc_F6.setIcon(white);
					win[9][5] = 1;
				}
				loc_F6.setBounds(225, 426, 29, 29);
				Main.Check.check(win, 9, 5);
				Main.position[2] = 9;
				Main.position[3] = 5;
				Main.put = 1;
			}
			else if (Y <= 505 + 9 && Y >= 505 - 9 && win[10][5] == -1)
			{
				if (player == 0)
				{
					loc_F5.setIcon(black);
					win[10][5] = 0;
				}
				else
				{
					loc_F5.setIcon(white);
					win[10][5] = 1;
				}
				loc_F5.setBounds(225, 454, 29, 29);
				Main.Check.check(win, 10, 5);
				Main.position[2] = 10;
				Main.position[3] = 5;
				Main.put = 1;
			}
			else if (Y <= 533 + 9 && Y >= 533 - 9 && win[11][5] == -1)
			{
				if (player == 0)
				{
					loc_F4.setIcon(black);
					win[11][5] = 0;
				}
				else
				{
					loc_F4.setIcon(white);
					win[11][5] = 1;
				}
				loc_F4.setBounds(225, 482, 29, 29);
				Main.Check.check(win, 11, 5);
				Main.position[2] = 11;
				Main.position[3] = 5;
				Main.put = 1;
			}
			else if (Y <= 562 + 9 && Y >= 562 - 9 && win[12][5] == -1)
			{
				if (player == 0)
				{
					loc_F3.setIcon(black);
					win[12][5] = 0;
				}
				else
				{
					loc_F3.setIcon(white);
					win[12][5] = 1;
				}
				loc_F3.setBounds(225, 510, 29, 29);
				Main.Check.check(win, 12, 5);
				Main.position[2] = 12;
				Main.position[3] = 5;
				Main.put = 1;
			}
			else if (Y <= 589 + 9 && Y >= 589 - 9 && win[13][5] == -1)
			{
				if (player == 0)
				{
					loc_F2.setIcon(black);
					win[13][5] = 0;
				}
				else
				{
					loc_F2.setIcon(white);
					win[13][5] = 1;
				}
				loc_F2.setBounds(225, 538, 29, 29);
				Main.Check.check(win, 13, 5);
				Main.position[2] = 13;
				Main.position[3] = 5;
				Main.put = 1;
			}
			else if (Y <= 618 + 9 && Y >= 618 - 9 && win[14][5] == -1)
			{
				if (player == 0)
				{
					loc_F1.setIcon(blackMiddleDown);
					win[14][5] = 0;
				}
				else
				{
					loc_F1.setIcon(whiteMiddleDown);
					win[14][5] = 1;
				}
				loc_F1.setBounds(225, 567, 29, 29);
				Main.Check.check(win, 14, 5);
				Main.position[2] = 14;
				Main.position[3] = 5;
				Main.put = 1;
			}
		}
		else if (X <= 276 + 8 && X >= 276 - 9 && Main.put == 0)
		{
			if (Y <= 225 + 9 && Y >= 225 - 9 && win[0][6] == -1)
			{
				if (player == 0)
				{
					loc_G15.setIcon(blackMiddleUp);
					win[0][6] = 0;
				}
				else
				{
					loc_G15.setIcon(whiteMiddleUp);
					win[0][6] = 1;
				}
				loc_G15.setBounds(253, 173, 29, 29);
				Main.Check.check(win, 0, 6);
				Main.position[2] = 0;
				Main.position[3] = 6;
				Main.put = 1;
			}
			else if (Y <= 253 + 9 && Y >= 253 - 9 && win[1][6] == -1)
			{
				if (player == 0)
				{
					loc_G14.setIcon(black);
					win[1][6] = 0;
				}
				else
				{
					loc_G14.setIcon(white);
					win[1][6] = 1;
				}
				loc_G14.setBounds(253, 202, 29, 29);
				Main.Check.check(win, 1, 6);
				Main.position[2] = 1;
				Main.position[3] = 6;
				Main.put = 1;
			}
			else if (Y <= 281 + 9 && Y >= 281 - 9 && win[2][6] == -1)
			{
				if (player == 0)
				{
					loc_G13.setIcon(black);
					win[2][6] = 0;
				}
				else
				{
					loc_G13.setIcon(white);
					win[2][6] = 1;
				}
				loc_G13.setBounds(253, 230, 29, 29);
				Main.Check.check(win, 2, 6);
				Main.position[2] = 2;
				Main.position[3] = 6;
				Main.put = 1;
			}
			else if (Y <= 310 + 9 && Y >= 310 - 9 && win[3][6] == -1)
			{
				if (player == 0)
				{
					loc_G12.setIcon(black);
					win[3][6] = 0;
				}
				else
				{
					loc_G12.setIcon(white);
					win[3][6] = 1;
				}
				loc_G12.setBounds(253, 258, 29, 29);
				Main.Check.check(win, 3, 6);
				Main.position[2] = 3;
				Main.position[3] = 6;
				Main.put = 1;
			}
			else if (Y <= 337 + 9 && Y >= 337 - 9 && win[4][6] == -1)
			{
				if (player == 0)
				{
					loc_G11.setIcon(black);
					win[4][6] = 0;
				}
				else
				{
					loc_G11.setIcon(white);
					win[4][6] = 1;
				}
				loc_G11.setBounds(253, 286, 29, 29);
				Main.Check.check(win, 4, 6);
				Main.position[2] = 4;
				Main.position[3] = 6;
				Main.put = 1;
			}
			else if (Y <= 367 + 9 && Y >= 367 - 9 && win[5][6] == -1)
			{
				if (player == 0)
				{
					loc_G10.setIcon(black);
					win[5][6] = 0;
				}
				else
				{
					loc_G10.setIcon(white);
					win[5][6] = 1;
				}
				loc_G10.setBounds(253, 314, 29, 29);
				Main.Check.check(win, 5, 6);
				Main.position[2] = 5;
				Main.position[3] = 6;
				Main.put = 1;
			}
			else if (Y <= 394 + 9 && Y >= 394 - 9 && win[6][6] == -1)
			{
				if (player == 0)
				{
					loc_G9.setIcon(black);
					win[6][6] = 0;
				}
				else
				{
					loc_G9.setIcon(white);
					win[6][6] = 1;
				}
				loc_G9.setBounds(253, 342, 29, 29);
				Main.Check.check(win, 6, 6);
				Main.position[2] = 6;
				Main.position[3] = 6;
				Main.put = 1;
			}
			else if (Y <= 422 + 9 && Y >= 422 - 9 && win[7][6] == -1)
			{
				if (player == 0)
				{
					loc_G8.setIcon(black);
					win[7][6] = 0;
				}
				else
				{
					loc_G8.setIcon(white);
					win[7][6] = 1;
				}
				loc_G8.setBounds(253, 370, 29, 29);
				Main.Check.check(win, 7, 6);
				Main.position[2] = 7;
				Main.position[3] = 6;
				Main.put = 1;
			}
			else if (Y <= 450 + 9 && Y >= 450 - 9 && win[8][6] == -1)
			{
				if (player == 0)
				{
					loc_G7.setIcon(black);
					win[8][6] = 0;
				}
				else
				{
					loc_G7.setIcon(white);
					win[8][6] = 1;
				}
				loc_G7.setBounds(253, 398, 29, 29);
				Main.Check.check(win, 8, 6);
				Main.position[2] = 8;
				Main.position[3] = 6;
				Main.put = 1;
			}
			else if (Y <= 477 + 9 && Y >= 477 - 9 && win[9][6] == -1)
			{
				if (player == 0)
				{
					loc_G6.setIcon(black);
					win[9][6] = 0;
				}
				else
				{
					loc_G6.setIcon(white);
					win[9][6] = 1;
				}
				loc_G6.setBounds(253, 426, 29, 29);
				Main.Check.check(win, 9, 6);
				Main.position[2] = 9;
				Main.position[3] = 6;
				Main.put = 1;
			}
			else if (Y <= 505 + 9 && Y >= 505 - 9 && win[10][6] == -1)
			{
				if (player == 0)
				{
					loc_G5.setIcon(black);
					win[10][6] = 0;
				}
				else
				{
					loc_G5.setIcon(white);
					win[10][6] = 1;
				}
				loc_G5.setBounds(253, 454, 29, 29);
				Main.Check.check(win, 10, 6);
				Main.position[2] = 10;
				Main.position[3] = 6;
				Main.put = 1;
			}
			else if (Y <= 533 + 9 && Y >= 533 - 9 && win[11][6] == -1)
			{
				if (player == 0)
				{
					loc_G4.setIcon(black);
					win[11][6] = 0;
				}
				else
				{
					loc_G4.setIcon(white);
					win[11][6] = 1;
				}
				loc_G4.setBounds(253, 482, 29, 29);
				Main.Check.check(win, 11, 6);
				Main.position[2] = 11;
				Main.position[3] = 6;
				Main.put = 1;
			}
			else if (Y <= 562 + 9 && Y >= 562 - 9 && win[12][6] == -1)
			{
				if (player == 0)
				{
					loc_G3.setIcon(black);
					win[12][6] = 0;
				}
				else
				{
					loc_G3.setIcon(white);
					win[12][6] = 1;
				}
				loc_G3.setBounds(253, 510, 29, 29);
				Main.Check.check(win, 12, 6);
				Main.position[2] = 12;
				Main.position[3] = 6;
				Main.put = 1;
			}
			else if (Y <= 589 + 9 && Y >= 589 - 9 && win[13][6] == -1)
			{
				if (player == 0)
				{
					loc_G2.setIcon(black);
					win[13][6] = 0;
				}
				else
				{
					loc_G2.setIcon(white);
					win[13][6] = 1;
				}
				loc_G2.setBounds(253, 538, 29, 29);
				Main.Check.check(win, 13, 6);
				Main.position[2] = 13;
				Main.position[3] = 6;
				Main.put = 1;
			}
			else if (Y <= 618 + 9 && Y >= 618 - 9 && win[14][6] == -1)
			{
				if (player == 0)
				{
					loc_G1.setIcon(blackMiddleDown);
					win[14][6] = 0;
				}
				else
				{
					loc_G1.setIcon(whiteMiddleDown);
					win[14][6] = 1;
				}
				loc_G1.setBounds(253, 567, 29, 29);
				Main.Check.check(win, 14, 6);
				Main.position[2] = 14;
				Main.position[3] = 6;
				Main.put = 1;
			}
		}
		else if (X <= 304 + 8 && X >= 304 - 9 && Main.put == 0)
		{
			if (Y <= 225 + 9 && Y >= 225 - 9 && win[0][7] == -1)
			{
				if (player == 0)
				{
					loc_H15.setIcon(blackMiddleUp);
					win[0][7] = 0;
				}
				else
				{
					loc_H15.setIcon(whiteMiddleUp);
					win[0][7] = 1;
				}
				loc_H15.setBounds(281, 173, 29, 29);
				Main.Check.check(win, 0, 7);
				Main.position[2] = 0;
				Main.position[3] = 7;
				Main.put = 1;
			}
			else if (Y <= 253 + 9 && Y >= 253 - 9 && win[1][7] == -1)
			{
				if (player == 0)
				{
					loc_H14.setIcon(black);
					win[1][7] = 0;
				}
				else
				{
					loc_H14.setIcon(white);
					win[1][7] = 1;
				}
				loc_H14.setBounds(281, 202, 29, 29);
				Main.Check.check(win, 1, 7);
				Main.position[2] = 1;
				Main.position[3] = 7;
				Main.put = 1;
			}
			else if (Y <= 281 + 9 && Y >= 281 - 9 && win[2][7] == -1)
			{
				if (player == 0)
				{
					loc_H13.setIcon(black);
					win[2][7] = 0;
				}
				else
				{
					loc_H13.setIcon(white);
					win[2][7] = 1;
				}
				loc_H13.setBounds(281, 230, 29, 29);
				Main.Check.check(win, 2, 7);
				Main.position[2] = 2;
				Main.position[3] = 7;
				Main.put = 1;
			}
			else if (Y <= 310 + 9 && Y >= 310 - 9 && win[3][7] == -1)
			{
				if (player == 0)
				{
					loc_H12.setIcon(black);
					win[3][7] = 0;
				}
				else
				{
					loc_H12.setIcon(white);
					win[3][7] = 1;
				}
				loc_H12.setBounds(281, 258, 29, 29);
				Main.Check.check(win, 3, 7);
				Main.position[2] = 3;
				Main.position[3] = 7;
				Main.put = 1;
			}
			else if (Y <= 337 + 9 && Y >= 337 - 9 && win[4][7] == -1)
			{
				if (player == 0)
				{
					loc_H11.setIcon(black);
					win[4][7] = 0;
				}
				else
				{
					loc_H11.setIcon(white);
					win[4][7] = 1;
				}
				loc_H11.setBounds(281, 286, 29, 29);
				Main.Check.check(win, 4, 7);
				Main.position[2] = 4;
				Main.position[3] = 7;
				Main.put = 1;
			}
			else if (Y <= 367 + 9 && Y >= 367 - 9 && win[5][7] == -1)
			{
				if (player == 0)
				{
					loc_H10.setIcon(black);
					win[5][7] = 0;
				}
				else
				{
					loc_H10.setIcon(white);
					win[5][7] = 1;
				}
				loc_H10.setBounds(281, 314, 29, 29);
				Main.Check.check(win, 5, 7);
				Main.position[2] = 5;
				Main.position[3] = 7;
				Main.put = 1;
			}
			else if (Y <= 394 + 9 && Y >= 394 - 9 && win[6][7] == -1)
			{
				if (player == 0)
				{
					loc_H9.setIcon(black);
					win[6][7] = 0;
				}
				else
				{
					loc_H9.setIcon(white);
					win[6][7] = 1;
				}
				loc_H9.setBounds(281, 342, 29, 29);
				Main.Check.check(win, 6, 7);
				Main.position[2] = 6;
				Main.position[3] = 7;
				Main.put = 1;
			}
			else if (Y <= 422 + 9 && Y >= 422 - 9 && win[7][7] == -1)
			{
				if (player == 0)
				{
					loc_H8.setIcon(black);
					win[7][7] = 0;
				}
				else
				{
					loc_H8.setIcon(white);
					win[7][7] = 1;
				}
				loc_H8.setBounds(281, 370, 29, 29);
				Main.Check.check(win, 7, 7);
				Main.position[2] = 7;
				Main.position[3] = 7;
				Main.put = 1;
			}
			else if (Y <= 450 + 9 && Y >= 450 - 9 && win[8][7] == -1)
			{
				if (player == 0)
				{
					loc_H7.setIcon(black);
					win[8][7] = 0;
				}
				else
				{
					loc_H7.setIcon(white);
					win[8][7] = 1;
				}
				loc_H7.setBounds(281, 398, 29, 29);
				Main.Check.check(win, 8, 7);
				Main.position[2] = 8;
				Main.position[3] = 7;
				Main.put = 1;
			}
			else if (Y <= 477 + 9 && Y >= 477 - 9 && win[9][7] == -1)
			{
				if (player == 0)
				{
					loc_H6.setIcon(black);
					win[9][7] = 0;
				}
				else
				{
					loc_H6.setIcon(white);
					win[9][7] = 1;
				}
				loc_H6.setBounds(281, 426, 29, 29);
				Main.Check.check(win, 9, 7);
				Main.position[2] = 9;
				Main.position[3] = 7;
				Main.put = 1;
			}
			else if (Y <= 505 + 9 && Y >= 505 - 9 && win[10][7] == -1)
			{
				if (player == 0)
				{
					loc_H5.setIcon(black);
					win[10][7] = 0;
				}
				else
				{
					loc_H5.setIcon(white);
					win[10][7] = 1;
				}
				loc_H5.setBounds(281, 454, 29, 29);
				Main.Check.check(win, 10, 7);
				Main.position[2] = 10;
				Main.position[3] = 7;
				Main.put = 1;
			}
			else if (Y <= 533 + 9 && Y >= 533 - 9 && win[11][7] == -1)
			{
				if (player == 0)
				{
					loc_H4.setIcon(black);
					win[11][7] = 0;
				}
				else
				{
					loc_H4.setIcon(white);
					win[11][7] = 1;
				}
				loc_H4.setBounds(281, 482, 29, 29);
				Main.Check.check(win, 11, 7);
				Main.position[2] = 11;
				Main.position[3] = 7;
				Main.put = 1;
			}
			else if (Y <= 562 + 9 && Y >= 562 - 9 && win[12][7] == -1)
			{
				if (player == 0)
				{
					loc_H3.setIcon(black);
					win[12][7] = 0;
				}
				else
				{
					loc_H3.setIcon(white);
					win[12][7] = 1;
				}
				loc_H3.setBounds(281, 510, 29, 29);
				Main.Check.check(win, 12, 7);
				Main.position[2] = 12;
				Main.position[3] = 7;
				Main.put = 1;
			}
			else if (Y <= 589 + 9 && Y >= 589 - 9 && win[13][7] == -1)
			{
				if (player == 0)
				{
					loc_H2.setIcon(black);
					win[13][7] = 0;
				}
				else
				{
					loc_H2.setIcon(white);
					win[13][7] = 1;
				}
				loc_H2.setBounds(281, 538, 29, 29);
				Main.Check.check(win, 13, 7);
				Main.position[2] = 13;
				Main.position[3] = 7;
				Main.put = 1;
			}
			else if (Y <= 618 + 9 && Y >= 618 - 9 && win[14][7] == -1)
			{
				if (player == 0)
				{
					loc_H1.setIcon(blackMiddleDown);
					win[14][7] = 0;
				}
				else
				{
					loc_H1.setIcon(whiteMiddleDown);
					win[14][7] = 1;
				}
				loc_H1.setBounds(281, 567, 29, 29);
				Main.Check.check(win, 14, 7);
				Main.position[2] = 14;
				Main.position[3] = 7;
				Main.put = 1;
			}
		}
		else if (X <= 333 + 8 && X >= 333 - 9 && Main.put == 0)
		{
			if (Y <= 225 + 9 && Y >= 225 - 9 && win[0][8] == -1)
			{
				if (player == 0)
				{
					loc_J15.setIcon(blackMiddleUp);
					win[0][8] = 0;
				}
				else
				{
					loc_J15.setIcon(whiteMiddleUp);
					win[0][8] = 1;
				}
				loc_J15.setBounds(309, 173, 29, 29);
				Main.Check.check(win, 0, 8);
				Main.position[2] = 0;
				Main.position[3] = 8;
				Main.put = 1;
			}
			else if (Y <= 253 + 9 && Y >= 253 - 9 && win[1][8] == -1)
			{
				if (player == 0)
				{
					loc_J14.setIcon(black);
					win[1][8] = 0;
				}
				else
				{
					loc_J14.setIcon(white);
					win[1][8] = 1;
				}
				loc_J14.setBounds(309, 202, 29, 29);
				Main.Check.check(win, 1, 8);
				Main.position[2] = 1;
				Main.position[3] = 8;
				Main.put = 1;
			}
			else if (Y <= 281 + 9 && Y >= 281 - 9 && win[2][8] == -1)
			{
				if (player == 0)
				{
					loc_J13.setIcon(black);
					win[2][8] = 0;
				}
				else
				{
					loc_J13.setIcon(white);
					win[2][8] = 1;
				}
				loc_J13.setBounds(309, 230, 29, 29);
				Main.Check.check(win, 2, 8);
				Main.position[2] = 2;
				Main.position[3] = 8;
				Main.put = 1;
			}
			else if (Y <= 310 + 9 && Y >= 310 - 9 && win[3][8] == -1)
			{
				if (player == 0)
				{
					loc_J12.setIcon(black);
					win[3][8] = 0;
				}
				else
				{
					loc_J12.setIcon(white);
					win[3][8] = 1;
				}
				loc_J12.setBounds(309, 258, 29, 29);
				Main.Check.check(win, 3, 8);
				Main.position[2] = 3;
				Main.position[3] = 8;
				Main.put = 1;
			}
			else if (Y <= 337 + 9 && Y >= 337 - 9 && win[4][8] == -1)
			{
				if (player == 0)
				{
					loc_J11.setIcon(black);
					win[4][8] = 0;
				}
				else
				{
					loc_J11.setIcon(white);
					win[4][8] = 1;
				}
				loc_J11.setBounds(309, 286, 29, 29);
				Main.Check.check(win, 4, 8);
				Main.position[2] = 4;
				Main.position[3] = 8;
				Main.put = 1;
			}
			else if (Y <= 367 + 9 && Y >= 367 - 9 && win[5][8] == -1)
			{
				if (player == 0)
				{
					loc_J10.setIcon(black);
					win[5][8] = 0;
				}
				else
				{
					loc_J10.setIcon(white);
					win[5][8] = 1;
				}
				loc_J10.setBounds(309, 314, 29, 29);
				Main.Check.check(win, 5, 8);
				Main.position[2] = 5;
				Main.position[3] = 8;
				Main.put = 1;
			}
			else if (Y <= 394 + 9 && Y >= 394 - 9 && win[6][8] == -1)
			{
				if (player == 0)
				{
					loc_J9.setIcon(black);
					win[6][8] = 0;
				}
				else
				{
					loc_J9.setIcon(white);
					win[6][8] = 1;
				}
				loc_J9.setBounds(309, 342, 29, 29);
				Main.Check.check(win, 6, 8);
				Main.position[2] = 6;
				Main.position[3] = 8;
				Main.put = 1;
			}
			else if (Y <= 422 + 9 && Y >= 422 - 9 && win[7][8] == -1)
			{
				if (player == 0)
				{
					loc_J8.setIcon(black);
					win[7][8] = 0;
				}
				else
				{
					loc_J8.setIcon(white);
					win[7][8] = 1;
				}
				loc_J8.setBounds(309, 370, 29, 29);
				Main.Check.check(win, 7, 8);
				Main.position[2] = 7;
				Main.position[3] = 8;
				Main.put = 1;
			}
			else if (Y <= 450 + 9 && Y >= 450 - 9 && win[8][8] == -1)
			{
				if (player == 0)
				{
					loc_J7.setIcon(black);
					win[8][8] = 0;
				}
				else
				{
					loc_J7.setIcon(white);
					win[8][8] = 1;
				}
				loc_J7.setBounds(309, 398, 29, 29);
				Main.Check.check(win, 8, 8);
				Main.position[2] = 8;
				Main.position[3] = 8;
				Main.put = 1;
			}
			else if (Y <= 477 + 9 && Y >= 477 - 9 && win[9][8] == -1)
			{
				if (player == 0)
				{
					loc_J6.setIcon(black);
					win[9][8] = 0;
				}
				else
				{
					loc_J6.setIcon(white);
					win[9][8] = 1;
				}
				loc_J6.setBounds(309, 426, 29, 29);
				Main.Check.check(win, 9, 8);
				Main.position[2] = 9;
				Main.position[3] = 8;
				Main.put = 1;
			}
			else if (Y <= 505 + 9 && Y >= 505 - 9 && win[10][8] == -1)
			{
				if (player == 0)
				{
					loc_J5.setIcon(black);
					win[10][8] = 0;
				}
				else
				{
					loc_J5.setIcon(white);
					win[10][8] = 1;
				}
				loc_J5.setBounds(309, 454, 29, 29);
				Main.Check.check(win, 10, 8);
				Main.position[2] = 10;
				Main.position[3] = 8;
				Main.put = 1;
			}
			else if (Y <= 533 + 9 && Y >= 533 - 9 && win[11][8] == -1)
			{
				if (player == 0)
				{
					loc_J4.setIcon(black);
					win[11][8] = 0;
				}
				else
				{
					loc_J4.setIcon(white);
					win[11][8] = 1;
				}
				loc_J4.setBounds(309, 482, 29, 29);
				Main.Check.check(win, 11, 8);
				Main.position[2] = 11;
				Main.position[3] = 8;
				Main.put = 1;
			}
			else if (Y <= 562 + 9 && Y >= 562 - 9 && win[12][8] == -1)
			{
				if (player == 0)
				{
					loc_J3.setIcon(black);
					win[12][8] = 0;
				}
				else
				{
					loc_J3.setIcon(white);
					win[12][8] = 1;
				}
				loc_J3.setBounds(309, 510, 29, 29);
				Main.Check.check(win, 12, 8);
				Main.position[2] = 12;
				Main.position[3] = 8;
				Main.put = 1;
			}
			else if (Y <= 589 + 9 && Y >= 589 - 9 && win[13][8] == -1)
			{
				if (player == 0)
				{
					loc_J2.setIcon(black);
					win[13][8] = 0;
				}
				else
				{
					loc_J2.setIcon(white);
					win[13][8] = 1;
				}
				loc_J2.setBounds(309, 538, 29, 29);
				Main.Check.check(win, 13, 8);
				Main.position[2] = 13;
				Main.position[3] = 8;
				Main.put = 1;
			}
			else if (Y <= 618 + 9 && Y >= 618 - 9 && win[14][8] == -1)
			{
				if (player == 0)
				{
					loc_J1.setIcon(blackMiddleDown);
					win[14][8] = 0;
				}
				else
				{
					loc_J1.setIcon(whiteMiddleDown);
					win[14][8] = 1;
				}
				loc_J1.setBounds(309, 567, 29, 29);
				Main.Check.check(win, 14, 8);
				Main.position[2] = 14;
				Main.position[3] = 8;
				Main.put = 1;
			}
		}
		else if (X <= 360 + 8 && X >= 360 - 9 && Main.put == 0)
		{
			if (Y <= 225 + 9 && Y >= 225 - 9 && win[0][9] == -1)
			{
				if (player == 0)
				{
					loc_K15.setIcon(blackMiddleUp);
					win[0][9] = 0;
				}
				else
				{
					loc_K15.setIcon(whiteMiddleUp);
					win[0][9] = 1;
				}
				loc_K15.setBounds(337, 173, 29, 29);
				Main.Check.check(win, 0, 9);
				Main.position[2] = 0;
				Main.position[3] = 9;
				Main.put = 1;
			}
			else if (Y <= 253 + 9 && Y >= 253 - 9 && win[1][9] == -1)
			{
				if (player == 0)
				{
					loc_K14.setIcon(black);
					win[1][9] = 0;
				}
				else
				{
					loc_K14.setIcon(white);
					win[1][9] = 1;
				}
				loc_K14.setBounds(337, 202, 29, 29);
				Main.Check.check(win, 1, 9);
				Main.position[2] = 1;
				Main.position[3] = 9;
				Main.put = 1;
			}
			else if (Y <= 281 + 9 && Y >= 281 - 9 && win[2][9] == -1)
			{
				if (player == 0)
				{
					loc_K13.setIcon(black);
					win[2][9] = 0;
				}
				else
				{
					loc_K13.setIcon(white);
					win[2][9] = 1;
				}
				loc_K13.setBounds(337, 230, 29, 29);
				Main.Check.check(win, 2, 9);
				Main.position[2] = 2;
				Main.position[3] = 9;
				Main.put = 1;
			}
			else if (Y <= 310 + 9 && Y >= 310 - 9 && win[3][9] == -1)
			{
				if (player == 0)
				{
					loc_K12.setIcon(black);
					win[3][9] = 0;
				}
				else
				{
					loc_K12.setIcon(white);
					win[3][9] = 1;
				}
				loc_K12.setBounds(337, 258, 29, 29);
				Main.Check.check(win, 3, 9);
				Main.position[2] = 3;
				Main.position[3] = 9;
				Main.put = 1;
			}
			else if (Y <= 337 + 9 && Y >= 337 - 9 && win[4][9] == -1)
			{
				if (player == 0)
				{
					loc_K11.setIcon(black);
					win[4][9] = 0;
				}
				else
				{
					loc_K11.setIcon(white);
					win[4][9] = 1;
				}
				loc_K11.setBounds(337, 286, 29, 29);
				Main.Check.check(win, 4, 9);
				Main.position[2] = 4;
				Main.position[3] = 9;
				Main.put = 1;
			}
			else if (Y <= 367 + 9 && Y >= 367 - 9 && win[5][9] == -1)
			{
				if (player == 0)
				{
					loc_K10.setIcon(black);
					win[5][9] = 0;
				}
				else
				{
					loc_K10.setIcon(white);
					win[5][9] = 1;
				}
				loc_K10.setBounds(337, 314, 29, 29);
				Main.Check.check(win, 5, 9);
				Main.position[2] = 5;
				Main.position[3] = 9;
				Main.put = 1;
			}
			else if (Y <= 394 + 9 && Y >= 394 - 9 && win[6][9] == -1)
			{
				if (player == 0)
				{
					loc_K9.setIcon(black);
					win[6][9] = 0;
				}
				else
				{
					loc_K9.setIcon(white);
					win[6][9] = 1;
				}
				loc_K9.setBounds(337, 342, 29, 29);
				Main.Check.check(win, 6, 9);
				Main.position[2] = 6;
				Main.position[3] = 9;
				Main.put = 1;
			}
			else if (Y <= 422 + 9 && Y >= 422 - 9 && win[7][9] == -1)
			{
				if (player == 0)
				{
					loc_K8.setIcon(black);
					win[7][9] = 0;
				}
				else
				{
					loc_K8.setIcon(white);
					win[7][9] = 1;
				}
				loc_K8.setBounds(337, 370, 29, 29);
				Main.Check.check(win, 7, 9);
				Main.position[2] = 7;
				Main.position[3] = 9;
				Main.put = 1;
			}
			else if (Y <= 450 + 9 && Y >= 450 - 9 && win[8][9] == -1)
			{
				if (player == 0)
				{
					loc_K7.setIcon(black);
					win[8][9] = 0;
				}
				else
				{
					loc_K7.setIcon(white);
					win[8][9] = 1;
				}
				loc_K7.setBounds(337, 398, 29, 29);
				Main.Check.check(win, 8, 9);
				Main.position[2] = 8;
				Main.position[3] = 9;
				Main.put = 1;
			}
			else if (Y <= 477 + 9 && Y >= 477 - 9 && win[9][9] == -1)
			{
				if (player == 0)
				{
					loc_K6.setIcon(black);
					win[9][9] = 0;
				}
				else
				{
					loc_K6.setIcon(white);
					win[9][9] = 1;
				}
				loc_K6.setBounds(337, 426, 29, 29);
				Main.Check.check(win, 9, 9);
				Main.position[2] = 9;
				Main.position[3] = 9;
				Main.put = 1;
			}
			else if (Y <= 505 + 9 && Y >= 505 - 9 && win[10][9] == -1)
			{
				if (player == 0)
				{
					loc_K5.setIcon(black);
					win[10][9] = 0;
				}
				else
				{
					loc_K5.setIcon(white);
					win[10][9] = 1;
				}
				loc_K5.setBounds(337, 454, 29, 29);
				Main.Check.check(win, 10, 9);
				Main.position[2] = 10;
				Main.position[3] = 9;
				Main.put = 1;
			}
			else if (Y <= 533 + 9 && Y >= 533 - 9 && win[11][9] == -1)
			{
				if (player == 0)
				{
					loc_K4.setIcon(black);
					win[11][9] = 0;
				}
				else
				{
					loc_K4.setIcon(white);
					win[11][9] = 1;
				}
				loc_K4.setBounds(337, 482, 29, 29);
				Main.Check.check(win, 11, 9);
				Main.position[2] = 11;
				Main.position[3] = 9;
				Main.put = 1;
			}
			else if (Y <= 562 + 9 && Y >= 562 - 9 && win[12][9] == -1)
			{
				if (player == 0)
				{
					loc_K3.setIcon(black);
					win[12][9] = 0;
				}
				else
				{
					loc_K3.setIcon(white);
					win[12][9] = 1;
				}
				loc_K3.setBounds(337, 510, 29, 29);
				Main.Check.check(win, 12, 9);
				Main.position[2] = 12;
				Main.position[3] = 9;
				Main.put = 1;
			}
			else if (Y <= 589 + 9 && Y >= 589 - 9 && win[13][9] == -1)
			{
				if (player == 0)
				{
					loc_K2.setIcon(black);
					win[13][9] = 0;
				}
				else
				{
					loc_K2.setIcon(white);
					win[13][9] = 1;
				}
				loc_K2.setBounds(337, 538, 29, 29);
				Main.Check.check(win, 13, 9);
				Main.position[2] = 13;
				Main.position[3] = 9;
				Main.put = 1;
			}
			else if (Y <= 618 + 9 && Y >= 618 - 9 && win[14][9] == -1)
			{
				if (player == 0)
				{
					loc_K1.setIcon(blackMiddleDown);
					win[14][9] = 0;
				}
				else
				{
					loc_K1.setIcon(whiteMiddleDown);
					win[14][9] = 1;
				}
				loc_K1.setBounds(337, 567, 29, 29);
				Main.Check.check(win, 14, 9);
				Main.position[2] = 14;
				Main.position[3] = 9;
				Main.put = 1;
			}
		}
		else if (X <= 387 + 8 && X >= 387 - 9 && Main.put == 0)
		{
			if (Y <= 225 + 9 && Y >= 225 - 9 && win[0][10] == -1)
			{
				if (player == 0)
				{
					loc_L15.setIcon(blackMiddleUp);
					win[0][10] = 0;
				}
				else
				{
					loc_L15.setIcon(whiteMiddleUp);
					win[0][10] = 1;
				}
				loc_L15.setBounds(365, 173, 29, 29);
				Main.Check.check(win, 0, 10);
				Main.position[2] = 0;
				Main.position[3] = 10;
				Main.put = 1;
			}
			else if (Y <= 253 + 9 && Y >= 253 - 9 && win[1][10] == -1)
			{
				if (player == 0)
				{
					loc_L14.setIcon(black);
					win[1][10] = 0;
				}
				else
				{
					loc_L14.setIcon(white);
					win[1][10] = 1;
				}
				loc_L14.setBounds(365, 202, 29, 29);
				Main.Check.check(win, 1, 10);
				Main.position[2] = 1;
				Main.position[3] = 10;
				Main.put = 1;
			}
			else if (Y <= 281 + 9 && Y >= 281 - 9 && win[2][10] == -1)
			{
				if (player == 0)
				{
					loc_L13.setIcon(black);
					win[2][10] = 0;
				}
				else
				{
					loc_L13.setIcon(white);
					win[2][10] = 1;
				}
				loc_L13.setBounds(365, 230, 29, 29);
				Main.Check.check(win, 2, 10);
				Main.position[2] = 2;
				Main.position[3] = 10;
				Main.put = 1;
			}
			else if (Y <= 310 + 9 && Y >= 310 - 9 && win[3][10] == -1)
			{
				if (player == 0)
				{
					loc_L12.setIcon(black);
					win[3][10] = 0;
				}
				else
				{
					loc_L12.setIcon(white);
					win[3][10] = 1;
				}
				loc_L12.setBounds(365, 258, 29, 29);
				Main.Check.check(win, 3, 10);
				Main.position[2] = 3;
				Main.position[3] = 10;
				Main.put = 1;
			}
			else if (Y <= 337 + 9 && Y >= 337 - 9 && win[4][10] == -1)
			{
				if (player == 0)
				{
					loc_L11.setIcon(black);
					win[4][10] = 0;
				}
				else
				{
					loc_L11.setIcon(white);
					win[4][10] = 1;
				}
				loc_L11.setBounds(365, 286, 29, 29);
				Main.Check.check(win, 4, 10);
				Main.position[2] = 4;
				Main.position[3] = 10;
				Main.put = 1;
			}
			else if (Y <= 367 + 9 && Y >= 367 - 9 && win[5][10] == -1)
			{
				if (player == 0)
				{
					loc_L10.setIcon(black);
					win[5][10] = 0;
				}
				else
				{
					loc_L10.setIcon(white);
					win[5][10] = 1;
				}
				loc_L10.setBounds(365, 314, 29, 29);
				Main.Check.check(win, 5, 10);
				Main.position[2] = 5;
				Main.position[3] = 10;
				Main.put = 1;
			}
			else if (Y <= 394 + 9 && Y >= 394 - 9 && win[6][10] == -1)
			{
				if (player == 0)
				{
					loc_L9.setIcon(black);
					win[6][10] = 0;
				}
				else
				{
					loc_L9.setIcon(white);
					win[6][10] = 1;
				}
				loc_L9.setBounds(365, 342, 29, 29);
				Main.Check.check(win, 6, 10);
				Main.position[2] = 6;
				Main.position[3] = 10;
				Main.put = 1;
			}
			else if (Y <= 422 + 9 && Y >= 422 - 9 && win[7][10] == -1)
			{
				if (player == 0)
				{
					loc_L8.setIcon(black);
					win[7][10] = 0;
				}
				else
				{
					loc_L8.setIcon(white);
					win[7][10] = 1;
				}
				loc_L8.setBounds(365, 370, 29, 29);
				Main.Check.check(win, 7, 10);
				Main.position[2] = 7;
				Main.position[3] = 10;
				Main.put = 1;
			}
			else if (Y <= 450 + 9 && Y >= 450 - 9 && win[8][10] == -1)
			{
				if (player == 0)
				{
					loc_L7.setIcon(black);
					win[8][10] = 0;
				}
				else
				{
					loc_L7.setIcon(white);
					win[8][10] = 1;
				}
				loc_L7.setBounds(365, 398, 29, 29);
				Main.Check.check(win, 8, 10);
				Main.position[2] = 8;
				Main.position[3] = 10;
				Main.put = 1;
			}
			else if (Y <= 477 + 9 && Y >= 477 - 9 && win[9][10] == -1)
			{
				if (player == 0)
				{
					loc_L6.setIcon(black);
					win[9][10] = 0;
				}
				else
				{
					loc_L6.setIcon(white);
					win[9][10] = 1;
				}
				loc_L6.setBounds(365, 426, 29, 29);
				Main.Check.check(win, 9, 10);
				Main.position[2] = 9;
				Main.position[3] = 10;
				Main.put = 1;
			}
			else if (Y <= 505 + 9 && Y >= 505 - 9 && win[10][10] == -1)
			{
				if (player == 0)
				{
					loc_L5.setIcon(black);
					win[10][10] = 0;
				}
				else
				{
					loc_L5.setIcon(white);
					win[10][10] = 1;
				}
				loc_L5.setBounds(365, 454, 29, 29);
				Main.Check.check(win, 10, 10);
				Main.position[2] = 10;
				Main.position[3] = 10;
				Main.put = 1;
			}
			else if (Y <= 533 + 9 && Y >= 533 - 9 && win[11][10] == -1)
			{
				if (player == 0)
				{
					loc_L4.setIcon(black);
					win[11][10] = 0;
				}
				else
				{
					loc_L4.setIcon(white);
					win[11][10] = 1;
				}
				loc_L4.setBounds(365, 482, 29, 29);
				Main.Check.check(win, 11, 10);
				Main.position[2] = 11;
				Main.position[3] = 10;
				Main.put = 1;
			}
			else if (Y <= 562 + 9 && Y >= 562 - 9 && win[12][10] == -1)
			{
				if (player == 0)
				{
					loc_L3.setIcon(black);
					win[12][10] = 0;
				}
				else
				{
					loc_L3.setIcon(white);
					win[12][10] = 1;
				}
				loc_L3.setBounds(365, 510, 29, 29);
				Main.Check.check(win, 12, 10);
				Main.position[2] = 12;
				Main.position[3] = 10;
				Main.put = 1;
			}
			else if (Y <= 589 + 9 && Y >= 589 - 9 && win[13][10] == -1)
			{
				if (player == 0)
				{
					loc_L2.setIcon(black);
					win[13][10] = 0;
				}
				else
				{
					loc_L2.setIcon(white);
					win[13][10] = 1;
				}
				loc_L2.setBounds(365, 538, 29, 29);
				Main.Check.check(win, 13, 10);
				Main.position[2] = 13;
				Main.position[3] = 10;
				Main.put = 1;
			}
			else if (Y <= 618 + 9 && Y >= 618 - 9 && win[14][10] == -1)
			{
				if (player == 0)
				{
					loc_L1.setIcon(blackMiddleDown);
					win[14][10] = 0;
				}
				else
				{
					loc_L1.setIcon(whiteMiddleDown);
					win[14][10] = 1;
				}
				loc_L1.setBounds(365, 567, 29, 29);
				Main.Check.check(win, 14, 10);
				Main.position[2] = 14;
				Main.position[3] = 10;
				Main.put = 1;
			}
		}
		else if (X <= 417 + 8 && X >= 417 - 9 && Main.put == 0)
		{
			if (Y <= 225 + 9 && Y >= 225 - 9 && win[0][11] == -1)
			{
				if (player == 0)
				{
					loc_M15.setIcon(blackMiddleUp);
					win[0][11] = 0;
				}
				else
				{
					loc_M15.setIcon(whiteMiddleUp);
					win[0][11] = 1;
				}
				loc_M15.setBounds(393, 173, 29, 29);
				Main.Check.check(win, 0, 11);
				Main.position[2] = 0;
				Main.position[3] = 11;
				Main.put = 1;
			}
			else if (Y <= 253 + 9 && Y >= 253 - 9 && win[1][11] == -1)
			{
				if (player == 0)
				{
					loc_M14.setIcon(black);
					win[1][11] = 0;
				}
				else
				{
					loc_M14.setIcon(white);
					win[1][11] = 1;
				}
				loc_M14.setBounds(393, 202, 29, 29);
				Main.Check.check(win, 1, 11);
				Main.position[2] = 1;
				Main.position[3] = 11;
				Main.put = 1;
			}
			else if (Y <= 281 + 9 && Y >= 281 - 9 && win[2][11] == -1)
			{
				if (player == 0)
				{
					loc_M13.setIcon(black);
					win[2][11] = 0;
				}
				else
				{
					loc_M13.setIcon(white);
					win[2][11] = 1;
				}
				loc_M13.setBounds(393, 230, 29, 29);
				Main.Check.check(win, 2, 11);
				Main.position[2] = 2;
				Main.position[3] = 11;
				Main.put = 1;
			}
			else if (Y <= 310 + 9 && Y >= 310 - 9 && win[3][11] == -1)
			{
				if (player == 0)
				{
					loc_M12.setIcon(black);
					win[3][11] = 0;
				}
				else
				{
					loc_M12.setIcon(white);
					win[3][11] = 1;
				}
				loc_M12.setBounds(393, 258, 29, 29);
				Main.Check.check(win, 3, 11);
				Main.position[2] = 3;
				Main.position[3] = 11;
				Main.put = 1;
			}
			else if (Y <= 337 + 9 && Y >= 337 - 9 && win[4][11] == -1)
			{
				if (player == 0)
				{
					loc_M11.setIcon(black);
					win[4][11] = 0;
				}
				else
				{
					loc_M11.setIcon(white);
					win[4][11] = 1;
				}
				loc_M11.setBounds(393, 286, 29, 29);
				Main.Check.check(win, 4, 11);
				Main.position[2] = 4;
				Main.position[3] = 11;
				Main.put = 1;
			}
			else if (Y <= 367 + 9 && Y >= 367 - 9 && win[5][11] == -1)
			{
				if (player == 0)
				{
					loc_M10.setIcon(black);
					win[5][11] = 0;
				}
				else
				{
					loc_M10.setIcon(white);
					win[5][11] = 1;
				}
				loc_M10.setBounds(393, 314, 29, 29);
				Main.Check.check(win, 5, 11);
				Main.position[2] = 5;
				Main.position[3] = 11;
				Main.put = 1;
			}
			else if (Y <= 394 + 9 && Y >= 394 - 9 && win[6][11] == -1)
			{
				if (player == 0)
				{
					loc_M9.setIcon(black);
					win[6][11] = 0;
				}
				else
				{
					loc_M9.setIcon(white);
					win[6][11] = 1;
				}
				loc_M9.setBounds(393, 342, 29, 29);
				Main.Check.check(win, 6, 11);
				Main.position[2] = 6;
				Main.position[3] = 11;
				Main.put = 1;
			}
			else if (Y <= 422 + 9 && Y >= 422 - 9 && win[7][11] == -1)
			{
				if (player == 0)
				{
					loc_M8.setIcon(black);
					win[7][11] = 0;
				}
				else
				{
					loc_M8.setIcon(white);
					win[7][11] = 1;
				}
				loc_M8.setBounds(393, 370, 29, 29);
				Main.Check.check(win, 7, 11);
				Main.position[2] = 7;
				Main.position[3] = 11;
				Main.put = 1;
			}
			else if (Y <= 450 + 9 && Y >= 450 - 9 && win[8][11] == -1)
			{
				if (player == 0)
				{
					loc_M7.setIcon(black);
					win[8][11] = 0;
				}
				else
				{
					loc_M7.setIcon(white);
					win[8][11] = 1;
				}
				loc_M7.setBounds(393, 398, 29, 29);
				Main.Check.check(win, 8, 11);
				Main.position[2] = 8;
				Main.position[3] = 11;
				Main.put = 1;
			}
			else if (Y <= 477 + 9 && Y >= 477 - 9 && win[9][11] == -1)
			{
				if (player == 0)
				{
					loc_M6.setIcon(black);
					win[9][11] = 0;
				}
				else
				{
					loc_M6.setIcon(white);
					win[9][11] = 1;
				}
				loc_M6.setBounds(393, 426, 29, 29);
				Main.Check.check(win, 9, 11);
				Main.position[2] = 9;
				Main.position[3] = 11;
				Main.put = 1;
			}
			else if (Y <= 505 + 9 && Y >= 505 - 9 && win[10][11] == -1)
			{
				if (player == 0)
				{
					loc_M5.setIcon(black);
					win[10][11] = 0;
				}
				else
				{
					loc_M5.setIcon(white);
					win[10][11] = 1;
				}
				loc_M5.setBounds(393, 454, 29, 29);
				Main.Check.check(win, 10, 11);
				Main.position[2] = 10;
				Main.position[3] = 11;
				Main.put = 1;
			}
			else if (Y <= 533 + 9 && Y >= 533 - 9 && win[11][11] == -1)
			{
				if (player == 0)
				{
					loc_M4.setIcon(black);
					win[11][11] = 0;
				}
				else
				{
					loc_M4.setIcon(white);
					win[11][11] = 1;
				}
				loc_M4.setBounds(393, 482, 29, 29);
				Main.Check.check(win, 11, 11);
				Main.position[2] = 11;
				Main.position[3] = 11;
				Main.put = 1;
			}
			else if (Y <= 562 + 9 && Y >= 562 - 9 && win[12][11] == -1)
			{
				if (player == 0)
				{
					loc_M3.setIcon(black);
					win[12][11] = 0;
				}
				else
				{
					loc_M3.setIcon(white);
					win[12][11] = 1;
				}
				loc_M3.setBounds(393, 510, 29, 29);
				Main.Check.check(win, 12, 11);
				Main.position[2] = 12;
				Main.position[3] = 11;
				Main.put = 1;
			}
			else if (Y <= 589 + 9 && Y >= 589 - 9 && win[13][11] == -1)
			{
				if (player == 0)
				{
					loc_M2.setIcon(black);
					win[13][11] = 0;
				}
				else
				{
					loc_M2.setIcon(white);
					win[13][11] = 1;
				}
				loc_M2.setBounds(393, 538, 29, 29);
				Main.Check.check(win, 13, 11);
				Main.position[2] = 13;
				Main.position[3] = 11;
				Main.put = 1;
			}
			else if (Y <= 618 + 9 && Y >= 618 - 9 && win[14][11] == -1)
			{
				if (player == 0)
				{
					loc_M1.setIcon(blackMiddleDown);
					win[14][11] = 0;
				}
				else
				{
					loc_M1.setIcon(whiteMiddleDown);
					win[14][11] = 1;
				}
				loc_M1.setBounds(393, 567, 29, 29);
				Main.Check.check(win, 14, 11);
				Main.position[2] = 14;
				Main.position[3] = 11;
				Main.put = 1;
			}
		}
		else if (X <= 443 + 8 && X >= 443 - 9 && Main.put == 0)
		{
			if (Y <= 225 + 9 && Y >= 225 - 9 && win[0][12] == -1)
			{
				if (player == 0)
				{
					loc_N15.setIcon(blackMiddleUp);
					win[0][12] = 0;
				}
				else
				{
					loc_N15.setIcon(whiteMiddleUp);
					win[0][12] = 1;
				}
				loc_N15.setBounds(420, 173, 29, 29);
				Main.Check.check(win, 0, 12);
				Main.position[2] = 0;
				Main.position[3] = 12;
				Main.put = 1;
			}
			else if (Y <= 253 + 9 && Y >= 253 - 9 && win[1][12] == -1)
			{
				if (player == 0)
				{
					loc_N14.setIcon(black);
					win[1][12] = 0;
				}
				else
				{
					loc_N14.setIcon(white);
					win[1][12] = 1;
				}
				loc_N14.setBounds(420, 202, 29, 29);
				Main.Check.check(win, 1, 12);
				Main.position[2] = 1;
				Main.position[3] = 12;
				Main.put = 1;
			}
			else if (Y <= 281 + 9 && Y >= 281 - 9 && win[2][12] == -1)
			{
				if (player == 0)
				{
					loc_N13.setIcon(black);
					win[2][12] = 0;
				}
				else
				{
					loc_N13.setIcon(white);
					win[2][12] = 1;
				}
				loc_N13.setBounds(420, 230, 29, 29);
				Main.Check.check(win, 2, 12);
				Main.position[2] = 2;
				Main.position[3] = 12;
				Main.put = 1;
			}
			else if (Y <= 310 + 9 && Y >= 310 - 9 && win[3][12] == -1)
			{
				if (player == 0)
				{
					loc_N12.setIcon(black);
					win[3][12] = 0;
				}
				else
				{
					loc_N12.setIcon(white);
					win[3][12] = 1;
				}
				loc_N12.setBounds(420, 258, 29, 29);
				Main.Check.check(win, 3, 12);
				Main.position[2] = 3;
				Main.position[3] = 12;
				Main.put = 1;
			}
			else if (Y <= 337 + 9 && Y >= 337 - 9 && win[4][12] == -1)
			{
				if (player == 0)
				{
					loc_N11.setIcon(black);
					win[4][12] = 0;
				}
				else
				{
					loc_N11.setIcon(white);
					win[4][12] = 1;
				}
				loc_N11.setBounds(420, 286, 29, 29);
				Main.Check.check(win, 4, 12);
				Main.position[2] = 4;
				Main.position[3] = 12;
				Main.put = 1;
			}
			else if (Y <= 367 + 9 && Y >= 367 - 9 && win[5][12] == -1)
			{
				if (player == 0)
				{
					loc_N10.setIcon(black);
					win[5][12] = 0;
				}
				else
				{
					loc_N10.setIcon(white);
					win[5][12] = 1;
				}
				loc_N10.setBounds(420, 314, 29, 29);
				Main.Check.check(win, 5, 12);
				Main.position[2] = 5;
				Main.position[3] = 12;
				Main.put = 1;
			}
			else if (Y <= 394 + 9 && Y >= 394 - 9 && win[6][12] == -1)
			{
				if (player == 0)
				{
					loc_N9.setIcon(black);
					win[6][12] = 0;
				}
				else
				{
					loc_N9.setIcon(white);
					win[6][12] = 1;
				}
				loc_N9.setBounds(420, 342, 29, 29);
				Main.Check.check(win, 6, 12);
				Main.position[2] = 6;
				Main.position[3] = 12;
				Main.put = 1;
			}
			else if (Y <= 422 + 9 && Y >= 422 - 9 && win[7][12] == -1)
			{
				if (player == 0)
				{
					loc_N8.setIcon(black);
					win[7][12] = 0;
				}
				else
				{
					loc_N8.setIcon(white);
					win[7][12] = 1;
				}
				loc_N8.setBounds(420, 370, 29, 29);
				Main.Check.check(win, 7, 12);
				Main.position[2] = 7;
				Main.position[3] = 12;
				Main.put = 1;
			}
			else if (Y <= 450 + 9 && Y >= 450 - 9 && win[8][12] == -1)
			{
				if (player == 0)
				{
					loc_N7.setIcon(black);
					win[8][12] = 0;
				}
				else
				{
					loc_N7.setIcon(white);
					win[8][12] = 1;
				}
				loc_N7.setBounds(420, 398, 29, 29);
				Main.Check.check(win, 8, 12);
				Main.position[2] = 8;
				Main.position[3] = 12;
				Main.put = 1;
			}
			else if (Y <= 477 + 9 && Y >= 477 - 9 && win[9][12] == -1)
			{
				if (player == 0)
				{
					loc_N6.setIcon(black);
					win[9][12] = 0;
				}
				else
				{
					loc_N6.setIcon(white);
					win[9][12] = 1;
				}
				loc_N6.setBounds(420, 426, 29, 29);
				Main.Check.check(win, 9, 12);
				Main.position[2] = 9;
				Main.position[3] = 12;
				Main.put = 1;
			}
			else if (Y <= 505 + 9 && Y >= 505 - 9 && win[10][12] == -1)
			{
				if (player == 0)
				{
					loc_N5.setIcon(black);
					win[10][12] = 0;
				}
				else
				{
					loc_N5.setIcon(white);
					win[10][12] = 1;
				}
				loc_N5.setBounds(420, 454, 29, 29);
				Main.Check.check(win, 10, 12);
				Main.position[2] = 10;
				Main.position[3] = 12;
				Main.put = 1;
			}
			else if (Y <= 533 + 9 && Y >= 533 - 9 && win[11][12] == -1)
			{
				if (player == 0)
				{
					loc_N4.setIcon(black);
					win[11][12] = 0;
				}
				else
				{
					loc_N4.setIcon(white);
					win[11][12] = 1;
				}
				loc_N4.setBounds(420, 482, 29, 29);
				Main.Check.check(win, 11, 12);
				Main.position[2] = 11;
				Main.position[3] = 12;
				Main.put = 1;
			}
			else if (Y <= 562 + 9 && Y >= 562 - 9 && win[12][12] == -1)
			{
				if (player == 0)
				{
					loc_N3.setIcon(black);
					win[12][12] = 0;
				}
				else
				{
					loc_N3.setIcon(white);
					win[12][12] = 1;
				}
				loc_N3.setBounds(420, 510, 29, 29);
				Main.Check.check(win, 12, 12);
				Main.position[2] = 12;
				Main.position[3] = 12;
				Main.put = 1;
			}
			else if (Y <= 589 + 9 && Y >= 589 - 9 && win[13][12] == -1)
			{
				if (player == 0)
				{
					loc_N2.setIcon(black);
					win[13][12] = 0;
				}
				else
				{
					loc_N2.setIcon(white);
					win[13][12] = 1;
				}
				loc_N2.setBounds(420, 538, 29, 29);
				Main.Check.check(win, 13, 12);
				Main.position[2] = 13;
				Main.position[3] = 12;
				Main.put = 1;
			}
			else if (Y <= 618 + 9 && Y >= 618 - 9 && win[14][12] == -1)
			{
				if (player == 0)
				{
					loc_N1.setIcon(blackMiddleDown);
					win[14][12] = 0;
				}
				else
				{
					loc_N1.setIcon(whiteMiddleDown);
					win[14][12] = 1;
				}
				loc_N1.setBounds(420, 567, 29, 29);
				Main.Check.check(win, 14, 12);
				Main.position[2] = 14;
				Main.position[3] = 12;
				Main.put = 1;
			}
		}
		else if (X <= 470 + 8 && X >= 470 - 9 && Main.put == 0)
		{
			if (Y <= 225 + 9 && Y >= 225 - 9 && win[0][13] == -1)
			{
				if (player == 0)
				{
					loc_O15.setIcon(blackMiddleUp);
					win[0][13] = 0;
				}
				else
				{
					loc_O15.setIcon(whiteMiddleUp);
					win[0][13] = 1;
				}
				loc_O15.setBounds(447, 173, 29, 29);
				Main.Check.check(win, 0, 13);
				Main.position[2] = 0;
				Main.position[3] = 13;
				Main.put = 1;
			}
			else if (Y <= 253 + 9 && Y >= 253 - 9 && win[1][13] == -1)
			{
				if (player == 0)
				{
					loc_O14.setIcon(black);
					win[1][13] = 0;
				}
				else
				{
					loc_O14.setIcon(white);
					win[1][13] = 1;
				}
				loc_O14.setBounds(447, 202, 29, 29);
				Main.Check.check(win, 1, 13);
				Main.position[2] = 1;
				Main.position[3] = 13;
				Main.put = 1;
			}
			else if (Y <= 281 + 9 && Y >= 281 - 9 && win[2][13] == -1)
			{
				if (player == 0)
				{
					loc_O13.setIcon(black);
					win[2][13] = 0;
				}
				else
				{
					loc_O13.setIcon(white);
					win[2][13] = 1;
				}
				loc_O13.setBounds(447, 230, 29, 29);
				Main.Check.check(win, 2, 13);
				Main.position[2] = 2;
				Main.position[3] = 13;
				Main.put = 1;
			}
			else if (Y <= 310 + 9 && Y >= 310 - 9 && win[3][13] == -1)
			{
				if (player == 0)
				{
					loc_O12.setIcon(black);
					win[3][13] = 0;
				}
				else
				{
					loc_O12.setIcon(white);
					win[3][13] = 1;
				}
				loc_O12.setBounds(447, 258, 29, 29);
				Main.Check.check(win, 3, 13);
				Main.position[2] = 3;
				Main.position[3] = 13;
				Main.put = 1;
			}
			else if (Y <= 337 + 9 && Y >= 337 - 9 && win[4][13] == -1)
			{
				if (player == 0)
				{
					loc_O11.setIcon(black);
					win[4][13] = 0;
				}
				else
				{
					loc_O11.setIcon(white);
					win[4][13] = 1;
				}
				loc_O11.setBounds(447, 286, 29, 29);
				Main.Check.check(win, 4, 13);
				Main.position[2] = 4;
				Main.position[3] = 13;
				Main.put = 1;
			}
			else if (Y <= 367 + 9 && Y >= 367 - 9 && win[5][13] == -1)
			{
				if (player == 0)
				{
					loc_O10.setIcon(black);
					win[5][13] = 0;
				}
				else
				{
					loc_O10.setIcon(white);
					win[5][13] = 1;
				}
				loc_O10.setBounds(447, 314, 29, 29);
				Main.Check.check(win, 5, 13);
				Main.position[2] = 5;
				Main.position[3] = 13;
				Main.put = 1;
			}
			else if (Y <= 394 + 9 && Y >= 394 - 9 && win[6][13] == -1)
			{
				if (player == 0)
				{
					loc_O9.setIcon(black);
					win[6][13] = 0;
				}
				else
				{
					loc_O9.setIcon(white);
					win[6][13] = 1;
				}
				loc_O9.setBounds(447, 342, 29, 29);
				Main.Check.check(win, 6, 13);
				Main.position[2] = 6;
				Main.position[3] = 13;
				Main.put = 1;
			}
			else if (Y <= 422 + 9 && Y >= 422 - 9 && win[7][13] == -1)
			{
				if (player == 0)
				{
					loc_O8.setIcon(black);
					win[7][13] = 0;
				}
				else
				{
					loc_O8.setIcon(white);
					win[7][13] = 1;
				}
				loc_O8.setBounds(447, 370, 29, 29);
				Main.Check.check(win, 7, 13);
				Main.position[2] = 7;
				Main.position[3] = 13;
				Main.put = 1;
			}
			else if (Y <= 450 + 9 && Y >= 450 - 9 && win[8][13] == -1)
			{
				if (player == 0)
				{
					loc_O7.setIcon(black);
					win[8][13] = 0;
				}
				else
				{
					loc_O7.setIcon(white);
					win[8][13] = 1;
				}
				loc_O7.setBounds(447, 398, 29, 29);
				Main.Check.check(win, 8, 13);
				Main.position[2] = 8;
				Main.position[3] = 13;
				Main.put = 1;
			}
			else if (Y <= 477 + 9 && Y >= 477 - 9 && win[9][13] == -1)
			{
				if (player == 0)
				{
					loc_O6.setIcon(black);
					win[9][13] = 0;
				}
				else
				{
					loc_O6.setIcon(white);
					win[9][13] = 1;
				}
				loc_O6.setBounds(447, 426, 29, 29);
				Main.Check.check(win, 9, 13);
				Main.position[2] = 9;
				Main.position[3] = 13;
				Main.put = 1;
			}
			else if (Y <= 505 + 9 && Y >= 505 - 9 && win[10][13] == -1)
			{
				if (player == 0)
				{
					loc_O5.setIcon(black);
					win[10][13] = 0;
				}
				else
				{
					loc_O5.setIcon(white);
					win[10][13] = 1;
				}
				loc_O5.setBounds(447, 454, 29, 29);
				Main.Check.check(win, 10, 13);
				Main.position[2] = 10;
				Main.position[3] = 13;
				Main.put = 1;
			}
			else if (Y <= 533 + 9 && Y >= 533 - 9 && win[11][13] == -1)
			{
				if (player == 0)
				{
					loc_O4.setIcon(black);
					win[11][13] = 0;
				}
				else
				{
					loc_O4.setIcon(white);
					win[11][13] = 1;
				}
				loc_O4.setBounds(447, 482, 29, 29);
				Main.Check.check(win, 11, 13);
				Main.position[2] = 11;
				Main.position[3] = 13;
				Main.put = 1;
			}
			else if (Y <= 562 + 9 && Y >= 562 - 9 && win[12][13] == -1)
			{
				if (player == 0)
				{
					loc_O3.setIcon(black);
					win[12][13] = 0;
				}
				else
				{
					loc_O3.setIcon(white);
					win[12][13] = 1;
				}
				loc_O3.setBounds(447, 510, 29, 29);
				Main.Check.check(win, 12, 13);
				Main.position[2] = 12;
				Main.position[3] = 13;
				Main.put = 1;
			}
			else if (Y <= 589 + 9 && Y >= 589 - 9 && win[13][13] == -1)
			{
				if (player == 0)
				{
					loc_O2.setIcon(black);
					win[13][13] = 0;
				}
				else
				{
					loc_O2.setIcon(white);
					win[13][13] = 1;
				}
				loc_O2.setBounds(447, 538, 29, 29);
				Main.Check.check(win, 13, 13);
				Main.position[2] = 13;
				Main.position[3] = 13;
				Main.put = 1;
			}
			else if (Y <= 618 + 9 && Y >= 618 - 9 && win[14][13] == -1)
			{
				if (player == 0)
				{
					loc_O1.setIcon(blackMiddleDown);
					win[14][13] = 0;
				}
				else
				{
					loc_O1.setIcon(whiteMiddleDown);
					win[14][13] = 1;
				}
				loc_O1.setBounds(447, 567, 29, 29);
				Main.Check.check(win, 14, 13);
				Main.position[2] = 14;
				Main.position[3] = 13;
				Main.put = 1;
			}
		}
		else if (X <= 496 + 8 && X >= 496 - 9 && Main.put == 0)
		{
			if (Y <= 225 + 9 && Y >= 225 - 9 && win[0][14] == -1)
			{
				if (player == 0)
				{
					loc_P15.setIcon(blackRightUp);
					win[0][14] = 0;
				}
				else
				{
					loc_P15.setIcon(whiteRightUp);
					win[0][14] = 1;
				}
				loc_P15.setBounds(474, 173, 29, 29);
				Main.Check.check(win, 0, 14);
				Main.position[2] = 0;
				Main.position[3] = 14;
				Main.put = 1;
			}
			else if (Y <= 253 + 9 && Y >= 253 - 9 && win[1][14] == -1)
			{
				if (player == 0)
				{
					loc_P14.setIcon(blackMiddleRight);
					win[1][14] = 0;
				}
				else
				{
					loc_P14.setIcon(whiteMiddleRight);
					win[1][14] = 1;
				}
				loc_P14.setBounds(474, 202, 29, 29);
				Main.Check.check(win, 1, 14);
				Main.position[2] = 1;
				Main.position[3] = 14;
				Main.put = 1;
			}
			else if (Y <= 281 + 9 && Y >= 281 - 9 && win[2][14] == -1)
			{
				if (player == 0)
				{
					loc_P13.setIcon(blackMiddleRight);
					win[2][14] = 0;
				}
				else
				{
					loc_P13.setIcon(whiteMiddleRight);
					win[2][14] = 1;
				}
				loc_P13.setBounds(474, 230, 29, 29);
				Main.Check.check(win, 2, 14);
				Main.position[2] = 2;
				Main.position[3] = 14;
				Main.put = 1;
			}
			else if (Y <= 310 + 9 && Y >= 310 - 9 && win[3][14] == -1)
			{
				if (player == 0)
				{
					loc_P12.setIcon(blackMiddleRight);
					win[3][14] = 0;
				}
				else
				{
					loc_P12.setIcon(whiteMiddleRight);
					win[3][14] = 1;
				}
				loc_P12.setBounds(474, 258, 29, 29);
				Main.Check.check(win, 3, 14);
				Main.position[2] = 3;
				Main.position[3] = 14;
				Main.put = 1;
			}
			else if (Y <= 337 + 9 && Y >= 337 - 9 && win[4][14] == -1)
			{
				if (player == 0)
				{
					loc_P11.setIcon(blackMiddleRight);
					win[4][14] = 0;
				}
				else
				{
					loc_P11.setIcon(whiteMiddleRight);
					win[4][14] = 1;
				}
				loc_P11.setBounds(474, 286, 29, 29);
				Main.Check.check(win, 4, 14);
				Main.position[2] = 4;
				Main.position[3] = 14;
				Main.put = 1;
			}
			else if (Y <= 367 + 9 && Y >= 367 - 9 && win[5][14] == -1)
			{
				if (player == 0)
				{
					loc_P10.setIcon(blackMiddleRight);
					win[5][14] = 0;
				}
				else
				{
					loc_P10.setIcon(whiteMiddleRight);
					win[5][14] = 1;
				}
				loc_P10.setBounds(474, 314, 29, 29);
				Main.Check.check(win, 5, 14);
				Main.position[2] = 5;
				Main.position[3] = 14;
				Main.put = 1;
			}
			else if (Y <= 394 + 9 && Y >= 394 - 9 && win[6][14] == -1)
			{
				if (player == 0)
				{
					loc_P9.setIcon(blackMiddleRight);
					win[6][14] = 0;
				}
				else
				{
					loc_P9.setIcon(whiteMiddleRight);
					win[6][14] = 1;
				}
				loc_P9.setBounds(474, 342, 29, 29);
				Main.Check.check(win, 6, 14);
				Main.position[2] = 6;
				Main.position[3] = 14;
				Main.put = 1;
			}
			else if (Y <= 422 + 9 && Y >= 422 - 9 && win[7][14] == -1)
			{
				if (player == 0)
				{
					loc_P8.setIcon(blackMiddleRight);
					win[7][14] = 0;
				}
				else
				{
					loc_P8.setIcon(whiteMiddleRight);
					win[7][14] = 1;
				}
				loc_P8.setBounds(474, 370, 29, 29);
				Main.Check.check(win, 7, 14);
				Main.position[2] = 7;
				Main.position[3] = 14;
				Main.put = 1;
			}
			else if (Y <= 450 + 9 && Y >= 450 - 9 && win[8][14] == -1)
			{
				if (player == 0)
				{
					loc_P7.setIcon(blackMiddleRight);
					win[8][14] = 0;
				}
				else
				{
					loc_P7.setIcon(whiteMiddleRight);
					win[8][14] = 1;
				}
				loc_P7.setBounds(474, 398, 29, 29);
				Main.Check.check(win, 8, 14);
				Main.position[2] = 8;
				Main.position[3] = 14;
				Main.put = 1;
			}
			else if (Y <= 477 + 9 && Y >= 477 - 9 && win[9][14] == -1)
			{
				if (player == 0)
				{
					loc_P6.setIcon(blackMiddleRight);
					win[9][14] = 0;
				}
				else
				{
					loc_P6.setIcon(whiteMiddleRight);
					win[9][14] = 1;
				}
				loc_P6.setBounds(474, 426, 29, 29);
				Main.Check.check(win, 9, 14);
				Main.position[2] = 9;
				Main.position[3] = 14;
				Main.put = 1;
			}
			else if (Y <= 505 + 9 && Y >= 505 - 9 && win[10][14] == -1)
			{
				if (player == 0)
				{
					loc_P5.setIcon(blackMiddleRight);
					win[10][14] = 0;
				}
				else
				{
					loc_P5.setIcon(whiteMiddleRight);
					win[10][14] = 1;
				}
				loc_P5.setBounds(474, 454, 29, 29);
				Main.Check.check(win, 10, 14);
				Main.position[2] = 10;
				Main.position[3] = 14;
				Main.put = 1;
			}
			else if (Y <= 533 + 9 && Y >= 533 - 9 && win[11][14] == -1)
			{
				if (player == 0)
				{
					loc_P4.setIcon(blackMiddleRight);
					win[11][14] = 0;
				}
				else
				{
					loc_P4.setIcon(whiteMiddleRight);
					win[11][14] = 1;
				}
				loc_P4.setBounds(474, 482, 29, 29);
				Main.Check.check(win, 11, 14);
				Main.position[2] = 11;
				Main.position[3] = 14;
				Main.put = 1;
			}
			else if (Y <= 562 + 9 && Y >= 562 - 9 && win[12][14] == -1)
			{
				if (player == 0)
				{
					loc_P3.setIcon(blackMiddleRight);
					win[12][14] = 0;
				}
				else
				{
					loc_P3.setIcon(whiteMiddleRight);
					win[12][14] = 1;
				}
				loc_P3.setBounds(474, 510, 29, 29);
				Main.Check.check(win, 12, 14);
				Main.position[2] = 12;
				Main.position[3] = 14;
				Main.put = 1;
			}
			else if (Y <= 589 + 9 && Y >= 589 - 9 && win[13][14] == -1)
			{
				if (player == 0)
				{
					loc_P2.setIcon(blackMiddleRight);
					win[13][14] = 0;
				}
				else
				{
					loc_P2.setIcon(whiteMiddleRight);
					win[13][14] = 1;
				}
				loc_P2.setBounds(474, 538, 29, 29);
				Main.Check.check(win, 13, 14);
				Main.position[2] = 13;
				Main.position[3] = 14;
				Main.put = 1;
			}
			else if (Y <= 618 + 9 && Y >= 618 - 9 && win[14][14] == -1)
			{
				if (player == 0)
				{
					loc_P1.setIcon(blackRightDown);
					win[14][14] = 0;
				}
				else
				{
					loc_P1.setIcon(whiteRightDown);
					win[14][14] = 1;
				}
				loc_P1.setBounds(474, 567, 29, 29);
				Main.Check.check(win, 14, 14);
				Main.position[2] = 14;
				Main.position[3] = 14;
				Main.put = 1;
			}
		}
		
		place();
		
		return win;
	}
}
