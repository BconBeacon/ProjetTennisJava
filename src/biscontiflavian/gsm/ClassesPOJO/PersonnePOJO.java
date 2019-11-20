package biscontiflavian.gsm.ClassesPOJO;

import java.util.Date;
import biscontiflavian.gsm.ClassesUtilitaires.CUSexe;

public abstract class PersonnePOJO {
	//Attributs**************************************************************************
	protected String nom;
	protected String prenom;
	protected Date dateNaissance;
	protected CUSexe sexe;
	
	//Surcharges de méthodes
	public String toString()
	{
		return nom + " " + prenom;
	}
}
