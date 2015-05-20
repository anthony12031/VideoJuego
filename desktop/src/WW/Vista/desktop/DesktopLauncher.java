package WW.Vista.desktop;



import WW.Vista.Graficos;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
	
	public static int ANCHO = 1000 ,ALTO = 600;
	
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width=ANCHO;
		config.height=ALTO;
		config.title="Video Juego";
		Graficos graficos = new Graficos();
		new LwjglApplication(graficos, config);
	}
}
