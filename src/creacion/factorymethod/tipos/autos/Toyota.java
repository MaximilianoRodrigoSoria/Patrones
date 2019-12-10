package creacion.factorymethod.tipos.autos;

import creacion.factorymethod.Auto;

public class Toyota extends Auto{
	public Toyota(String marca, Double precio) {
		super(marca, precio);
	}

	@Override
	public void crearDescripcion() {
		System.out.println(String.format("La maca es %s con un precio de  $%s", getMarca(), getPrecio()));
	}

}
