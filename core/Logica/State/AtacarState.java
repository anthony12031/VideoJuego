package State;


import WW.Representacion.Producto.RepresentacionGrafica;
import WW.Vista.Modelo;
import WW.Vista.Pantallas.PantallaJuego;

import com.badlogic.gdx.Gdx;

public class AtacarState extends RepGraficaState {

	private static AtacarState instancia = null;

	@Override
	public void dibujar(RepresentacionGrafica representacion) {

		super.actualizar(representacion);

		Modelo.spritebatch.setProjectionMatrix(PantallaJuego.camara.combined);
		Modelo.spritebatch.begin();
		super.dibujar(representacion);
		if (representacion.efecto != null)
			dibujarEfectoParticula(representacion);
		Modelo.spritebatch.end();

	}

	private void dibujarEfectoParticula (RepresentacionGrafica rep){
		rep.efecto.draw(Modelo.spritebatch, Gdx.graphics.getDeltaTime());
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
