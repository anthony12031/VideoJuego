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
	
	
	public RepresentacionEnteMagico(Sprite sprite, float posx, float posy) {
		super(sprite);
		this.setPosition(posx, posy);
		init();
	}

	private void init() {

		String animaciones_[] = { "mujerarriba", "mujerabajo",
				"mujerizquierda", "mujerderecha", "mujerderechaQuieta",
				"mujerizquierdaQuieta", "mujerarribaQuieta", "mujerabajoQuieta" };
		GestorAnimaciones.getInstancia().cargarAnimaciones(Graficos.atlas,
				animaciones_, animaciones, duracion_animacion);
		animacion_frame = animaciones.get("mujerabajo").getKeyFrame(
				tiempo_animacion);
		
		derecha = getAnimaciones().get("mujerderechaQuieta").getKeyFrame(0.0f);
		izquierda = getAnimaciones().get("mujerizquierdaQuieta").getKeyFrame(0.0f);
		abajo = getAnimaciones().get("mujerabajoQuieta").getKeyFrame(0.0f);
		arriba = getAnimaciones().get("mujerarribaQuieta").getKeyFrame(0.0f);
	}

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

		if (movarri) {
			this.setY(y + velocidad * Gdx.graphics.getDeltaTime());
			animacion_frame = animaciones.get("mujerarriba").getKeyFrame(
					tiempo_animacion);
		}
		if (movaba) {
			this.setY(y - velocidad * Gdx.graphics.getDeltaTime());
			animacion_frame = animaciones.get("mujerabajo").getKeyFrame(
					tiempo_animacion);
		}
		if (movdere) {
			this.setX(x + velocidad * Gdx.graphics.getDeltaTime());
			animacion_frame = animaciones.get("mujerderecha").getKeyFrame(
					tiempo_animacion);
		}
		if (movizq) {
			this.setX(x - velocidad * Gdx.graphics.getDeltaTime());
			animacion_frame = animaciones.get("mujerizquierda").getKeyFrame(
					tiempo_animacion);
		}
	}

}
