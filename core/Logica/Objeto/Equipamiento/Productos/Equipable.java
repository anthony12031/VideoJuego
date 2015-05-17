package Objeto.Equipamiento.Productos;

import Objeto.Objeto;

public abstract class Equipable extends Objeto {
	
	protected int defensaMagica;
	protected int defensaFisica;
	
	public int getDefensaMagica() {
		return defensaMagica;
	}

	public void setDefensaMagica(int defensaMagica) {
		this.defensaMagica = defensaMagica;
	}

	public int getDefensaFisica() {
		return defensaFisica;
	}

	public void setDefensaFisica(int defensaFisica) {
		this.defensaFisica = defensaFisica;
	}
}
