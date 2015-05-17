package Objeto.Armas.Creadores;
import Objeto.Armas.Productos.Arma;
import Objeto.Armas.Productos.VaritaSauce;




/**
 * 
 */
public class CreadorVaritaSauce implements CreadorArma {

    /**
     * 
     */
    public CreadorVaritaSauce() {
    }

	public Arma crearArma() {
		// TODO Auto-generated method stub
		return new VaritaSauce();
	}

}