package Habilidades.Builder;

import Habilidades.Productos.HabilidadZona;
import Habilidades.Productos.HabilidadZonaAtaque;

public class Terremoto extends HabilidadZonaAtaqueBuilder {

	@Override
	public void construirHabilidad() {
		if(!(habilidad instanceof HabilidadZonaAtaque) || habilidad==null){
			crearHabilidad();
		}
		habilidad.setEnfriamiento(4);
		habilidad.setNombre("Terremoto");
		((HabilidadZona) habilidad).setRadio(6);
		((HabilidadZonaAtaque) habilidad).setValorAtaqueFisico(60);
		((HabilidadZonaAtaque) habilidad).setValorAtaqueMagico(10);
	}

}
