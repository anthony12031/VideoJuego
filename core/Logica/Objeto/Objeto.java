package Objeto;

import java.io.Serializable;

public abstract class Objeto implements Serializable{

	protected static final long serialVersionUID = 1L;
	
	protected String nombreObjeto;

	public String getNombreObjeto() {
		return nombreObjeto;
	}

	public void setNombreObjeto(String nombreObjeto) {
		this.nombreObjeto = nombreObjeto;
	}
	
	public abstract void usarObjeto();
	
}
