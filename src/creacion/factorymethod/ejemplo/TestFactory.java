package creacion.factorymethod.ejemplo;

public class TestFactory {	
	
	public static void main(String[] args) {
		
		FactorySmartphone factoryProduct = new FactorySmartphone();
		
		Smartphone phone = factoryProduct.getSamsung("Hello, I'm a Samsung", "One Ui 2");		
		phone.getDescription();
		phone.getUi();
		phone.takePhoto();
		System.out.println("------------");
		phone = factoryProduct.getXiaomi("Hello, I'm a Xiaomi", "MIUI 11");		
		phone.getDescription();
		phone.getUi();
		phone.takePhoto();
		System.out.println("------------");
		phone = factoryProduct.getMotorola("Hello, I'm a Motorola", "Android", "Only motorola");		
		phone.getDescription();
		phone.getUi();	
		phone.takePhoto();
	}

}
