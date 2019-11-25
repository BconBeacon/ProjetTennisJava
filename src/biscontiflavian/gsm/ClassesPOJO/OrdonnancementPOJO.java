package biscontiflavian.gsm.ClassesPOJO;

import java.util.ArrayList;

import biscontiflavian.gsm.ClassesUtilitaires.CUTypeMatch;

public class OrdonnancementPOJO {
	//Attributs***************************************************************************
	private CUTypeMatch type;
	private int nbSetsGagnants;
	private MatchPOJO[] t_matchs;
	
	//Constructeurs************************************************************************
	@SuppressWarnings("preview")
	public OrdonnancementPOJO(CUTypeMatch type, int nbSetsGagnants)
	{
		switch(type)
		{
			case SH, SD :
			{
				t_matchs = new MatchPOJO[127];
				break;
			}
			case DH, DD, DM :
			{
				t_matchs = new MatchPOJO[63];
				break;
			}
		}
		this.type = type;
		this.nbSetsGagnants = nbSetsGagnants;
	}
	
	//Méthodes***************************************************************************	
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
	
	public void organiserMatchsTour(EquipePOJO e1, EquipePOJO e2)
	{
		boolean ok = false;
		int cpt = 0;
		while(!ok)
		{
			if(t_matchs[cpt].getEquipes() == null)
			{
				t_matchs[cpt].setEquipes(e1, e2);
				ok = true;
			}
			cpt++;
		}
	}
	
	public EquipePOJO obtenirVainqueurOrdonnancement()
	{
		return t_matchs[t_matchs.length-1].getVainqueur();
	}
	
	//Getters et setters*************************************************************************
	public MatchPOJO[] getMatchs()
	{
		return t_matchs;
	}
	
	public MatchPOJO getMatch(int index)
	{
		return t_matchs[index];
	}
	
	public void setTableauMatchs(MatchPOJO[] t_matchs)
	{
		this.t_matchs = t_matchs;
	}
	
	//Méthodes de tests**************************************************************************
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
			m.afficherInfosMatch();
			cpt++;
		}
	}
}
