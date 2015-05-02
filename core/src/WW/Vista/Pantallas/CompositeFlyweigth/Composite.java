package WW.Vista.Pantallas.CompositeFlyweigth;

import java.awt.Point;
import java.util.HashMap;
import java.util.Iterator;

public class Composite implements Dibujable{
	
	
	private HashMap<Point, Dibujable> listado;
	
	public Composite(){
		listado=new HashMap<Point, Dibujable>();
		agregar(Fabrica.getMapa("Mapas/MapaUno.tmx", 0, 0),new Point(0,0));
		agregar(Fabrica.getMapa("Mapas/MapaUno.tmx", 1, 0),new Point(1,0));
		agregar(Fabrica.getMapa("Mapas/MapaUno.tmx", 0, 1),new Point(0,1));
		agregar(Fabrica.getMapa("Mapas/MapaUno.tmx", 1, 1),new Point(1,1));
	}
	
	public void agregar(Dibujable d, Point p){
		listado.put(p, d);
	}
	
	public void eliminar(Point p){
		listado.remove(p);
	}
	
	public void dibujar(){
		Iterator<Point> i=listado.keySet().iterator();
		while(i.hasNext()){
			listado.get(i.next()).dibujar();
		}
	}
	
	public Dibujable getDibujo(Point p){
		return listado.get(p);
	}
}