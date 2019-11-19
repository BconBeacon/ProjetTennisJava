package biscontiflavian.gsm.JFrames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class JFSimple extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFSimple frame = new JFSimple();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFSimple() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 999, 705);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_menu = new JPanel();
		panel_menu.setBounds(10, 11, 975, 43);
		contentPane.add(panel_menu);
		panel_menu.setLayout(null);
		
		JButton btn_retour = new JButton("Retour");
		btn_retour.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btn_retour.setBounds(10, 11, 77, 23);
		panel_menu.add(btn_retour);
		
		JMenu mnToursliminatoires = new JMenu("Tours \u00E9liminatoires 1");
		mnToursliminatoires.setBounds(233, 11, 200, 26);
		panel_menu.add(mnToursliminatoires);
		
		JMenuItem menu_t1_p1 = new JMenuItem("Matchs 01 - 16");
		mnToursliminatoires.add(menu_t1_p1);
		
		JMenuItem menu_t1_p2 = new JMenuItem("Matchs 17 - 32");
		mnToursliminatoires.add(menu_t1_p2);
		
		JMenuItem menu_t1_p3 = new JMenuItem("Matchs 33 - 48");
		mnToursliminatoires.add(menu_t1_p3);
		
		JMenuItem menu_t1_p4 = new JMenuItem("Matchs 49 - 64");
		mnToursliminatoires.add(menu_t1_p4);
		
		JMenu mnToursliminatoires_1 = new JMenu("Tours \u00E9liminatoires 2");
		mnToursliminatoires_1.setBounds(443, 11, 200, 26);
		panel_menu.add(mnToursliminatoires_1);
		
		JMenuItem menu_t2_p1 = new JMenuItem("Matchs 65 - 80");
		mnToursliminatoires_1.add(menu_t2_p1);
		
		JMenuItem menu_t2_p2 = new JMenuItem("Matchs 81 - 96");
		mnToursliminatoires_1.add(menu_t2_p2);
		
		JMenu menu_finale = new JMenu("Tours finaux");
		menu_finale.setBounds(653, 11, 155, 26);
		panel_menu.add(menu_finale);
		
		JMenuItem menu_finale16 = new JMenuItem("16/Finale");
		menu_finale.add(menu_finale16);
		
		JMenuItem menu_finale8 = new JMenuItem("8/Finale - Finale");
		menu_finale.add(menu_finale8);
		
		JPanel panel_tour = new JPanel();
		panel_tour.setBounds(10, 65, 975, 776);
		contentPane.add(panel_tour);
		panel_tour.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(24, 11, 228, 139);
		panel_tour.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbl_m1_j1 = new JLabel("Nom Joueur 1");
		lbl_m1_j1.setBounds(10, 39, 100, 14);
		panel_1.add(lbl_m1_j1);
		
		JLabel lbl_m1_s1 = new JLabel("Score Joueur 1");
		lbl_m1_s1.setBounds(120, 39, 100, 14);
		panel_1.add(lbl_m1_s1);
		
		JLabel lbl_m1_s2 = new JLabel("Score Joueur 2");
		lbl_m1_s2.setBounds(120, 64, 100, 14);
		panel_1.add(lbl_m1_s2);
		
		JLabel lbl_m1_j2 = new JLabel("Nom Joueur 2");
		lbl_m1_j2.setBounds(10, 64, 100, 14);
		panel_1.add(lbl_m1_j2);
		
		JLabel lbl_c1 = new JLabel("N\u00B0 du cour");
		lbl_c1.setBounds(10, 89, 100, 14);
		panel_1.add(lbl_c1);
		
		JLabel lbl_d1 = new JLabel("Date du match");
		lbl_d1.setBounds(10, 114, 100, 14);
		panel_1.add(lbl_d1);
		
		JLabel lbl_a1 = new JLabel("Nom de l'Arbitre");
		lbl_a1.setBounds(120, 89, 100, 14);
		panel_1.add(lbl_a1);
		
		JLabel lbl_h1 = new JLabel("Heure du match");
		lbl_h1.setBounds(120, 114, 100, 14);
		panel_1.add(lbl_h1);
		
		JLabel lbl_m1 = new JLabel("N\u00B0 match");
		lbl_m1.setBounds(85, 11, 48, 14);
		panel_1.add(lbl_m1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(262, 11, 228, 139);
		panel_tour.add(panel_2);
		
		JLabel lbl_m2_j1 = new JLabel("Nom Joueur 1");
		lbl_m2_j1.setBounds(10, 39, 100, 14);
		panel_2.add(lbl_m2_j1);
		
		JLabel lbl_m2_s1 = new JLabel("Score Joueur 1");
		lbl_m2_s1.setBounds(120, 39, 100, 14);
		panel_2.add(lbl_m2_s1);
		
		JLabel lbl_m2_s2 = new JLabel("Score Joueur 2");
		lbl_m2_s2.setBounds(120, 64, 100, 14);
		panel_2.add(lbl_m2_s2);
		
		JLabel lbl_m2_j2 = new JLabel("Nom Joueur 2");
		lbl_m2_j2.setBounds(10, 64, 100, 14);
		panel_2.add(lbl_m2_j2);
		
		JLabel lbl_c2 = new JLabel("N\u00B0 du cour");
		lbl_c2.setBounds(10, 89, 100, 14);
		panel_2.add(lbl_c2);
		
		JLabel lbl_d2 = new JLabel("Date du match");
		lbl_d2.setBounds(10, 114, 100, 14);
		panel_2.add(lbl_d2);
		
		JLabel lbl_a2 = new JLabel("Nom de l'Arbitre");
		lbl_a2.setBounds(120, 89, 100, 14);
		panel_2.add(lbl_a2);
		
		JLabel lbl_h2 = new JLabel("Heure du match");
		lbl_h2.setBounds(120, 114, 100, 14);
		panel_2.add(lbl_h2);
		
		JLabel lbl_m2 = new JLabel("N\u00B0 match");
		lbl_m2.setBounds(85, 11, 48, 14);
		panel_2.add(lbl_m2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(500, 11, 228, 139);
		panel_tour.add(panel_3);
		
		JLabel lbl_m3_j1 = new JLabel("Nom Joueur 1");
		lbl_m3_j1.setBounds(10, 39, 100, 14);
		panel_3.add(lbl_m3_j1);
		
		JLabel lbl_m3_s1 = new JLabel("Score Joueur 1");
		lbl_m3_s1.setBounds(120, 39, 100, 14);
		panel_3.add(lbl_m3_s1);
		
		JLabel lbl_m3_s2 = new JLabel("Score Joueur 2");
		lbl_m3_s2.setBounds(120, 64, 100, 14);
		panel_3.add(lbl_m3_s2);
		
		JLabel lbl_m3_j2 = new JLabel("Nom Joueur 2");
		lbl_m3_j2.setBounds(10, 64, 100, 14);
		panel_3.add(lbl_m3_j2);
		
		JLabel lbl_c3 = new JLabel("N\u00B0 du cour");
		lbl_c3.setBounds(10, 89, 100, 14);
		panel_3.add(lbl_c3);
		
		JLabel lbl_d3 = new JLabel("Date du match");
		lbl_d3.setBounds(10, 114, 100, 14);
		panel_3.add(lbl_d3);
		
		JLabel lbl_a3 = new JLabel("Nom de l'Arbitre");
		lbl_a3.setBounds(120, 89, 100, 14);
		panel_3.add(lbl_a3);
		
		JLabel lbl_h3 = new JLabel("Heure du match");
		lbl_h3.setBounds(120, 114, 100, 14);
		panel_3.add(lbl_h3);
		
		JLabel lbl_m3 = new JLabel("N\u00B0 match");
		lbl_m3.setBounds(85, 11, 48, 14);
		panel_3.add(lbl_m3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(738, 11, 228, 139);
		panel_tour.add(panel_4);
		
		JLabel lbl_m4_j1 = new JLabel("Nom Joueur 1");
		lbl_m4_j1.setBounds(10, 39, 100, 14);
		panel_4.add(lbl_m4_j1);
		
		JLabel lbl_m4_s1 = new JLabel("Score Joueur 1");
		lbl_m4_s1.setBounds(120, 39, 100, 14);
		panel_4.add(lbl_m4_s1);
		
		JLabel lbl_m4_s2 = new JLabel("Score Joueur 2");
		lbl_m4_s2.setBounds(120, 64, 100, 14);
		panel_4.add(lbl_m4_s2);
		
		JLabel lbl_m4_j2 = new JLabel("Nom Joueur 2");
		lbl_m4_j2.setBounds(10, 64, 100, 14);
		panel_4.add(lbl_m4_j2);
		
		JLabel lbl_c4 = new JLabel("N\u00B0 du cour");
		lbl_c4.setBounds(10, 89, 100, 14);
		panel_4.add(lbl_c4);
		
		JLabel lbl_d4 = new JLabel("Date du match");
		lbl_d4.setBounds(10, 114, 100, 14);
		panel_4.add(lbl_d4);
		
		JLabel lbl_a4 = new JLabel("Nom de l'Arbitre");
		lbl_a4.setBounds(120, 89, 100, 14);
		panel_4.add(lbl_a4);
		
		JLabel lbl_h4 = new JLabel("Heure du match");
		lbl_h4.setBounds(120, 114, 100, 14);
		panel_4.add(lbl_h4);
		
		JLabel lbl_m4 = new JLabel("N\u00B0 match");
		lbl_m4.setBounds(85, 11, 48, 14);
		panel_4.add(lbl_m4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(24, 161, 228, 139);
		panel_tour.add(panel_5);
		
		JLabel lbl_m5_j1 = new JLabel("Nom Joueur 1");
		lbl_m5_j1.setBounds(10, 39, 100, 14);
		panel_5.add(lbl_m5_j1);
		
		JLabel lbl_m5_s1 = new JLabel("Score Joueur 1");
		lbl_m5_s1.setBounds(120, 39, 100, 14);
		panel_5.add(lbl_m5_s1);
		
		JLabel lbl_m5_s2 = new JLabel("Score Joueur 2");
		lbl_m5_s2.setBounds(120, 64, 100, 14);
		panel_5.add(lbl_m5_s2);
		
		JLabel lbl_m5_j2 = new JLabel("Nom Joueur 2");
		lbl_m5_j2.setBounds(10, 64, 100, 14);
		panel_5.add(lbl_m5_j2);
		
		JLabel lbl_c5 = new JLabel("N\u00B0 du cour");
		lbl_c5.setBounds(10, 89, 100, 14);
		panel_5.add(lbl_c5);
		
		JLabel lbl_d5 = new JLabel("Date du match");
		lbl_d5.setBounds(10, 114, 100, 14);
		panel_5.add(lbl_d5);
		
		JLabel lbl_a5 = new JLabel("Nom de l'Arbitre");
		lbl_a5.setBounds(120, 89, 100, 14);
		panel_5.add(lbl_a5);
		
		JLabel lbl_h5 = new JLabel("Heure du match");
		lbl_h5.setBounds(120, 114, 100, 14);
		panel_5.add(lbl_h5);
		
		JLabel lbl_m5 = new JLabel("N\u00B0 match");
		lbl_m5.setBounds(85, 11, 48, 14);
		panel_5.add(lbl_m5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBounds(262, 161, 228, 139);
		panel_tour.add(panel_6);
		
		JLabel lbl_m6_j1 = new JLabel("Nom Joueur 1");
		lbl_m6_j1.setBounds(10, 39, 100, 14);
		panel_6.add(lbl_m6_j1);
		
		JLabel lbl_m6_s1 = new JLabel("Score Joueur 1");
		lbl_m6_s1.setBounds(120, 39, 100, 14);
		panel_6.add(lbl_m6_s1);
		
		JLabel lbl_m6_s2 = new JLabel("Score Joueur 2");
		lbl_m6_s2.setBounds(120, 64, 100, 14);
		panel_6.add(lbl_m6_s2);
		
		JLabel lbl_m6_j2 = new JLabel("Nom Joueur 2");
		lbl_m6_j2.setBounds(10, 64, 100, 14);
		panel_6.add(lbl_m6_j2);
		
		JLabel lbl_c6 = new JLabel("N\u00B0 du cour");
		lbl_c6.setBounds(10, 89, 100, 14);
		panel_6.add(lbl_c6);
		
		JLabel lbl_d6 = new JLabel("Date du match");
		lbl_d6.setBounds(10, 114, 100, 14);
		panel_6.add(lbl_d6);
		
		JLabel lbl_a6 = new JLabel("Nom de l'Arbitre");
		lbl_a6.setBounds(120, 89, 100, 14);
		panel_6.add(lbl_a6);
		
		JLabel lbl_h6 = new JLabel("Heure du match");
		lbl_h6.setBounds(120, 114, 100, 14);
		panel_6.add(lbl_h6);
		
		JLabel lbl_m6 = new JLabel("N\u00B0 match");
		lbl_m6.setBounds(85, 11, 48, 14);
		panel_6.add(lbl_m6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBounds(500, 161, 228, 139);
		panel_tour.add(panel_7);
		
		JLabel lbl_m7_j1 = new JLabel("Nom Joueur 1");
		lbl_m7_j1.setBounds(10, 39, 100, 14);
		panel_7.add(lbl_m7_j1);
		
		JLabel lbl_m7_s1 = new JLabel("Score Joueur 1");
		lbl_m7_s1.setBounds(120, 39, 100, 14);
		panel_7.add(lbl_m7_s1);
		
		JLabel lbl_m7_s2 = new JLabel("Score Joueur 2");
		lbl_m7_s2.setBounds(120, 64, 100, 14);
		panel_7.add(lbl_m7_s2);
		
		JLabel lbl_m7_j2 = new JLabel("Nom Joueur 2");
		lbl_m7_j2.setBounds(10, 64, 100, 14);
		panel_7.add(lbl_m7_j2);
		
		JLabel lbl_c7 = new JLabel("N\u00B0 du cour");
		lbl_c7.setBounds(10, 89, 100, 14);
		panel_7.add(lbl_c7);
		
		JLabel lbl_d7 = new JLabel("Date du match");
		lbl_d7.setBounds(10, 114, 100, 14);
		panel_7.add(lbl_d7);
		
		JLabel lbl_a7 = new JLabel("Nom de l'Arbitre");
		lbl_a7.setBounds(120, 89, 100, 14);
		panel_7.add(lbl_a7);
		
		JLabel lbl_h7 = new JLabel("Heure du match");
		lbl_h7.setBounds(120, 114, 100, 14);
		panel_7.add(lbl_h7);
		
		JLabel lbl_m7 = new JLabel("N\u00B0 match");
		lbl_m7.setBounds(85, 11, 48, 14);
		panel_7.add(lbl_m7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBounds(738, 161, 228, 139);
		panel_tour.add(panel_8);
		
		JLabel lbl_m8_j1 = new JLabel("Nom Joueur 1");
		lbl_m8_j1.setBounds(10, 39, 100, 14);
		panel_8.add(lbl_m8_j1);
		
		JLabel lbl_m8_s1 = new JLabel("Score Joueur 1");
		lbl_m8_s1.setBounds(120, 39, 100, 14);
		panel_8.add(lbl_m8_s1);
		
		JLabel lbl_m8_s2 = new JLabel("Score Joueur 2");
		lbl_m8_s2.setBounds(120, 64, 100, 14);
		panel_8.add(lbl_m8_s2);
		
		JLabel lbl_m8_j2 = new JLabel("Nom Joueur 2");
		lbl_m8_j2.setBounds(10, 64, 100, 14);
		panel_8.add(lbl_m8_j2);
		
		JLabel lbl_c8 = new JLabel("N\u00B0 du cour");
		lbl_c8.setBounds(10, 89, 100, 14);
		panel_8.add(lbl_c8);
		
		JLabel lbl_d8 = new JLabel("Date du match");
		lbl_d8.setBounds(10, 114, 100, 14);
		panel_8.add(lbl_d8);
		
		JLabel lbl_a8 = new JLabel("Nom de l'Arbitre");
		lbl_a8.setBounds(120, 89, 100, 14);
		panel_8.add(lbl_a8);
		
		JLabel lbl_h8 = new JLabel("Heure du match");
		lbl_h8.setBounds(120, 114, 100, 14);
		panel_8.add(lbl_h8);
		
		JLabel lbl_m8 = new JLabel("N\u00B0 match");
		lbl_m8.setBounds(85, 11, 48, 14);
		panel_8.add(lbl_m8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBounds(24, 461, 228, 139);
		panel_tour.add(panel_9);
		
		JLabel lbl_m13_j1 = new JLabel("Nom Joueur 1");
		lbl_m13_j1.setBounds(10, 39, 100, 14);
		panel_9.add(lbl_m13_j1);
		
		JLabel lbl_m13_s1 = new JLabel("Score Joueur 1");
		lbl_m13_s1.setBounds(120, 39, 100, 14);
		panel_9.add(lbl_m13_s1);
		
		JLabel lbl_m13_s2 = new JLabel("Score Joueur 2");
		lbl_m13_s2.setBounds(120, 64, 100, 14);
		panel_9.add(lbl_m13_s2);
		
		JLabel lbl_m13_j2 = new JLabel("Nom Joueur 2");
		lbl_m13_j2.setBounds(10, 64, 100, 14);
		panel_9.add(lbl_m13_j2);
		
		JLabel lbl_c13 = new JLabel("N\u00B0 du cour");
		lbl_c13.setBounds(10, 89, 100, 14);
		panel_9.add(lbl_c13);
		
		JLabel lbl_d13 = new JLabel("Date du match");
		lbl_d13.setBounds(10, 114, 100, 14);
		panel_9.add(lbl_d13);
		
		JLabel lbl_a13 = new JLabel("Nom de l'Arbitre");
		lbl_a13.setBounds(120, 89, 100, 14);
		panel_9.add(lbl_a13);
		
		JLabel lbl_h13 = new JLabel("Heure du match");
		lbl_h13.setBounds(120, 114, 100, 14);
		panel_9.add(lbl_h13);
		
		JLabel lbl_m13 = new JLabel("N\u00B0 match");
		lbl_m13.setBounds(85, 11, 48, 14);
		panel_9.add(lbl_m13);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBounds(262, 461, 228, 139);
		panel_tour.add(panel_10);
		
		JLabel lbl_m14_j1 = new JLabel("Nom Joueur 1");
		lbl_m14_j1.setBounds(10, 39, 100, 14);
		panel_10.add(lbl_m14_j1);
		
		JLabel lbl_m14_s1 = new JLabel("Score Joueur 1");
		lbl_m14_s1.setBounds(120, 39, 100, 14);
		panel_10.add(lbl_m14_s1);
		
		JLabel lbl_m14_s2 = new JLabel("Score Joueur 2");
		lbl_m14_s2.setBounds(120, 64, 100, 14);
		panel_10.add(lbl_m14_s2);
		
		JLabel lbl_m14_j2 = new JLabel("Nom Joueur 2");
		lbl_m14_j2.setBounds(10, 64, 100, 14);
		panel_10.add(lbl_m14_j2);
		
		JLabel lbl_c14 = new JLabel("N\u00B0 du cour");
		lbl_c14.setBounds(10, 89, 100, 14);
		panel_10.add(lbl_c14);
		
		JLabel lbl_d14 = new JLabel("Date du match");
		lbl_d14.setBounds(10, 114, 100, 14);
		panel_10.add(lbl_d14);
		
		JLabel lbl_a14 = new JLabel("Nom de l'Arbitre");
		lbl_a14.setBounds(120, 89, 100, 14);
		panel_10.add(lbl_a14);
		
		JLabel lbl_h14 = new JLabel("Heure du match");
		lbl_h14.setBounds(120, 114, 100, 14);
		panel_10.add(lbl_h14);
		
		JLabel lbl_m14 = new JLabel("N\u00B0 match");
		lbl_m14.setBounds(85, 11, 48, 14);
		panel_10.add(lbl_m14);
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBounds(500, 461, 228, 139);
		panel_tour.add(panel_11);
		
		JLabel lbl_m15_j1 = new JLabel("Nom Joueur 1");
		lbl_m15_j1.setBounds(10, 39, 100, 14);
		panel_11.add(lbl_m15_j1);
		
		JLabel lbl_m15_s1 = new JLabel("Score Joueur 1");
		lbl_m15_s1.setBounds(120, 39, 100, 14);
		panel_11.add(lbl_m15_s1);
		
		JLabel lbl_m15_s2 = new JLabel("Score Joueur 2");
		lbl_m15_s2.setBounds(120, 64, 100, 14);
		panel_11.add(lbl_m15_s2);
		
		JLabel lbl_m15_j2 = new JLabel("Nom Joueur 2");
		lbl_m15_j2.setBounds(10, 64, 100, 14);
		panel_11.add(lbl_m15_j2);
		
		JLabel lbl_c15 = new JLabel("N\u00B0 du cour");
		lbl_c15.setBounds(10, 89, 100, 14);
		panel_11.add(lbl_c15);
		
		JLabel lbl_d15 = new JLabel("Date du match");
		lbl_d15.setBounds(10, 114, 100, 14);
		panel_11.add(lbl_d15);
		
		JLabel lbl_a15 = new JLabel("Nom de l'Arbitre");
		lbl_a15.setBounds(120, 89, 100, 14);
		panel_11.add(lbl_a15);
		
		JLabel lbl_h15 = new JLabel("Heure du match");
		lbl_h15.setBounds(120, 114, 100, 14);
		panel_11.add(lbl_h15);
		
		JLabel lbl_m15 = new JLabel("N\u00B0 match");
		lbl_m15.setBounds(85, 11, 48, 14);
		panel_11.add(lbl_m15);
		
		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBounds(738, 461, 228, 139);
		panel_tour.add(panel_12);
		
		JLabel lbl_m16_j1 = new JLabel("Nom Joueur 1");
		lbl_m16_j1.setBounds(10, 39, 100, 14);
		panel_12.add(lbl_m16_j1);
		
		JLabel lbl_m16_s1 = new JLabel("Score Joueur 1");
		lbl_m16_s1.setBounds(120, 39, 100, 14);
		panel_12.add(lbl_m16_s1);
		
		JLabel lbl_m16_s2 = new JLabel("Score Joueur 2");
		lbl_m16_s2.setBounds(120, 64, 100, 14);
		panel_12.add(lbl_m16_s2);
		
		JLabel lbl_m16_j2 = new JLabel("Nom Joueur 2");
		lbl_m16_j2.setBounds(10, 64, 100, 14);
		panel_12.add(lbl_m16_j2);
		
		JLabel lbl_c16 = new JLabel("N\u00B0 du cour");
		lbl_c16.setBounds(10, 89, 100, 14);
		panel_12.add(lbl_c16);
		
		JLabel lbl_d16 = new JLabel("Date du match");
		lbl_d16.setBounds(10, 114, 100, 14);
		panel_12.add(lbl_d16);
		
		JLabel lbl_a16 = new JLabel("Nom de l'Arbitre");
		lbl_a16.setBounds(120, 89, 100, 14);
		panel_12.add(lbl_a16);
		
		JLabel lbl_h16 = new JLabel("Heure du match");
		lbl_h16.setBounds(120, 114, 100, 14);
		panel_12.add(lbl_h16);
		
		JLabel lbl_m16 = new JLabel("N\u00B0 match");
		lbl_m16.setBounds(85, 11, 48, 14);
		panel_12.add(lbl_m16);
		
		JPanel panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBounds(24, 311, 228, 139);
		panel_tour.add(panel_13);
		
		JLabel lbl_m9_j1 = new JLabel("Nom Joueur 1");
		lbl_m9_j1.setBounds(10, 39, 100, 14);
		panel_13.add(lbl_m9_j1);
		
		JLabel lbl_m9_s1 = new JLabel("Score Joueur 1");
		lbl_m9_s1.setBounds(120, 39, 100, 14);
		panel_13.add(lbl_m9_s1);
		
		JLabel lbl_m9_s2 = new JLabel("Score Joueur 2");
		lbl_m9_s2.setBounds(120, 64, 100, 14);
		panel_13.add(lbl_m9_s2);
		
		JLabel lbl_m9_j2 = new JLabel("Nom Joueur 2");
		lbl_m9_j2.setBounds(10, 64, 100, 14);
		panel_13.add(lbl_m9_j2);
		
		JLabel lbl_c9 = new JLabel("N\u00B0 du cour");
		lbl_c9.setBounds(10, 89, 100, 14);
		panel_13.add(lbl_c9);
		
		JLabel lbl_d9 = new JLabel("Date du match");
		lbl_d9.setBounds(10, 114, 100, 14);
		panel_13.add(lbl_d9);
		
		JLabel lbl_a9 = new JLabel("Nom de l'Arbitre");
		lbl_a9.setBounds(120, 89, 100, 14);
		panel_13.add(lbl_a9);
		
		JLabel lbl_h9 = new JLabel("Heure du match");
		lbl_h9.setBounds(120, 114, 100, 14);
		panel_13.add(lbl_h9);
		
		JLabel lbl_m9 = new JLabel("N\u00B0 match");
		lbl_m9.setBounds(85, 11, 48, 14);
		panel_13.add(lbl_m9);
		
		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBounds(262, 311, 228, 139);
		panel_tour.add(panel_14);
		
		JLabel lbl_m10_j1 = new JLabel("Nom Joueur 1");
		lbl_m10_j1.setBounds(10, 39, 100, 14);
		panel_14.add(lbl_m10_j1);
		
		JLabel lbl_m10_s1 = new JLabel("Score Joueur 1");
		lbl_m10_s1.setBounds(120, 39, 100, 14);
		panel_14.add(lbl_m10_s1);
		
		JLabel lbl_m10_s2 = new JLabel("Score Joueur 2");
		lbl_m10_s2.setBounds(120, 64, 100, 14);
		panel_14.add(lbl_m10_s2);
		
		JLabel lbl_m10_j2 = new JLabel("Nom Joueur 2");
		lbl_m10_j2.setBounds(10, 64, 100, 14);
		panel_14.add(lbl_m10_j2);
		
		JLabel lbl_c10 = new JLabel("N\u00B0 du cour");
		lbl_c10.setBounds(10, 89, 100, 14);
		panel_14.add(lbl_c10);
		
		JLabel lbl_d10 = new JLabel("Date du match");
		lbl_d10.setBounds(10, 114, 100, 14);
		panel_14.add(lbl_d10);
		
		JLabel lbl_a10 = new JLabel("Nom de l'Arbitre");
		lbl_a10.setBounds(120, 89, 100, 14);
		panel_14.add(lbl_a10);
		
		JLabel lbl_h10 = new JLabel("Heure du match");
		lbl_h10.setBounds(120, 114, 100, 14);
		panel_14.add(lbl_h10);
		
		JLabel lbl_m10 = new JLabel("N\u00B0 match");
		lbl_m10.setBounds(85, 11, 48, 14);
		panel_14.add(lbl_m10);
		
		JPanel panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBounds(500, 311, 228, 139);
		panel_tour.add(panel_15);
		
		JLabel lbl_m11_j1 = new JLabel("Nom Joueur 1");
		lbl_m11_j1.setBounds(10, 39, 100, 14);
		panel_15.add(lbl_m11_j1);
		
		JLabel lbl_m11_s1 = new JLabel("Score Joueur 1");
		lbl_m11_s1.setBounds(120, 39, 100, 14);
		panel_15.add(lbl_m11_s1);
		
		JLabel lbl_m11_s2 = new JLabel("Score Joueur 2");
		lbl_m11_s2.setBounds(120, 64, 100, 14);
		panel_15.add(lbl_m11_s2);
		
		JLabel lbl_m11_j2 = new JLabel("Nom Joueur 2");
		lbl_m11_j2.setBounds(10, 64, 100, 14);
		panel_15.add(lbl_m11_j2);
		
		JLabel lbl_c11 = new JLabel("N\u00B0 du cour");
		lbl_c11.setBounds(10, 89, 100, 14);
		panel_15.add(lbl_c11);
		
		JLabel lbl_d11 = new JLabel("Date du match");
		lbl_d11.setBounds(10, 114, 100, 14);
		panel_15.add(lbl_d11);
		
		JLabel lbl_a11 = new JLabel("Nom de l'Arbitre");
		lbl_a11.setBounds(120, 89, 100, 14);
		panel_15.add(lbl_a11);
		
		JLabel lbl_h11 = new JLabel("Heure du match");
		lbl_h11.setBounds(120, 114, 100, 14);
		panel_15.add(lbl_h11);
		
		JLabel lbl_m11 = new JLabel("N\u00B0 match");
		lbl_m11.setBounds(85, 11, 48, 14);
		panel_15.add(lbl_m11);
		
		JPanel panel_16 = new JPanel();
		panel_16.setLayout(null);
		panel_16.setBounds(738, 311, 228, 139);
		panel_tour.add(panel_16);
		
		JLabel lbl_m12_j1 = new JLabel("Nom Joueur 1");
		lbl_m12_j1.setBounds(10, 39, 100, 14);
		panel_16.add(lbl_m12_j1);
		
		JLabel lbl_m12_s1 = new JLabel("Score Joueur 1");
		lbl_m12_s1.setBounds(120, 39, 100, 14);
		panel_16.add(lbl_m12_s1);
		
		JLabel lbl_m12_s2 = new JLabel("Score Joueur 2");
		lbl_m12_s2.setBounds(120, 64, 100, 14);
		panel_16.add(lbl_m12_s2);
		
		JLabel lbl_m12_j2 = new JLabel("Nom Joueur 2");
		lbl_m12_j2.setBounds(10, 64, 100, 14);
		panel_16.add(lbl_m12_j2);
		
		JLabel lbl_c12 = new JLabel("N\u00B0 du cour");
		lbl_c12.setBounds(10, 89, 100, 14);
		panel_16.add(lbl_c12);
		
		JLabel lbl_d12 = new JLabel("Date du match");
		lbl_d12.setBounds(10, 114, 100, 14);
		panel_16.add(lbl_d12);
		
		JLabel lbl_a12 = new JLabel("Nom de l'Arbitre");
		lbl_a12.setBounds(120, 89, 100, 14);
		panel_16.add(lbl_a12);
		
		JLabel lbl_h12 = new JLabel("Heure du match");
		lbl_h12.setBounds(120, 114, 100, 14);
		panel_16.add(lbl_h12);
		
		JLabel lbl_m12 = new JLabel("N\u00B0 match");
		lbl_m12.setBounds(85, 11, 48, 14);
		panel_16.add(lbl_m12);
		
		JLabel[] t_matchs = new JLabel[]{lbl_m1,lbl_m2,lbl_m3,lbl_m4,lbl_m5,lbl_m6,lbl_m7,lbl_m8,lbl_m9,lbl_m10,lbl_m11,lbl_m12,lbl_m13,lbl_m14,lbl_m15,lbl_m16};
		JLabel[] t_joueurs1 = new JLabel[]{lbl_m1_j1,lbl_m2_j1,lbl_m3_j1,lbl_m4_j1,lbl_m5_j1,lbl_m6_j1,lbl_m7_j1,lbl_m8_j1,lbl_m9_j1,lbl_m10_j1,lbl_m11_j1,lbl_m12_j1,lbl_m13_j1,lbl_m14_j1,lbl_m15_j1,lbl_m16_j1};
		JLabel[] t_joueurs2 = new JLabel[]{lbl_m1_j2,lbl_m2_j2,lbl_m3_j2,lbl_m4_j2,lbl_m5_j2,lbl_m6_j2,lbl_m7_j2,lbl_m8_j2,lbl_m9_j2,lbl_m10_j2,lbl_m11_j2,lbl_m12_j2,lbl_m13_j2,lbl_m14_j2,lbl_m15_j2,lbl_m16_j2};
		JLabel[] t_arbitres = new JLabel[]{lbl_a1,lbl_a2,lbl_a3,lbl_a4,lbl_a5,lbl_a6,lbl_a7,lbl_a8,lbl_a9,lbl_a10,lbl_a11,lbl_a12,lbl_a13,lbl_a14,lbl_a15,lbl_a16};
		JLabel[] t_cours = new JLabel[]{lbl_c1,lbl_c2,lbl_c3,lbl_c4,lbl_c5,lbl_c6,lbl_c7,lbl_c8,lbl_c9,lbl_c10,lbl_c11,lbl_c12,lbl_c13,lbl_c14,lbl_c15,lbl_c16};
		JLabel[] t_dates = new JLabel[]{lbl_d1,lbl_d2,lbl_d3,lbl_d4,lbl_d5,lbl_d6,lbl_d7,lbl_d8,lbl_d9,lbl_d10,lbl_d11,lbl_d12,lbl_d13,lbl_d14,lbl_d15,lbl_d16};
		JLabel[] t_heures = new JLabel[]{lbl_h1,lbl_h2,lbl_h3,lbl_h4,lbl_h5,lbl_h6,lbl_h7,lbl_h8,lbl_h9,lbl_h10,lbl_h11,lbl_h12,lbl_h13,lbl_h14,lbl_h15,lbl_h16};
		JLabel[] t_score1 = new JLabel[]{lbl_m1_s1,lbl_m2_s1,lbl_m3_s1,lbl_m4_s1,lbl_m5_s1,lbl_m6_s1,lbl_m7_s1,lbl_m8_s1,lbl_m9_s1,lbl_m10_s1,lbl_m11_s1,lbl_m12_s1,lbl_m13_s1,lbl_m14_s1,lbl_m15_s1,lbl_m16_s1};
		JLabel[] t_score2 = new JLabel[]{lbl_m1_s2,lbl_m2_s2,lbl_m3_s2,lbl_m4_s2,lbl_m5_s2,lbl_m6_s2,lbl_m7_s2,lbl_m8_s2,lbl_m9_s2,lbl_m10_s2,lbl_m11_s2,lbl_m12_s2,lbl_m13_s2,lbl_m14_s2,lbl_m15_s2,lbl_m16_s2};
	}
}
