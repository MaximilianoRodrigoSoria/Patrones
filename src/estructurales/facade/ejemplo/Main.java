package estructurales.facade.ejemplo;

public class Main {

	public static void main(String[] args) {
		
		Conductor conductor = new Conductor();
		
		MedioTransporte barco = new Barco();		
		conductor.setearTransporte(barco);
		conductor.encender();
		conductor.acelerar();		
		conductor.desacelerar();
		conductor.detener();
		
		System.out.println("/////////////////////////////////////////////////");
		
		MedioTransporte moto = new Moto();		
		conductor.setearTransporte(moto);
		conductor.encender();
		conductor.acelerar();
		conductor.desacelerar();
		conductor.detener();
		
	}

}
