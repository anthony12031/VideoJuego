package Objeto.Armas.Creadores;
import Objeto.Armas.Productos.Arma;
import Objeto.Armas.Productos.VaritaCedro;




/**
 * 
 */
public class CreadorVaritaCedro implements CreadorArma {

    /**
     * 
     */
    public CreadorVaritaCedro() {
    }

	public Arma crearArma() {
		// TODO Auto-generated method stub
		return new VaritaCedro();
	}

}