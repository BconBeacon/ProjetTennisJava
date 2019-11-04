package biscontiflavian.gsm.ClassesPOJO;

public class OrdonnancementPOJO {
	private enum Type { SH, SD, DH, DD, DM };
	private Type type;
	private int nbSetsGagnants;
	private MatchPOJO[] t_matchs;
	
	@SuppressWarnings("preview")
	public OrdonnancementPOJO(String type, int nbSetsGagnants)
	{
		switch(type)
		{
			case "SH" :
			{
				this.type = Type.SH;
				t_matchs = new MatchPOJO[127];
			}
			case "SD" :
			{
				this.type = Type.SD;
				t_matchs = new MatchPOJO[127];
			}
			case "DH" :
			{
				this.type = Type.DH;
				t_matchs = new MatchPOJO[63];
			}
			case "DD" :
			{
				this.type = Type.DD;
				t_matchs = new MatchPOJO[63];
			}
			case "DM" :
			{
				this.type = Type.DM;
				t_matchs = new MatchPOJO[63];
			}
		}
		this.nbSetsGagnants = nbSetsGagnants;
	}
	
	public void setTableauMatchs(MatchPOJO[] t_matchs)
	{
		this.t_matchs = t_matchs;
	}
	
	public void afficherMatchs()
	{
		for(MatchPOJO m : t_matchs)
		{
			m.afficherInfosMatch();
		}
	}
}
