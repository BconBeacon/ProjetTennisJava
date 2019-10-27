package biscontiflavian.gsm.ClassesPOJO;

import java.util.ArrayList;
import java.util.Date;

public class MatchPOJO {
	private int numero;
	private Date date;
	private final int dureeEsperee = 2;
	private CourPOJO court;
	private EquipePOJO[] t_equipes;
	private ArbitrePOJO arbitre;
	private EquipePOJO vainqueur;
	private ArrayList<SetPOJO> l_sets;
}
