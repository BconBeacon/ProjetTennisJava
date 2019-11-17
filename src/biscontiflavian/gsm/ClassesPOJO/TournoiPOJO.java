package biscontiflavian.gsm.ClassesPOJO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import biscontiflavian.gsm.ClassesUtilitaires.*;

public class TournoiPOJO {
	//Attributs*************************************************************************
	private String nom;
	private OrdonnancementPOJO[] t_ordo;
	
	//Constructeurs******************************************************************************
	public TournoiPOJO(EquipePOJO[] t_simpleHomme, EquipePOJO[] t_simpleDame, 
			EquipePOJO[] t_doubleHomme, EquipePOJO[] t_doubleDame, EquipePOJO[] t_doubleMixe)
	{
		nom = "Grand Slam - 2019";
		t_ordo = genererTournoi(t_simpleHomme, t_simpleDame, t_doubleHomme, t_doubleDame, t_doubleMixe);
		assignerDates(CUAgenda.getInstance().getAgenda());
	}
	
	//M�thodes*************************************************************************
	private OrdonnancementPOJO[] genererTournoi(EquipePOJO[] t_simpleHomme, EquipePOJO[] t_simpleDame, 
			EquipePOJO[] t_doubleHomme, EquipePOJO[] t_doubleDame, EquipePOJO[] t_doubleMixe)
	{
		ArrayList<EquipePOJO> SH = new ArrayList<>();
		ArrayList<EquipePOJO> SD = new ArrayList<>();
		ArrayList<EquipePOJO> DH = new ArrayList<>();
		ArrayList<EquipePOJO> DD = new ArrayList<>();
		ArrayList<EquipePOJO> DM = new ArrayList<>();
		OrdonnancementPOJO[] tournoi = new OrdonnancementPOJO[] { new OrdonnancementPOJO(CUTypeMatch.SH, 3), new OrdonnancementPOJO(CUTypeMatch.SD, 2), 
				new OrdonnancementPOJO(CUTypeMatch.DH, 2),
				new OrdonnancementPOJO(CUTypeMatch.DD, 2), new OrdonnancementPOJO(CUTypeMatch.DM, 2)};
		
		for(int i=0;i<128;i++)
		{
			SH.add(t_simpleHomme[i]);
			SD.add(t_simpleDame[i]);
		}
		for(int i=0;i<64;i++)
		{
			DH.add(t_doubleHomme[i]);
			DD.add(t_doubleDame[i]);
			DM.add(t_doubleMixe[i]);
		}
		
		Collections.shuffle(SH);
		Collections.shuffle(SD);
		Collections.shuffle(DH);
		Collections.shuffle(DD);
		Collections.shuffle(DM);
		
		MatchPOJO[] t_matchsSH = new MatchPOJO[127]; 
		MatchPOJO[] t_matchsSD = new MatchPOJO[127]; 
		MatchPOJO[] t_matchsDH = new MatchPOJO[63]; 
		MatchPOJO[] t_matchsDD = new MatchPOJO[63]; 
		MatchPOJO[] t_matchsDM = new MatchPOJO[63]; 
		
		//G�n�ration du tableau des matchs simple homme et simple dame
		for(int i=0;i<64;i++)
		{
			t_matchsSH[i] = new MatchPOJO(i+1, SH.get(0), SH.get(1));
			SH.remove(0); SH.remove(0);
			t_matchsSD[i] = new MatchPOJO(i+1, SD.get(0), SD.get(1));
			SD.remove(0); SD.remove(0);
		}
		for(int i=0;i<63;i++)
		{
			t_matchsSH[i+64] = new MatchPOJO(i+65);
			t_matchsSD[i+64] = new MatchPOJO(i+65);
		}
		
		//G�n�ration du tableau des matchs double homme, double dame et double mixte
		for(int i=0;i<32;i++)
		{
			t_matchsDH[i] = new MatchPOJO(i+1, DH.get(0), DH.get(1));
			DH.remove(0); DH.remove(0);
			t_matchsDD[i] = new MatchPOJO(i+1, DD.get(0), DD.get(1));
			DD.remove(0); DD.remove(0);
			t_matchsDM[i] = new MatchPOJO(i+1, DM.get(0), DM.get(1));
			DM.remove(0); DM.remove(0);
		}
		for(int i=0;i<31;i++)
		{
			t_matchsDH[i+32] = new MatchPOJO(i+33);
			t_matchsDD[i+32] = new MatchPOJO(i+33);
			t_matchsDM[i+32] = new MatchPOJO(i+33);
		}
		
		tournoi[0].setTableauMatchs(t_matchsSH);
		tournoi[1].setTableauMatchs(t_matchsSD);
		tournoi[2].setTableauMatchs(t_matchsDH);
		tournoi[3].setTableauMatchs(t_matchsDD);
		tournoi[4].setTableauMatchs(t_matchsDM);
		
		return tournoi;
	}
	
	private void assignerDates(CUDate[][] agenda)
	{
		for(int i=0;i<t_ordo.length;i++)
		{
			MatchPOJO[] matchs = t_ordo[i].getMatchs();
			for(int j=0;j<matchs.length;j++)
			{
				matchs[j].setDate(agenda[i][j]);
			}
		}
	}
	
