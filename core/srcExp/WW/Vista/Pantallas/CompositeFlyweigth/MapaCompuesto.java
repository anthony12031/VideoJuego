package WW.Vista.Pantallas.CompositeFlyweigth;

import java.util.ArrayList;
import java.util.Iterator;

public class MapaCompuesto implements Dibujable{

	private ArrayList<Dibujable> hijos = new ArrayList<Dibujable>();
	
	public void agregar(Dibujable com){
		hijos.add(com);
	}
	
	public void eliminar(Dibujable com){
		hijos.remove(com);
	}
	
	public void dibujar(){
		Iterator<Dibujable> i = hijos.iterator();
		while(i.hasNext()){
			i.next().dibujar();
		}
	}
	
	public Dibujable getDibujo(Dibujable com){
			return hijos.get(hijos.indexOf(com));
	}

	public ArrayList<Dibujable> getHijos() {
		return hijos;
	}

	void setHijos(ArrayList<Dibujable> hijos) {
		this.hijos = hijos;
	}
	
	
}
