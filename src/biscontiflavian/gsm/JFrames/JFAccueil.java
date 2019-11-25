package biscontiflavian.gsm.JFrames;

import java.awt.EventQueue;

import java.sql.Connection;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import biscontiflavian.gsm.ClassesDAO.ArbitreDAO;
import biscontiflavian.gsm.ClassesDAO.ConnexionDAO;
import biscontiflavian.gsm.ClassesDAO.DAO;
import biscontiflavian.gsm.ClassesDAO.JoueurDAO;
import biscontiflavian.gsm.ClassesPOJO.ArbitrePOJO;
import biscontiflavian.gsm.ClassesPOJO.EquipePOJO;
import biscontiflavian.gsm.ClassesPOJO.JoueurPOJO;
import biscontiflavian.gsm.ClassesPOJO.TournoiPOJO;
import biscontiflavian.gsm.ClassesUtilitaires.CUSexe;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;

public class JFAccueil extends JFrame {
	
	private static final long serialVersionUID = -1309977255491777036L;
	private JPanel contentPane;
	private final String mdp = "projettennis";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFAccueil frame = new JFAccueil();
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
	public JFAccueil() {
		//Configuration des composants graphiques******************************************************************************
		JFAccueil frame = this;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_titre = new JLabel("Grand Slam Manager");
		lbl_titre.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_titre.setBackground(Color.LIGHT_GRAY);
		lbl_titre.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lbl_titre.setBounds(118, 11, 203, 59);
		contentPane.add(lbl_titre);
		
		JLabel lbl_token = new JLabel("Token");
		lbl_token.setBackground(Color.LIGHT_GRAY);
		lbl_token.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lbl_token.setBounds(100, 80, 50, 20);
		contentPane.add(lbl_token);
		
		JLabel lbl_tournoi = new JLabel("Tournoi");
		lbl_tournoi.setBackground(Color.LIGHT_GRAY);
		lbl_tournoi.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lbl_tournoi.setBounds(100, 135, 50, 20);
		contentPane.add(lbl_tournoi);
		
		JPasswordField txt_token = new JPasswordField();
		txt_token.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_token.setToolTipText("");
		txt_token.setBounds(220, 80, 150, 20);
		contentPane.add(txt_token);
		
		JTextPane txt_tournoi = new JTextPane();
		txt_tournoi.setToolTipText("");
		txt_tournoi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_tournoi.setBounds(220, 135, 150, 20);
		contentPane.add(txt_tournoi);
		
		JButton btn_confirmer = new JButton("Confirmer");
		btn_confirmer.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txt_token.getText().length() >= 3 && txt_tournoi.getText().length() >= 5)
				{
					if(txt_token.getText().equals(mdp))
					{
						//Création du tournoi**************************************************************************************
						ArrayList<EquipePOJO> SH = new ArrayList<EquipePOJO>();
						ArrayList<EquipePOJO> SD = new ArrayList<EquipePOJO>();
						ArrayList<EquipePOJO> DH = new ArrayList<EquipePOJO>();
						ArrayList<EquipePOJO> DD = new ArrayList<EquipePOJO>();
						ArrayList<EquipePOJO> DM = new ArrayList<EquipePOJO>();
						
						/*DAO<JoueurPOJO> daoJoueur = new JoueurDAO(ConnexionDAO.getInstance());
						ArrayList<JoueurPOJO> l_hommes = daoJoueur.getAll("H");
						ArrayList<JoueurPOJO> l_femmes = daoJoueur.getAll("F");
						
						if(l_hommes.size() == 128 || l_femmes.size() == 128)
						{
							for(int i=0;i<128;i++)
							{
								EquipePOJO e1 = new EquipePOJO(new JoueurPOJO[] {l_hommes.get(i)});
								EquipePOJO e2 = new EquipePOJO(new JoueurPOJO[] {l_femmes.get(i)});
								SH.add(e1);
								SD.add(e2);
							}
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Erreur, nombre de joueurs masculins et/ou féminins inadéquats. Fermeture du programme");
							System.exit(0);
						}
						
						Collections.shuffle(l_femmes);
						Collections.shuffle(l_hommes);
						
						for(int i=0;i<64;i++)
						{
							EquipePOJO e1 = new EquipePOJO(new JoueurPOJO[] {l_hommes.get(i),l_hommes.get(63-i)});
							EquipePOJO e2 = new EquipePOJO(new JoueurPOJO[] {l_femmes.get(i),l_femmes.get(63-i)});
							DH.add(e1);
							DD.add(e2);
						}
						
						Collections.shuffle(l_femmes);
						Collections.shuffle(l_hommes);
						
						for(int i=0;i<64;i++)
						{
							EquipePOJO eq = new EquipePOJO(new JoueurPOJO[] {l_hommes.get(i),l_femmes.get(i)});
							DM.add(eq);
						}*/
						
						for(int i=0;i<128;i++)
						{
							EquipePOJO e1 = new EquipePOJO(new JoueurPOJO[] {new JoueurPOJO("Joueur"+(i+1), "M", i+1, CUSexe.M)});
							EquipePOJO e2 = new EquipePOJO(new JoueurPOJO[] {new JoueurPOJO("Joueur"+(i+1), "F", i+1, CUSexe.F)});
							SH.add(e1);
							SD.add(e2);
						}
						
						for(int i=0;i<64;i++)
						{
							EquipePOJO e1 = new EquipePOJO(new JoueurPOJO[] {new JoueurPOJO("Joueur"+(i+1), "M", i+1, CUSexe.M),new JoueurPOJO("Joueur"+(i+1), "M", i+1, CUSexe.M)});
							EquipePOJO e2 = new EquipePOJO(new JoueurPOJO[] {new JoueurPOJO("Joueur"+(i+1), "F", i+1, CUSexe.F),new JoueurPOJO("Joueur"+(i+1), "F", i+1, CUSexe.F)});
							EquipePOJO e3 = new EquipePOJO(new JoueurPOJO[] {new JoueurPOJO("Joueur"+(i+1), "F", i+1, CUSexe.F),new JoueurPOJO("Joueur"+(i+1), "M", i+1, CUSexe.M)});
							DH.add(e1);
							DD.add(e2);
							DM.add(e3);
						}
						
						DAO<ArbitrePOJO> daoArbitre = new ArbitreDAO(ConnexionDAO.getInstance());
						ArrayList<ArbitrePOJO> arbitres = daoArbitre.getAll();
						
						/*for(int i=0;i<16;i++)
						{
							arbitres.add(new ArbitrePOJO("Arbitre", String.valueOf(i+1)));
						}*/
						
						TournoiPOJO tournoi = new TournoiPOJO(txt_tournoi.getText(),SH,SD,DH,DD,DM,arbitres);
						
						JFTournoi newFrame = new JFTournoi(tournoi);
						newFrame.show();
						frame.dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Token incorrect");
					}
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Veuillez entrer un token et nom de tournoi valide");
				}
			}
		});
		btn_confirmer.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btn_confirmer.setBounds(100, 191, 120, 25);
		contentPane.add(btn_confirmer);
		
		JButton btn_quitter = new JButton("Quitter");
		btn_quitter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		btn_quitter.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btn_quitter.setBounds(251, 191, 120, 25);
		contentPane.add(btn_quitter);
	}
}
