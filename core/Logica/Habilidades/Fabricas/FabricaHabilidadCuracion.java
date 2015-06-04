package Habilidades.Fabricas;

import Habilidades.Productos.HabilidadPuntualCuracion;
import Habilidades.Productos.HabilidadZonaCuracion;

public class FabricaHabilidadCuracion implements FabricaHabilidad {

	@Override
	public HabilidadZonaCuracion crearHabilidadZona() {
		return new HabilidadZonaCuracion();
	}

	@Override
	public HabilidadPuntualCuracion crearHabilidadPuntual() {
		return new HabilidadPuntualCuracion();
	}

}
