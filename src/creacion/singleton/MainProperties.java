package creacion.singleton;

public class MainProperties {
	
	public static void main(String[] args) {
						
		Properties properties1 = Properties.getInstance("USERNAME");
		properties1.setNombre("LALA");
		Properties properties2 = Properties.getInstance("NAMEUSER");
		properties2.setNombre("Mara");
		
		if(properties1.equals(properties2))	{
			System.out.println("Son los mismos objetos");
		} else {
			System.out.println("Son distintos objetos");
		}
		
		//Lala
		System.out.println(properties1.getNombre());
		//Mara
		System.out.println(properties2.getNombre());
		
		
		Properties properties3 = Properties.getInstance("Mara");
		System.out.println(properties3.getNombre());
	}	

}
