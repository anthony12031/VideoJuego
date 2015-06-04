package Habilidades.Builder;

import Habilidades.Productos.HabilidadZona;
import Habilidades.Productos.HabilidadZonaCuracion;

public class MultipleSanacionSimple extends HabilidadZonaCuracionBuilder {

	@Override
	public void construirHabilidad() {
		if(!(habilidad instanceof HabilidadZonaCuracion) || habilidad==null){
			crearHabilidad();
		}
		habilidad.setEnfriamiento(0);
		habilidad.setNombre("Multiple sanacion simple");
		((HabilidadZona) habilidad).setRadio(3);
		((HabilidadZonaCuracion) habilidad).setVidaRecuperada(10);
	}

}
