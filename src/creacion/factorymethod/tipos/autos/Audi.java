package creacion.factorymethod.tipos.autos;

import creacion.factorymethod.Auto;

public class Audi extends Auto{
	public Audi(String marca, Double precio) {
		super(marca, precio);
	}

	@Override
	public void crearDescripcion() {
		System.out.println(String.format("La maca es  %s con un precio de $%s", getMarca(), getPrecio()));
	}

}
