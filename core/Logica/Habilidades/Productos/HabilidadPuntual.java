package Habilidades.Productos;

import EnteMagico.EnteMagico;

public abstract class HabilidadPuntual extends Habilidad {
	protected EnteMagico enteMagico;

	public EnteMagico getEnteMagico() {
		return enteMagico;
	}

	public void setEnteMagico(EnteMagico enteMagico) {
		this.enteMagico = enteMagico;
	}
	
	public void setFoco(float x, float y){
		super.setFoco(x, y);
	}
}
