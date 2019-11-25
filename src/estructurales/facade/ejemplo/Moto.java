package estructurales.facade.ejemplo;

public class Moto extends MedioTransporte{

	@Override
	public void encender() {
		System.out.println("Moto encendida");		
	}

	@Override
	public void detener() {
		System.out.println("Moto detenida");	
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando moto");	
	}

	@Override
	public void desacelerar() {
		System.out.println("Desacelerando moto");	
	}

}
