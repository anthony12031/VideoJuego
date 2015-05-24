package State;

import com.badlogic.gdx.Gdx;

import WW.Representacion.Producto.RepresentacionGrafica;

public class CaminandoState implements RepGraficaState{

	private static CaminandoState instancia = null;
	
	private CaminandoState(){
		
	}
	
	@Override
	public void actualizar(RepresentacionGrafica rep) {
		
		float x = rep.getX();
		float y = rep.getY();

		float delta_tiempo = rep.getTiempo_animacion() + Gdx.graphics.getDeltaTime();
		
		rep.setTiempo_animacion(delta_tiempo);

		if (rep.isMovarri()) {
			rep.setY(y + rep.getVelocidad() * Gdx.graphics.getDeltaTime());
			rep.setAnimacion_frame(rep.getAnimaciones().get(rep.getIdentificador() + "arriba").getKeyFrame(rep.getTiempo_animacion())); 
		}
		if (rep.isMovaba()) {
			rep.setY(y - rep.getVelocidad() * Gdx.graphics.getDeltaTime());
			rep.setAnimacion_frame(rep.getAnimaciones().get(rep.getIdentificador() + "abajo").getKeyFrame(rep.getTiempo_animacion())); 
		}
		if (rep.isMovdere()) {
			rep.setX(x + rep.getVelocidad() * Gdx.graphics.getDeltaTime());
			rep.setAnimacion_frame(rep.getAnimaciones().get(rep.getIdentificador() + "derecha").getKeyFrame(rep.getTiempo_animacion())); 
		}
		if (rep.isMovizq()) {
			rep.setX(x - rep.getVelocidad() * Gdx.graphics.getDeltaTime());
			rep.setAnimacion_frame(rep.getAnimaciones().get(rep.getIdentificador() + "izquierda").getKeyFrame(rep.getTiempo_animacion())); 
		}
		
	}
	
	public static CaminandoState getInstancia(){
		if(instancia == null) instancia = new CaminandoState();
		return instancia;
	}

}
