package biscontiflavian.gsm.ClassesPOJO;

public class OrdonnancementPOJO {
	private enum Type { SH, SD, DH, DD, DM };
	private Type type;
	private int nbSetsGagnants;
	private MatchPOJO[] t_matchs;
}
