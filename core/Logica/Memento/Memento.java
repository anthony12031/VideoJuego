package Memento;

import java.io.Serializable;

public class Memento implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public Memento(Usuario u) {
		usuario=u;
	}
	
	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
