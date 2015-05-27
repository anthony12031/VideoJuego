package State;

import WW.Representacion.Producto.RepresentacionGrafica;
import WW.Vista.Graficos;
import WW.Vista.Pantallas.PantallaJuego;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;

public class CaminandoState extends RepGraficaState {

	private static CaminandoState instancia = null;

	/* Singleton el objeto sera reutilizado en otras criaturas */

	private CaminandoState() {

	}


	public void dibujar(RepresentacionGrafica rep) {
		
		super.actualizar(rep);
		
		Graficos.spritebatch.setProjectionMatrix(PantallaJuego.camara.combined);
		Graficos.spritebatch.begin();
		super.dibujar(rep);
		Graficos.spritebatch.end();
		
	}
	

	public static CaminandoState getInstancia() {
		if (instancia == null)
			instancia = new CaminandoState();
		System.out.println("Estado actual Caminando");
		return instancia;
	}




}
