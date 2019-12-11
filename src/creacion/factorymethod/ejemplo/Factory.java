package creacion.factorymethod.ejemplo;

public interface Factory {

	Smartphone getSamsung(String description, String ui);
	Smartphone getXiaomi(String description, String ui);
	Smartphone getMotorola(String description, String ui, String onlyMotorola);
}
