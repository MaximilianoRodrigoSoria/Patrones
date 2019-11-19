package estructurales.facade;

public class CuerpoFacade {

	private Ojos ojos;
	private Boca boca;
	
	public CuerpoFacade()
		{ ojos = new Ojos();
		 boca = new Boca();
		}
	
	
	public void ginear()
		{ojos.giniar();}
	
	public void bostesar()
		{boca.bostesar();}
}
