package State;

import WW.Representacion.Producto.RepresentacionGrafica;
<<<<<<< HEAD
import WW.Vista.Modelo;
=======
import WW.Vista.Graficos;
>>>>>>> 596930794c696359b6f2011f447cf7862a1ad6a7
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
		
<<<<<<< HEAD
		Modelo.spritebatch.setProjectionMatrix(PantallaJuego.camara.combined);
		Modelo.spritebatch.begin();
		super.dibujar(rep);
		Modelo.spritebatch.end();
=======
		Graficos.spritebatch.setProjectionMatrix(PantallaJuego.camara.combined);
		Graficos.spritebatch.begin();
		super.dibujar(rep);
		Graficos.spritebatch.end();
>>>>>>> 596930794c696359b6f2011f447cf7862a1ad6a7
		
	}
	

	public static CaminandoState getInstancia() {
		if (instancia == null)
			instancia = new CaminandoState();
		System.out.println("Estado actual Caminando");
		return instancia;
	}




}
