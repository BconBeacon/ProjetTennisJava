package biscontiflavian.gsm.JFrames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import biscontiflavian.gsm.ClassesPOJO.MatchPOJO;
import biscontiflavian.gsm.ClassesPOJO.OrdonnancementPOJO;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JFDouble extends JFrame {

	private static final long serialVersionUID = 8948924474706249073L;
	private JPanel contentPane;
	private static OrdonnancementPOJO ordo;
	private JPanel dernierPanel;
	private JLabel[] t_matchs;
	//Equipe 1
	private JLabel[] t_joueurs1;
	private JLabel[] t_joueurs2;
	//Equipe 2
	private JLabel[] t_joueurs3;
	private JLabel[] t_joueurs4;
	
	private JLabel[] t_arbitres;
	private JLabel[] t_cours;
	private JLabel[] t_dates;
	private JLabel[] t_heures;
	private JLabel[] t_scores1;
	private JLabel[] t_scores2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFDouble frame = new JFDouble(ordo);
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
	public JFDouble(OrdonnancementPOJO ordo) {
		//Configuration des composants graphiques******************************************************************************
		JFDouble frame = this;
		JFDouble.ordo = ordo;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1008, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_tour = new JPanel();
		panel_tour.setLayout(null);
		panel_tour.setBounds(10, 65, 975, 776);
		contentPane.add(panel_tour);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(24, 11, 228, 139);
		panel_tour.add(panel_2);
		
		JLabel lbl_m1_j1 = new JLabel("Nom Joueur 1-1");
		lbl_m1_j1.setBounds(10, 24, 100, 14);
		panel_2.add(lbl_m1_j1);
		
		JLabel lbl_m1_s1 = new JLabel("Score Joueur 1");
		lbl_m1_s1.setBounds(120, 37, 100, 14);
		panel_2.add(lbl_m1_s1);
		
		JLabel lbl_m1_s2 = new JLabel("Score Joueur 2");
		lbl_m1_s2.setBounds(120, 74, 100, 14);
		panel_2.add(lbl_m1_s2);
		
		JLabel lbl_m1_j2 = new JLabel("Nom Joueur 1-2");
		lbl_m1_j2.setBounds(10, 37, 100, 14);
		panel_2.add(lbl_m1_j2);
		
		JLabel lbl_m1_c = new JLabel("N\u00B0 du cour");
		lbl_m1_c.setBounds(10, 101, 100, 14);
		panel_2.add(lbl_m1_c);
		
		JLabel lbl_m1_d = new JLabel("Date du match");
		lbl_m1_d.setBounds(10, 114, 100, 14);
		panel_2.add(lbl_m1_d);
		
		JLabel lbl_m1_a = new JLabel("Nom de l'Arbitre");
		lbl_m1_a.setBounds(120, 101, 100, 14);
		panel_2.add(lbl_m1_a);
		
		JLabel lbl_m1_h = new JLabel("Heure du match");
		lbl_m1_h.setBounds(120, 114, 100, 14);
		panel_2.add(lbl_m1_h);
		
		JLabel lbl_m1 = new JLabel("N\u00B0 match");
		lbl_m1.setBounds(85, 11, 55, 14);
		panel_2.add(lbl_m1);
		
		JLabel lbl_m1_j4 = new JLabel("Nom Joueur 2-2");
		lbl_m1_j4.setBounds(10, 75, 100, 14);
		panel_2.add(lbl_m1_j4);
		
		JLabel lbl_m1_j3 = new JLabel("Nom Joueur 2-1");
		lbl_m1_j3.setBounds(10, 62, 100, 14);
		panel_2.add(lbl_m1_j3);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(262, 11, 228, 139);
		panel_tour.add(panel);
		
		JLabel lbl_m2_j1 = new JLabel("Nom Joueur 1-1");
		lbl_m2_j1.setBounds(10, 24, 100, 14);
		panel.add(lbl_m2_j1);
		
		JLabel lbl_m2_s1 = new JLabel("Score Joueur 1");
		lbl_m2_s1.setBounds(120, 37, 100, 14);
		panel.add(lbl_m2_s1);
		
		JLabel lbl_m2_s2 = new JLabel("Score Joueur 2");
		lbl_m2_s2.setBounds(120, 74, 100, 14);
		panel.add(lbl_m2_s2);
		
		JLabel lbl_m2_j2 = new JLabel("Nom Joueur 1-2");
		lbl_m2_j2.setBounds(10, 37, 100, 14);
		panel.add(lbl_m2_j2);
		
		JLabel lbl_m2_c = new JLabel("N\u00B0 du cour");
		lbl_m2_c.setBounds(10, 101, 100, 14);
		panel.add(lbl_m2_c);
		
		JLabel lbl_m2_d = new JLabel("Date du match");
		lbl_m2_d.setBounds(10, 114, 100, 14);
		panel.add(lbl_m2_d);
		
		JLabel lbl_m2_a = new JLabel("Nom de l'Arbitre");
		lbl_m2_a.setBounds(120, 101, 100, 14);
		panel.add(lbl_m2_a);
		
		JLabel lbl_m2_h = new JLabel("Heure du match");
		lbl_m2_h.setBounds(120, 114, 100, 14);
		panel.add(lbl_m2_h);
		
		JLabel lbl_m2 = new JLabel("N\u00B0 match");
		lbl_m2.setBounds(85, 11, 55, 14);
		panel.add(lbl_m2);
		
		JLabel lbl_m2_j4 = new JLabel("Nom Joueur 2-2");
		lbl_m2_j4.setBounds(10, 75, 100, 14);
		panel.add(lbl_m2_j4);
		
		JLabel lbl_m2_j3 = new JLabel("Nom Joueur 2-1");
		lbl_m2_j3.setBounds(10, 62, 100, 14);
		panel.add(lbl_m2_j3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(738, 11, 228, 139);
		panel_tour.add(panel_1);
		
		JLabel lbl_m4_j1 = new JLabel("Nom Joueur 1-1");
		lbl_m4_j1.setBounds(10, 24, 100, 14);
		panel_1.add(lbl_m4_j1);
		
		JLabel lbl_m4_s1 = new JLabel("Score Joueur 1");
		lbl_m4_s1.setBounds(120, 37, 100, 14);
		panel_1.add(lbl_m4_s1);
		
		JLabel lbl_m4_s2 = new JLabel("Score Joueur 2");
		lbl_m4_s2.setBounds(120, 74, 100, 14);
		panel_1.add(lbl_m4_s2);
		
		JLabel lbl_m4_j2 = new JLabel("Nom Joueur 1-2");
		lbl_m4_j2.setBounds(10, 37, 100, 14);
		panel_1.add(lbl_m4_j2);
		
		JLabel lbl_m4_c = new JLabel("N\u00B0 du cour");
		lbl_m4_c.setBounds(10, 101, 100, 14);
		panel_1.add(lbl_m4_c);
		
		JLabel lbl_m4_d = new JLabel("Date du match");
		lbl_m4_d.setBounds(10, 114, 100, 14);
		panel_1.add(lbl_m4_d);
		
		JLabel lbl_m4_a = new JLabel("Nom de l'Arbitre");
		lbl_m4_a.setBounds(120, 101, 100, 14);
		panel_1.add(lbl_m4_a);
		
		JLabel lbl_m4_h = new JLabel("Heure du match");
		lbl_m4_h.setBounds(120, 114, 100, 14);
		panel_1.add(lbl_m4_h);
		
		JLabel lbl_m4 = new JLabel("N\u00B0 match");
		lbl_m4.setBounds(85, 11, 55, 14);
		panel_1.add(lbl_m4);
		
		JLabel lbl_m4_j4 = new JLabel("Nom Joueur 2-2");
		lbl_m4_j4.setBounds(10, 75, 100, 14);
		panel_1.add(lbl_m4_j4);
		
		JLabel lbl_m4_j3 = new JLabel("Nom Joueur 2-1");
		lbl_m4_j3.setBounds(10, 62, 100, 14);
		panel_1.add(lbl_m4_j3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(500, 11, 228, 139);
		panel_tour.add(panel_3);
		
		JLabel lbl_m3_j1 = new JLabel("Nom Joueur 1-1");
		lbl_m3_j1.setBounds(10, 24, 100, 14);
		panel_3.add(lbl_m3_j1);
		
		JLabel lbl_m3_s1 = new JLabel("Score Joueur 1");
		lbl_m3_s1.setBounds(120, 37, 100, 14);
		panel_3.add(lbl_m3_s1);
		
		JLabel lbl_m3_s2 = new JLabel("Score Joueur 2");
		lbl_m3_s2.setBounds(120, 74, 100, 14);
		panel_3.add(lbl_m3_s2);
		
		JLabel lbl_m3_j2 = new JLabel("Nom Joueur 1-2");
		lbl_m3_j2.setBounds(10, 37, 100, 14);
		panel_3.add(lbl_m3_j2);
		
		JLabel lbl_m3_c = new JLabel("N\u00B0 du cour");
		lbl_m3_c.setBounds(10, 101, 100, 14);
		panel_3.add(lbl_m3_c);
		
		JLabel lbl_m3_d = new JLabel("Date du match");
		lbl_m3_d.setBounds(10, 114, 100, 14);
		panel_3.add(lbl_m3_d);
		
		JLabel lbl_m3_a = new JLabel("Nom de l'Arbitre");
		lbl_m3_a.setBounds(120, 101, 100, 14);
		panel_3.add(lbl_m3_a);
		
		JLabel lbl_m3_h = new JLabel("Heure du match");
		lbl_m3_h.setBounds(120, 114, 100, 14);
		panel_3.add(lbl_m3_h);
		
		JLabel lbl_m3 = new JLabel("N\u00B0 match");
		lbl_m3.setBounds(85, 11, 55, 14);
		panel_3.add(lbl_m3);
		
		JLabel lbl_m3_j4 = new JLabel("Nom Joueur 2-2");
		lbl_m3_j4.setBounds(10, 75, 100, 14);
		panel_3.add(lbl_m3_j4);
		
		JLabel lbl_m3_j3 = new JLabel("Nom Joueur 2-1");
		lbl_m3_j3.setBounds(10, 62, 100, 14);
		panel_3.add(lbl_m3_j3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(738, 161, 228, 139);
		panel_tour.add(panel_4);
		
		JLabel lbl_m8_j1 = new JLabel("Nom Joueur 1-1");
		lbl_m8_j1.setBounds(10, 24, 100, 14);
		panel_4.add(lbl_m8_j1);
		
		JLabel lbl_m8_s1 = new JLabel("Score Joueur 1");
		lbl_m8_s1.setBounds(120, 37, 100, 14);
		panel_4.add(lbl_m8_s1);
		
		JLabel lbl_m8_s2 = new JLabel("Score Joueur 2");
		lbl_m8_s2.setBounds(120, 74, 100, 14);
		panel_4.add(lbl_m8_s2);
		
		JLabel lbl_m8_j2 = new JLabel("Nom Joueur 1-2");
		lbl_m8_j2.setBounds(10, 37, 100, 14);
		panel_4.add(lbl_m8_j2);
		
		JLabel lbl_m8_c = new JLabel("N\u00B0 du cour");
		lbl_m8_c.setBounds(10, 101, 100, 14);
		panel_4.add(lbl_m8_c);
		
		JLabel lbl_m8_d = new JLabel("Date du match");
		lbl_m8_d.setBounds(10, 114, 100, 14);
		panel_4.add(lbl_m8_d);
		
		JLabel lbl_m8_a = new JLabel("Nom de l'Arbitre");
		lbl_m8_a.setBounds(120, 101, 100, 14);
		panel_4.add(lbl_m8_a);
		
		JLabel lbl_m8_h = new JLabel("Heure du match");
		lbl_m8_h.setBounds(120, 114, 100, 14);
		panel_4.add(lbl_m8_h);
		
		JLabel lbl_m8 = new JLabel("N\u00B0 match");
		lbl_m8.setBounds(85, 11, 55, 14);
		panel_4.add(lbl_m8);
		
		JLabel lbl_m8_j4 = new JLabel("Nom Joueur 2-2");
		lbl_m8_j4.setBounds(10, 75, 100, 14);
		panel_4.add(lbl_m8_j4);
		
		JLabel lbl_m8_j3 = new JLabel("Nom Joueur 2-1");
		lbl_m8_j3.setBounds(10, 62, 100, 14);
		panel_4.add(lbl_m8_j3);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(500, 161, 228, 139);
		panel_tour.add(panel_5);
		
		JLabel lbl_m7_j1 = new JLabel("Nom Joueur 1-1");
		lbl_m7_j1.setBounds(10, 24, 100, 14);
		panel_5.add(lbl_m7_j1);
		
		JLabel lbl_m7_s1 = new JLabel("Score Joueur 1");
		lbl_m7_s1.setBounds(120, 37, 100, 14);
		panel_5.add(lbl_m7_s1);
		
		JLabel lbl_m7_s2 = new JLabel("Score Joueur 2");
		lbl_m7_s2.setBounds(120, 74, 100, 14);
		panel_5.add(lbl_m7_s2);
		
		JLabel lbl_m7_j2 = new JLabel("Nom Joueur 1-2");
		lbl_m7_j2.setBounds(10, 37, 100, 14);
		panel_5.add(lbl_m7_j2);
		
		JLabel lbl_m7_c = new JLabel("N\u00B0 du cour");
		lbl_m7_c.setBounds(10, 101, 100, 14);
		panel_5.add(lbl_m7_c);
		
		JLabel lbl_m7_d = new JLabel("Date du match");
		lbl_m7_d.setBounds(10, 114, 100, 14);
		panel_5.add(lbl_m7_d);
		
		JLabel lbl_m7_a = new JLabel("Nom de l'Arbitre");
		lbl_m7_a.setBounds(120, 101, 100, 14);
		panel_5.add(lbl_m7_a);
		
		JLabel lbl_m7_h = new JLabel("Heure du match");
		lbl_m7_h.setBounds(120, 114, 100, 14);
		panel_5.add(lbl_m7_h);
		
		JLabel lbl_m7 = new JLabel("N\u00B0 match");
		lbl_m7.setBounds(85, 11, 55, 14);
		panel_5.add(lbl_m7);
		
		JLabel lbl_m7_j4 = new JLabel("Nom Joueur 2-2");
		lbl_m7_j4.setBounds(10, 75, 100, 14);
		panel_5.add(lbl_m7_j4);
		
		JLabel lbl_m7_j3 = new JLabel("Nom Joueur 2-1");
		lbl_m7_j3.setBounds(10, 62, 100, 14);
		panel_5.add(lbl_m7_j3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBounds(262, 161, 228, 139);
		panel_tour.add(panel_6);
		
		JLabel lbl_m6_j1 = new JLabel("Nom Joueur 1-1");
		lbl_m6_j1.setBounds(10, 24, 100, 14);
		panel_6.add(lbl_m6_j1);
		
		JLabel lbl_m6_s1 = new JLabel("Score Joueur 1");
		lbl_m6_s1.setBounds(120, 37, 100, 14);
		panel_6.add(lbl_m6_s1);
		
		JLabel lbl_m6_s2 = new JLabel("Score Joueur 2");
		lbl_m6_s2.setBounds(120, 74, 100, 14);
		panel_6.add(lbl_m6_s2);
		
		JLabel lbl_m6_j2 = new JLabel("Nom Joueur 1-2");
		lbl_m6_j2.setBounds(10, 37, 100, 14);
		panel_6.add(lbl_m6_j2);
		
		JLabel lbl_m6_c = new JLabel("N\u00B0 du cour");
		lbl_m6_c.setBounds(10, 101, 100, 14);
		panel_6.add(lbl_m6_c);
		
		JLabel lbl_m6_d = new JLabel("Date du match");
		lbl_m6_d.setBounds(10, 114, 100, 14);
		panel_6.add(lbl_m6_d);
		
		JLabel lbl_m6_a = new JLabel("Nom de l'Arbitre");
		lbl_m6_a.setBounds(120, 101, 100, 14);
		panel_6.add(lbl_m6_a);
		
		JLabel lbl_m6_h = new JLabel("Heure du match");
		lbl_m6_h.setBounds(120, 114, 100, 14);
		panel_6.add(lbl_m6_h);
		
		JLabel lbl_m6 = new JLabel("N\u00B0 match");
		lbl_m6.setBounds(85, 11, 55, 14);
		panel_6.add(lbl_m6);
		
		JLabel lbl_m6_j4 = new JLabel("Nom Joueur 2-2");
		lbl_m6_j4.setBounds(10, 75, 100, 14);
		panel_6.add(lbl_m6_j4);
		
		JLabel lbl_m6_j3 = new JLabel("Nom Joueur 2-1");
		lbl_m6_j3.setBounds(10, 62, 100, 14);
		panel_6.add(lbl_m6_j3);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBounds(24, 161, 228, 139);
		panel_tour.add(panel_7);
		
		JLabel lbl_m5_j1 = new JLabel("Nom Joueur 1-1");
		lbl_m5_j1.setBounds(10, 24, 100, 14);
		panel_7.add(lbl_m5_j1);
		
		JLabel lbl_m5_s1 = new JLabel("Score Joueur 1");
		lbl_m5_s1.setBounds(120, 37, 100, 14);
		panel_7.add(lbl_m5_s1);
		
		JLabel lbl_m5_s2 = new JLabel("Score Joueur 2");
		lbl_m5_s2.setBounds(120, 74, 100, 14);
		panel_7.add(lbl_m5_s2);
		
		JLabel lbl_m5_j2 = new JLabel("Nom Joueur 1-2");
		lbl_m5_j2.setBounds(10, 37, 100, 14);
		panel_7.add(lbl_m5_j2);
		
		JLabel lbl_m5_c = new JLabel("N\u00B0 du cour");
		lbl_m5_c.setBounds(10, 101, 100, 14);
		panel_7.add(lbl_m5_c);
		
		JLabel lbl_m5_d = new JLabel("Date du match");
		lbl_m5_d.setBounds(10, 114, 100, 14);
		panel_7.add(lbl_m5_d);
		
		JLabel lbl_m5_a = new JLabel("Nom de l'Arbitre");
		lbl_m5_a.setBounds(120, 101, 100, 14);
		panel_7.add(lbl_m5_a);
		
		JLabel lbl_m5_h = new JLabel("Heure du match");
		lbl_m5_h.setBounds(120, 114, 100, 14);
		panel_7.add(lbl_m5_h);
		
		JLabel lbl_m5 = new JLabel("N\u00B0 match");
		lbl_m5.setBounds(85, 11, 55, 14);
		panel_7.add(lbl_m5);
		
		JLabel lbl_m5_j4 = new JLabel("Nom Joueur 2-2");
		lbl_m5_j4.setBounds(10, 75, 100, 14);
		panel_7.add(lbl_m5_j4);
		
		JLabel lbl_m5_j3 = new JLabel("Nom Joueur 2-1");
		lbl_m5_j3.setBounds(10, 62, 100, 14);
		panel_7.add(lbl_m5_j3);
		
		JPanel panel_finale = new JPanel();
		panel_finale.setLayout(null);
		panel_finale.setBounds(738, 461, 228, 139);
		panel_tour.add(panel_finale);
		dernierPanel = panel_finale;
		
		JLabel lbl_m16_j1 = new JLabel("Nom Joueur 1-1");
		lbl_m16_j1.setBounds(10, 24, 100, 14);
		panel_finale.add(lbl_m16_j1);
		
		JLabel lbl_m16_s1 = new JLabel("Score Joueur 1");
		lbl_m16_s1.setBounds(120, 37, 100, 14);
		panel_finale.add(lbl_m16_s1);
		
		JLabel lbl_m16_s2 = new JLabel("Score Joueur 2");
		lbl_m16_s2.setBounds(120, 74, 100, 14);
		panel_finale.add(lbl_m16_s2);
		
		JLabel lbl_m16_j2 = new JLabel("Nom Joueur 1-2");
		lbl_m16_j2.setBounds(10, 37, 100, 14);
		panel_finale.add(lbl_m16_j2);
		
		JLabel lbl_m16_c = new JLabel("N\u00B0 du cour");
		lbl_m16_c.setBounds(10, 101, 100, 14);
		panel_finale.add(lbl_m16_c);
		
		JLabel lbl_m16_d = new JLabel("Date du match");
		lbl_m16_d.setBounds(10, 114, 100, 14);
		panel_finale.add(lbl_m16_d);
		
		JLabel lbl_m16_a = new JLabel("Nom de l'Arbitre");
		lbl_m16_a.setBounds(120, 101, 100, 14);
		panel_finale.add(lbl_m16_a);
		
		JLabel lbl_m16_h = new JLabel("Heure du match");
		lbl_m16_h.setBounds(120, 114, 100, 14);
		panel_finale.add(lbl_m16_h);
		
		JLabel lbl_m16 = new JLabel("N\u00B0 match");
		lbl_m16.setBounds(85, 11, 55, 14);
		panel_finale.add(lbl_m16);
		
		JLabel lbl_m16_j4 = new JLabel("Nom Joueur 2-2");
		lbl_m16_j4.setBounds(10, 75, 100, 14);
		panel_finale.add(lbl_m16_j4);
		
		JLabel lbl_m16_j3 = new JLabel("Nom Joueur 2-1");
		lbl_m16_j3.setBounds(10, 62, 100, 14);
		panel_finale.add(lbl_m16_j3);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBounds(500, 461, 228, 139);
		panel_tour.add(panel_9);
		
		JLabel lbl_m15_j1 = new JLabel("Nom Joueur 1-1");
		lbl_m15_j1.setBounds(10, 24, 100, 14);
		panel_9.add(lbl_m15_j1);
		
		JLabel lbl_m15_s1 = new JLabel("Score Joueur 1");
		lbl_m15_s1.setBounds(120, 37, 100, 14);
		panel_9.add(lbl_m15_s1);
		
		JLabel lbl_m15_s2 = new JLabel("Score Joueur 2");
		lbl_m15_s2.setBounds(120, 74, 100, 14);
		panel_9.add(lbl_m15_s2);
		
		JLabel lbl_m15_j2 = new JLabel("Nom Joueur 1-2");
		lbl_m15_j2.setBounds(10, 37, 100, 14);
		panel_9.add(lbl_m15_j2);
		
		JLabel lbl_m15_c = new JLabel("N\u00B0 du cour");
		lbl_m15_c.setBounds(10, 101, 100, 14);
		panel_9.add(lbl_m15_c);
		
		JLabel lbl_m15_d = new JLabel("Date du match");
		lbl_m15_d.setBounds(10, 114, 100, 14);
		panel_9.add(lbl_m15_d);
		
		JLabel lbl_m15_a = new JLabel("Nom de l'Arbitre");
		lbl_m15_a.setBounds(120, 101, 100, 14);
		panel_9.add(lbl_m15_a);
		
		JLabel lbl_m15_h = new JLabel("Heure du match");
		lbl_m15_h.setBounds(120, 114, 100, 14);
		panel_9.add(lbl_m15_h);
		
		JLabel lbl_m15 = new JLabel("N\u00B0 match");
		lbl_m15.setBounds(85, 11, 55, 14);
		panel_9.add(lbl_m15);
		
		JLabel lbl_m15_j4 = new JLabel("Nom Joueur 2-2");
		lbl_m15_j4.setBounds(10, 75, 100, 14);
		panel_9.add(lbl_m15_j4);
		
		JLabel lbl_m15_j3 = new JLabel("Nom Joueur 2-1");
		lbl_m15_j3.setBounds(10, 62, 100, 14);
		panel_9.add(lbl_m15_j3);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBounds(262, 461, 228, 139);
		panel_tour.add(panel_10);
		
		JLabel lbl_m14_j1 = new JLabel("Nom Joueur 1-1");
		lbl_m14_j1.setBounds(10, 24, 100, 14);
		panel_10.add(lbl_m14_j1);
		
		JLabel lbl_m14_s1 = new JLabel("Score Joueur 1");
		lbl_m14_s1.setBounds(120, 37, 100, 14);
		panel_10.add(lbl_m14_s1);
		
		JLabel lbl_m14_s2 = new JLabel("Score Joueur 2");
		lbl_m14_s2.setBounds(120, 74, 100, 14);
		panel_10.add(lbl_m14_s2);
		
		JLabel lbl_m14_j2 = new JLabel("Nom Joueur 1-2");
		lbl_m14_j2.setBounds(10, 37, 100, 14);
		panel_10.add(lbl_m14_j2);
		
		JLabel lbl_m14_c = new JLabel("N\u00B0 du cour");
		lbl_m14_c.setBounds(10, 101, 100, 14);
		panel_10.add(lbl_m14_c);
		
		JLabel lbl_m14_d = new JLabel("Date du match");
		lbl_m14_d.setBounds(10, 114, 100, 14);
		panel_10.add(lbl_m14_d);
		
		JLabel lbl_m14_a = new JLabel("Nom de l'Arbitre");
		lbl_m14_a.setBounds(120, 101, 100, 14);
		panel_10.add(lbl_m14_a);
		
		JLabel lbl_m14_h = new JLabel("Heure du match");
		lbl_m14_h.setBounds(120, 114, 100, 14);
		panel_10.add(lbl_m14_h);
		
		JLabel lbl_m14 = new JLabel("N\u00B0 match");
		lbl_m14.setBounds(85, 11, 55, 14);
		panel_10.add(lbl_m14);
		
		JLabel lbl_m14_j4 = new JLabel("Nom Joueur 2-2");
		lbl_m14_j4.setBounds(10, 75, 100, 14);
		panel_10.add(lbl_m14_j4);
		
		JLabel lbl_m14_j3 = new JLabel("Nom Joueur 2-1");
		lbl_m14_j3.setBounds(10, 62, 100, 14);
		panel_10.add(lbl_m14_j3);
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBounds(24, 461, 228, 139);
		panel_tour.add(panel_11);
		
		JLabel lbl_m13_j1 = new JLabel("Nom Joueur 1-1");
		lbl_m13_j1.setBounds(10, 24, 100, 14);
		panel_11.add(lbl_m13_j1);
		
		JLabel lbl_m13_s1 = new JLabel("Score Joueur 1");
		lbl_m13_s1.setBounds(120, 37, 100, 14);
		panel_11.add(lbl_m13_s1);
		
		JLabel lbl_m13_s2 = new JLabel("Score Joueur 2");
		lbl_m13_s2.setBounds(120, 74, 100, 14);
		panel_11.add(lbl_m13_s2);
		
		JLabel lbl_m13_j2 = new JLabel("Nom Joueur 1-2");
		lbl_m13_j2.setBounds(10, 37, 100, 14);
		panel_11.add(lbl_m13_j2);
		
		JLabel lbl_m13_c = new JLabel("N\u00B0 du cour");
		lbl_m13_c.setBounds(10, 101, 100, 14);
		panel_11.add(lbl_m13_c);
		
		JLabel lbl_m13_d = new JLabel("Date du match");
		lbl_m13_d.setBounds(10, 114, 100, 14);
		panel_11.add(lbl_m13_d);
		
		JLabel lbl_m13_a = new JLabel("Nom de l'Arbitre");
		lbl_m13_a.setBounds(120, 101, 100, 14);
		panel_11.add(lbl_m13_a);
		
		JLabel lbl_m13_h = new JLabel("Heure du match");
		lbl_m13_h.setBounds(120, 114, 100, 14);
		panel_11.add(lbl_m13_h);
		
		JLabel lbl_m13 = new JLabel("N\u00B0 match");
		lbl_m13.setBounds(85, 11, 55, 14);
		panel_11.add(lbl_m13);
		
		JLabel lbl_m13_j4 = new JLabel("Nom Joueur 2-2");
		lbl_m13_j4.setBounds(10, 75, 100, 14);
		panel_11.add(lbl_m13_j4);
		
		JLabel lbl_m13_j3 = new JLabel("Nom Joueur 2-1");
		lbl_m13_j3.setBounds(10, 62, 100, 14);
		panel_11.add(lbl_m13_j3);
		
		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBounds(24, 311, 228, 139);
		panel_tour.add(panel_12);
		
		JLabel lbl_m9_j1 = new JLabel("Nom Joueur 1-1");
		lbl_m9_j1.setBounds(10, 24, 100, 14);
		panel_12.add(lbl_m9_j1);
		
		JLabel lbl_m9_s1 = new JLabel("Score Joueur 1");
		lbl_m9_s1.setBounds(120, 37, 100, 14);
		panel_12.add(lbl_m9_s1);
		
		JLabel lbl_m9_s2 = new JLabel("Score Joueur 2");
		lbl_m9_s2.setBounds(120, 74, 100, 14);
		panel_12.add(lbl_m9_s2);
		
		JLabel lbl_m9_j2 = new JLabel("Nom Joueur 1-2");
		lbl_m9_j2.setBounds(10, 37, 100, 14);
		panel_12.add(lbl_m9_j2);
		
		JLabel lbl_m9_c = new JLabel("N\u00B0 du cour");
		lbl_m9_c.setBounds(10, 101, 100, 14);
		panel_12.add(lbl_m9_c);
		
		JLabel lbl_m9_d = new JLabel("Date du match");
		lbl_m9_d.setBounds(10, 114, 100, 14);
		panel_12.add(lbl_m9_d);
		
		JLabel lbl_m9_a = new JLabel("Nom de l'Arbitre");
		lbl_m9_a.setBounds(120, 101, 100, 14);
		panel_12.add(lbl_m9_a);
		
		JLabel lbl_m9_h = new JLabel("Heure du match");
		lbl_m9_h.setBounds(120, 114, 100, 14);
		panel_12.add(lbl_m9_h);
		
		JLabel lbl_m9 = new JLabel("N\u00B0 match");
		lbl_m9.setBounds(85, 11, 55, 14);
		panel_12.add(lbl_m9);
		
		JLabel lbl_m9_j4 = new JLabel("Nom Joueur 2-2");
		lbl_m9_j4.setBounds(10, 75, 100, 14);
		panel_12.add(lbl_m9_j4);
		
		JLabel lbl_m9_j3 = new JLabel("Nom Joueur 2-1");
		lbl_m9_j3.setBounds(10, 62, 100, 14);
		panel_12.add(lbl_m9_j3);
		
		JPanel panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBounds(262, 311, 228, 139);
		panel_tour.add(panel_13);
		
		JLabel lbl_m10_j1 = new JLabel("Nom Joueur 1-1");
		lbl_m10_j1.setBounds(10, 24, 100, 14);
		panel_13.add(lbl_m10_j1);
		
		JLabel lbl_m10_s1 = new JLabel("Score Joueur 1");
		lbl_m10_s1.setBounds(120, 37, 100, 14);
		panel_13.add(lbl_m10_s1);
		
		JLabel lbl_m10_s2 = new JLabel("Score Joueur 2");
		lbl_m10_s2.setBounds(120, 74, 100, 14);
		panel_13.add(lbl_m10_s2);
		
		JLabel lbl_m10_j2 = new JLabel("Nom Joueur 1-2");
		lbl_m10_j2.setBounds(10, 37, 100, 14);
		panel_13.add(lbl_m10_j2);
		
		JLabel lbl_m10_c = new JLabel("N\u00B0 du cour");
		lbl_m10_c.setBounds(10, 101, 100, 14);
		panel_13.add(lbl_m10_c);
		
		JLabel lbl_m10_d = new JLabel("Date du match");
		lbl_m10_d.setBounds(10, 114, 100, 14);
		panel_13.add(lbl_m10_d);
		
		JLabel lbl_m10_a = new JLabel("Nom de l'Arbitre");
		lbl_m10_a.setBounds(120, 101, 100, 14);
		panel_13.add(lbl_m10_a);
		
		JLabel lbl_m10_h = new JLabel("Heure du match");
		lbl_m10_h.setBounds(120, 114, 100, 14);
		panel_13.add(lbl_m10_h);
		
		JLabel lbl_m10 = new JLabel("N\u00B0 match");
		lbl_m10.setBounds(85, 11, 55, 14);
		panel_13.add(lbl_m10);
		
		JLabel lbl_m10_j4 = new JLabel("Nom Joueur 2-2");
		lbl_m10_j4.setBounds(10, 75, 100, 14);
		panel_13.add(lbl_m10_j4);
		
		JLabel lbl_m10_j3 = new JLabel("Nom Joueur 2-1");
		lbl_m10_j3.setBounds(10, 62, 100, 14);
		panel_13.add(lbl_m10_j3);
		
		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBounds(500, 311, 228, 139);
		panel_tour.add(panel_14);
		
		JLabel lbl_m11_j1 = new JLabel("Nom Joueur 1-1");
		lbl_m11_j1.setBounds(10, 24, 100, 14);
		panel_14.add(lbl_m11_j1);
		
		JLabel lbl_m11_s1 = new JLabel("Score Joueur 1");
		lbl_m11_s1.setBounds(120, 37, 100, 14);
		panel_14.add(lbl_m11_s1);
		
		JLabel lbl_m11_s2 = new JLabel("Score Joueur 2");
		lbl_m11_s2.setBounds(120, 74, 100, 14);
		panel_14.add(lbl_m11_s2);
		
		JLabel lbl_m11_j2 = new JLabel("Nom Joueur 1-2");
		lbl_m11_j2.setBounds(10, 37, 100, 14);
		panel_14.add(lbl_m11_j2);
		
		JLabel lbl_m11_c = new JLabel("N\u00B0 du cour");
		lbl_m11_c.setBounds(10, 101, 100, 14);
		panel_14.add(lbl_m11_c);
		
		JLabel lbl_m11_d = new JLabel("Date du match");
		lbl_m11_d.setBounds(10, 114, 100, 14);
		panel_14.add(lbl_m11_d);
		
		JLabel lbl_m11_a = new JLabel("Nom de l'Arbitre");
		lbl_m11_a.setBounds(120, 101, 100, 14);
		panel_14.add(lbl_m11_a);
		
		JLabel lbl_m11_h = new JLabel("Heure du match");
		lbl_m11_h.setBounds(120, 114, 100, 14);
		panel_14.add(lbl_m11_h);
		
		JLabel lbl_m11 = new JLabel("N\u00B0 match");
		lbl_m11.setBounds(85, 11, 55, 14);
		panel_14.add(lbl_m11);
		
		JLabel lbl_m11_j4 = new JLabel("Nom Joueur 2-2");
		lbl_m11_j4.setBounds(10, 75, 100, 14);
		panel_14.add(lbl_m11_j4);
		
		JLabel lbl_m11_j3 = new JLabel("Nom Joueur 2-1");
		lbl_m11_j3.setBounds(10, 62, 100, 14);
		panel_14.add(lbl_m11_j3);
		
		JPanel panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBounds(738, 311, 228, 139);
		panel_tour.add(panel_15);
		
		JLabel lbl_m12_j1 = new JLabel("Nom Joueur 1-1");
		lbl_m12_j1.setBounds(10, 24, 100, 14);
		panel_15.add(lbl_m12_j1);
		
		JLabel lbl_m12_s1 = new JLabel("Score Joueur 1");
		lbl_m12_s1.setBounds(120, 37, 100, 14);
		panel_15.add(lbl_m12_s1);
		
		JLabel lbl_m12_s2 = new JLabel("Score Joueur 2");
		lbl_m12_s2.setBounds(120, 74, 100, 14);
		panel_15.add(lbl_m12_s2);
		
		JLabel lbl_m12_j2 = new JLabel("Nom Joueur 1-2");
		lbl_m12_j2.setBounds(10, 37, 100, 14);
		panel_15.add(lbl_m12_j2);
		
		JLabel lbl_m12_c = new JLabel("N\u00B0 du cour");
		lbl_m12_c.setBounds(10, 101, 100, 14);
		panel_15.add(lbl_m12_c);
		
		JLabel lbl_m12_d = new JLabel("Date du match");
		lbl_m12_d.setBounds(10, 114, 100, 14);
		panel_15.add(lbl_m12_d);
		
		JLabel lbl_m12_a = new JLabel("Nom de l'Arbitre");
		lbl_m12_a.setBounds(120, 101, 100, 14);
		panel_15.add(lbl_m12_a);
		
		JLabel lbl_m12_h = new JLabel("Heure du match");
		lbl_m12_h.setBounds(120, 114, 100, 14);
		panel_15.add(lbl_m12_h);
		
		JLabel lbl_m12 = new JLabel("N\u00B0 match");
		lbl_m12.setBounds(85, 11, 55, 14);
		panel_15.add(lbl_m12);
		
		JLabel lbl_m12_j4 = new JLabel("Nom Joueur 2-2");
		lbl_m12_j4.setBounds(10, 75, 100, 14);
		panel_15.add(lbl_m12_j4);
		
		JLabel lbl_m12_j3 = new JLabel("Nom Joueur 2-1");
		lbl_m12_j3.setBounds(10, 62, 100, 14);
		panel_15.add(lbl_m12_j3);
		
		JPanel panel_menu = new JPanel();
		panel_menu.setLayout(null);
		panel_menu.setBounds(10, 11, 975, 43);
		contentPane.add(panel_menu);
		
		JButton btn_fermer = new JButton("Fermer");
		btn_fermer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		btn_fermer.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btn_fermer.setBounds(10, 11, 77, 23);
		panel_menu.add(btn_fermer);
		
		JMenu mnToursliminatoires = new JMenu("Tours \u00E9liminatoires");
		mnToursliminatoires.setBounds(228, 11, 200, 26);
		panel_menu.add(mnToursliminatoires);
		
		JMenuItem menu_t1_p1 = new JMenuItem("Matchs 01 - 16");
		mnToursliminatoires.add(menu_t1_p1);
		
		JMenuItem menu_t1_p2 = new JMenuItem("Matchs 17 - 32");
		mnToursliminatoires.add(menu_t1_p2);
		
		JMenu menu_final = new JMenu("Tours finaux");
		menu_final.setBounds(438, 11, 152, 26);
		panel_menu.add(menu_final);
		
		JMenuItem menu_final16 = new JMenuItem("16/Finale");
		menu_final.add(menu_final16);
		
		JMenuItem menu_finale8 = new JMenuItem("8/Finale - Finale");
		menu_final.add(menu_finale8);
		
		//Affichage des matchs************************************************************************************************************************
		t_matchs = new JLabel[]{lbl_m1,lbl_m2,lbl_m3,lbl_m4,lbl_m5,lbl_m6,lbl_m7,lbl_m8,lbl_m9,lbl_m10,lbl_m11,lbl_m12,lbl_m13,lbl_m14,lbl_m15,lbl_m16};
		t_joueurs1 = new JLabel[]{lbl_m1_j1,lbl_m2_j1,lbl_m3_j1,lbl_m4_j1,lbl_m5_j1,lbl_m6_j1,lbl_m7_j1,lbl_m8_j1,lbl_m9_j1,lbl_m10_j1,lbl_m11_j1,lbl_m12_j1,lbl_m13_j1,lbl_m14_j1,lbl_m15_j1,lbl_m16_j1};
		t_joueurs2 = new JLabel[]{lbl_m1_j2,lbl_m2_j2,lbl_m3_j2,lbl_m4_j2,lbl_m5_j2,lbl_m6_j2,lbl_m7_j2,lbl_m8_j2,lbl_m9_j2,lbl_m10_j2,lbl_m11_j2,lbl_m12_j2,lbl_m13_j2,lbl_m14_j2,lbl_m15_j2,lbl_m16_j2};
		t_joueurs3 = new JLabel[]{lbl_m1_j3,lbl_m2_j3,lbl_m3_j3,lbl_m4_j3,lbl_m5_j3,lbl_m6_j3,lbl_m7_j3,lbl_m8_j3,lbl_m9_j3,lbl_m10_j3,lbl_m11_j3,lbl_m12_j3,lbl_m13_j3,lbl_m14_j3,lbl_m15_j3,lbl_m16_j3};
		t_joueurs4 = new JLabel[]{lbl_m1_j4,lbl_m2_j4,lbl_m3_j4,lbl_m4_j4,lbl_m5_j4,lbl_m6_j4,lbl_m7_j4,lbl_m8_j4,lbl_m9_j4,lbl_m10_j4,lbl_m11_j4,lbl_m12_j4,lbl_m13_j4,lbl_m14_j4,lbl_m15_j4,lbl_m16_j4};		
		t_arbitres = new JLabel[]{lbl_m1_a,lbl_m2_a,lbl_m3_a,lbl_m4_a,lbl_m5_a,lbl_m6_a,lbl_m7_a,lbl_m8_a,lbl_m9_a,lbl_m10_a,lbl_m11_a,lbl_m12_a,lbl_m13_a,lbl_m14_a,lbl_m15_a,lbl_m16_a};
		t_cours = new JLabel[]{lbl_m1_c,lbl_m2_c,lbl_m3_c,lbl_m4_c,lbl_m5_c,lbl_m6_c,lbl_m7_c,lbl_m8_c,lbl_m9_c,lbl_m10_c,lbl_m11_c,lbl_m12_c,lbl_m13_c,lbl_m14_c,lbl_m15_c,lbl_m16_c};
		t_dates = new JLabel[]{lbl_m1_d,lbl_m2_d,lbl_m3_d,lbl_m4_d,lbl_m5_d,lbl_m6_d,lbl_m7_d,lbl_m8_d,lbl_m9_d,lbl_m10_d,lbl_m11_d,lbl_m12_d,lbl_m13_d,lbl_m14_d,lbl_m15_d,lbl_m16_d};
		t_heures = new JLabel[]{lbl_m1_h,lbl_m2_h,lbl_m3_h,lbl_m4_h,lbl_m5_h,lbl_m6_h,lbl_m7_h,lbl_m8_h,lbl_m9_h,lbl_m10_h,lbl_m11_h,lbl_m12_h,lbl_m13_h,lbl_m14_h,lbl_m15_h,lbl_m16_h};
		t_scores1 = new JLabel[]{lbl_m1_s1,lbl_m2_s1,lbl_m3_s1,lbl_m4_s1,lbl_m5_s1,lbl_m6_s1,lbl_m7_s1,lbl_m8_s1,lbl_m9_s1,lbl_m10_s1,lbl_m11_s1,lbl_m12_s1,lbl_m13_s1,lbl_m14_s1,lbl_m15_s1,lbl_m16_s1};
		t_scores2 = new JLabel[]{lbl_m1_s2,lbl_m2_s2,lbl_m3_s2,lbl_m4_s2,lbl_m5_s2,lbl_m6_s2,lbl_m7_s2,lbl_m8_s2,lbl_m9_s2,lbl_m10_s2,lbl_m11_s2,lbl_m12_s2,lbl_m13_s2,lbl_m14_s2,lbl_m15_s2,lbl_m16_s2};
	
		afficherResultats(0,15);
	}
	
	//Méthode d'affichage des résultats***************************************************************************************
		private void afficherResultats(int borneInf, int borneSup)
		{
			MatchPOJO[] matchs = new MatchPOJO[borneSup-borneInf+1];
			System.arraycopy(ordo.getMatchs(), borneInf, matchs, 0, matchs.length);
					
			for(int i=0;i<matchs.length;i++)
			{
				t_matchs[i].setText("Match " + matchs[i].getNumero());
				t_joueurs1[i].setText(matchs[i].getJoueur1Equipe1().toString());
				t_joueurs2[i].setText(matchs[i].getJoueur2Equipe1().toString());
				t_joueurs3[i].setText(matchs[i].getJoueur1Equipe2().toString());
				t_joueurs4[i].setText(matchs[i].getJoueur2Equipe2().toString());
				//t_arbitres[i].setText(matchs[i].getArbitre().toString());
				//t_cours[i].setText(matchs[i].getCour().toString());
				t_dates[i].setText(matchs[i].getDate().obtenirDate());
				t_heures[i].setText(matchs[i].getDate().obtenirHeure());
				t_scores1[i].setText(matchs[i].obtenirScoreEquipe(1));
				t_scores2[i].setText(matchs[i].obtenirScoreEquipe(2));
			}
			if(matchs.length == 15)dernierPanel.setVisible(false);
			else dernierPanel.setVisible(true);
		}
}
