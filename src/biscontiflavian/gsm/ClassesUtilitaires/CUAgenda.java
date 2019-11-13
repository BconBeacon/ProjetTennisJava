package biscontiflavian.gsm.ClassesUtilitaires;

import java.time.LocalDate;

public class CUAgenda {
	private CUAgenda instance;
	private CUDate[][] agenda;
	
	private CUAgenda()
	{
		LocalDate date = LocalDate.now().plusDays(1);
		//heures[heure][minute]
		int[][] heures = new int[7][];
		for(int i=0;i<heures.length;i++)
		{
			heures[i] = new int[2];
		}
		
		agenda = new CUDate[5][];
		//Matchs de type 'simple homme'==========
		//Jour 1 à Jour 4
		agenda[0][0] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 8, 0 , CUTypeMatch.SH, 1);
		agenda[0][1] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 8, 0 , CUTypeMatch.SH, 2);
		agenda[0][2] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 8, 0 , CUTypeMatch.SH, 3);
		agenda[0][3] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 8, 0 , CUTypeMatch.SH, 4);
		agenda[0][4] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 8, 0 , CUTypeMatch.SH, 5);
		agenda[0][5] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 8, 0 , CUTypeMatch.SH, 6);
		agenda[0][6] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 8, 0 , CUTypeMatch.SH, 7);
		agenda[0][7] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 8, 0 , CUTypeMatch.SH, 8);
		agenda[0][8] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 10, 0 , CUTypeMatch.SH, 9);
		agenda[0][9] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 10, 0 , CUTypeMatch.SH, 10);
		agenda[0][10] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 10, 0 , CUTypeMatch.SH, 11);
		agenda[0][11] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 10, 0 , CUTypeMatch.SH, 12);
		agenda[0][12] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 10, 0 , CUTypeMatch.SH, 13);
		agenda[0][13] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 10, 0 , CUTypeMatch.SH, 14);
		agenda[0][14] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 10, 0 , CUTypeMatch.SH, 15);
		agenda[0][15] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 10, 0 , CUTypeMatch.SH, 16);
	}
	
	public CUAgenda getInstance()
	{
		if(instance == null)
		{
			instance = new CUAgenda();
		}
		return instance;
	}
}
