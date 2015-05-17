package Objeto.Armas.Creadores;
import Objeto.Armas.Productos.Arma;
import Objeto.Armas.Productos.Espada;




/**
 * 
 */
public class CreadorEspada implements CreadorArma {

    /**
     * 
     */
    public CreadorEspada() {
    }

	public Arma crearArma() {
		// TODO Auto-generated method stub
		return new Espada();
	}

}