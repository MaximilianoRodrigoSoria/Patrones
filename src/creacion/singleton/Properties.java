package creacion.singleton;


public class Properties {
	
	private static final Properties instance = new Properties();
	private static String userName;
	private String nombre;
	private Properties() {
	}
	
	public static Properties getInstance(String userDetail) {
		userName = userDetail;
		System.out.println("User Name: " + userName);
		return instance;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
