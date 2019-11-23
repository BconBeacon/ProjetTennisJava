package biscontiflavian.gsm.ClassesPOJO;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import biscontiflavian.gsm.ClassesDAO.CourDAO;
import biscontiflavian.gsm.ClassesUtilitaires.CUTypeCour;

public class CourPOJO {
	//Attributs******************************************************************
	private int numero;
	private int nbPlaces;
	private CUTypeCour type;
	private boolean couvert;
	
	//Constructeurs***************************************************************
	@SuppressWarnings("preview")
	public CourPOJO(String ligne)
	{
		int index, nextIndex;
		
		index = ligne.indexOf("|");
		numero = Integer.parseInt(ligne.substring(0, index));
		
		nextIndex = ligne.indexOf("|", index+1);
		nbPlaces = Integer.parseInt(ligne.substring(index+1, nextIndex));
		
		index = nextIndex;
		nextIndex = ligne.indexOf("|", index+1);
		type = switch(ligne.substring(index+1,  nextIndex))
				{
					case "Dur" -> CUTypeCour.Dur;
					case "Gazon" -> CUTypeCour.Gazon;
					case "Moquette" -> CUTypeCour.Moquette;
					case "Terre" -> CUTypeCour.Terre;
					default -> CUTypeCour.Gazon;
				};
		
		index = nextIndex;
		couvert = switch(ligne.substring(index+1))
				{
					case "True" -> true;
					case "False" -> false;
					default -> true;
				};
	}
	
	//Surcharges de méthodes********************************************************************************
	public String toString()
	{
		return "Cour " + numero + " " +type.toString();
	}
	
	//Main************************************************************************************************
	public static void main(String args[])
	{
		try
		{
			CourDAO cdao = new CourDAO();
			ArrayList<CourPOJO> cours = new ArrayList<>();
			
			for(String cour : cdao.getCours())
			{
				CourPOJO c = new CourPOJO(cour);
				cours.add(c);
				System.out.println(c);
			}
		}
		catch(IOException e)
		{
			JOptionPane.showMessageDialog(null, "Une erreur est survenue : " + e);
		}
	}
}
