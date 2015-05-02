package WW.Representacion.Producto;

import com.badlogic.gdx.graphics.g2d.Sprite;

public class RepresentacionEnteMagico extends Sprite {
	
	private int cuadranteX;
	private int cuadranteY;
	private float velocidadMovimiento=60*2;

	public RepresentacionEnteMagico(Sprite sprite){
		super(sprite);
		cuadranteX=0;
		cuadranteY=0;
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
	
}
