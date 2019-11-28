package creacion.factorymethod.ejemplo;

public class Samsung extends Smartphone {

	public Samsung(String description, String ui) {
		super(description, ui);
	}

	@Override
	public void takePhoto() {
		System.out.println("Taking photo from Samsung");
	}

}
