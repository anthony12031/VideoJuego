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

	public RepresentacionEnteMagico(String identificador) {
		super(new Sprite(Graficos.atlas.findRegion(identificador + "arriba")));
		super.identificador = identificador;
		this.setPosition(100, 100);
		init();
	}

	public RepresentacionEnteMagico(String identificador,Sprite sprite, float posx, float posy) {
		super(sprite);
		super.identificador = identificador;
		this.setPosition(posx, posy);
		init();
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
			animacion_frame = animaciones.get(identificador + "arriba")
					.getKeyFrame(tiempo_animacion);
		}
		if (movaba) {
			this.setY(y - velocidad * Gdx.graphics.getDeltaTime());
			animacion_frame = animaciones.get(identificador + "abajo")
					.getKeyFrame(tiempo_animacion);
		}
		if (movdere) {
			this.setX(x + velocidad * Gdx.graphics.getDeltaTime());
			animacion_frame = animaciones.get(identificador + "derecha")
					.getKeyFrame(tiempo_animacion);
		}
		if (movizq) {
			this.setX(x - velocidad * Gdx.graphics.getDeltaTime());
			animacion_frame = animaciones.get(identificador + "izquierda")
					.getKeyFrame(tiempo_animacion);
		}
	}


	private void init() {

		String animaciones_[] = { identificador + "arriba",
				identificador + "abajo", identificador + "izquierda",
				identificador + "derecha", identificador + "arribaQuieta",
				identificador + "abajoQuieta", identificador + "derechaQuieta",
				identificador + "izquierdaQuieta" };

		GestorAnimaciones.getInstancia().cargarAnimaciones(Graficos.atlas,
				animaciones_, animaciones, duracion_animacion);
		animacion_frame = animaciones.get(identificador + "arribaQuieta")
				.getKeyFrame(0.0f);

	}

}
