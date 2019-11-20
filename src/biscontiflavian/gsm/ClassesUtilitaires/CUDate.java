package biscontiflavian.gsm.ClassesUtilitaires;

public class CUDate {
	//Attributs***********************************************************************
	private int jour;
	private int mois;
	private int annee;
	private int heure;
	private int minute;
	private CUTypeMatch typeMatch;
	private int numeroMatch;
	
	//Constructeurs****************************************************************
	public CUDate(int j, int m, int a, int h, int min, CUTypeMatch tm, int nm)
	{
		annee = a;
		mois = m;
		jour = j;
		heure = h;
		minute = min;
		typeMatch = tm;
		numeroMatch = nm;
	}
	
	//Méthodes***********************************************************************
	public String obtenirDate()
	{
		return jour + "/" + mois + "/" + annee;
	}
	
	public String obtenirHeure()
	{
		String m;
		if(minute == 0) m = "00";
		else m = String.valueOf(minute);
		return heure + "h" + m;
	}
	
	//Surcharges de méthodes************************************************************
	public String toString()
	{
		return jour + "/" + mois + "/" + annee + " à " + heure + "h" + minute + " | Match " + numeroMatch + " "+ typeMatch.toString(); 
	}
}
