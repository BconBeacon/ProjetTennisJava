package biscontiflavian.gsm.ClassesDAO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CourDAO    
{
	private String fichier;
	
	public CourDAO() throws IOException
	{
		fichier = "cours.txt";
		String[] cours = new String[] {"1|2500|Gazon|True","2|2000|Dur|True",
				"3|4000|Gazon|False","4|3200|Terre|True",
				"5|6000|Moquette|True","6|4200|Dur|True",
				"7|6200|Gazon|Flase","8|3900|Terre|True"};
		
		PrintWriter sortie = new PrintWriter (new FileWriter (fichier));
		for(String c : cours)
		{
			sortie.println(c);
		}		
		sortie.close();
	}
	
	public ArrayList<String> getCours() throws IOException
	{	
		BufferedReader entree = new BufferedReader(new FileReader (fichier));		
		ArrayList<String> cours = new ArrayList<>();
		String ligne;
		
		while((ligne = entree.readLine()) != null)cours.add(ligne);
		entree.close();
		
		return cours;
	}
	
	public void afficherContenuFichier() throws IOException
	{
		String ligne;
		
		BufferedReader entree = new BufferedReader (new FileReader (fichier));
		while((ligne = entree.readLine()) != null)
		{
			System.out.println(ligne);
		}
		entree.close();
	}
	
	public void testErreurException() throws IOException
	{
		BufferedReader entree = new BufferedReader (new FileReader ("erreur"));
	}
	
	public static void main (String args[])
	{
		try
		{
			CourDAO cdao = new CourDAO();
			cdao.afficherContenuFichier();
			cdao.testErreurException();
		}
		catch(IOException e)
		{
			JOptionPane.showMessageDialog(null, "Une erreur est survenue : " + e);
		}
	}
}
