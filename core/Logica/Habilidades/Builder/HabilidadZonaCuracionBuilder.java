package Habilidades.Builder;

import Habilidades.Fabricas.FabricaHabilidad;
import Habilidades.Fabricas.FabricaHabilidadCuracion;

public abstract class HabilidadZonaCuracionBuilder extends HabilidadBuilder {

	@Override
	public FabricaHabilidad crearFabricaHabilidad() {
		if(fabricaHabilidad==null || !(fabricaHabilidad instanceof FabricaHabilidadCuracion)){
			fabricaHabilidad=new FabricaHabilidadCuracion();
		}
		return fabricaHabilidad;
	}

	@Override
	public void crearHabilidad() {
		fabricaHabilidad=crearFabricaHabilidad();
		habilidad=fabricaHabilidad.crearHabilidadZona();
	}

}
