package EnteMagico;

import java.awt.Graphics;

public class Gryffindor extends Mago{
	
	public Gryffindor() {
    	super.setColor("Amarillo");
    }

	@Override
	public Object clonar() {
		return new Gryffindor();
	}

	@Override
	public void Saludar() {

	}

	



}