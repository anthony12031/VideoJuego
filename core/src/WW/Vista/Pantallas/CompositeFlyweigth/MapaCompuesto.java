package WW.Vista.Pantallas.CompositeFlyweigth;

import java.util.ArrayList;
import java.util.Iterator;

public class MapaCompuesto extends Composite{

	private ArrayList<Composite> hijos = new ArrayList<Composite>();
	
	public void agregar(Composite com){
		hijos.add(com);
	}
	
	public void eliminar(Composite com){
		hijos.remove(com);
	}
	
	public void dibujar(){
		Iterator<Composite> i = hijos.iterator();
		while(i.hasNext()){
			i.next().dibujar();
		}
	}
	
	public Composite getDibujo(Composite com){
			return hijos.get(hijos.indexOf(com));
	}

	ArrayList<Composite> getHijos() {
		return hijos;
	}

	void setHijos(ArrayList<Composite> hijos) {
		this.hijos = hijos;
	}
	
	
}
