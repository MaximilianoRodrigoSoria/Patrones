package creacion.factorymethod;

public abstract class Auto {
	
	String marca;
	Double precio;
	public Auto(String marca, Double precio) {
		this.marca = marca;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public Double getPrecio() {
		return precio;
	}
	
	public abstract void crearDescripcion();
	

}
