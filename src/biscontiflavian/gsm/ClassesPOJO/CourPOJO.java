package biscontiflavian.gsm.ClassesPOJO;

public class CourPOJO {
	//Attributs******************************************************************
	private byte numero;
	private int nbPlaces;
	private enum Type { Dur, Gazon, Terre, Moquette };
	private Type type;
	private boolean couvert;
	
	//Surcharges de méthodes*******************************************************
	public String toString()
	{
		return "Cour N°" + numero;
	}
}
