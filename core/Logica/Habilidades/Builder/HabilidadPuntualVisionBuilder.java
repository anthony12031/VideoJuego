package Habilidades.Builder;

import Habilidades.Fabricas.FabricaHabilidad;
import Habilidades.Fabricas.FabricaHabilidadVision;

public abstract class HabilidadPuntualVisionBuilder extends HabilidadBuilder {

	@Override
	public FabricaHabilidad crearFabricaHabilidad() {
		if(fabricaHabilidad==null || !(fabricaHabilidad instanceof FabricaHabilidadVision)){
			fabricaHabilidad=new FabricaHabilidadVision();
		}
		return fabricaHabilidad;
	}
	
	@Override
	public void crearHabilidad() {
		fabricaHabilidad=crearFabricaHabilidad();
		habilidad=fabricaHabilidad.crearHabilidadPuntual();
	}

}
