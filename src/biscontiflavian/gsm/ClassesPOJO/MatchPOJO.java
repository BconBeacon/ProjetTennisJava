package biscontiflavian.gsm.ClassesPOJO;

import java.util.ArrayList;
import java.util.Date;

import biscontiflavian.gsm.ClassesUtilitaires.CUDate;

public class MatchPOJO {
	//Attributs****************************************************************************************
	private int numero;
	private CUDate date;
	private final int dureeEsperee = 2;
	private CourPOJO cour;
	private EquipePOJO[] t_equipes;
	private ArbitrePOJO arbitre;
	private EquipePOJO vainqueur;
	private ArrayList<SetPOJO> l_sets;
	
	//Constructeurs*************************************************************************************
	public MatchPOJO(int numero) 
	{
		this.numero = numero;
		l_sets = new ArrayList<>();
		t_equipes = null;
		arbitre = null;
		cour = null;
		vainqueur = null;
	}
	
	public MatchPOJO(int numero, EquipePOJO e1, EquipePOJO e2)
	{
		this.numero = numero;
		l_sets = new ArrayList<>();
		t_equipes = new EquipePOJO[] { e1, e2 };
		arbitre = null;
		cour = null;
		vainqueur = null;
	}
	
	public MatchPOJO(EquipePOJO e1, EquipePOJO e2, int nbSetsGagnants)
	{
		l_sets = new ArrayList<>();
		t_equipes = new EquipePOJO[] { e1, e2 };
		vainqueur = null;
		
		jouerMatch(nbSetsGagnants);
	}
	
	//Méthodes******************************************************************************
	public EquipePOJO jouerMatch(int nbSetsGagnants)
	{
		int set = 0;
		while(vainqueur == null)
		{
			switch(nbSetsGagnants)
			{
			case 2 :
			{
				while(vainqueur == null)
				{
					if(set == 2) l_sets.add(genererSet(true));
					else l_sets.add(genererSet(false));
					set++;
					vainqueur = designerVainqueur(nbSetsGagnants);
				}				
				break;
			}
			case 3 :
			{
				while(vainqueur == null)
				{
					if(set == 4) l_sets.add(genererSet(true));
					else l_sets.add(genererSet(false));
					set++;
					vainqueur = designerVainqueur(nbSetsGagnants);
				}
				break;
			}
			}						
		}
		return vainqueur;
	}

	private SetPOJO genererSet(boolean dernierSet)
	{
		if(dernierSet) return new SetPOJO(calculerProbabilites(), true);
		else return new SetPOJO(calculerProbabilites(), false);
	}
	
	//Calcule et retourne la probabilité de victoire de l'équipe 1
	//La probabilité de victoire de l'équipe 2 sera simplement = 100 - "Probabilité victoire équipe 1"
	private int calculerProbabilites()
	{		
		int nivE1, nivE2, ecart;
		nivE1 = t_equipes[0].obtenirNiveauEquipe();
		nivE2 = t_equipes[1].obtenirNiveauEquipe();
		
		ecart = nivE1 - nivE2;
		
		//Si la variable 'inversion' est 'true', nivE1 > niveE2 
		boolean inversion = false;
		if(ecart < 0) 
		{
			ecart = -ecart; 
			inversion = true;
		}
		
		int prob;
		if(ecart < 5)prob = 52; //Entre 1 et 4 niveaux d'écart
		else if(ecart < 15)prob = 55; //Entre 5 et 14 niveaux d'écart
		else if(ecart < 30)prob = 58; //Entre 15 et 29 niveaux d'écart
		else if(ecart < 50)prob = 63; //Entre 30 et 49 niveaux d'écart
		else if(ecart < 90)prob = 68; //Entre 50 et 89 niveaux d'écart
		else prob = 75; //Plus de 90 niveaux d'écart
		
		//Vérifie que le niveau de l'équipe 1 est plus grand que celui de l'équipe 2
		if(inversion)return prob;
		else return 100 - prob;
	}
	
	public EquipePOJO designerVainqueur(int nbSetsGagnants)
	{
		int vicE1 = 0, vicE2 = 0;
		try
		{
			for(SetPOJO set : l_sets)
			{
				if(set.getPtsE1() > set.getPtsE2())vicE1++;
				else vicE2++;
			}
		}
		catch(Exception e)
		{
			return null;
		}
		
		if(vicE1 == nbSetsGagnants || vicE2 == nbSetsGagnants)
		{
			if(vicE1 > vicE2)return t_equipes[0];
			else return t_equipes[1];
		}
		else return null;
	}
	
