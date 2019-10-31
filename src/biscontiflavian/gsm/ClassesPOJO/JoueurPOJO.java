package biscontiflavian.gsm.ClassesPOJO;

public class JoueurPOJO extends PersonnePOJO {
	private int classement;
	
	public JoueurPOJO(int clas)
	{
		classement = clas;
	}
	
	public int getClassement() 
	{		
		return classement;
	}
}
