package biscontiflavian.gsm.ClassesUtilitaires;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import biscontiflavian.gsm.ClassesPOJO.*;

public class CUAgenda {
	public static OrdonnancementPOJO[] genererTournoi(EquipePOJO[] t_simpleHomme, EquipePOJO[] t_simpleDame, 
			EquipePOJO[] t_doubleHomme, EquipePOJO[] t_doubleDame, EquipePOJO[] t_doubleMixe, Date date)
	{
		Date d = date;
		ArrayList<EquipePOJO> SH = new ArrayList<>();
		ArrayList<EquipePOJO> SD = new ArrayList<>();
		ArrayList<EquipePOJO> DH = new ArrayList<>();
		ArrayList<EquipePOJO> DD = new ArrayList<>();
		ArrayList<EquipePOJO> DM = new ArrayList<>();
		OrdonnancementPOJO[] tournoi = new OrdonnancementPOJO[] { new OrdonnancementPOJO("SH", 3), new OrdonnancementPOJO("SD", 2), new OrdonnancementPOJO("DH", 2),
				new OrdonnancementPOJO("DD", 2), new OrdonnancementPOJO("DM", 2)};
		
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
	
	@SuppressWarnings("deprecation")
	public static void main (String args[])
	{
		Date d = new Date(2008,8,15);
		TournoiPOJO tournoi = new TournoiPOJO("Grand Slam", d);
		EquipePOJO[] SH = new EquipePOJO[128];
		EquipePOJO[] SD = new EquipePOJO[128];
		EquipePOJO[] DH = new EquipePOJO[64];
		EquipePOJO[] DD = new EquipePOJO[64];
		EquipePOJO[] DM = new EquipePOJO[64];
		
		for(int i=0;i<128;i++)
		{
			EquipePOJO e1 = new EquipePOJO(new JoueurPOJO[] {new JoueurPOJO("Joueur"+(i+1), "M", i+1)});
			EquipePOJO e2 = new EquipePOJO(new JoueurPOJO[] {new JoueurPOJO("Joueur"+(i+1), "F", i+1)});
			SH[i] = e1;
			SD[i] = e2;
		}
		
		for(int i=0;i<64;i++)
		{
			EquipePOJO e1 = new EquipePOJO(new JoueurPOJO[] {new JoueurPOJO("Joueur"+(i+1), "M", i+1),new JoueurPOJO("Joueur"+(i+1), "M", i+1)});
			EquipePOJO e2 = new EquipePOJO(new JoueurPOJO[] {new JoueurPOJO("Joueur"+(i+1), "F", i+1),new JoueurPOJO("Joueur"+(i+1), "F", i+1)});
			EquipePOJO e3 = new EquipePOJO(new JoueurPOJO[] {new JoueurPOJO("Joueur"+(i+1), "F", i+1),new JoueurPOJO("Joueur"+(i+1), "M", i+1)});
			DH[i] = e1;
			DD[i] = e2;
			DM[i] = e3;
		}
		
		tournoi.setOrdonnancement(CUAgenda.genererTournoi(SH, SD, DH, DD, DM, d));
		tournoi.afficherMatchs();
	}
}
