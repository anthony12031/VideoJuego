package Habilidades.Builder;

import Habilidades.Productos.HabilidadZona;
import Habilidades.Productos.HabilidadZonaAtaque;

public class Explosion extends HabilidadZonaAtaqueBuilder {

	@Override
	public void construirHabilidad() {
		if(!(habilidad instanceof HabilidadZonaAtaque) || habilidad==null){
			crearHabilidad();
		}
		habilidad.setEnfriamiento(2);
		habilidad.setNombre("Explosion");
		((HabilidadZona) habilidad).setRadio(4);
		((HabilidadZonaAtaque) habilidad).setValorAtaqueFisico(50);
		((HabilidadZonaAtaque) habilidad).setValorAtaqueMagico(20);
	}

}
