package WW.Vista.desktop;

import WW.Vista.Modelo;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
	
	public static int ANCHO = 1000 ,ALTO = 600;
	
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.disableAudio=true;
		//config.fullscreen=true;
		config.width=ANCHO;
		config.height=ALTO;
		config.title="Video Juego";
		Modelo graficos = new Modelo();
		new LwjglApplication(graficos, config);
	}
}
