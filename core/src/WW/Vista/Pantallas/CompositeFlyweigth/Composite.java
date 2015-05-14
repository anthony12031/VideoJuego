package WW.Vista.Pantallas.CompositeFlyweigth;

import java.awt.Point;
import java.util.HashMap;
import java.util.Iterator;

public abstract class Composite implements Dibujable{
	
	
	public Composite(){
	}
	
	
	public void agregar(Composite com){
		throw new UnsupportedOperationException();
	}
	
	public void eliminar(Composite com){
		throw new UnsupportedOperationException();
	}
	
	public void dibujar(){
		throw new UnsupportedOperationException();

	}
	
	public Dibujable getDibujo(Point p){
		throw new UnsupportedOperationException();
	}
}