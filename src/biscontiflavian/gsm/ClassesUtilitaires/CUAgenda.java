package biscontiflavian.gsm.ClassesUtilitaires;

public class CUAgenda {
	//private ListLinked<CUDate> agenda;
	private CUAgenda instance;
	
	private CUAgenda()
	{
		
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
