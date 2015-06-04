package Habilidades.Builder;

import Habilidades.Productos.HabilidadPuntualAtaque;

public class Fuego extends HabilidadPuntualAtaqueBuilder {

	@Override
	public void construirHabilidad() {
		if(!(habilidad instanceof HabilidadPuntualAtaque) || habilidad==null){
			crearHabilidad();
		}
		habilidad.setEnfriamiento(5);
		habilidad.setNombre("Fuego");
		habilidad.setKeyRep("fuego");
		((HabilidadPuntualAtaque)habilidad).setValorAtaqueFisico(40);
		((HabilidadPuntualAtaque)habilidad).setValorAtaqueMagico(10);
		
	}

}
