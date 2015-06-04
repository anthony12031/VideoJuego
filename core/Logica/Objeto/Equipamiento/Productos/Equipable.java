package Objeto.Equipamiento.Productos;

import EnteMagico.EnteMagico;
import Objeto.Objeto;

public abstract class Equipable extends Objeto {
	
	protected int defensaMagica;
	protected int defensaFisica;
	protected EnteMagico ente;
	
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

	public EnteMagico getEnte() {
		return ente;
	}

	public void setEnte(EnteMagico ente) {
		this.ente = ente;
	}
	
}
