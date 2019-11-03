package biscontiflavian.gsm.JFrames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class JFAccueil extends JFrame {

	private JPanel contentPane;

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
		btn_confirmer.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btn_confirmer.setBounds(100, 191, 120, 25);
		contentPane.add(btn_confirmer);
		
		JButton btn_quitter = new JButton("Quitter");
		btn_quitter.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btn_quitter.setBounds(251, 191, 120, 25);
		contentPane.add(btn_quitter);
	}
}
