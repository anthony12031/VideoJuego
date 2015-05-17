package Objeto.Armas.Creadores;
import Objeto.Armas.Productos.Arma;
import Objeto.Armas.Productos.VaritaFresno;




/**
 * 
 */
public class CreadorVaritaFresno implements CreadorArma {

    /**
     * 
     */
    public CreadorVaritaFresno() {
    }

	public Arma crearArma() {
		// TODO Auto-generated method stub
		return new VaritaFresno();
	}

}