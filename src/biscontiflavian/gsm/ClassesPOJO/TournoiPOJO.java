package biscontiflavian.gsm.ClassesPOJO;

import java.util.Date;

public class TournoiPOJO {
	private String nom;
	private Date date;
	private OrdonnancementPOJO[] t_ordo;
	
	public TournoiPOJO(String n, Date d)
	{
		nom = n;
		date = d;
	}
	
	public void setOrdonnancement(OrdonnancementPOJO[] ordo)
	{
		t_ordo = ordo;
	}
	
	public void afficherMatchs()
	{
		for(OrdonnancementPOJO o : t_ordo)
		{
			o.afficherMatchs();
		}
	}
}
