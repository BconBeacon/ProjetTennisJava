package biscontiflavian.gsm.ClassesPOJO;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

import biscontiflavian.gsm.ClassesDAO.CourDAO;
import biscontiflavian.gsm.ClassesUtilitaires.*;

public class TournoiPOJO {
	//Attributs*************************************************************************
	private String nom;
	private LocalDate date;
	private OrdonnancementPOJO[] t_ordo;
	
	//Constructeurs******************************************************************************
	public TournoiPOJO(String nom, ArrayList<EquipePOJO> t_simpleHomme, ArrayList<EquipePOJO> t_simpleDame, 
			ArrayList<EquipePOJO> t_doubleHomme, ArrayList<EquipePOJO> t_doubleDame, ArrayList<EquipePOJO> t_doubleMixe, ArrayList<ArbitrePOJO> t_arbitres)
	{
		this.nom = nom;
		t_ordo = genererTournoi(t_simpleHomme, t_simpleDame, t_doubleHomme, t_doubleDame, t_doubleMixe);
		date = LocalDate.now();
		assignerDates(CUAgenda.getInstance().getAgenda());
		assignerCours();
		assignerArbitres(t_arbitres);
	}
	
	//Méthodes*************************************************************************
	private OrdonnancementPOJO[] genererTournoi(ArrayList<EquipePOJO> t_simpleHomme, ArrayList<EquipePOJO> t_simpleDame, 
			ArrayList<EquipePOJO> t_doubleHomme, ArrayList<EquipePOJO> t_doubleDame, ArrayList<EquipePOJO> t_doubleMixte)
	{
		ArrayList<EquipePOJO> SH = new ArrayList<>();
		ArrayList<EquipePOJO> SD = new ArrayList<>();
		ArrayList<EquipePOJO> DH = new ArrayList<>();
		ArrayList<EquipePOJO> DD = new ArrayList<>();
		ArrayList<EquipePOJO> DM = new ArrayList<>();
		OrdonnancementPOJO[] tournoi = new OrdonnancementPOJO[] { new OrdonnancementPOJO(CUTypeMatch.SH, 3), new OrdonnancementPOJO(CUTypeMatch.SD, 2), 
				new OrdonnancementPOJO(CUTypeMatch.DH, 2),
				new OrdonnancementPOJO(CUTypeMatch.DD, 2), new OrdonnancementPOJO(CUTypeMatch.DM, 2)};
		
		try
		{
			for(int i=0;i<128;i++)
			{
				SH.add(t_simpleHomme.get(i));
				SD.add(t_simpleDame.get(i));
			}
			for(int i=0;i<64;i++)
			{
				DH.add(t_doubleHomme.get(i));
				DD.add(t_doubleDame.get(i));
				DM.add(t_doubleMixte.get(i));
			}
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Une des listes d'équipes n'est pas de taille adéquate");
			System.exit(0);
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
		
		//Génération du tableau des matchs simple homme et simple dame
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
		
		//Génération du tableau des matchs double homme, double dame et double mixte
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
	
	public void assignerCours()
	{
		ArrayList<CourPOJO> courts = null;
		ArrayList<CourPOJO> l_courts = null;
		try
		{
			CourDAO cdao = new CourDAO();
			courts = new ArrayList<>();
			
			for(String court : cdao.getCours())
			{
				CourPOJO c = new CourPOJO(court);
				courts.add(c);
			}
		}
		catch(IOException e)
		{
			JOptionPane.showMessageDialog(null, "Une erreur est survenue : " + e);
		}
		
		for(OrdonnancementPOJO ordo : t_ordo)
		{
			MatchPOJO[] matchs = ordo.getMatchs();
			l_courts = regenererListeCourts(courts);
			
			for(MatchPOJO m : matchs)
			{
				m.setCour(l_courts.get(0));
				l_courts.remove(0);
				if(l_courts.size() == 0) l_courts = regenererListeCourts(courts);
			}		
		}
		
		//Réassignation du cour pour les matchs SH125, SH126, SD125 et SD126
		reassignerCours(new MatchPOJO[] {t_ordo[0].getMatch(124), t_ordo[0].getMatch(125), t_ordo[1].getMatch(124), t_ordo[1].getMatch(125)},
				courts);
		
		//Réassignation du cour pour les matchs DH61, DH62, DD61 et DD62
		reassignerCours(new MatchPOJO[] {t_ordo[2].getMatch(60), t_ordo[2].getMatch(61), t_ordo[3].getMatch(60), t_ordo[3].getMatch(61)},
				courts);
		
		//Réassignation du cour pour les matchs SH127, SD127, DH63 et DD63
		reassignerCours(new MatchPOJO[] {t_ordo[0].getMatch(126), t_ordo[1].getMatch(126), t_ordo[2].getMatch(62), t_ordo[3].getMatch(62)},
				courts);
	}
	
	private ArrayList<CourPOJO> regenererListeCourts(ArrayList<CourPOJO> courts)
	{
		ArrayList<CourPOJO> l_courts = new ArrayList<CourPOJO>();
		for(CourPOJO c : courts)
		{
			l_courts.add(c);
		}
		Collections.shuffle(l_courts);
		
		return l_courts;
	}
	
	private void reassignerCours(MatchPOJO[] t_matchs, ArrayList<CourPOJO> courts)
	{
		ArrayList<CourPOJO> l_courts = regenererListeCourts(courts);
		for(MatchPOJO m : t_matchs)
		{
			m.setCour(l_courts.get(0));
			l_courts.remove(0);
		}
	}
	
	public void assignerArbitres(ArrayList<ArbitrePOJO> arbitres)
	{
		ArrayList<ArbitrePOJO> l_arbitres = null;
		
		for(OrdonnancementPOJO ordo : t_ordo)
		{
			MatchPOJO[] matchs = ordo.getMatchs();
			l_arbitres = regenererListeArbitres(arbitres);
			
			for(MatchPOJO m : matchs)
			{			
				m.setArbitre(l_arbitres.get(0));
				l_arbitres.remove(0);
				if(l_arbitres.size() == 0) l_arbitres = regenererListeArbitres(arbitres);
			}		
		}
		
		//Réassignation de l'arbitres pour les matchs SH125, SH126, SD125 et SD126
		reassignerArbitres(new MatchPOJO[] {t_ordo[0].getMatch(124), t_ordo[0].getMatch(125), t_ordo[1].getMatch(124), t_ordo[1].getMatch(125)},
				arbitres);
				
		//Réassignation de l'arbitres pour les matchs DH61, DH62, DD61 et DD62
		reassignerArbitres(new MatchPOJO[] {t_ordo[2].getMatch(60), t_ordo[2].getMatch(61), t_ordo[3].getMatch(60), t_ordo[3].getMatch(61)},
				arbitres);
				
		//Réassignation de l'arbitres pour les matchs SH127, SD127, DH63 et DD63
		reassignerArbitres(new MatchPOJO[] {t_ordo[0].getMatch(126), t_ordo[1].getMatch(126), t_ordo[2].getMatch(62), t_ordo[3].getMatch(62)},
				arbitres);
	}
	
	private ArrayList<ArbitrePOJO> regenererListeArbitres(ArrayList<ArbitrePOJO> arbitres)
	{
		ArrayList<ArbitrePOJO> l_arbitres = new ArrayList<ArbitrePOJO>();
		for(ArbitrePOJO a : arbitres)
		{
			l_arbitres.add(a);
		}
		Collections.shuffle(l_arbitres);
		
		return l_arbitres;
	}
	
	private void reassignerArbitres(MatchPOJO[] t_matchs, ArrayList<ArbitrePOJO> arbitres)
	{
		ArrayList<ArbitrePOJO> l_arbitres = regenererListeArbitres(arbitres);
		for(MatchPOJO m : t_matchs)
		{
			m.setArbitre(l_arbitres.get(0));
			l_arbitres.remove(0);
		}	
	}
	
	//Getters*******************************************************************************************
	public String getNom()
	{
		return nom;
	}
	
	public OrdonnancementPOJO getOrdonnancement(CUTypeMatch type)
	{
		switch(type)
		{
			case SH :
			{
				return t_ordo[0];
			}
			case SD :
			{
				return t_ordo[1];
			}
			case DH :
			{
				return t_ordo[2];
			}
			case DD :
			{
				return t_ordo[3];
			}
			case DM :
			{
				return t_ordo[4];
			}
			default :
			{
				return null;
			}
		}
	}
	
	//Méthodes de tests*************************************************************************
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
	
	public EquipePOJO[] obtenirVainqueursTournoi()
	{
		EquipePOJO[] vainqueurs = new EquipePOJO[5];
		for(int i=0;i<5;i++)
		{
			vainqueurs[i] = t_ordo[i].obtenirVainqueurOrdonnancement();
		}
		return vainqueurs;
	}
	
	//Main***************************************************************************************
	public static void main (String args[])
	{		
		ArrayList<EquipePOJO> SH = new ArrayList<EquipePOJO>();
		ArrayList<EquipePOJO> SD = new ArrayList<EquipePOJO>();
		ArrayList<EquipePOJO> DH = new ArrayList<EquipePOJO>();
		ArrayList<EquipePOJO> DD = new ArrayList<EquipePOJO>();
		ArrayList<EquipePOJO> DM = new ArrayList<EquipePOJO>();
		
		for(int i=0;i<128;i++)
		{
			EquipePOJO e1 = new EquipePOJO(new JoueurPOJO[] {new JoueurPOJO("Joueur"+(i+1), "M", i+1, CUSexe.M)});
			EquipePOJO e2 = new EquipePOJO(new JoueurPOJO[] {new JoueurPOJO("Joueur"+(i+1), "F", i+1, CUSexe.F)});
			SH.add(e1);
			SD.add(e2);
		}
		
		for(int i=0;i<64;i++)
		{
			EquipePOJO e1 = new EquipePOJO(new JoueurPOJO[] {new JoueurPOJO("Joueur"+(i+1), "M", i+1, CUSexe.M),new JoueurPOJO("Joueur"+(i+1), "M", i+1, CUSexe.M)});
			EquipePOJO e2 = new EquipePOJO(new JoueurPOJO[] {new JoueurPOJO("Joueur"+(i+1), "F", i+1, CUSexe.F),new JoueurPOJO("Joueur"+(i+1), "F", i+1, CUSexe.F)});
			EquipePOJO e3 = new EquipePOJO(new JoueurPOJO[] {new JoueurPOJO("Joueur"+(i+1), "F", i+1, CUSexe.F),new JoueurPOJO("Joueur"+(i+1), "M", i+1, CUSexe.M)});
			DH.add(e1);
			DD.add(e2);
			DM.add(e3);
		}
		
		ArrayList<ArbitrePOJO> arbitres = new ArrayList<ArbitrePOJO>();
		
		for(int i=0;i<16;i++)
		{
			arbitres.add(new ArbitrePOJO("Arbitre", String.valueOf(i+1)));
		}
		
		TournoiPOJO tournoi = new TournoiPOJO("Grand Slam - 2019",SH,SD,DH,DD,DM,arbitres);
		
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
