package Habilidades.Builder;

import Habilidades.Productos.HabilidadPuntualAtaque;

public class MocoMurcielago extends HabilidadPuntualAtaqueBuilder {
	
	@Override
	public void construirHabilidad() {
		if(!(habilidad instanceof HabilidadPuntualAtaque) || habilidad==null){
			crearHabilidad();
		}
		habilidad.setEnfriamiento(10);
		habilidad.setNombre("Moco de murcielago");
		habilidad.setKeyRep("magia");
		((HabilidadPuntualAtaque)habilidad).setValorAtaqueFisico(20);
		((HabilidadPuntualAtaque)habilidad).setValorAtaqueMagico(10);
	}
}
