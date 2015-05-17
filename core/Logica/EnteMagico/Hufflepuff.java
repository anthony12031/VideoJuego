package EnteMagico;

import java.awt.Graphics;


public class Hufflepuff extends Mago{

    public Hufflepuff() {
    	super.setColor("Rojo");
    }

    public void Saludar() {
        // TODO implement here
       
    }

	@Override
	public Object clonar() {
		return new Hufflepuff();
	}

	

	

}