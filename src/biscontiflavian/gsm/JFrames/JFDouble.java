package biscontiflavian.gsm.JFrames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;

public class JFDouble extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFDouble frame = new JFDouble();
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
	public JFDouble() {
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
		
		JLabel lblNomJoueur_1 = new JLabel("Nom Joueur 1-1");
		lblNomJoueur_1.setBounds(10, 24, 100, 14);
		panel_2.add(lblNomJoueur_1);
		
		JLabel label_1 = new JLabel("Score Joueur 1");
		label_1.setBounds(120, 37, 100, 14);
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("Score Joueur 2");
		label_2.setBounds(120, 74, 100, 14);
		panel_2.add(label_2);
		
		JLabel lblNomJoueur = new JLabel("Nom Joueur 1-2");
		lblNomJoueur.setBounds(10, 37, 100, 14);
		panel_2.add(lblNomJoueur);
		
		JLabel label_4 = new JLabel("N\u00B0 du cour");
		label_4.setBounds(10, 101, 100, 14);
		panel_2.add(label_4);
		
		JLabel label_5 = new JLabel("Date du match");
		label_5.setBounds(10, 114, 100, 14);
		panel_2.add(label_5);
		
		JLabel label_6 = new JLabel("Nom de l'Arbitre");
		label_6.setBounds(120, 101, 100, 14);
		panel_2.add(label_6);
		
		JLabel label_7 = new JLabel("Heure du match");
		label_7.setBounds(120, 114, 100, 14);
		panel_2.add(label_7);
		
		JLabel label_8 = new JLabel("N\u00B0 match");
		label_8.setBounds(85, 11, 48, 14);
		panel_2.add(label_8);
		
		JLabel lblNomJoueur_3 = new JLabel("Nom Joueur 2-2");
		lblNomJoueur_3.setBounds(10, 75, 100, 14);
		panel_2.add(lblNomJoueur_3);
		
		JLabel lblNomJoueur_2 = new JLabel("Nom Joueur 2-1");
		lblNomJoueur_2.setBounds(10, 62, 100, 14);
		panel_2.add(lblNomJoueur_2);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(262, 11, 228, 139);
		panel_tour.add(panel);
		
		JLabel label = new JLabel("Nom Joueur 1-1");
		label.setBounds(10, 24, 100, 14);
		panel.add(label);
		
		JLabel label_3 = new JLabel("Score Joueur 1");
		label_3.setBounds(120, 37, 100, 14);
		panel.add(label_3);
		
		JLabel label_9 = new JLabel("Score Joueur 2");
		label_9.setBounds(120, 74, 100, 14);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("Nom Joueur 1-2");
		label_10.setBounds(10, 37, 100, 14);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("N\u00B0 du cour");
		label_11.setBounds(10, 101, 100, 14);
		panel.add(label_11);
		
		JLabel label_12 = new JLabel("Date du match");
		label_12.setBounds(10, 114, 100, 14);
		panel.add(label_12);
		
		JLabel label_13 = new JLabel("Nom de l'Arbitre");
		label_13.setBounds(120, 101, 100, 14);
		panel.add(label_13);
		
		JLabel label_14 = new JLabel("Heure du match");
		label_14.setBounds(120, 114, 100, 14);
		panel.add(label_14);
		
		JLabel label_15 = new JLabel("N\u00B0 match");
		label_15.setBounds(85, 11, 48, 14);
		panel.add(label_15);
		
		JLabel label_16 = new JLabel("Nom Joueur 2-2");
		label_16.setBounds(10, 75, 100, 14);
		panel.add(label_16);
		
		JLabel label_17 = new JLabel("Nom Joueur 2-1");
		label_17.setBounds(10, 62, 100, 14);
		panel.add(label_17);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(738, 11, 228, 139);
		panel_tour.add(panel_1);
		
		JLabel label_18 = new JLabel("Nom Joueur 1-1");
		label_18.setBounds(10, 24, 100, 14);
		panel_1.add(label_18);
		
		JLabel label_19 = new JLabel("Score Joueur 1");
		label_19.setBounds(120, 37, 100, 14);
		panel_1.add(label_19);
		
		JLabel label_20 = new JLabel("Score Joueur 2");
		label_20.setBounds(120, 74, 100, 14);
		panel_1.add(label_20);
		
		JLabel label_21 = new JLabel("Nom Joueur 1-2");
		label_21.setBounds(10, 37, 100, 14);
		panel_1.add(label_21);
		
		JLabel label_22 = new JLabel("N\u00B0 du cour");
		label_22.setBounds(10, 101, 100, 14);
		panel_1.add(label_22);
		
		JLabel label_23 = new JLabel("Date du match");
		label_23.setBounds(10, 114, 100, 14);
		panel_1.add(label_23);
		
		JLabel label_24 = new JLabel("Nom de l'Arbitre");
		label_24.setBounds(120, 101, 100, 14);
		panel_1.add(label_24);
		
		JLabel label_25 = new JLabel("Heure du match");
		label_25.setBounds(120, 114, 100, 14);
		panel_1.add(label_25);
		
		JLabel label_26 = new JLabel("N\u00B0 match");
		label_26.setBounds(85, 11, 48, 14);
		panel_1.add(label_26);
		
		JLabel label_27 = new JLabel("Nom Joueur 2-2");
		label_27.setBounds(10, 75, 100, 14);
		panel_1.add(label_27);
		
		JLabel label_28 = new JLabel("Nom Joueur 2-1");
		label_28.setBounds(10, 62, 100, 14);
		panel_1.add(label_28);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(500, 11, 228, 139);
		panel_tour.add(panel_3);
		
		JLabel label_29 = new JLabel("Nom Joueur 1-1");
		label_29.setBounds(10, 24, 100, 14);
		panel_3.add(label_29);
		
		JLabel label_30 = new JLabel("Score Joueur 1");
		label_30.setBounds(120, 37, 100, 14);
		panel_3.add(label_30);
		
		JLabel label_31 = new JLabel("Score Joueur 2");
		label_31.setBounds(120, 74, 100, 14);
		panel_3.add(label_31);
		
		JLabel label_32 = new JLabel("Nom Joueur 1-2");
		label_32.setBounds(10, 37, 100, 14);
		panel_3.add(label_32);
		
		JLabel label_33 = new JLabel("N\u00B0 du cour");
		label_33.setBounds(10, 101, 100, 14);
		panel_3.add(label_33);
		
		JLabel label_34 = new JLabel("Date du match");
		label_34.setBounds(10, 114, 100, 14);
		panel_3.add(label_34);
		
		JLabel label_35 = new JLabel("Nom de l'Arbitre");
		label_35.setBounds(120, 101, 100, 14);
		panel_3.add(label_35);
		
		JLabel label_36 = new JLabel("Heure du match");
		label_36.setBounds(120, 114, 100, 14);
		panel_3.add(label_36);
		
		JLabel label_37 = new JLabel("N\u00B0 match");
		label_37.setBounds(85, 11, 48, 14);
		panel_3.add(label_37);
		
		JLabel label_38 = new JLabel("Nom Joueur 2-2");
		label_38.setBounds(10, 75, 100, 14);
		panel_3.add(label_38);
		
		JLabel label_39 = new JLabel("Nom Joueur 2-1");
		label_39.setBounds(10, 62, 100, 14);
		panel_3.add(label_39);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(738, 161, 228, 139);
		panel_tour.add(panel_4);
		
		JLabel label_40 = new JLabel("Nom Joueur 1-1");
		label_40.setBounds(10, 24, 100, 14);
		panel_4.add(label_40);
		
		JLabel label_41 = new JLabel("Score Joueur 1");
		label_41.setBounds(120, 37, 100, 14);
		panel_4.add(label_41);
		
		JLabel label_42 = new JLabel("Score Joueur 2");
		label_42.setBounds(120, 74, 100, 14);
		panel_4.add(label_42);
		
		JLabel label_43 = new JLabel("Nom Joueur 1-2");
		label_43.setBounds(10, 37, 100, 14);
		panel_4.add(label_43);
		
		JLabel label_44 = new JLabel("N\u00B0 du cour");
		label_44.setBounds(10, 101, 100, 14);
		panel_4.add(label_44);
		
		JLabel label_45 = new JLabel("Date du match");
		label_45.setBounds(10, 114, 100, 14);
		panel_4.add(label_45);
		
		JLabel label_46 = new JLabel("Nom de l'Arbitre");
		label_46.setBounds(120, 101, 100, 14);
		panel_4.add(label_46);
		
		JLabel label_47 = new JLabel("Heure du match");
		label_47.setBounds(120, 114, 100, 14);
		panel_4.add(label_47);
		
		JLabel label_48 = new JLabel("N\u00B0 match");
		label_48.setBounds(85, 11, 48, 14);
		panel_4.add(label_48);
		
		JLabel label_49 = new JLabel("Nom Joueur 2-2");
		label_49.setBounds(10, 75, 100, 14);
		panel_4.add(label_49);
		
		JLabel label_50 = new JLabel("Nom Joueur 2-1");
		label_50.setBounds(10, 62, 100, 14);
		panel_4.add(label_50);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(500, 161, 228, 139);
		panel_tour.add(panel_5);
		
		JLabel label_51 = new JLabel("Nom Joueur 1-1");
		label_51.setBounds(10, 24, 100, 14);
		panel_5.add(label_51);
		
		JLabel label_52 = new JLabel("Score Joueur 1");
		label_52.setBounds(120, 37, 100, 14);
		panel_5.add(label_52);
		
		JLabel label_53 = new JLabel("Score Joueur 2");
		label_53.setBounds(120, 74, 100, 14);
		panel_5.add(label_53);
		
		JLabel label_54 = new JLabel("Nom Joueur 1-2");
		label_54.setBounds(10, 37, 100, 14);
		panel_5.add(label_54);
		
		JLabel label_55 = new JLabel("N\u00B0 du cour");
		label_55.setBounds(10, 101, 100, 14);
		panel_5.add(label_55);
		
		JLabel label_56 = new JLabel("Date du match");
		label_56.setBounds(10, 114, 100, 14);
		panel_5.add(label_56);
		
		JLabel label_57 = new JLabel("Nom de l'Arbitre");
		label_57.setBounds(120, 101, 100, 14);
		panel_5.add(label_57);
		
		JLabel label_58 = new JLabel("Heure du match");
		label_58.setBounds(120, 114, 100, 14);
		panel_5.add(label_58);
		
		JLabel label_59 = new JLabel("N\u00B0 match");
		label_59.setBounds(85, 11, 48, 14);
		panel_5.add(label_59);
		
		JLabel label_60 = new JLabel("Nom Joueur 2-2");
		label_60.setBounds(10, 75, 100, 14);
		panel_5.add(label_60);
		
		JLabel label_61 = new JLabel("Nom Joueur 2-1");
		label_61.setBounds(10, 62, 100, 14);
		panel_5.add(label_61);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBounds(262, 161, 228, 139);
		panel_tour.add(panel_6);
		
		JLabel label_62 = new JLabel("Nom Joueur 1-1");
		label_62.setBounds(10, 24, 100, 14);
		panel_6.add(label_62);
		
		JLabel label_63 = new JLabel("Score Joueur 1");
		label_63.setBounds(120, 37, 100, 14);
		panel_6.add(label_63);
		
		JLabel label_64 = new JLabel("Score Joueur 2");
		label_64.setBounds(120, 74, 100, 14);
		panel_6.add(label_64);
		
		JLabel label_65 = new JLabel("Nom Joueur 1-2");
		label_65.setBounds(10, 37, 100, 14);
		panel_6.add(label_65);
		
		JLabel label_66 = new JLabel("N\u00B0 du cour");
		label_66.setBounds(10, 101, 100, 14);
		panel_6.add(label_66);
		
		JLabel label_67 = new JLabel("Date du match");
		label_67.setBounds(10, 114, 100, 14);
		panel_6.add(label_67);
		
		JLabel label_68 = new JLabel("Nom de l'Arbitre");
		label_68.setBounds(120, 101, 100, 14);
		panel_6.add(label_68);
		
		JLabel label_69 = new JLabel("Heure du match");
		label_69.setBounds(120, 114, 100, 14);
		panel_6.add(label_69);
		
		JLabel label_70 = new JLabel("N\u00B0 match");
		label_70.setBounds(85, 11, 48, 14);
		panel_6.add(label_70);
		
		JLabel label_71 = new JLabel("Nom Joueur 2-2");
		label_71.setBounds(10, 75, 100, 14);
		panel_6.add(label_71);
		
		JLabel label_72 = new JLabel("Nom Joueur 2-1");
		label_72.setBounds(10, 62, 100, 14);
		panel_6.add(label_72);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBounds(24, 161, 228, 139);
		panel_tour.add(panel_7);
		
		JLabel label_73 = new JLabel("Nom Joueur 1-1");
		label_73.setBounds(10, 24, 100, 14);
		panel_7.add(label_73);
		
		JLabel label_74 = new JLabel("Score Joueur 1");
		label_74.setBounds(120, 37, 100, 14);
		panel_7.add(label_74);
		
		JLabel label_75 = new JLabel("Score Joueur 2");
		label_75.setBounds(120, 74, 100, 14);
		panel_7.add(label_75);
		
		JLabel label_76 = new JLabel("Nom Joueur 1-2");
		label_76.setBounds(10, 37, 100, 14);
		panel_7.add(label_76);
		
		JLabel label_77 = new JLabel("N\u00B0 du cour");
		label_77.setBounds(10, 101, 100, 14);
		panel_7.add(label_77);
		
		JLabel label_78 = new JLabel("Date du match");
		label_78.setBounds(10, 114, 100, 14);
		panel_7.add(label_78);
		
		JLabel label_79 = new JLabel("Nom de l'Arbitre");
		label_79.setBounds(120, 101, 100, 14);
		panel_7.add(label_79);
		
		JLabel label_80 = new JLabel("Heure du match");
		label_80.setBounds(120, 114, 100, 14);
		panel_7.add(label_80);
		
		JLabel label_81 = new JLabel("N\u00B0 match");
		label_81.setBounds(85, 11, 48, 14);
		panel_7.add(label_81);
		
		JLabel label_82 = new JLabel("Nom Joueur 2-2");
		label_82.setBounds(10, 75, 100, 14);
		panel_7.add(label_82);
		
		JLabel label_83 = new JLabel("Nom Joueur 2-1");
		label_83.setBounds(10, 62, 100, 14);
		panel_7.add(label_83);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBounds(738, 461, 228, 139);
		panel_tour.add(panel_8);
		
		JLabel label_84 = new JLabel("Nom Joueur 1-1");
		label_84.setBounds(10, 24, 100, 14);
		panel_8.add(label_84);
		
		JLabel label_85 = new JLabel("Score Joueur 1");
		label_85.setBounds(120, 37, 100, 14);
		panel_8.add(label_85);
		
		JLabel label_86 = new JLabel("Score Joueur 2");
		label_86.setBounds(120, 74, 100, 14);
		panel_8.add(label_86);
		
		JLabel label_87 = new JLabel("Nom Joueur 1-2");
		label_87.setBounds(10, 37, 100, 14);
		panel_8.add(label_87);
		
		JLabel label_88 = new JLabel("N\u00B0 du cour");
		label_88.setBounds(10, 101, 100, 14);
		panel_8.add(label_88);
		
		JLabel label_89 = new JLabel("Date du match");
		label_89.setBounds(10, 114, 100, 14);
		panel_8.add(label_89);
		
		JLabel label_90 = new JLabel("Nom de l'Arbitre");
		label_90.setBounds(120, 101, 100, 14);
		panel_8.add(label_90);
		
		JLabel label_91 = new JLabel("Heure du match");
		label_91.setBounds(120, 114, 100, 14);
		panel_8.add(label_91);
		
		JLabel label_92 = new JLabel("N\u00B0 match");
		label_92.setBounds(85, 11, 48, 14);
		panel_8.add(label_92);
		
		JLabel label_93 = new JLabel("Nom Joueur 2-2");
		label_93.setBounds(10, 75, 100, 14);
		panel_8.add(label_93);
		
		JLabel label_94 = new JLabel("Nom Joueur 2-1");
		label_94.setBounds(10, 62, 100, 14);
		panel_8.add(label_94);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBounds(500, 461, 228, 139);
		panel_tour.add(panel_9);
		
		JLabel label_95 = new JLabel("Nom Joueur 1-1");
		label_95.setBounds(10, 24, 100, 14);
		panel_9.add(label_95);
		
		JLabel label_96 = new JLabel("Score Joueur 1");
		label_96.setBounds(120, 37, 100, 14);
		panel_9.add(label_96);
		
		JLabel label_97 = new JLabel("Score Joueur 2");
		label_97.setBounds(120, 74, 100, 14);
		panel_9.add(label_97);
		
		JLabel label_98 = new JLabel("Nom Joueur 1-2");
		label_98.setBounds(10, 37, 100, 14);
		panel_9.add(label_98);
		
		JLabel label_99 = new JLabel("N\u00B0 du cour");
		label_99.setBounds(10, 101, 100, 14);
		panel_9.add(label_99);
		
		JLabel label_100 = new JLabel("Date du match");
		label_100.setBounds(10, 114, 100, 14);
		panel_9.add(label_100);
		
		JLabel label_101 = new JLabel("Nom de l'Arbitre");
		label_101.setBounds(120, 101, 100, 14);
		panel_9.add(label_101);
		
		JLabel label_102 = new JLabel("Heure du match");
		label_102.setBounds(120, 114, 100, 14);
		panel_9.add(label_102);
		
		JLabel label_103 = new JLabel("N\u00B0 match");
		label_103.setBounds(85, 11, 48, 14);
		panel_9.add(label_103);
		
		JLabel label_104 = new JLabel("Nom Joueur 2-2");
		label_104.setBounds(10, 75, 100, 14);
		panel_9.add(label_104);
		
		JLabel label_105 = new JLabel("Nom Joueur 2-1");
		label_105.setBounds(10, 62, 100, 14);
		panel_9.add(label_105);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBounds(262, 461, 228, 139);
		panel_tour.add(panel_10);
		
		JLabel label_106 = new JLabel("Nom Joueur 1-1");
		label_106.setBounds(10, 24, 100, 14);
		panel_10.add(label_106);
		
		JLabel label_107 = new JLabel("Score Joueur 1");
		label_107.setBounds(120, 37, 100, 14);
		panel_10.add(label_107);
		
		JLabel label_108 = new JLabel("Score Joueur 2");
		label_108.setBounds(120, 74, 100, 14);
		panel_10.add(label_108);
		
		JLabel label_109 = new JLabel("Nom Joueur 1-2");
		label_109.setBounds(10, 37, 100, 14);
		panel_10.add(label_109);
		
		JLabel label_110 = new JLabel("N\u00B0 du cour");
		label_110.setBounds(10, 101, 100, 14);
		panel_10.add(label_110);
		
		JLabel label_111 = new JLabel("Date du match");
		label_111.setBounds(10, 114, 100, 14);
		panel_10.add(label_111);
		
		JLabel label_112 = new JLabel("Nom de l'Arbitre");
		label_112.setBounds(120, 101, 100, 14);
		panel_10.add(label_112);
		
		JLabel label_113 = new JLabel("Heure du match");
		label_113.setBounds(120, 114, 100, 14);
		panel_10.add(label_113);
		
		JLabel label_114 = new JLabel("N\u00B0 match");
		label_114.setBounds(85, 11, 48, 14);
		panel_10.add(label_114);
		
		JLabel label_115 = new JLabel("Nom Joueur 2-2");
		label_115.setBounds(10, 75, 100, 14);
		panel_10.add(label_115);
		
		JLabel label_116 = new JLabel("Nom Joueur 2-1");
		label_116.setBounds(10, 62, 100, 14);
		panel_10.add(label_116);
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBounds(24, 461, 228, 139);
		panel_tour.add(panel_11);
		
		JLabel label_117 = new JLabel("Nom Joueur 1-1");
		label_117.setBounds(10, 24, 100, 14);
		panel_11.add(label_117);
		
		JLabel label_118 = new JLabel("Score Joueur 1");
		label_118.setBounds(120, 37, 100, 14);
		panel_11.add(label_118);
		
		JLabel label_119 = new JLabel("Score Joueur 2");
		label_119.setBounds(120, 74, 100, 14);
		panel_11.add(label_119);
		
		JLabel label_120 = new JLabel("Nom Joueur 1-2");
		label_120.setBounds(10, 37, 100, 14);
		panel_11.add(label_120);
		
		JLabel label_121 = new JLabel("N\u00B0 du cour");
		label_121.setBounds(10, 101, 100, 14);
		panel_11.add(label_121);
		
		JLabel label_122 = new JLabel("Date du match");
		label_122.setBounds(10, 114, 100, 14);
		panel_11.add(label_122);
		
		JLabel label_123 = new JLabel("Nom de l'Arbitre");
		label_123.setBounds(120, 101, 100, 14);
		panel_11.add(label_123);
		
		JLabel label_124 = new JLabel("Heure du match");
		label_124.setBounds(120, 114, 100, 14);
		panel_11.add(label_124);
		
		JLabel label_125 = new JLabel("N\u00B0 match");
		label_125.setBounds(85, 11, 48, 14);
		panel_11.add(label_125);
		
		JLabel label_126 = new JLabel("Nom Joueur 2-2");
		label_126.setBounds(10, 75, 100, 14);
		panel_11.add(label_126);
		
		JLabel label_127 = new JLabel("Nom Joueur 2-1");
		label_127.setBounds(10, 62, 100, 14);
		panel_11.add(label_127);
		
		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBounds(24, 311, 228, 139);
		panel_tour.add(panel_12);
		
		JLabel label_128 = new JLabel("Nom Joueur 1-1");
		label_128.setBounds(10, 24, 100, 14);
		panel_12.add(label_128);
		
		JLabel label_129 = new JLabel("Score Joueur 1");
		label_129.setBounds(120, 37, 100, 14);
		panel_12.add(label_129);
		
		JLabel label_130 = new JLabel("Score Joueur 2");
		label_130.setBounds(120, 74, 100, 14);
		panel_12.add(label_130);
		
		JLabel label_131 = new JLabel("Nom Joueur 1-2");
		label_131.setBounds(10, 37, 100, 14);
		panel_12.add(label_131);
		
		JLabel label_132 = new JLabel("N\u00B0 du cour");
		label_132.setBounds(10, 101, 100, 14);
		panel_12.add(label_132);
		
		JLabel label_133 = new JLabel("Date du match");
		label_133.setBounds(10, 114, 100, 14);
		panel_12.add(label_133);
		
		JLabel label_134 = new JLabel("Nom de l'Arbitre");
		label_134.setBounds(120, 101, 100, 14);
		panel_12.add(label_134);
		
		JLabel label_135 = new JLabel("Heure du match");
		label_135.setBounds(120, 114, 100, 14);
		panel_12.add(label_135);
		
		JLabel label_136 = new JLabel("N\u00B0 match");
		label_136.setBounds(85, 11, 48, 14);
		panel_12.add(label_136);
		
		JLabel label_137 = new JLabel("Nom Joueur 2-2");
		label_137.setBounds(10, 75, 100, 14);
		panel_12.add(label_137);
		
		JLabel label_138 = new JLabel("Nom Joueur 2-1");
		label_138.setBounds(10, 62, 100, 14);
		panel_12.add(label_138);
		
		JPanel panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBounds(262, 311, 228, 139);
		panel_tour.add(panel_13);
		
		JLabel label_139 = new JLabel("Nom Joueur 1-1");
		label_139.setBounds(10, 24, 100, 14);
		panel_13.add(label_139);
		
		JLabel label_140 = new JLabel("Score Joueur 1");
		label_140.setBounds(120, 37, 100, 14);
		panel_13.add(label_140);
		
		JLabel label_141 = new JLabel("Score Joueur 2");
		label_141.setBounds(120, 74, 100, 14);
		panel_13.add(label_141);
		
		JLabel label_142 = new JLabel("Nom Joueur 1-2");
		label_142.setBounds(10, 37, 100, 14);
		panel_13.add(label_142);
		
		JLabel label_143 = new JLabel("N\u00B0 du cour");
		label_143.setBounds(10, 101, 100, 14);
		panel_13.add(label_143);
		
		JLabel label_144 = new JLabel("Date du match");
		label_144.setBounds(10, 114, 100, 14);
		panel_13.add(label_144);
		
		JLabel label_145 = new JLabel("Nom de l'Arbitre");
		label_145.setBounds(120, 101, 100, 14);
		panel_13.add(label_145);
		
		JLabel label_146 = new JLabel("Heure du match");
		label_146.setBounds(120, 114, 100, 14);
		panel_13.add(label_146);
		
		JLabel label_147 = new JLabel("N\u00B0 match");
		label_147.setBounds(85, 11, 48, 14);
		panel_13.add(label_147);
		
		JLabel label_148 = new JLabel("Nom Joueur 2-2");
		label_148.setBounds(10, 75, 100, 14);
		panel_13.add(label_148);
		
		JLabel label_149 = new JLabel("Nom Joueur 2-1");
		label_149.setBounds(10, 62, 100, 14);
		panel_13.add(label_149);
		
		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBounds(500, 311, 228, 139);
		panel_tour.add(panel_14);
		
		JLabel label_150 = new JLabel("Nom Joueur 1-1");
		label_150.setBounds(10, 24, 100, 14);
		panel_14.add(label_150);
		
		JLabel label_151 = new JLabel("Score Joueur 1");
		label_151.setBounds(120, 37, 100, 14);
		panel_14.add(label_151);
		
		JLabel label_152 = new JLabel("Score Joueur 2");
		label_152.setBounds(120, 74, 100, 14);
		panel_14.add(label_152);
		
		JLabel label_153 = new JLabel("Nom Joueur 1-2");
		label_153.setBounds(10, 37, 100, 14);
		panel_14.add(label_153);
		
		JLabel label_154 = new JLabel("N\u00B0 du cour");
		label_154.setBounds(10, 101, 100, 14);
		panel_14.add(label_154);
		
		JLabel label_155 = new JLabel("Date du match");
		label_155.setBounds(10, 114, 100, 14);
		panel_14.add(label_155);
		
		JLabel label_156 = new JLabel("Nom de l'Arbitre");
		label_156.setBounds(120, 101, 100, 14);
		panel_14.add(label_156);
		
		JLabel label_157 = new JLabel("Heure du match");
		label_157.setBounds(120, 114, 100, 14);
		panel_14.add(label_157);
		
		JLabel label_158 = new JLabel("N\u00B0 match");
		label_158.setBounds(85, 11, 48, 14);
		panel_14.add(label_158);
		
		JLabel label_159 = new JLabel("Nom Joueur 2-2");
		label_159.setBounds(10, 75, 100, 14);
		panel_14.add(label_159);
		
		JLabel label_160 = new JLabel("Nom Joueur 2-1");
		label_160.setBounds(10, 62, 100, 14);
		panel_14.add(label_160);
		
		JPanel panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBounds(738, 311, 228, 139);
		panel_tour.add(panel_15);
		
		JLabel label_161 = new JLabel("Nom Joueur 1-1");
		label_161.setBounds(10, 24, 100, 14);
		panel_15.add(label_161);
		
		JLabel label_162 = new JLabel("Score Joueur 1");
		label_162.setBounds(120, 37, 100, 14);
		panel_15.add(label_162);
		
		JLabel label_163 = new JLabel("Score Joueur 2");
		label_163.setBounds(120, 74, 100, 14);
		panel_15.add(label_163);
		
		JLabel label_164 = new JLabel("Nom Joueur 1-2");
		label_164.setBounds(10, 37, 100, 14);
		panel_15.add(label_164);
		
		JLabel label_165 = new JLabel("N\u00B0 du cour");
		label_165.setBounds(10, 101, 100, 14);
		panel_15.add(label_165);
		
		JLabel label_166 = new JLabel("Date du match");
		label_166.setBounds(10, 114, 100, 14);
		panel_15.add(label_166);
		
		JLabel label_167 = new JLabel("Nom de l'Arbitre");
		label_167.setBounds(120, 101, 100, 14);
		panel_15.add(label_167);
		
		JLabel label_168 = new JLabel("Heure du match");
		label_168.setBounds(120, 114, 100, 14);
		panel_15.add(label_168);
		
		JLabel label_169 = new JLabel("N\u00B0 match");
		label_169.setBounds(85, 11, 48, 14);
		panel_15.add(label_169);
		
		JLabel label_170 = new JLabel("Nom Joueur 2-2");
		label_170.setBounds(10, 75, 100, 14);
		panel_15.add(label_170);
		
		JLabel label_171 = new JLabel("Nom Joueur 2-1");
		label_171.setBounds(10, 62, 100, 14);
		panel_15.add(label_171);
		
		JPanel panel_menu = new JPanel();
		panel_menu.setLayout(null);
		panel_menu.setBounds(10, 11, 975, 43);
		contentPane.add(panel_menu);
		
		JButton button = new JButton("Retour");
		button.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button.setBounds(10, 11, 77, 23);
		panel_menu.add(button);
		
		JButton btn_t1 = new JButton("Tour 1");
		btn_t1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btn_t1.setBounds(612, 11, 77, 23);
		panel_menu.add(btn_t1);
		
		JButton button_3 = new JButton("16/Final");
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button_3.setBounds(873, 11, 92, 23);
		panel_menu.add(button_3);
		
		JButton btnTour = new JButton("Tour 2");
		btnTour.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnTour.setBounds(699, 11, 77, 23);
		panel_menu.add(btnTour);
		
		JButton button_1 = new JButton("Tour 2");
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button_1.setBounds(786, 11, 77, 23);
		panel_menu.add(button_1);
	}
}
