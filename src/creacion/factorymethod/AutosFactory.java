package creacion.factorymethod;

import creacion.factorymethod.tipos.autos.Audi;
import creacion.factorymethod.tipos.autos.BMW;
import creacion.factorymethod.tipos.autos.Toyota;

public class AutosFactory implements Factory{

	@Override
	public Auto getToyota(String marca, Double precio) {
		return new Toyota(marca, precio);
	}

	@Override
	public Auto getBMW(String marca, Double precio) {
		return new BMW(marca, precio);
	}

	@Override
	public Auto getAudi(String marca, Double precio) {
		return new Audi(marca, precio);
	}

	
	
	

}
