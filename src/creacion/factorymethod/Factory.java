package creacion.factorymethod;

public interface Factory {
	
	public Auto getToyota(String marca, Double precio);
	public Auto getBMW(String marca, Double precio);
	public Auto getAudi(String marca, Double precio);


}
