package WW.Representacion.Producto;

import java.util.HashMap;

import WW.Vista.Graficos;
import WW.Vista.Pantallas.PantallaJuego;
import WW.Vista.Pantallas.CompositeFlyweigth.Dibujable;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Animation.PlayMode;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;

public class RepresentacionEnteMagico extends Sprite implements Dibujable {

	public boolean movizq = false, movdere = false, movaba = false,
			movarri = false;
	public static float duracion_animacion = 0.2f, tiempo_animacion = 10.0f,
			velocidad = 100.0f;
	private int cuadranteX;
	private int cuadranteY;
	private float velocidadMovimiento = 60 * 2;
	private HashMap<String, Animation> animaciones = new HashMap<String, Animation>();
	private TextureRegion animacion_frame;
	

	public RepresentacionEnteMagico(Sprite sprite) {
		super(sprite);
		cuadranteX = 0;
		cuadranteY = 0;
	}

	public RepresentacionEnteMagico(Sprite sprite, float posx, float posy) {
		super(sprite);
		cuadranteX = 0;
		cuadranteY = 0;
		setPosition(posx, posy);
		init();
	}

	private void init() {

		Array<AtlasRegion> animaciones_arriba = new Array<AtlasRegion>();
		animaciones_arriba.addAll(Graficos.atlas.findRegion("mujerarriba", 1),
				Graficos.atlas.findRegion("mujerarriba", 3));
		Animation ani_arriba = new Animation(duracion_animacion,
				animaciones_arriba, PlayMode.LOOP);

		Array<AtlasRegion> animaciones_abajo = new Array<AtlasRegion>();
		animaciones_abajo.addAll(Graficos.atlas.findRegion("mujerabajo", 1),
				Graficos.atlas.findRegion("mujerabajo", 3));
		Animation ani_abajo = new Animation(duracion_animacion,
				animaciones_abajo, PlayMode.LOOP);

		Array<AtlasRegion> animaciones_izquierda = new Array<AtlasRegion>();
		animaciones_izquierda.addAll(
				Graficos.atlas.findRegion("mujerizquierda", 2),
				Graficos.atlas.findRegion("mujerizquierda", 3));
		Animation ani_izquierda = new Animation(duracion_animacion,
				animaciones_izquierda, PlayMode.LOOP);

		Array<AtlasRegion> animaciones_derecha = new Array<AtlasRegion>();
		animaciones_derecha.addAll(
				Graficos.atlas.findRegion("mujerderecha", 1),
				Graficos.atlas.findRegion("mujerderecha", 2),
				Graficos.atlas.findRegion("mujerderecha", 3));
		Animation ani_derecha = new Animation(duracion_animacion,
				animaciones_derecha, PlayMode.LOOP);

		animaciones.put("arriba", ani_arriba);
		animaciones.put("abajo", ani_abajo);
		animaciones.put("izquierda", ani_izquierda);
		animaciones.put("derecha", ani_derecha);

		animacion_frame = animaciones.get("abajo")
				.getKeyFrame(tiempo_animacion);
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
			animacion_frame = animaciones.get("arriba").getKeyFrame(
					tiempo_animacion);
		}
		if (movaba) {
			this.setY(y - velocidad * Gdx.graphics.getDeltaTime());
			animacion_frame = animaciones.get("abajo").getKeyFrame(
					tiempo_animacion);
		}
		if (movdere) {
			this.setX(x + velocidad * Gdx.graphics.getDeltaTime());
			animacion_frame = animaciones.get("derecha").getKeyFrame(
					tiempo_animacion);
		}
		if (movizq) {
			this.setX(x - velocidad * Gdx.graphics.getDeltaTime());
			animacion_frame = animaciones.get("izquierda").getKeyFrame(
					tiempo_animacion);
		}
	}

	public int getCuadranteX() {
		return cuadranteX;
	}

	public void setCuadranteX(int cuadranteX) {
		this.cuadranteX = cuadranteX;
	}

	public int getCuadranteY() {
		return cuadranteY;
	}

	public void setCuadranteY(int cuadranteY) {
		this.cuadranteY = cuadranteY;
	}

	public float getVelocidadMovimiento() {
		return velocidadMovimiento;
	}

	public void setVelocidadMovimiento(float velocidadMovimiento) {
		this.velocidadMovimiento = velocidadMovimiento;
	}
	
	public HashMap<String, Animation> getAnimaciones() {
		return animaciones;
	}

	public void setAnimaciones(HashMap<String, Animation> animaciones) {
		this.animaciones = animaciones;
	}

	public TextureRegion getAnimacion_frame() {
		return animacion_frame;
	}

	public void setAnimacion_frame(TextureRegion animacion_frame) {
		this.animacion_frame = animacion_frame;
	}

	public void setMovizq(boolean movizq) {

		this.movizq = movizq;
	}

	public void setMovdere(boolean movdere) {
		this.movdere = movdere;
	}

	public void setMovaba(boolean movaba) {
		this.movaba = movaba;
	}

	public void setMovarri(boolean movarri) {
		this.movarri = movarri;
	}

}
