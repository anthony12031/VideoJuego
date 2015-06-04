package Objeto.Armas.Creadores;

import Objeto.Armas.Productos.Arma;
import Objeto.Armas.Productos.Baculo;

public class CreadorBaculo implements CreadorArma {

	public Arma crearArma() {
		return new Baculo();
	}

}