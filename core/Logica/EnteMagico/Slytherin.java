package EnteMagico;

import java.awt.Graphics;

public class Slytherin extends Mago{

    public Slytherin() {
    	super.setColor("verde");
    }

    public void Saludar() {
        // TODO implement here
      
    }

	@Override
	public Object clonar() {
		return new Slytherin();
	}

	

}