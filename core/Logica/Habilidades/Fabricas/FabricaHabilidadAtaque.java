package Habilidades.Fabricas;

import Habilidades.Productos.HabilidadPuntualAtaque;
import Habilidades.Productos.HabilidadZonaAtaque;

public class FabricaHabilidadAtaque implements FabricaHabilidad{

	@Override
	public HabilidadZonaAtaque crearHabilidadZona() {
		return new HabilidadZonaAtaque();
	}

	@Override
	public HabilidadPuntualAtaque crearHabilidadPuntual() {
		return new HabilidadPuntualAtaque();
	}

}
