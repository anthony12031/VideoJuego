package Habilidades.Fabricas;

import Habilidades.Productos.HabilidadPuntualDefensa;
import Habilidades.Productos.HabilidadZonaDefensa;

public class FabricaHabilidadDefensa implements FabricaHabilidad {

	@Override
	public HabilidadZonaDefensa crearHabilidadZona() {
		return new HabilidadZonaDefensa();
	}

	@Override
	public HabilidadPuntualDefensa crearHabilidadPuntual() {
		return new HabilidadPuntualDefensa();
	}

}
