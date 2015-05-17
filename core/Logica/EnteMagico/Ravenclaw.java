package EnteMagico;

import java.awt.Graphics;


public class Ravenclaw extends Mago{

    public Ravenclaw() {
    	super.setColor("Azul");
    }

    public void Saludar() {
        // TODO implement here
       
    }

	@Override
	public Object clonar() {
		return new Ravenclaw();
	}


}