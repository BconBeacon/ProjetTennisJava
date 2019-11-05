package biscontiflavian.gsm.ClassesPOJO;

import biscontiflavian.gsm.ClassesUtilitaires.CUSexe;
import biscontiflavian.gsm.ClassesUtilitaires.CUTypeEquipe;

public class EquipePOJO {
	private JoueurPOJO[] t_joueurs;
	private CUTypeEquipe type;
	
	public EquipePOJO(JoueurPOJO[] t_j)
	{
		t_joueurs = new JoueurPOJO[t_j.length];
		System.arraycopy(t_j, 0, t_joueurs, 0, t_j.length);
		
		if(t_j.length == 1)
		{
			if(t_j[0].sexe == CUSexe.M)type = CUTypeEquipe.H;
			else type = CUTypeEquipe.D;
		}
		else
		{
			if(t_j[0].sexe == CUSexe.M && t_j[1].sexe == CUSexe.M)type = CUTypeEquipe.H;
			else if(t_j[0].sexe == CUSexe.F && t_j[1].sexe == CUSexe.F)type = CUTypeEquipe.D;
			else type = CUTypeEquipe.M;
		}
	}
	
	public int obtenirNiveauEquipe()
	{
		int niveau = 0;
		for(JoueurPOJO j : t_joueurs)
		{
			niveau += j.getClassement();
		}
		return niveau;
	}
	
	public void afficherJoueurs()
	{
		for(JoueurPOJO j : t_joueurs)
		{
			System.out.println(j);
		}
	}
}
