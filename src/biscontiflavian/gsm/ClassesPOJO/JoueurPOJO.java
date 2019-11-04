package biscontiflavian.gsm.ClassesPOJO;

public class JoueurPOJO extends PersonnePOJO {
	private int classement;
	
	public JoueurPOJO(String n, String p, int c)
	{
		nom = n;
		prenom = p;
		classement = c;
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