	//La méthode retourne 'true' si le match est jouable
	public boolean obtenirEtatMatch()
	{
		if(getVainqueur() == null && t_equipes != null)return true;
		else return false;
	}
	
	//Méthodes de test******************************************************************
	public void afficherResultatsMatch()
	{
		for(SetPOJO set : l_sets)
		{
			System.out.println(set);
		}
	}
	
	public void afficherInfosMatch()
	{
		System.out.println("Match " +  numero);
		System.out.println(date);
		System.out.println(cour);
		try
		{
			for(EquipePOJO e : t_equipes)
			{
				e.afficherJoueurs();
			}
			afficherResultatsMatch();
			getVainqueur().afficherJoueurs();
		}
		catch(Exception e)
		{
			System.out.println("UNDEFINED");
		}
	}
	
	public String obtenirScoreEquipe(int numeroEquipe)
	{
		String score = "";
		switch(numeroEquipe)
		{
			case 1 :
			{
				for(SetPOJO set : l_sets)
				{
					score += set.getPtsE1();
					score += " ";
				}
				break;
			}
			case 2 :
			{
				for(SetPOJO set : l_sets)
				{
					score += set.getPtsE2();
					score += " ";
				}
				break;
			}
			default :
			{
				for(SetPOJO set : l_sets)
				{
					score += "? ";
					break;
				}
			}
		}
		return score;
	}
	
	//Getters et Setters*******************************************************************************************
	public EquipePOJO getVainqueur()
	{
		return vainqueur;
	}
	
	public EquipePOJO[] getEquipes()
	{
		return t_equipes;
	}
	
	public int getNumero()
	{
		return numero;
	}
	
	public EquipePOJO getEquipe1()
	{
		return t_equipes[0];
	}
	
	public JoueurPOJO getJoueur1Equipe1()
	{
		return t_equipes[0].getJoueur1();
	}
	
	public JoueurPOJO getJoueur1Equipe2()
	{
		return t_equipes[1].getJoueur1();
	}
	
	public JoueurPOJO getJoueur2Equipe1()
	{
		return t_equipes[0].getJoueur2();
	}
	
	public JoueurPOJO getJoueur2Equipe2()
	{
		return t_equipes[1].getJoueur2();
	}
	
	public ArbitrePOJO getArbitre()
	{
		return arbitre;
	}
	
	public CourPOJO getCour()
	{
		return cour;
	}
	
	public CUDate getDate()
	{
		return date;
	}
	
	public void setEquipes(EquipePOJO e1, EquipePOJO e2)
	{
		t_equipes = new EquipePOJO[2];
		t_equipes[0] = e1;
		t_equipes[1] = e2;
	}
	
	public void setDate(CUDate d)
	{
		date = d;
	}
	
	public void setCour(CourPOJO c)
	{
		cour = c;
	}
	
	public void setArbitre(ArbitrePOJO a)
	{
		arbitre = a;
	}
	
	//Main***********************************************************************************************
	public static void main(String args[])
	{
		JoueurPOJO[] j1;
		j1 = new JoueurPOJO[] { new JoueurPOJO(5) };
		EquipePOJO e1 = new EquipePOJO(j1);
		
		JoueurPOJO[] j2;
		j2 = new JoueurPOJO[] { new JoueurPOJO(1) };
		EquipePOJO e2 = new EquipePOJO(j2);
		
		MatchPOJO match1 = new MatchPOJO(e1, e2, 2);
		match1.afficherResultatsMatch();
		
		System.out.println("************************");
		
		JoueurPOJO[] j3;
		j3 = new JoueurPOJO[] { new JoueurPOJO(5), new JoueurPOJO(7) };
		EquipePOJO e3 = new EquipePOJO(j1);
		
		JoueurPOJO[] j4;
		j2 = new JoueurPOJO[] { new JoueurPOJO(15), new JoueurPOJO(3) };
		EquipePOJO e4 = new EquipePOJO(j2);
		
		MatchPOJO match2 = new MatchPOJO(e3, e4, 3);
		match2.afficherResultatsMatch();
	}
}
