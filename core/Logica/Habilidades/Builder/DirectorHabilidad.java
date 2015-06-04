package Habilidades.Builder;

import Habilidades.Productos.Habilidad;

public class DirectorHabilidad {
	
	private HabilidadBuilder habilidadBuilder;

	public void setHabilidadBuilder(HabilidadBuilder habilidadBuilder) {
		this.habilidadBuilder = habilidadBuilder;
	}
	
	public Habilidad getHabilidad(){
		return habilidadBuilder.getHabilidad();
	}
	
	public void contruirHabilidad(){
		habilidadBuilder.crearHabilidad();
		habilidadBuilder.construirHabilidad();
	}
}
