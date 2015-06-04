package Habilidades.Productos;

import java.awt.Point;

public abstract class HabilidadZona extends Habilidad {
	protected int radio;
	protected Point ubicacion;
	protected HabilidadPuntual habilidadPuntualAsociada;

	public HabilidadZona() {
		radio=10;
		ubicacion=new Point(0,0);
	}
	
	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	public Point getUbicacion(){
		return ubicacion;
	}
	
	public void setFoco(float x, float y){
		super.setFoco(x, y);
		ubicacion.setLocation(x, y);
	}

	public HabilidadPuntual getHabilidadPuntualAsociada() {
		return habilidadPuntualAsociada;
	}

	public void setHabilidadPuntualAsociada(
			HabilidadPuntual habilidadPuntualAsociada) {
		this.habilidadPuntualAsociada = habilidadPuntualAsociada;
	}

}
