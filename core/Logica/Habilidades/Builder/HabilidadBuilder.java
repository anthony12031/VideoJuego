package Habilidades.Builder;

import Habilidades.Fabricas.FabricaHabilidad;
import Habilidades.Productos.Habilidad;

public abstract class HabilidadBuilder {
	protected Habilidad habilidad;
	protected FabricaHabilidad fabricaHabilidad;
	
	public Habilidad getHabilidad() {
		return habilidad;
	}

	public abstract FabricaHabilidad crearFabricaHabilidad();
	public abstract void construirHabilidad();
	public abstract void crearHabilidad();
}
