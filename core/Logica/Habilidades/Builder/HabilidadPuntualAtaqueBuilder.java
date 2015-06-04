package Habilidades.Builder;

import Habilidades.Fabricas.FabricaHabilidad;
import Habilidades.Fabricas.FabricaHabilidadAtaque;

public abstract class HabilidadPuntualAtaqueBuilder extends HabilidadBuilder {

	@Override
	public FabricaHabilidad crearFabricaHabilidad() {
		if(fabricaHabilidad==null || !(fabricaHabilidad instanceof FabricaHabilidadAtaque)){
			fabricaHabilidad=new FabricaHabilidadAtaque();
		}
		return fabricaHabilidad;
	}

	@Override
	public void crearHabilidad() {
		fabricaHabilidad=crearFabricaHabilidad();
		habilidad=fabricaHabilidad.crearHabilidadPuntual();
	}

}
