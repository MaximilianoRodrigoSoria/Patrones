package creacion.factorymethod;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		/*  1- Se crean 3 Instancias de Metodos, las mismas tienen como marca a Audi
		 *  2- La factory devuelve 3 autos cuya marca es Audi (Pero que la clase de creacion correponde a Audi.java, BMW.java y Toyota.java que heredan de Auto.java)
		 *  3- Se agregan a una lista
		 *  4- Se recorren con un for y se busca solo a los autos que sean de tipo Audi
		 *  5- Solo imprime la descripcon del auto1 
		 */  
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
