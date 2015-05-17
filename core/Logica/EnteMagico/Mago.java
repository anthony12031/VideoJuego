package EnteMagico;



public abstract class Mago extends EnteMagico {
	

	protected String Color;
	
	 public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public abstract void Saludar();

}
