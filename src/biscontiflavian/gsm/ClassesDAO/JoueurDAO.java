package biscontiflavian.gsm.ClassesDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import biscontiflavian.gsm.ClassesPOJO.JoueurPOJO;
import biscontiflavian.gsm.ClassesUtilitaires.CUSexe;

public class JoueurDAO extends DAO<JoueurPOJO>{

	public JoueurDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
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
		JoueurPOJO joueur = null;
		try
		{
			ResultSet result = this.connect.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Eleve WHERE elv_id = " + id);
			
			if(result.first())
			{
				@SuppressWarnings("preview")
				CUSexe sexe = switch(result.getString("Sexe"))
						{
							case "M" -> CUSexe.M;
							case "F" -> CUSexe.F;
							default -> throw new IllegalArgumentException("Unexpected value: " + result.getString("Sexe"));
						};
				joueur = new JoueurPOJO(result.getString("Nom"), result.getString("Prenom"), result.getInt("Classement"), sexe);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return joueur;
	}

	@Override
	public ArrayList<JoueurPOJO> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
