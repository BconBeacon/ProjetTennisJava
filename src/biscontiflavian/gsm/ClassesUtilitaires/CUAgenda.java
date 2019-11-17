package biscontiflavian.gsm.ClassesUtilitaires;

import java.time.LocalDate;

public class CUAgenda {
	private static CUAgenda instance;
	private CUDate[][] agenda;
	
	private CUAgenda()
	{
		LocalDate date;	
		agenda = new CUDate[5][];
		agenda[0] = new CUDate[127];
		agenda[1] = new CUDate[127];
		agenda[2] = new CUDate[63];
		agenda[3] = new CUDate[63];
		agenda[4] = new CUDate[63];
		
		for(int i=0;i<8;i++)
		{
			//Jour 1 SH, SD, DH, DD, DM
			date = LocalDate.now().plusDays(1);
			agenda[0][i] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 8, 0, CUTypeMatch.SH, i+1);
			agenda[0][i+8] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 10, 0, CUTypeMatch.SH, i+9);
			agenda[1][i] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 12, 0, CUTypeMatch.SD, i+1);
			agenda[1][i+8] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 14, 0, CUTypeMatch.SD, i+9);
			agenda[2][i] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 16, 0, CUTypeMatch.DH, i+1);
			agenda[3][i] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 18, 0, CUTypeMatch.DD, i+1);
			agenda[4][i] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 20, 0, CUTypeMatch.DM, i+1);
			
			//Jour 2 SH, SD, DH, DD, DM
			date = LocalDate.now().plusDays(2);
			agenda[0][i+16] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 8, 0, CUTypeMatch.SH, i+17);
			agenda[0][i+24] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 10, 0, CUTypeMatch.SH, i+25);
			agenda[1][i+16] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 12, 0, CUTypeMatch.SD, i+17);
			agenda[1][i+24] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 14, 0, CUTypeMatch.SD, i+25);
			agenda[2][i+8] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 16, 0, CUTypeMatch.DH, i+9);
			agenda[3][i+8] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 18, 0, CUTypeMatch.DD, i+9);
			agenda[4][i+8] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 20, 0, CUTypeMatch.DM, i+9);
			
			//Jour 3 SH, SD, DH, DD, DM
			date = LocalDate.now().plusDays(3);
			agenda[0][i+32] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 8, 0, CUTypeMatch.SH, i+33);
			agenda[0][i+40] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 10, 0, CUTypeMatch.SH, i+41);
			agenda[1][i+32] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 12, 0, CUTypeMatch.SD, i+33);
			agenda[1][i+40] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 14, 0, CUTypeMatch.SD, i+41);
			agenda[2][i+16] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 16, 0, CUTypeMatch.DH, i+17);
			agenda[3][i+16] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 18, 0, CUTypeMatch.DD, i+17);
			agenda[4][i+16] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 20, 0, CUTypeMatch.DM, i+17);
			
			//Jour 4 SH, SD, DH, DD, DM
			date = LocalDate.now().plusDays(4);
			agenda[0][i+48] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 8, 0, CUTypeMatch.SH, i+49);
			agenda[0][i+56] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 10, 0, CUTypeMatch.SH, i+57);
			agenda[1][i+48] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 12, 0, CUTypeMatch.SD, i+49);
			agenda[1][i+56] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 14, 0, CUTypeMatch.SD, i+57);
			agenda[2][i+24] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 16, 0, CUTypeMatch.DH, i+25);
			agenda[3][i+24] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 18, 0, CUTypeMatch.DD, i+25);
			agenda[4][i+24] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 20, 0, CUTypeMatch.DM, i+25);
			
			//Jour 5 SH, SD
			date = LocalDate.now().plusDays(5);
			agenda[0][i+64] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 8, 0, CUTypeMatch.SH, i+65);
			agenda[1][i+64] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 12, 0, CUTypeMatch.SD, i+65);
			
			//Jour 6 SH, SD
			date = LocalDate.now().plusDays(6);
			agenda[0][i+72] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 8, 0, CUTypeMatch.SH, i+73);
			agenda[1][i+72] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 12, 0, CUTypeMatch.SD, i+73);
			
			//Jour 7 SH, SD
			date = LocalDate.now().plusDays(7);
			agenda[0][i+80] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 8, 0, CUTypeMatch.SH, i+81);
			agenda[1][i+80] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 12, 0, CUTypeMatch.SD, i+81);
			
			//Jour 8 SH, SD
			date = LocalDate.now().plusDays(8);
			agenda[0][i+88] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 8, 0, CUTypeMatch.SH, i+89);
			agenda[1][i+88] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 12, 0, CUTypeMatch.SD, i+89);
			
			//Jour 9 SH, SD
			date = LocalDate.now().plusDays(9);
			agenda[0][i+96] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 8, 0, CUTypeMatch.SH, i+97);
			agenda[1][i+96] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 12, 0, CUTypeMatch.SD, i+97);
			
			//Jour 10 SH, SD
			date = LocalDate.now().plusDays(10);
			agenda[0][i+104] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 8, 0, CUTypeMatch.SH, i+105);
			agenda[1][i+104] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 12, 0, CUTypeMatch.SD, i+105);
		}
		
		for(int i=0;i<4;i++)
		{
			//Jour 5 DH, DD, DM
			date = LocalDate.now().plusDays(5);
			agenda[2][i+32] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 14, 0, CUTypeMatch.DH, i+33);
			agenda[3][i+32] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 16, 0, CUTypeMatch.DD, i+33);
			agenda[4][i+32] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 20, 0, CUTypeMatch.DM, i+33);
			
			//Jour 6 DH, DD, DM
			date = LocalDate.now().plusDays(6);
			agenda[2][i+36] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 14, 0, CUTypeMatch.DH, i+37);
			agenda[3][i+36] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 16, 0, CUTypeMatch.DD, i+37);
			agenda[4][i+36] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 20, 0, CUTypeMatch.DM, i+37);
			
			//Jour 7 DH, DD, DM
			date = LocalDate.now().plusDays(7);
			agenda[2][i+40] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 14, 0, CUTypeMatch.DH, i+41);
			agenda[3][i+40] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 16, 0, CUTypeMatch.DD, i+41);
			agenda[4][i+40] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 20, 0, CUTypeMatch.DM, i+41);
			
			//Jour 8 DH, DD, DM
			date = LocalDate.now().plusDays(8);
			agenda[2][i+44] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 14, 0, CUTypeMatch.DH, i+45);
			agenda[3][i+44] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 16, 0, CUTypeMatch.DD, i+45);
			agenda[4][i+44] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 20, 0, CUTypeMatch.DM, i+45);
			
			//Jour 11 SH, SD
			date = LocalDate.now().plusDays(11);
			agenda[0][i+112] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 8, 0, CUTypeMatch.SH, i+113);
			agenda[1][i+112] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 10, 0, CUTypeMatch.SD, i+113);
			
			//Jour 12 SH, SD
			date = LocalDate.now().plusDays(12);
			agenda[0][i+116] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 8, 0, CUTypeMatch.SH, i+115);
			agenda[1][i+116] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 10, 0, CUTypeMatch.SD, i+115);
			
			//Jour 13 SH, SD, DH, DD, DM
			date = LocalDate.now().plusDays(13);
			agenda[0][i+120] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 8, 0, CUTypeMatch.SH, i+121);
			agenda[1][i+120] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 10, 0, CUTypeMatch.SD, i+121);
			agenda[2][i+56] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 14, 0, CUTypeMatch.DH, i+57);
			agenda[3][i+56] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 16, 0, CUTypeMatch.DD, i+57);
			agenda[4][i+56] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 20, 0, CUTypeMatch.DM, i+57);
		}
		
		for(int i=0;i<2;i++)
		{
			//Jour 9 DH, DD, DM
			date = LocalDate.now().plusDays(9);
			agenda[2][i+48] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 14, 0, CUTypeMatch.DH, i+49);
			agenda[3][i+48] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 16, 0, CUTypeMatch.DD, i+49);
			agenda[4][i+48] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 20, 0, CUTypeMatch.DM, i+49);
			
			//Jour 10 DH, DD, DM
			date = LocalDate.now().plusDays(10);
			agenda[2][i+50] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 14, 0, CUTypeMatch.DH, i+51);
			agenda[3][i+50] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 16, 0, CUTypeMatch.DD, i+51);
			agenda[4][i+50] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 20, 0, CUTypeMatch.DM, i+51);
			
			//Jour 11 DH, DD, DM
			date = LocalDate.now().plusDays(11);
			agenda[2][i+52] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 14, 0, CUTypeMatch.DH, i+53);
			agenda[3][i+52] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 16, 0, CUTypeMatch.DD, i+53);
			agenda[4][i+52] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 20, 0, CUTypeMatch.DM, i+53);
			
			//Jour 12 DH, DD, DM
			date = LocalDate.now().plusDays(12);
			agenda[2][i+54] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 14, 0, CUTypeMatch.DH, i+55);
			agenda[3][i+54] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 16, 0, CUTypeMatch.DD, i+55);
			agenda[4][i+54] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 20, 0, CUTypeMatch.DM, i+55);
			
			//Jour 14 SH, SD, DH, DD, DM
			date = LocalDate.now().plusDays(14);
			agenda[0][i+124] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 8, 0, CUTypeMatch.SH, i+125);
			agenda[1][i+124] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 8, 0, CUTypeMatch.SD, i+125);	
			agenda[2][i+60] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 14, 0, CUTypeMatch.DH, i+61);
			agenda[3][i+60] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 14, 0, CUTypeMatch.DD, i+61);
			agenda[4][i+60] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 20, 0, CUTypeMatch.DM, i+61);		
		}
		
		//Finales
		date = LocalDate.now().plusDays(15);
		agenda[0][126] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 8, 0, CUTypeMatch.SH, 127);
		agenda[1][126] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 8, 0, CUTypeMatch.SD, 127);	
		agenda[2][62] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 14, 0, CUTypeMatch.DH, 63);
		agenda[3][62] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 14, 0, CUTypeMatch.DD, 63);
		agenda[4][62] = new CUDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 20, 0, CUTypeMatch.DM, 63);	
		
	}
	
	public static CUAgenda getInstance()
	{
		if(instance == null)
		{
			instance = new CUAgenda();
		}
		return instance;
	}
	
	public void afficherDates()
	{
		for(CUDate[] ordo : agenda)
		{
			for(CUDate date : ordo)
			{
				if(date != null)System.out.println(date);
				else System.out.println("Pas de match programmé");
			}
			System.out.println("***********************************************");
		}
	}
	
	public CUDate[][] getAgenda()
	{
		return agenda;
	}
	
	public static void main (String args[])
	{
		CUAgenda agenda = CUAgenda.getInstance();
		agenda.afficherDates();
	}
}
