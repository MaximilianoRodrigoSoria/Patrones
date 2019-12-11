package creacion.singleton;

public class Main {

	public static void main(String[] args) {

		/**
		 * Utilizaremos el patrón Singleton cuando por alguna razón necesitemos 
		 * que exista sólo una instancia (un objeto) de una determinada Clase.
		 */

		Conexion c1 = Conexion.getInstance();
		Conexion c2 = Conexion.getInstance();
		if(c1==c2)	
			{System.out.println("Las conexiones son el mismo Objeto");}
		else
			{System.out.println("Las no conexiones son el mismo Objeto");}
	
		
		c1.getDataConecion();
		
		//AHORA VEAMOS CON OBJETOS APARENTEMENTE IGUALES
		String s1 = new String("EXAMPLE");
		String s2 = new String("EXAMPLE");
		if(s1 == s2)	
		{System.out.println("\nLos strings son el mismo Objeto");}
	else
		{System.out.println("\nLos strings no son el mismo Objeto");}
	}

}
