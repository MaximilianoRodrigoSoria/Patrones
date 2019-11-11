package creacion.singleton;

public class Conexion {

	private static final Conexion instance = new Conexion();

	private Conexion() {
	}

	public static Conexion getInstance() {
		return instance;
	}

	// METODO APARTE
	public void getDataConecion() {
		System.out.println("\nURL: 10.3.56.100/mydatabase");
		System.out.println("User: Pepe");
		System.out.println("Password: Fatiga64");
		System.out.println("______________________");
	}

// OTRA FORMA DE GENERAR EL SINGLETON    

//    public class Conexion {
//
//        private static Conexion instance;
//        
//        private Conexion(){}
//        
//        public static Conexion getInstance(){
//            if(instance == null){
//                instance = new Conexion();
//            }
//            return instance;
//        }
//    }

}