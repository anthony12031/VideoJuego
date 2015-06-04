package Habilidades.Productos;

import java.io.Serializable;

public abstract class Habilidad implements Runnable, Serializable{

	protected static final long serialVersionUID = 1L;
	
	protected String nombre;
	protected int enfriamiento;
	protected int enfriamientoActual;
	protected String keyRep;
	protected float focoX;
	protected float focoY;
	
	public float getFocoX() {
		return focoX;
	}

	public void setFocoX(float focoX) {
		this.focoX = focoX;
	}

	public float getFocoY() {
		return focoY;
	}

	public void setFocoY(float focoY) {
		this.focoY = focoY;
	}

	public String getKeyRep() {
		return keyRep;
	}

	public void setKeyRep(String keyRep) {
		this.keyRep = keyRep;
	}
	
	public Habilidad() {
		enfriamiento=0;
		enfriamientoActual=0;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEnfriamiento() {
		return enfriamiento;
	}
	public void setEnfriamiento(int enfriamiento) {
		this.enfriamiento = enfriamiento;
	}
	
	public int getEnfriamientoActual(){
		return enfriamientoActual;
	}
	
	public abstract void actuar();
	
	public void setFoco(float x, float y){
		focoX=x;
		focoY=y;
	}
	
	@Override
	public void run() {
		this.enfriamientoActual=0;
		while(enfriamientoActual<enfriamiento){
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {}
			enfriamientoActual++;
		}
	}
	
	public void metodoPlantilla(float x, float y){
		setFoco(x,y);
		actuar();
		new Thread(this).start();
	}
}
