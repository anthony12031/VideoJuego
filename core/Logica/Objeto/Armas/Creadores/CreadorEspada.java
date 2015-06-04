package Objeto.Armas.Creadores;

import Objeto.Armas.Productos.Arma;
import Objeto.Armas.Productos.Espada;

public class CreadorEspada implements CreadorArma {
	
	public Arma crearArma() {
		return new Espada();
	}

}