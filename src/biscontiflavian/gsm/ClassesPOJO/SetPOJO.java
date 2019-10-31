package biscontiflavian.gsm.ClassesPOJO;

import java.util.Random;

public class SetPOJO {
	private byte ptsE1;
	private byte ptsE2;
	private enum Type { normal, dernier };
	private Type type;
	
	public SetPOJO(int probabilite, boolean dernierSet)
	{
		ptsE1 = 0;
		ptsE2 = 0;
		
		if(dernierSet)type = Type.dernier;
		else type = Type.normal;
		
		genererPoints(probabilite);
	}
	
	//La variable prob correspond à la probabilité de victoire de l'équipe 1
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
	
	public String toString()
	{
		return ptsE1 + " - " + ptsE2;
	}
	
	public int getPtsE1()
	{
		return ptsE1;
	}
	
	public int getPtsE2()
	{
		return ptsE2;
	}
	
	public static void main(String args[])
	{
		//Tests
	}
}
