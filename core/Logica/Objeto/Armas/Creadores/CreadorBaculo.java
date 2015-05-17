package Objeto.Armas.Creadores;
import Objeto.Armas.Productos.Arma;
import Objeto.Armas.Productos.Baculo;




/**
 * 
 */
public class CreadorBaculo implements CreadorArma {

    /**
     * 
     */
    public CreadorBaculo() {
    }

	public Arma crearArma() {
		// TODO Auto-generated method stub
		return new Baculo();
	}

}