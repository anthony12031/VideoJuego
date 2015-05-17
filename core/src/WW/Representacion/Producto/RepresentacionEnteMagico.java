package WW.Representacion.Producto;

import gestoresRecursos.GestorAnimaciones;
import WW.Vista.Graficos;
import WW.Vista.Pantallas.PantallaJuego;
import WW.Vista.Pantallas.CompositeFlyweigth.Dibujable;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;


public class RepresentacionEnteMagico extends RepresentacionGrafica implements
		Dibujable {

	public TextureRegion derecha,izquierda,arriba,abajo;
	



	@Override
	public void dibujar() {

		actualizar();
		Graficos.spritebatch.setProjectionMatrix(PantallaJuego.camara.combined);
		Graficos.spritebatch.begin();
		Graficos.spritebatch.draw(animacion_frame, this.getX(), this.getY());
		Graficos.spritebatch.end();
	}

	private void actualizar() {

		float x = this.getX();
		float y = this.getY();

		tiempo_animacion += Gdx.graphics.getDeltaTime();


}