	public EquipePOJO[][] genererResultatsTour()
	{
		EquipePOJO[][] vainqueurs = new EquipePOJO[5][];
		int cpt = 0;
		for(OrdonnancementPOJO o : t_ordo)
		{
			vainqueurs[cpt] = o.jouerMatchs();
			cpt++;
		}
		
		return vainqueurs;
	}
	
	public void genererTourSuivant(EquipePOJO[][] vainqueursTourPrecedent)
	{
		ArrayList<EquipePOJO> vainqueurs = new ArrayList<>();
		for(int i=0;i<5;i++)
		{
			if(t_ordo[i].obtenirVainqueurOrdonnancement() == null)
			{
				for(int j=0;j<vainqueursTourPrecedent[i].length;j++)
				{
					vainqueurs.add(vainqueursTourPrecedent[i][j]);
				}
				
				while(vainqueurs.size() != 0)
				{
					t_ordo[i].organiserMatchsTour(vainqueurs.get(0), vainqueurs.get(1));
					vainqueurs.remove(0); vainqueurs.remove(0);
				}
			}
		}
	}
	
	public EquipePOJO[] obtenirVainqueursTournoi()
	{
		EquipePOJO[] vainqueurs = new EquipePOJO[5];
		for(int i=0;i<5;i++)
		{
			vainqueurs[i] = t_ordo[i].obtenirVainqueurOrdonnancement();
		}
		return vainqueurs;
	}
	
	//M�thodes de tests*************************************************************************
	public void afficherResultatsMatchs()
	{
		int cpt = 1;
		for(OrdonnancementPOJO o : t_ordo)
		{
			System.out.println("***************************************************************************** " + cpt);
			o.afficherResultatsMatchs();
			cpt++;
		}
	}
	
	public void afficherMatchs()
	{
		for(OrdonnancementPOJO o : t_ordo)
		{
			o.afficherMatchs();
			System.out.println("---------------------------------------");
			System.out.println("---------------------------------------");
			System.out.println("---------------------------------------");
		}
	}
	
	public static void main (String args[])
	{		
		EquipePOJO[] SH = new EquipePOJO[128];
		EquipePOJO[] SD = new EquipePOJO[128];
		EquipePOJO[] DH = new EquipePOJO[64];
		EquipePOJO[] DD = new EquipePOJO[64];
		EquipePOJO[] DM = new EquipePOJO[64];
		
		for(int i=0;i<128;i++)
		{
			EquipePOJO e1 = new EquipePOJO(new JoueurPOJO[] {new JoueurPOJO("Joueur"+(i+1), "M", i+1, CUSexe.M)});
			EquipePOJO e2 = new EquipePOJO(new JoueurPOJO[] {new JoueurPOJO("Joueur"+(i+1), "F", i+1, CUSexe.F)});
			SH[i] = e1;
			SD[i] = e2;
		}
		
		for(int i=0;i<64;i++)
		{
			EquipePOJO e1 = new EquipePOJO(new JoueurPOJO[] {new JoueurPOJO("Joueur"+(i+1), "M", i+1, CUSexe.M),new JoueurPOJO("Joueur"+(i+1), "M", i+1, CUSexe.M)});
			EquipePOJO e2 = new EquipePOJO(new JoueurPOJO[] {new JoueurPOJO("Joueur"+(i+1), "F", i+1, CUSexe.F),new JoueurPOJO("Joueur"+(i+1), "F", i+1, CUSexe.F)});
			EquipePOJO e3 = new EquipePOJO(new JoueurPOJO[] {new JoueurPOJO("Joueur"+(i+1), "F", i+1, CUSexe.F),new JoueurPOJO("Joueur"+(i+1), "M", i+1, CUSexe.M)});
			DH[i] = e1;
			DD[i] = e2;
			DM[i] = e3;
		}
		
		TournoiPOJO tournoi = new TournoiPOJO(SH,SD,DH,DD,DM);
		
		EquipePOJO[][] vainqueurs = tournoi.genererResultatsTour();;	
		tournoi.genererTourSuivant(vainqueurs);
		
		EquipePOJO[][] vainqueurs2 = tournoi.genererResultatsTour();	
		tournoi.genererTourSuivant(vainqueurs2);
		
		EquipePOJO[][] vainqueurs3 = tournoi.genererResultatsTour();
		tournoi.genererTourSuivant(vainqueurs3);
		
		EquipePOJO[][] vainqueurs4 = tournoi.genererResultatsTour();
		tournoi.genererTourSuivant(vainqueurs4);
		
		EquipePOJO[][] vainqueurs5 = tournoi.genererResultatsTour();
		tournoi.genererTourSuivant(vainqueurs5);
		
		EquipePOJO[][] vainqueurs6 = tournoi.genererResultatsTour();
		tournoi.genererTourSuivant(vainqueurs6);
		
		tournoi.genererResultatsTour();
		
		tournoi.afficherResultatsMatchs();
		
		for(EquipePOJO e : tournoi.obtenirVainqueursTournoi())
		{
			System.out.println("*****************");
			if(e != null)e.afficherJoueurs();
			else System.out.println("UNDEFINED");
			System.out.println("*****************");
		}
	}
}