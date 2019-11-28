package creacion.factorymethod.ejemplo;

public class Xiaomi extends Smartphone {

	public Xiaomi(String description, String ui) {
		super(description, ui);
		
	}

	@Override
	public void takePhoto() {
		System.out.println("Taking a photo from Xiaomi");
	}

}
