package biscontiflavian.gsm.ClassesPOJO;

public class EquipePOJO {
	private JoueurPOJO[] t_joueurs;
	private enum Type { H, F, M };
	private Type type;
	
	public EquipePOJO(JoueurPOJO[] t_j)
	{
		t_joueurs = new JoueurPOJO[t_j.length];
		System.arraycopy(t_j, 0, t_joueurs, 0, t_j.length);
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
