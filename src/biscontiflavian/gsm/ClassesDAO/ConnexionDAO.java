package biscontiflavian.gsm.ClassesDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnexionDAO {
private static Connection instance = null;
	
	private ConnexionDAO()
	{
		try
		{
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");			
		}
		catch(ClassNotFoundException ex)
		{
			JOptionPane.showMessageDialog(null, "Classe de driver introuvable " + ex.getMessage());
			System.exit(0);
		}
		
		try
		{
			String url = "jdbc:ucanaccess://./DBTennis.accdb";
			instance = DriverManager.getConnection(url);
		}
		catch (SQLException ex) 
		{
			JOptionPane.showMessageDialog(null, "Erreur JDBC : " + ex.getMessage());
		}
		if (instance == null) 
		{
            JOptionPane.showMessageDialog(null, "La base de donn�es est inaccessible, fermeture du programme.");
            System.exit(0);
        }
	}
	
	public static Connection getInstance() {
		if(instance == null){
			new ConnexionDAO();
		}
		return instance;
	}
}
