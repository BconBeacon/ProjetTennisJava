package biscontiflavian.gsm.JFrames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JFAccueil extends JFrame {

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
		
		JTextPane txt_token = new JTextPane();
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
				if(txt_token.getText().length() >= 3 || txt_tournoi.getText().length() >= 5)
				{
					if(txt_token.getText().equals(mdp))
					{
						JFTournoi newFrame = new JFTournoi();
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
