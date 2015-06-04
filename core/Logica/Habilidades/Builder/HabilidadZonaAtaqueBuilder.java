package Habilidades.Builder;

import Habilidades.Fabricas.FabricaHabilidad;
import Habilidades.Fabricas.FabricaHabilidadAtaque;

public abstract class HabilidadZonaAtaqueBuilder extends HabilidadBuilder {

	@Override
	public FabricaHabilidad crearFabricaHabilidad() {
		if(fabricaHabilidad==null || !(fabricaHabilidad instanceof FabricaHabilidadAtaque)){
			fabricaHabilidad=new FabricaHabilidadAtaque();
		}
		return fabricaHabilidad;
	}
	
	public void crearHabilidad(){
		fabricaHabilidad=crearFabricaHabilidad();
		habilidad=fabricaHabilidad.crearHabilidadZona();
	}

}
