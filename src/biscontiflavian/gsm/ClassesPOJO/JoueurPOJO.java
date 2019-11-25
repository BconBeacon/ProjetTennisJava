package biscontiflavian.gsm.ClassesPOJO;

import biscontiflavian.gsm.ClassesUtilitaires.CUSexe;

public class JoueurPOJO extends PersonnePOJO {
	//Attributs***************************************************************
	private int classement;
	
	//Constructeurs**************************************************************
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
	
	public JoueurPOJO() {}

	//Getters************************************************************************
	public int getClassement() 
	{		
		return classement;
	}
}
