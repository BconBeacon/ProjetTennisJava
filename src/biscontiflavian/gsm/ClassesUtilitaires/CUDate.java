package biscontiflavian.gsm.ClassesUtilitaires;

public class CUDate {
	private int jour;
	private int mois;
	private int annee;
	private int heure;
	private int minute;
	private CUTypeMatch typeMatch;
	private int numeroMatch;
	
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
}
