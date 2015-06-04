package Habilidades.Builder;

import Habilidades.Fabricas.FabricaHabilidad;
import Habilidades.Fabricas.FabricaHabilidadDefensa;

public abstract class HabilidadZonaDefensaBuilder extends HabilidadBuilder {

	@Override
	public FabricaHabilidad crearFabricaHabilidad() {
		if(fabricaHabilidad==null || !(fabricaHabilidad instanceof FabricaHabilidadDefensa)){
			fabricaHabilidad=new FabricaHabilidadDefensa();
		}
		return fabricaHabilidad;
	}

	@Override
	public void crearHabilidad() {
		fabricaHabilidad=crearFabricaHabilidad();
		habilidad=fabricaHabilidad.crearHabilidadZona();
	}

}
