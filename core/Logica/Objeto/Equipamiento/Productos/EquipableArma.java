package Objeto.Equipamiento.Productos;

import Objeto.Armas.Productos.Arma;

public class EquipableArma extends Equipable {
	
	private Arma arma;

	public void setArma(Arma arma){
		this.arma=arma;
	}	

	public Arma getArma(){
		return arma;
	}

	@Override
	public void usarObjeto() {		
		arma.usarObjeto();
	}

}