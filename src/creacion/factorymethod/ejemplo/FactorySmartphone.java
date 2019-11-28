package creacion.factorymethod.ejemplo;

public class FactorySmartphone implements Factory{

	@Override
	public Smartphone getSamsung(String description, String ui) {
		return new Samsung(description, ui);
	}

	@Override
	public Smartphone getXiaomi(String description, String ui) {
		return new Xiaomi(description, ui);
	}

	@Override
	public Smartphone getMotorola(String description, String ui, String onlyMotorola) {
		return new Motorola(description, ui, onlyMotorola);
	}

}
