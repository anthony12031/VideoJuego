package Objeto;

public abstract class Objeto {
	protected String nombreObjeto;

	public String getNombreObjeto() {
		return nombreObjeto;
	}

	public void setNombreObjeto(String nombreObjeto) {
		this.nombreObjeto = nombreObjeto;
	}
	
	public abstract void usarObjeto();
}
