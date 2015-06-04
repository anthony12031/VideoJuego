package Habilidades.Fabricas;

import Habilidades.Productos.HabilidadPuntualVelocidad;
import Habilidades.Productos.HabilidadZonaVelocidad;

public class FabricaHabilidadVelocidad implements FabricaHabilidad {

	@Override
	public HabilidadZonaVelocidad crearHabilidadZona() {
		return new HabilidadZonaVelocidad();
	}

	@Override
	public HabilidadPuntualVelocidad crearHabilidadPuntual() {
		return new HabilidadPuntualVelocidad();
	}

}
