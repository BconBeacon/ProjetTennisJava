package biscontiflavian.gsm.ClassesPOJO;

import java.util.ArrayList;
import java.util.Date;

public class MatchPOJO {
	private int numero;
	private Date date;
	private final int dureeEsperee = 2;
	private CourPOJO cour;
	private EquipePOJO[] t_equipes;
	private ArbitrePOJO arbitre;
	private EquipePOJO vainqueur;
	private ArrayList<SetPOJO> l_sets;
	
	public MatchPOJO(int numero) 
	{
		this.numero = numero;
	}
	
	public MatchPOJO(int numero, EquipePOJO e1, EquipePOJO e2)
	{
		this.numero = numero;
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
		
		while(vainqueur == null)
		{
			switch(nbSetsGagnants)
			{
			case 2 :
			{
				if(l_sets.size() == 2) l_sets.add(genererSet(true));
				else l_sets.add(genererSet(false));
				break;
			}
			case 3 :
			{
				if(l_sets.size() == 4) l_sets.add(genererSet(true));
				else l_sets.add(genererSet(false));
				break;
			}
			}			
			vainqueur = designerVainqueur(nbSetsGagnants);
		}
	}

	public SetPOJO genererSet(boolean dernierSet)
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
		try
		{
			for(EquipePOJO e : t_equipes)
			{
				e.afficherJoueurs();
			}
		}
		catch(Exception e)
		{
			System.out.println("Pas encore de joueur dans ce match");
		}
	}
	
	public void setDate(Date d)
	{
		date = d;
	}
	
	public static void main(String args[])
	{
		JoueurPOJO[] j1;
		j1 = new JoueurPOJO[] { new JoueurPOJO(5) };
		EquipePOJO e1 = new EquipePOJO(j1);
		
		JoueurPOJO[] j2;
		j2 = new JoueurPOJO[] { new JoueurPOJO(1) };
		EquipePOJO e2 = new EquipePOJO(j2);
		
		MatchPOJO match1 = new MatchPOJO(e1, e2, 3);
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
