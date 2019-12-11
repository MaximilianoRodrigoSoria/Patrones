package creacion.factorymethod;

public interface Factory {
	
	//Se declaran los tipos de auto a devolver con el nombre de las clases
	public Auto getToyota(String marca, Double precio);
	public Auto getBMW(String marca, Double precio);
	public Auto getAudi(String marca, Double precio);


}
