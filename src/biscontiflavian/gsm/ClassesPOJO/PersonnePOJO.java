package biscontiflavian.gsm.ClassesPOJO;

import java.util.Date;

public abstract class PersonnePOJO {
	protected String nom;
	protected String prenom;
	protected Date dateNaissance;
	protected enum Sexe { H , F };
	protected Sexe sexe;
}
