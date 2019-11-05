package biscontiflavian.gsm.ClassesPOJO;

import java.util.ArrayList;

import biscontiflavian.gsm.ClassesUtilitaires.CUTypeMatch;

public class OrdonnancementPOJO {
	private CUTypeMatch type;
	private int nbSetsGagnants;
	private MatchPOJO[] t_matchs;
	
	@SuppressWarnings("preview")
	public OrdonnancementPOJO(CUTypeMatch type, int nbSetsGagnants)
	{
		switch(type)
		{
			case SH, SD :
			{
				t_matchs = new MatchPOJO[127];
			}
			case DH, DD, DM :
			{
				t_matchs = new MatchPOJO[63];
			}
		}
		this.type = type;
		this.nbSetsGagnants = nbSetsGagnants;
	}
	
	public void setTableauMatchs(MatchPOJO[] t_matchs)
	{
		this.t_matchs = t_matchs;
	}
	
	public EquipePOJO[] jouerMatchs()
	{
		ArrayList<EquipePOJO> vainqueurs = new ArrayList<>();
		for(MatchPOJO m : t_matchs)
		{
			if(m.obtenirEtatMatch() == true)vainqueurs.add(m.jouerMatch(nbSetsGagnants));
		}
		
		EquipePOJO[] t_equipes = new EquipePOJO[vainqueurs.size()];
		for(int i=0;i<t_equipes.length;i++)
		{
			t_equipes[i] = vainqueurs.get(i);
		}
		
		return t_equipes;
	}
	
	public void afficherMatchs()
	{
		for(MatchPOJO m : t_matchs)
		{
			m.afficherInfosMatch();
		}
	}

	public void afficherResultatsMatchs() 
	{
		int cpt = 1;
		for(MatchPOJO m : t_matchs)
		{
			System.out.println("--------- " + cpt);
			m.afficherResultatsMatch();
			cpt++;
		}
	}
}
