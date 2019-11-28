package estructurales.facade.ejemplo;


public class Conductor {
	private MedioTransporte medioTransporte;

	
	public Conductor() {
		
	}
	

	public void setearTransporte(MedioTransporte medio) {
		this.medioTransporte = medio;
	}


	public void encender() {
		medioTransporte.encender();
		
	}

	public void acelerar() {
		medioTransporte.acelerar();
		
	}

	public void detener() {
		medioTransporte.detener();
		
	}

	public void desacelerar() {
		medioTransporte.desacelerar();
		
	}

}
