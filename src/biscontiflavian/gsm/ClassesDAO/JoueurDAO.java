package biscontiflavian.gsm.ClassesDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
			
			if(result.next())
			{
				@SuppressWarnings("preview")
				CUSexe sexe = switch(result.getString("Sexe"))
						{
							case "M" -> CUSexe.M;
							case "F" -> CUSexe.F;
							default -> throw new IllegalArgumentException("Unexpected value: " + result.getString("Sexe"));
						};
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
					ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Joueur J INNER JOIN Personne P ON J.IdPersonne = P.IdPersonne WHERE Sexe = " + sexe);
					
					if(result.next())
					{
						@SuppressWarnings("preview")
						CUSexe s = switch(result.getString("Sexe"))
								{
									case "M" -> CUSexe.M;
									case "F" -> CUSexe.F;
									default -> throw new IllegalArgumentException("Unexpected value: " + result.getString("Sexe"));
								};
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
