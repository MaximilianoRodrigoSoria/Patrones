package creacion.factorymethod;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		AutosFactory factory = new AutosFactory();
		Auto auto1 = factory.getAudi("Audi", 100.000);
		Auto auto2 = factory.getBMW("Audi", 200.000);
		Auto auto3 = factory.getToyota("Audi", 500.000);

		List<Auto> autos = new ArrayList<Auto>();
		autos.add(auto1);
		autos.add(auto2);
		autos.add(auto3);

		for (Auto auto : autos)
		{
			if (auto.getClass().getSimpleName().equals("Audi")) {
				auto.crearDescripcion();
			}

		}

	}

}
