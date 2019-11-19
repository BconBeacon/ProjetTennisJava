package biscontiflavian.gsm.JFrames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class JFTournoi extends JFrame {
	private static final long serialVersionUID = -3788870959857009959L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFTournoi frame = new JFTournoi();
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
	public JFTournoi() {
		JFTournoi frame = this;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_tournoi = new JLabel("Nom Tournoi - Date");
		lbl_tournoi.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_tournoi.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lbl_tournoi.setBounds(10, 11, 414, 35);
		contentPane.add(lbl_tournoi);
		
		JLabel lbl_simple = new JLabel("Tournois simples");
		lbl_simple.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_simple.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbl_simple.setBounds(70, 70, 120, 15);
		contentPane.add(lbl_simple);
		
		JLabel lbl_double = new JLabel("Tournois doubles");
		lbl_double.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_double.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbl_double.setBounds(246, 70, 120, 15);
		contentPane.add(lbl_double);
		
		JButton btn_sh = new JButton("Homme");
		btn_sh.setBounds(90, 106, 80, 25);
		contentPane.add(btn_sh);
		
		JButton btn_sd = new JButton("Dame");
		btn_sd.setBounds(90, 142, 80, 25);
		contentPane.add(btn_sd);
		
		JButton btn_dh = new JButton("Homme");
		btn_dh.setBounds(266, 106, 80, 25);
		contentPane.add(btn_dh);
		
		JButton btn_dd = new JButton("Dame");
		btn_dd.setBounds(266, 142, 80, 25);
		contentPane.add(btn_dd);
		
		JButton btn_dm = new JButton("Mixte");
		btn_dm.setBounds(266, 178, 80, 25);
		contentPane.add(btn_dm);
		
		JButton btn_deconnexion = new JButton("Deconnexion");
		btn_deconnexion.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				JFAccueil newFrame = new JFAccueil();
				newFrame.show();
				frame.dispose();
			}
		});
		btn_deconnexion.setBounds(10, 227, 110, 23);
		contentPane.add(btn_deconnexion);
		
		JButton btn_quitter = new JButton("Quitter");
		btn_quitter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		btn_quitter.setBounds(329, 227, 95, 23);
		contentPane.add(btn_quitter);
		
		JButton btn_tour = new JButton("G\u00E9n\u00E9rer tour suivant");
		btn_tour.setBounds(130, 227, 189, 23);
		contentPane.add(btn_tour);
	}
}
