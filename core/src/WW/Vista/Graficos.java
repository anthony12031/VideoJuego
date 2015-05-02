package WW.Vista;

import WW.Vista.Pantallas.Play;

import com.badlogic.gdx.Game;

public class Graficos extends Game {

	private Play pantalla;
	public static int ANCHO,ALTO,algo;
	
	@Override
	public void create() {
		pantalla=new Play();
		setScreen(pantalla);
	}
}
