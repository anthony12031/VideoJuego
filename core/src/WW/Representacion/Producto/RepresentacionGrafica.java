package WW.Representacion.Producto;
import java.util.HashMap;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class RepresentacionGrafica extends Sprite{

	protected boolean movizq = false, movdere = false, movaba = false,
			movarri = false;
	protected static float duracion_animacion = 0.2f, tiempo_animacion = 10.0f,
			velocidad = 100.0f;
	protected HashMap<String, Animation> animaciones;
	protected TextureRegion animacion_frame;
	
	public RepresentacionGrafica(Sprite sprite){
		super(sprite);
		animaciones = new HashMap<String, Animation>();
	}

	public boolean isMovizq() {
		return movizq;
	}

	public void setMovizq(boolean movizq) {
		this.movizq = movizq;
	}

	public boolean isMovdere() {
		return movdere;
	}

	public void setMovdere(boolean movdere) {
		this.movdere = movdere;
	}

	public boolean isMovaba() {
		return movaba;
	}

	public void setMovaba(boolean movaba) {
		this.movaba = movaba;
	}

	public boolean isMovarri() {
		return movarri;
	}

	public void setMovarri(boolean movarri) {
		this.movarri = movarri;
	}

	public static float getDuracion_animacion() {
		return duracion_animacion;
	}

	public static void setDuracion_animacion(float duracion_animacion) {
		RepresentacionGrafica.duracion_animacion = duracion_animacion;
	}

	public static float getTiempo_animacion() {
		return tiempo_animacion;
	}

	public static void setTiempo_animacion(float tiempo_animacion) {
		RepresentacionGrafica.tiempo_animacion = tiempo_animacion;
	}

	public static float getVelocidad() {
		return velocidad;
	}

	public static void setVelocidad(float velocidad) {
		RepresentacionGrafica.velocidad = velocidad;
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
	
	
	
	
}