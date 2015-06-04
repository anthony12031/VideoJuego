package Objeto.Armas.Creadores;

import Objeto.Armas.Productos.Arma;
import Objeto.Armas.Productos.Varita;

public class CreadorVarita implements CreadorArma {

	public Arma crearArma() {
		return new Varita();
	}

}