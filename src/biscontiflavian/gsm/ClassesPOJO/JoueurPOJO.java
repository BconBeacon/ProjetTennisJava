package biscontiflavian.gsm.ClassesPOJO;

import biscontiflavian.gsm.ClassesUtilitaires.CUSexe;

public class JoueurPOJO extends PersonnePOJO {
	private int classement;
	
	public JoueurPOJO(String n, String p, int c, CUSexe sexe)
	{
		nom = n;
		prenom = p;
		classement = c;
		this.sexe = sexe;
	}
	
	public JoueurPOJO(int clas)
	{
		classement = clas;
	}
	
	public int getClassement() 
	{		
		return classement;
	}
	
	public String toString()
	{
		return nom + " " + prenom;
	}
}
