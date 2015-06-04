package State;


import WW.Representacion.Producto.RepresentacionGrafica;
<<<<<<< HEAD
import WW.Vista.Modelo;
=======
import WW.Vista.Graficos;
>>>>>>> 596930794c696359b6f2011f447cf7862a1ad6a7
import WW.Vista.Pantallas.PantallaJuego;

import com.badlogic.gdx.Gdx;

public class AtacarState extends RepGraficaState {

	private static AtacarState instancia = null;

	@Override
	public void dibujar(RepresentacionGrafica representacion) {

		super.actualizar(representacion);

<<<<<<< HEAD
		Modelo.spritebatch.setProjectionMatrix(PantallaJuego.camara.combined);
		Modelo.spritebatch.begin();
		super.dibujar(representacion);
		if (representacion.efecto != null)
			dibujarEfectoParticula(representacion);
		Modelo.spritebatch.end();
=======
		Graficos.spritebatch.setProjectionMatrix(PantallaJuego.camara.combined);
		Graficos.spritebatch.begin();
		super.dibujar(representacion);
		if (representacion.efecto != null)
			dibujarEfectoParticula(representacion);
		Graficos.spritebatch.end();
>>>>>>> 596930794c696359b6f2011f447cf7862a1ad6a7

	}

	private void dibujarEfectoParticula (RepresentacionGrafica rep){
<<<<<<< HEAD
		rep.efecto.draw(Modelo.spritebatch, Gdx.graphics.getDeltaTime());
=======
		rep.efecto.draw(Graficos.spritebatch, Gdx.graphics.getDeltaTime());
>>>>>>> 596930794c696359b6f2011f447cf7862a1ad6a7
		if (rep.efecto.isComplete()) {
			rep.setEstado_actual(CaminandoState.getInstancia());
		}
	}


	public static AtacarState getInstancia() {
		if (instancia == null)
			instancia = new AtacarState();
		System.out.println("Estado actual Atacando");
		return instancia;
	}

}
