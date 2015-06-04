package Habilidades.Builder;

import Habilidades.Productos.HabilidadZona;
import Habilidades.Productos.HabilidadZonaCuracion;

public class MultipleSanacion extends HabilidadZonaCuracionBuilder {

	@Override
	public void construirHabilidad() {
		if(!(habilidad instanceof HabilidadZonaCuracion) || habilidad==null){
			crearHabilidad();
		}
		habilidad.setEnfriamiento(0);
		habilidad.setNombre("Multiple Sanacion");
		((HabilidadZona) habilidad).setRadio(6);
		((HabilidadZonaCuracion) habilidad).setVidaRecuperada(20);
	}

}