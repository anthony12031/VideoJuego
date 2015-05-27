package State;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;

import WW.Representacion.Producto.RepresentacionGrafica;
import WW.Vista.Graficos;

public abstract class RepGraficaState {

	/*
	 * define la interface para los distintos estados en los que puede esta el
	 * objeto la clase representacion grafica mantiene una referencia al estado
	 * actual y pasa sus solicitudes de actualizacion al objeto estado_actual, posee una 
	 * implementacion que puede o no ser utilizada por las subclases.
	 */

	public void dibujar(RepresentacionGrafica rep) {
		
		/* dibujar el ente Magico */
		Graficos.spritebatch.draw(rep.getAnimacion_frame(), rep.getX(), rep.getY());
		
	}

	public void actualizar(RepresentacionGrafica rep) {
		
		float x = rep.getX();
		float y = rep.getY();
		float velocidad = rep.getVelocidad();

		float delta_tiempo = rep.getTiempo_animacion()
				+ Gdx.graphics.getDeltaTime();

		rep.setTiempo_animacion(delta_tiempo);

		if (rep.isMovarri()) {
			rep.setY(y + velocidad * Gdx.graphics.getDeltaTime());
			rep.setAnimacion_frame(rep.getAnimaciones()
					.get(rep.getIdentificador() + "arriba")
					.getKeyFrame(rep.getTiempo_animacion()));
		}
		if (rep.isMovaba()) {
			rep.setY(y - velocidad * Gdx.graphics.getDeltaTime());
			rep.setAnimacion_frame(rep.getAnimaciones()
					.get(rep.getIdentificador() + "abajo")
					.getKeyFrame(rep.getTiempo_animacion()));
		}
		if (rep.isMovdere()) {
			rep.setX(x + velocidad * Gdx.graphics.getDeltaTime());
			rep.setAnimacion_frame(rep.getAnimaciones()
					.get(rep.getIdentificador() + "derecha")
					.getKeyFrame(rep.getTiempo_animacion()));
		}
		if (rep.isMovizq()) {
			rep.setX(x - velocidad * Gdx.graphics.getDeltaTime());
			rep.setAnimacion_frame(rep.getAnimaciones()
					.get(rep.getIdentificador() + "izquierda")
					.getKeyFrame(rep.getTiempo_animacion()));
		}


	}

}
