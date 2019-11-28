package biscontiflavian.gsm.ClassesPOJO;

import java.util.Random;

public class SetPOJO {
	//Attributs************************************************************************
	private byte ptsE1;
	private byte ptsE2;
	private byte ptsTBE1;
	private byte ptsTBE2;
	private enum Type { normal, dernier };
	private Type type;
	
	//Constructeurs************************************************************************
	public SetPOJO(int probabilite, boolean dernierSet)
	{
		ptsE1 = 0;
		ptsE2 = 0;
		ptsTBE1 = 0;
		ptsTBE2 = 0;
		
		if(dernierSet)type = Type.dernier;
		else type = Type.normal;
		
		genererPoints(probabilite);
	}
	
	//Méthodes*****************************************************************************
	//La variable 'prob' correspond à la probabilité de victoire de l'équipe 1
	public void genererPoints(int prob)
	{
		boolean fin = false;
		switch(type)
		{
		case normal :
		{
			while(!fin)
			{
				incrementerPoint(prob);
				if(ptsE1 == 7 || ptsE2 == 7) fin = true;
				if(ptsE1 == 6 && ptsE2 == 6) 
				{
					jouerTieBreak(prob);
					fin = true;
				}
				else if(ptsE1 == 6 || ptsE2 == 6)
				{
					if(ptsE1 - ptsE2 > 1 || ptsE2 - ptsE1 > 1)fin = true;
				}
			}
			break;
		}
		case dernier :
		{
			while(!fin)
			{
				incrementerPoint(prob);
				if(ptsE1 == 12 || ptsE2 == 12) fin = true;
				else if(ptsE1 >= 6 || ptsE2 >= 6)
				{
					if(ptsE1 - ptsE2 > 1 || ptsE2 - ptsE1 > 1)fin = true;
				}
			}
			break;
		}
		}
	}
	
	private void incrementerPoint(int prob)
	{
		Random r = new Random();
		int i = r.nextInt(101);
		
		if(i <= prob)ptsE1++;
		else ptsE2++;
	}
	
	private void jouerTieBreak(int prob)
	{
		boolean fin = false;
		while(!fin)
		{
			Random r = new Random();
			int i = r.nextInt(101);
			
			if(i <= prob)ptsTBE1++;
			else ptsTBE2++;
			
			if(ptsTBE1 == 12) 
			{
				fin = true;
				ptsE1++;
			}
			else if(ptsTBE2 == 12)
			{
				fin = true;
				ptsE2++;
			}
			else if(ptsTBE1 >= 7 || ptsTBE2 >= 7)
			{
				if(ptsTBE1 - ptsTBE2 > 1) 
				{
					fin = true;
					ptsE1++;
				}
				else if(ptsTBE2 - ptsTBE1 > 1)
				{
					fin = true;
					ptsE2++;
				}
			}
		}
	}
	
	public boolean tieBreak()
	{
		if(ptsTBE1 != 0 || ptsTBE2 != 0)return true;
		else return false;
	}
	
	//Surchages de méthodes**********************************************************************
	public String toString()
	{
		return ptsE1 + " - " + ptsE2;
	}
	
	//Getters************************************************************************
	public int getPtsE1()
	{
		return ptsE1;
	}
	
	public int getPtsE2()
	{
		return ptsE2;
	}
	
	public int getPtsTBE1()
	{
		return ptsTBE1;
	}
	
	public int getPtsTBE2()
	{
		return ptsTBE2;
	}
	
	//Main*********************************************************************************
	public static void main(String args[])
	{
		//Tests
	}
}
