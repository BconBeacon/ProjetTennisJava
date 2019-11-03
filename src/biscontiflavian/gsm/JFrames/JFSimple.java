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
		
		JButton btn_t5 = new JButton("Tour 5");
		btn_t5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btn_t5.setBounds(699, 11, 77, 23);
		panel_menu.add(btn_t5);
		
		JButton btn_t6 = new JButton("Tour 6");
		btn_t6.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btn_t6.setBounds(786, 11, 77, 23);
		panel_menu.add(btn_t6);
		
		JButton btn_final = new JButton("16/Final");
		btn_final.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btn_final.setBounds(873, 11, 92, 23);
		panel_menu.add(btn_final);
		
		JButton btn_t3 = new JButton("Tour 3");
		btn_t3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btn_t3.setBounds(525, 11, 77, 23);
		panel_menu.add(btn_t3);
		
		JButton btn_t4 = new JButton("Tour 4");
		btn_t4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btn_t4.setBounds(612, 11, 77, 23);
		panel_menu.add(btn_t4);
		
		JButton btn_t1 = new JButton("Tour 1");
		btn_t1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btn_t1.setBounds(351, 11, 77, 23);
		panel_menu.add(btn_t1);
		
		JButton btn_t2 = new JButton("Tour 2");
		btn_t2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btn_t2.setBounds(438, 11, 77, 23);
		panel_menu.add(btn_t2);
		
		JPanel panel_tour = new JPanel();
		panel_tour.setBounds(10, 65, 975, 776);
		contentPane.add(panel_tour);
		panel_tour.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(24, 11, 228, 139);
		panel_tour.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nom Joueur 1");
		lblNewLabel.setBounds(10, 39, 100, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Score Joueur 1");
		lblNewLabel_1.setBounds(120, 39, 100, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblScoreJoueur = new JLabel("Score Joueur 2");
		lblScoreJoueur.setBounds(120, 64, 100, 14);
		panel_1.add(lblScoreJoueur);
		
		JLabel lblNomJoueur = new JLabel("Nom Joueur 2");
		lblNomJoueur.setBounds(10, 64, 100, 14);
		panel_1.add(lblNomJoueur);
		
		JLabel lblNDuCour = new JLabel("N\u00B0 du cour");
		lblNDuCour.setBounds(10, 89, 100, 14);
		panel_1.add(lblNDuCour);
		
		JLabel lblNewLabel_2 = new JLabel("Date du match");
		lblNewLabel_2.setBounds(10, 114, 100, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nom de l'Arbitre");
		lblNewLabel_3.setBounds(120, 89, 100, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Heure du match");
		lblNewLabel_4.setBounds(120, 114, 100, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("N\u00B0 match");
		lblNewLabel_5.setBounds(85, 11, 48, 14);
		panel_1.add(lblNewLabel_5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(262, 11, 228, 139);
		panel_tour.add(panel_2);
		
		JLabel label = new JLabel("Nom Joueur 1");
		label.setBounds(10, 39, 100, 14);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("Score Joueur 1");
		label_1.setBounds(120, 39, 100, 14);
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("Score Joueur 2");
		label_2.setBounds(120, 64, 100, 14);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("Nom Joueur 2");
		label_3.setBounds(10, 64, 100, 14);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("N\u00B0 du cour");
		label_4.setBounds(10, 89, 100, 14);
		panel_2.add(label_4);
		
		JLabel label_5 = new JLabel("Date du match");
		label_5.setBounds(10, 114, 100, 14);
		panel_2.add(label_5);
		
		JLabel label_6 = new JLabel("Nom de l'Arbitre");
		label_6.setBounds(120, 89, 100, 14);
		panel_2.add(label_6);
		
		JLabel label_7 = new JLabel("Heure du match");
		label_7.setBounds(120, 114, 100, 14);
		panel_2.add(label_7);
		
		JLabel label_8 = new JLabel("N\u00B0 match");
		label_8.setBounds(85, 11, 48, 14);
		panel_2.add(label_8);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(500, 11, 228, 139);
		panel_tour.add(panel_3);
		
		JLabel label_9 = new JLabel("Nom Joueur 1");
		label_9.setBounds(10, 39, 100, 14);
		panel_3.add(label_9);
		
		JLabel label_10 = new JLabel("Score Joueur 1");
		label_10.setBounds(120, 39, 100, 14);
		panel_3.add(label_10);
		
		JLabel label_11 = new JLabel("Score Joueur 2");
		label_11.setBounds(120, 64, 100, 14);
		panel_3.add(label_11);
		
		JLabel label_12 = new JLabel("Nom Joueur 2");
		label_12.setBounds(10, 64, 100, 14);
		panel_3.add(label_12);
		
		JLabel label_13 = new JLabel("N\u00B0 du cour");
		label_13.setBounds(10, 89, 100, 14);
		panel_3.add(label_13);
		
		JLabel label_14 = new JLabel("Date du match");
		label_14.setBounds(10, 114, 100, 14);
		panel_3.add(label_14);
		
		JLabel label_15 = new JLabel("Nom de l'Arbitre");
		label_15.setBounds(120, 89, 100, 14);
		panel_3.add(label_15);
		
		JLabel label_16 = new JLabel("Heure du match");
		label_16.setBounds(120, 114, 100, 14);
		panel_3.add(label_16);
		
		JLabel label_17 = new JLabel("N\u00B0 match");
		label_17.setBounds(85, 11, 48, 14);
		panel_3.add(label_17);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(738, 11, 228, 139);
		panel_tour.add(panel_4);
		
		JLabel label_18 = new JLabel("Nom Joueur 1");
		label_18.setBounds(10, 39, 100, 14);
		panel_4.add(label_18);
		
		JLabel label_19 = new JLabel("Score Joueur 1");
		label_19.setBounds(120, 39, 100, 14);
		panel_4.add(label_19);
		
		JLabel label_20 = new JLabel("Score Joueur 2");
		label_20.setBounds(120, 64, 100, 14);
		panel_4.add(label_20);
		
		JLabel label_21 = new JLabel("Nom Joueur 2");
		label_21.setBounds(10, 64, 100, 14);
		panel_4.add(label_21);
		
		JLabel label_22 = new JLabel("N\u00B0 du cour");
		label_22.setBounds(10, 89, 100, 14);
		panel_4.add(label_22);
		
		JLabel label_23 = new JLabel("Date du match");
		label_23.setBounds(10, 114, 100, 14);
		panel_4.add(label_23);
		
		JLabel label_24 = new JLabel("Nom de l'Arbitre");
		label_24.setBounds(120, 89, 100, 14);
		panel_4.add(label_24);
		
		JLabel label_25 = new JLabel("Heure du match");
		label_25.setBounds(120, 114, 100, 14);
		panel_4.add(label_25);
		
		JLabel label_26 = new JLabel("N\u00B0 match");
		label_26.setBounds(85, 11, 48, 14);
		panel_4.add(label_26);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(24, 161, 228, 139);
		panel_tour.add(panel_5);
		
		JLabel label_27 = new JLabel("Nom Joueur 1");
		label_27.setBounds(10, 39, 100, 14);
		panel_5.add(label_27);
		
		JLabel label_28 = new JLabel("Score Joueur 1");
		label_28.setBounds(120, 39, 100, 14);
		panel_5.add(label_28);
		
		JLabel label_29 = new JLabel("Score Joueur 2");
		label_29.setBounds(120, 64, 100, 14);
		panel_5.add(label_29);
		
		JLabel label_30 = new JLabel("Nom Joueur 2");
		label_30.setBounds(10, 64, 100, 14);
		panel_5.add(label_30);
		
		JLabel label_31 = new JLabel("N\u00B0 du cour");
		label_31.setBounds(10, 89, 100, 14);
		panel_5.add(label_31);
		
		JLabel label_32 = new JLabel("Date du match");
		label_32.setBounds(10, 114, 100, 14);
		panel_5.add(label_32);
		
		JLabel label_33 = new JLabel("Nom de l'Arbitre");
		label_33.setBounds(120, 89, 100, 14);
		panel_5.add(label_33);
		
		JLabel label_34 = new JLabel("Heure du match");
		label_34.setBounds(120, 114, 100, 14);
		panel_5.add(label_34);
		
		JLabel label_35 = new JLabel("N\u00B0 match");
		label_35.setBounds(85, 11, 48, 14);
		panel_5.add(label_35);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBounds(262, 161, 228, 139);
		panel_tour.add(panel_6);
		
		JLabel label_36 = new JLabel("Nom Joueur 1");
		label_36.setBounds(10, 39, 100, 14);
		panel_6.add(label_36);
		
		JLabel label_37 = new JLabel("Score Joueur 1");
		label_37.setBounds(120, 39, 100, 14);
		panel_6.add(label_37);
		
		JLabel label_38 = new JLabel("Score Joueur 2");
		label_38.setBounds(120, 64, 100, 14);
		panel_6.add(label_38);
		
		JLabel label_39 = new JLabel("Nom Joueur 2");
		label_39.setBounds(10, 64, 100, 14);
		panel_6.add(label_39);
		
		JLabel label_40 = new JLabel("N\u00B0 du cour");
		label_40.setBounds(10, 89, 100, 14);
		panel_6.add(label_40);
		
		JLabel label_41 = new JLabel("Date du match");
		label_41.setBounds(10, 114, 100, 14);
		panel_6.add(label_41);
		
		JLabel label_42 = new JLabel("Nom de l'Arbitre");
		label_42.setBounds(120, 89, 100, 14);
		panel_6.add(label_42);
		
		JLabel label_43 = new JLabel("Heure du match");
		label_43.setBounds(120, 114, 100, 14);
		panel_6.add(label_43);
		
		JLabel label_44 = new JLabel("N\u00B0 match");
		label_44.setBounds(85, 11, 48, 14);
		panel_6.add(label_44);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBounds(500, 161, 228, 139);
		panel_tour.add(panel_7);
		
		JLabel label_45 = new JLabel("Nom Joueur 1");
		label_45.setBounds(10, 39, 100, 14);
		panel_7.add(label_45);
		
		JLabel label_46 = new JLabel("Score Joueur 1");
		label_46.setBounds(120, 39, 100, 14);
		panel_7.add(label_46);
		
		JLabel label_47 = new JLabel("Score Joueur 2");
		label_47.setBounds(120, 64, 100, 14);
		panel_7.add(label_47);
		
		JLabel label_48 = new JLabel("Nom Joueur 2");
		label_48.setBounds(10, 64, 100, 14);
		panel_7.add(label_48);
		
		JLabel label_49 = new JLabel("N\u00B0 du cour");
		label_49.setBounds(10, 89, 100, 14);
		panel_7.add(label_49);
		
		JLabel label_50 = new JLabel("Date du match");
		label_50.setBounds(10, 114, 100, 14);
		panel_7.add(label_50);
		
		JLabel label_51 = new JLabel("Nom de l'Arbitre");
		label_51.setBounds(120, 89, 100, 14);
		panel_7.add(label_51);
		
		JLabel label_52 = new JLabel("Heure du match");
		label_52.setBounds(120, 114, 100, 14);
		panel_7.add(label_52);
		
		JLabel label_53 = new JLabel("N\u00B0 match");
		label_53.setBounds(85, 11, 48, 14);
		panel_7.add(label_53);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBounds(738, 161, 228, 139);
		panel_tour.add(panel_8);
		
		JLabel label_54 = new JLabel("Nom Joueur 1");
		label_54.setBounds(10, 39, 100, 14);
		panel_8.add(label_54);
		
		JLabel label_55 = new JLabel("Score Joueur 1");
		label_55.setBounds(120, 39, 100, 14);
		panel_8.add(label_55);
		
		JLabel label_56 = new JLabel("Score Joueur 2");
		label_56.setBounds(120, 64, 100, 14);
		panel_8.add(label_56);
		
		JLabel label_57 = new JLabel("Nom Joueur 2");
		label_57.setBounds(10, 64, 100, 14);
		panel_8.add(label_57);
		
		JLabel label_58 = new JLabel("N\u00B0 du cour");
		label_58.setBounds(10, 89, 100, 14);
		panel_8.add(label_58);
		
		JLabel label_59 = new JLabel("Date du match");
		label_59.setBounds(10, 114, 100, 14);
		panel_8.add(label_59);
		
		JLabel label_60 = new JLabel("Nom de l'Arbitre");
		label_60.setBounds(120, 89, 100, 14);
		panel_8.add(label_60);
		
		JLabel label_61 = new JLabel("Heure du match");
		label_61.setBounds(120, 114, 100, 14);
		panel_8.add(label_61);
		
		JLabel label_62 = new JLabel("N\u00B0 match");
		label_62.setBounds(85, 11, 48, 14);
		panel_8.add(label_62);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBounds(24, 461, 228, 139);
		panel_tour.add(panel_9);
		
		JLabel label_63 = new JLabel("Nom Joueur 1");
		label_63.setBounds(10, 39, 100, 14);
		panel_9.add(label_63);
		
		JLabel label_64 = new JLabel("Score Joueur 1");
		label_64.setBounds(120, 39, 100, 14);
		panel_9.add(label_64);
		
		JLabel label_65 = new JLabel("Score Joueur 2");
		label_65.setBounds(120, 64, 100, 14);
		panel_9.add(label_65);
		
		JLabel label_66 = new JLabel("Nom Joueur 2");
		label_66.setBounds(10, 64, 100, 14);
		panel_9.add(label_66);
		
		JLabel label_67 = new JLabel("N\u00B0 du cour");
		label_67.setBounds(10, 89, 100, 14);
		panel_9.add(label_67);
		
		JLabel label_68 = new JLabel("Date du match");
		label_68.setBounds(10, 114, 100, 14);
		panel_9.add(label_68);
		
		JLabel label_69 = new JLabel("Nom de l'Arbitre");
		label_69.setBounds(120, 89, 100, 14);
		panel_9.add(label_69);
		
		JLabel label_70 = new JLabel("Heure du match");
		label_70.setBounds(120, 114, 100, 14);
		panel_9.add(label_70);
		
		JLabel label_71 = new JLabel("N\u00B0 match");
		label_71.setBounds(85, 11, 48, 14);
		panel_9.add(label_71);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBounds(262, 461, 228, 139);
		panel_tour.add(panel_10);
		
		JLabel label_72 = new JLabel("Nom Joueur 1");
		label_72.setBounds(10, 39, 100, 14);
		panel_10.add(label_72);
		
		JLabel label_73 = new JLabel("Score Joueur 1");
		label_73.setBounds(120, 39, 100, 14);
		panel_10.add(label_73);
		
		JLabel label_74 = new JLabel("Score Joueur 2");
		label_74.setBounds(120, 64, 100, 14);
		panel_10.add(label_74);
		
		JLabel label_75 = new JLabel("Nom Joueur 2");
		label_75.setBounds(10, 64, 100, 14);
		panel_10.add(label_75);
		
		JLabel label_76 = new JLabel("N\u00B0 du cour");
		label_76.setBounds(10, 89, 100, 14);
		panel_10.add(label_76);
		
		JLabel label_77 = new JLabel("Date du match");
		label_77.setBounds(10, 114, 100, 14);
		panel_10.add(label_77);
		
		JLabel label_78 = new JLabel("Nom de l'Arbitre");
		label_78.setBounds(120, 89, 100, 14);
		panel_10.add(label_78);
		
		JLabel label_79 = new JLabel("Heure du match");
		label_79.setBounds(120, 114, 100, 14);
		panel_10.add(label_79);
		
		JLabel label_80 = new JLabel("N\u00B0 match");
		label_80.setBounds(85, 11, 48, 14);
		panel_10.add(label_80);
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBounds(500, 461, 228, 139);
		panel_tour.add(panel_11);
		
		JLabel label_81 = new JLabel("Nom Joueur 1");
		label_81.setBounds(10, 39, 100, 14);
		panel_11.add(label_81);
		
		JLabel label_82 = new JLabel("Score Joueur 1");
		label_82.setBounds(120, 39, 100, 14);
		panel_11.add(label_82);
		
		JLabel label_83 = new JLabel("Score Joueur 2");
		label_83.setBounds(120, 64, 100, 14);
		panel_11.add(label_83);
		
		JLabel label_84 = new JLabel("Nom Joueur 2");
		label_84.setBounds(10, 64, 100, 14);
		panel_11.add(label_84);
		
		JLabel label_85 = new JLabel("N\u00B0 du cour");
		label_85.setBounds(10, 89, 100, 14);
		panel_11.add(label_85);
		
		JLabel label_86 = new JLabel("Date du match");
		label_86.setBounds(10, 114, 100, 14);
		panel_11.add(label_86);
		
		JLabel label_87 = new JLabel("Nom de l'Arbitre");
		label_87.setBounds(120, 89, 100, 14);
		panel_11.add(label_87);
		
		JLabel label_88 = new JLabel("Heure du match");
		label_88.setBounds(120, 114, 100, 14);
		panel_11.add(label_88);
		
		JLabel label_89 = new JLabel("N\u00B0 match");
		label_89.setBounds(85, 11, 48, 14);
		panel_11.add(label_89);
		
		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBounds(738, 461, 228, 139);
		panel_tour.add(panel_12);
		
		JLabel label_90 = new JLabel("Nom Joueur 1");
		label_90.setBounds(10, 39, 100, 14);
		panel_12.add(label_90);
		
		JLabel label_91 = new JLabel("Score Joueur 1");
		label_91.setBounds(120, 39, 100, 14);
		panel_12.add(label_91);
		
		JLabel label_92 = new JLabel("Score Joueur 2");
		label_92.setBounds(120, 64, 100, 14);
		panel_12.add(label_92);
		
		JLabel label_93 = new JLabel("Nom Joueur 2");
		label_93.setBounds(10, 64, 100, 14);
		panel_12.add(label_93);
		
		JLabel label_94 = new JLabel("N\u00B0 du cour");
		label_94.setBounds(10, 89, 100, 14);
		panel_12.add(label_94);
		
		JLabel label_95 = new JLabel("Date du match");
		label_95.setBounds(10, 114, 100, 14);
		panel_12.add(label_95);
		
		JLabel label_96 = new JLabel("Nom de l'Arbitre");
		label_96.setBounds(120, 89, 100, 14);
		panel_12.add(label_96);
		
		JLabel label_97 = new JLabel("Heure du match");
		label_97.setBounds(120, 114, 100, 14);
		panel_12.add(label_97);
		
		JLabel label_98 = new JLabel("N\u00B0 match");
		label_98.setBounds(85, 11, 48, 14);
		panel_12.add(label_98);
		
		JPanel panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBounds(24, 311, 228, 139);
		panel_tour.add(panel_13);
		
		JLabel label_99 = new JLabel("Nom Joueur 1");
		label_99.setBounds(10, 39, 100, 14);
		panel_13.add(label_99);
		
		JLabel label_100 = new JLabel("Score Joueur 1");
		label_100.setBounds(120, 39, 100, 14);
		panel_13.add(label_100);
		
		JLabel label_101 = new JLabel("Score Joueur 2");
		label_101.setBounds(120, 64, 100, 14);
		panel_13.add(label_101);
		
		JLabel label_102 = new JLabel("Nom Joueur 2");
		label_102.setBounds(10, 64, 100, 14);
		panel_13.add(label_102);
		
		JLabel label_103 = new JLabel("N\u00B0 du cour");
		label_103.setBounds(10, 89, 100, 14);
		panel_13.add(label_103);
		
		JLabel label_104 = new JLabel("Date du match");
		label_104.setBounds(10, 114, 100, 14);
		panel_13.add(label_104);
		
		JLabel label_105 = new JLabel("Nom de l'Arbitre");
		label_105.setBounds(120, 89, 100, 14);
		panel_13.add(label_105);
		
		JLabel label_106 = new JLabel("Heure du match");
		label_106.setBounds(120, 114, 100, 14);
		panel_13.add(label_106);
		
		JLabel label_107 = new JLabel("N\u00B0 match");
		label_107.setBounds(85, 11, 48, 14);
		panel_13.add(label_107);
		
		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBounds(262, 311, 228, 139);
		panel_tour.add(panel_14);
		
		JLabel label_108 = new JLabel("Nom Joueur 1");
		label_108.setBounds(10, 39, 100, 14);
		panel_14.add(label_108);
		
		JLabel label_109 = new JLabel("Score Joueur 1");
		label_109.setBounds(120, 39, 100, 14);
		panel_14.add(label_109);
		
		JLabel label_110 = new JLabel("Score Joueur 2");
		label_110.setBounds(120, 64, 100, 14);
		panel_14.add(label_110);
		
		JLabel label_111 = new JLabel("Nom Joueur 2");
		label_111.setBounds(10, 64, 100, 14);
		panel_14.add(label_111);
		
		JLabel label_112 = new JLabel("N\u00B0 du cour");
		label_112.setBounds(10, 89, 100, 14);
		panel_14.add(label_112);
		
		JLabel label_113 = new JLabel("Date du match");
		label_113.setBounds(10, 114, 100, 14);
		panel_14.add(label_113);
		
		JLabel label_114 = new JLabel("Nom de l'Arbitre");
		label_114.setBounds(120, 89, 100, 14);
		panel_14.add(label_114);
		
		JLabel label_115 = new JLabel("Heure du match");
		label_115.setBounds(120, 114, 100, 14);
		panel_14.add(label_115);
		
		JLabel label_116 = new JLabel("N\u00B0 match");
		label_116.setBounds(85, 11, 48, 14);
		panel_14.add(label_116);
		
		JPanel panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBounds(500, 311, 228, 139);
		panel_tour.add(panel_15);
		
		JLabel label_117 = new JLabel("Nom Joueur 1");
		label_117.setBounds(10, 39, 100, 14);
		panel_15.add(label_117);
		
		JLabel label_118 = new JLabel("Score Joueur 1");
		label_118.setBounds(120, 39, 100, 14);
		panel_15.add(label_118);
		
		JLabel label_119 = new JLabel("Score Joueur 2");
		label_119.setBounds(120, 64, 100, 14);
		panel_15.add(label_119);
		
		JLabel label_120 = new JLabel("Nom Joueur 2");
		label_120.setBounds(10, 64, 100, 14);
		panel_15.add(label_120);
		
		JLabel label_121 = new JLabel("N\u00B0 du cour");
		label_121.setBounds(10, 89, 100, 14);
		panel_15.add(label_121);
		
		JLabel label_122 = new JLabel("Date du match");
		label_122.setBounds(10, 114, 100, 14);
		panel_15.add(label_122);
		
		JLabel label_123 = new JLabel("Nom de l'Arbitre");
		label_123.setBounds(120, 89, 100, 14);
		panel_15.add(label_123);
		
		JLabel label_124 = new JLabel("Heure du match");
		label_124.setBounds(120, 114, 100, 14);
		panel_15.add(label_124);
		
		JLabel label_125 = new JLabel("N\u00B0 match");
		label_125.setBounds(85, 11, 48, 14);
		panel_15.add(label_125);
		
		JPanel panel_16 = new JPanel();
		panel_16.setLayout(null);
		panel_16.setBounds(738, 311, 228, 139);
		panel_tour.add(panel_16);
		
		JLabel label_126 = new JLabel("Nom Joueur 1");
		label_126.setBounds(10, 39, 100, 14);
		panel_16.add(label_126);
		
		JLabel label_127 = new JLabel("Score Joueur 1");
		label_127.setBounds(120, 39, 100, 14);
		panel_16.add(label_127);
		
		JLabel label_128 = new JLabel("Score Joueur 2");
		label_128.setBounds(120, 64, 100, 14);
		panel_16.add(label_128);
		
		JLabel label_129 = new JLabel("Nom Joueur 2");
		label_129.setBounds(10, 64, 100, 14);
		panel_16.add(label_129);
		
		JLabel label_130 = new JLabel("N\u00B0 du cour");
		label_130.setBounds(10, 89, 100, 14);
		panel_16.add(label_130);
		
		JLabel label_131 = new JLabel("Date du match");
		label_131.setBounds(10, 114, 100, 14);
		panel_16.add(label_131);
		
		JLabel label_132 = new JLabel("Nom de l'Arbitre");
		label_132.setBounds(120, 89, 100, 14);
		panel_16.add(label_132);
		
		JLabel label_133 = new JLabel("Heure du match");
		label_133.setBounds(120, 114, 100, 14);
		panel_16.add(label_133);
		
		JLabel label_134 = new JLabel("N\u00B0 match");
		label_134.setBounds(85, 11, 48, 14);
		panel_16.add(label_134);
	}
}
