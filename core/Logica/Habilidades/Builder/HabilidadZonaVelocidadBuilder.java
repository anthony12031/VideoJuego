package Habilidades.Builder;

import Habilidades.Fabricas.FabricaHabilidad;
import Habilidades.Fabricas.FabricaHabilidadVelocidad;

public abstract class HabilidadZonaVelocidadBuilder extends HabilidadBuilder {

	@Override
	public FabricaHabilidad crearFabricaHabilidad() {
		if(fabricaHabilidad==null || !(fabricaHabilidad instanceof FabricaHabilidadVelocidad)){
			fabricaHabilidad=new FabricaHabilidadVelocidad();
		}
		return fabricaHabilidad;
	}

	@Override
	public void crearHabilidad() {
		fabricaHabilidad=crearFabricaHabilidad();
		habilidad=fabricaHabilidad.crearHabilidadZona();
	}

}
