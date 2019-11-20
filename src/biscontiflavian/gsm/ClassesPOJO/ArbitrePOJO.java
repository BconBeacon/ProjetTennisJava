package biscontiflavian.gsm.ClassesPOJO;

public class ArbitrePOJO extends PersonnePOJO{
	//Attributs*************************************************************
	private String nationalite;
	
	//Constructeurs*********************************************************
	public ArbitrePOJO(String nom, String prenom)
	{
		this.nom = nom;
		this.prenom = prenom;
	}
	
	//Main**********************************************************
	public static void main(String args[])
	{
		ArbitrePOJO a = new ArbitrePOJO("Staline", "Joseph");
		System.out.println(a);
	}
}
