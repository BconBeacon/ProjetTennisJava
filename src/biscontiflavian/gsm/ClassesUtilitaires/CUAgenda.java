package biscontiflavian.gsm.ClassesUtilitaires;

import java.time.LocalDate;

public class CUAgenda {
	private CUDate[] agenda;
	private CUAgenda instance;
	
	private CUAgenda()
	{
		LocalDate auj = LocalDate.now();
		agenda = new CUDate[443];
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
