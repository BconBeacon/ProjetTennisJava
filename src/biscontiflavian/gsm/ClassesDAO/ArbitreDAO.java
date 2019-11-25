package biscontiflavian.gsm.ClassesDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import biscontiflavian.gsm.ClassesPOJO.ArbitrePOJO;

public class ArbitreDAO extends DAO<ArbitrePOJO>{

	public ArbitreDAO(Connection conn) 
	{
		super(conn);
	}

	@Override
	public boolean create(ArbitrePOJO obj) {
		// TODO Auto-generated method stub
		return false; 
	}

	@Override
	public boolean delete(ArbitrePOJO obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(ArbitrePOJO obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArbitrePOJO find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ArbitrePOJO> getAll() {
		ArrayList<ArbitrePOJO> l_arbitres = new ArrayList<ArbitrePOJO>();
		
		try
		{
			ResultSet result = this.connect.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY	).executeQuery("SELECT * FROM Arbitre A INNER JOIN Personne P ON A.IdPersonne = P.IdPersonne");
			
			while(result.next())
			{
				l_arbitres.add(new ArbitrePOJO(result.getString("nom"), result.getString("prenom")));
			}	
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return l_arbitres;
	}

	@Override
	public ArrayList<ArbitrePOJO> getAll(String sexe) {
		// TODO Auto-generated method stub
		return null;
	}
}
