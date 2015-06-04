package Habilidades.Fabricas;

import Habilidades.Productos.HabilidadPuntualVision;
import Habilidades.Productos.HabilidadZonaVision;

public class FabricaHabilidadVision implements FabricaHabilidad {

	@Override
	public HabilidadZonaVision crearHabilidadZona() {
		return new HabilidadZonaVision();
	}

	@Override
	public HabilidadPuntualVision crearHabilidadPuntual() {
		return new HabilidadPuntualVision();
	}

}
