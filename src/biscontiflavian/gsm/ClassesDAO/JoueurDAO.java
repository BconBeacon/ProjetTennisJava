package biscontiflavian.gsm.ClassesDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import biscontiflavian.gsm.ClassesPOJO.JoueurPOJO;
import biscontiflavian.gsm.ClassesUtilitaires.CUSexe;

public class JoueurDAO extends DAO<JoueurPOJO>{

	public JoueurDAO(Connection conn) 
	{
		super(conn);
	}

	@Override
	public boolean create(JoueurPOJO obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(JoueurPOJO obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(JoueurPOJO obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public JoueurPOJO find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<JoueurPOJO> getAll() {
		ArrayList<JoueurPOJO> l_joueurs = new ArrayList<JoueurPOJO>();
		try
		{
			ResultSet result = this.connect.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Joueur J INNER JOIN Personne P ON J.IdPersonne = P.IdPersonne");
			
			while(result.next())
			{
				CUSexe sexe = null;
				l_joueurs.add(new JoueurPOJO(result.getString("Nom"), result.getString("Prenom"), result.getInt("Classement"), sexe));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return l_joueurs;
	}

	@Override
	public ArrayList<JoueurPOJO> getAll(String sexe) {
		ArrayList<JoueurPOJO> l_joueurs = new ArrayList<JoueurPOJO>();
		try
		{
			ResultSet result = this.connect.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Joueur J INNER JOIN Personne P ON J.IdPersonne = P.IdPersonne WHERE Sexe = '" + sexe +"'");
					
			while(result.next())
			{
				CUSexe s = null;
				
				if(sexe.equals("M"))s = CUSexe.M;
				else if(sexe.equals("F"))s = CUSexe.F;
				else
				{
					JOptionPane.showMessageDialog(null, "Erreur, le sexe des joueurs doit être défini par 'M' ou 'F'. Fermeture du programme");
					System.exit(0);
				}
				
				l_joueurs.add(new JoueurPOJO(result.getString("Nom"), result.getString("Prenom"), result.getInt("Classement"), s));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return l_joueurs;
	}
}
