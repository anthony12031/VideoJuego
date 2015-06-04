package Habilidades.Productos;

import java.util.ArrayList;

public class PilaHabilidad extends Habilidad {

	private float x;
	private float y;
	private ArrayList<Habilidad> habilidades;
	
	public PilaHabilidad() {
		habilidades=new ArrayList<Habilidad>();
	}
	
	public void agregarHabilidad(Habilidad h){
		habilidades.add(h);
	}
	
	public void quitarHabilidad(Habilidad h){
		habilidades.remove(h);
	}
	
	public ArrayList<Habilidad> getHabilidades(){
		return habilidades;
	}
	
	@Override
	public void actuar() {
		for(int i=0;i<habilidades.size();i++){
			habilidades.get(i).setFoco(x, y);
			habilidades.get(i).actuar();
		}
	}

	@Override
	public void setFoco(float x, float y) {
		this.x=x;
		this.y=y;
	}
	
}
