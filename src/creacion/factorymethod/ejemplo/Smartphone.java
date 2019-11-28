package creacion.factorymethod.ejemplo;

public abstract class Smartphone {
	
	private String description;
	private String ui;

	
	public Smartphone(String description, String ui) {
		this.description = description;
		this.ui = ui;
	}

	public String getDescription() {
		System.out.println(description);
		return description;
	}
	
	public String getUi() {
		System.out.println(ui);
		return ui;
	}

	public abstract void takePhoto();

}
