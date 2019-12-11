package estructurales.facade.ejemplo;

public class Barco extends MedioTransporte{
	
	public void encender() {
		System.out.println("Barco encendido");
	}
	
	public void detener() {
		System.out.println("Barco detenido");
	}

	public void acelerar() {
		System.out.println("Acelerando");
	}

	public void desacelerar() {
		System.out.println("Desacelerando");
	}
}