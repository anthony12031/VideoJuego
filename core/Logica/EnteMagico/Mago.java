package EnteMagico;

import java.util.ArrayList;

import Habilidades.Productos.Habilidad;
import Objeto.Objeto;
import Objeto.Equipamiento.Productos.Equipable;

public abstract class Mago extends EnteMagico {

	protected Habilidad habilidadUsar;
	protected Habilidad habilidadQ;
	protected Habilidad habilidadW;
	protected Habilidad habilidadE;
	protected ArrayList<Habilidad> listaHabilidad;
	protected ArrayList<Objeto> listaObjetos;
	protected ArrayList<Equipable> equipoUsado;
	
	public Mago() {
		listaHabilidad=new ArrayList<Habilidad>();
		listaObjetos=new ArrayList<Objeto>();
		equipoUsado=new ArrayList<Equipable>();
	}

	public Habilidad getHabilidadUsar() {
		return habilidadUsar;
	}

	public void setHabilidadUsar(Habilidad habilidadUsar) {
		this.habilidadUsar = habilidadUsar;
	}
	
	public Habilidad getHabilidadQ() {
		return habilidadQ;
	}

	public void setHabilidadQ(Habilidad habilidadQ) {
		this.habilidadQ = habilidadQ;
	}

	public Habilidad getHabilidadW() {
		return habilidadW;
	}

	public void setHabilidadW(Habilidad habilidadW) {
		this.habilidadW = habilidadW;
	}

	public Habilidad getHabilidadE() {
		return habilidadE;
	}

	public void setHabilidadE(Habilidad habilidadE) {
		this.habilidadE = habilidadE;
	}

	public void agregarHabilidad(Habilidad h){
		if(!listaHabilidad.contains(h)){
			listaHabilidad.add(h);
		}
	}
	
	public void agregarObjeto(Objeto o){
		if(!listaObjetos.contains(o)){
			listaObjetos.add(o);
		}
	}
	
	public void agregarEquipable(Equipable e){
		for(int i=0;i<equipoUsado.size();i++){
			if(e.getClass().getSimpleName().equals(equipoUsado.get(i).getClass().getSimpleName())){
				equipoUsado.set(i, e);
				return;
			}
		}
		equipoUsado.add(e);
	}
	
	public void usarHabilidad(){
		if(!(habilidadUsar==null)){
			habilidadUsar.actuar();
		}
	}
	
}
