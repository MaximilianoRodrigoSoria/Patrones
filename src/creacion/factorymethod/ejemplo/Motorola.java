package creacion.factorymethod.ejemplo;

public class Motorola extends Smartphone {
	
	private String onlyMotorola;

	public Motorola(String description, String ui, String onlyMotorola) {
		super(description, ui);
		this.onlyMotorola = onlyMotorola;
	}

	@Override
	public void takePhoto() {
		System.out.println("Taking photo from Motorola");
	}

	public String getOnlyMotorola() {
		System.out.println(onlyMotorola);
		return onlyMotorola;
	}
	
	

}
