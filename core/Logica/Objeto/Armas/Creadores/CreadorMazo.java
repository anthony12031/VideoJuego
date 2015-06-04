package Objeto.Armas.Creadores;

import Objeto.Armas.Productos.Arma;
import Objeto.Armas.Productos.Mazo;

public class CreadorMazo implements CreadorArma {
	
	public Arma crearArma() {
		// TODO Auto-generated method stub
		return new Mazo();
	}

}