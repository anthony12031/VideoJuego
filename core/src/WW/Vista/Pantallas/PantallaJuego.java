package WW.Vista.Pantallas;

import Controladores.Controlador;
import Mundo.Mundo;
import WW.Vista.Modelo;
import WW.Vista.Pantallas.CompositeFlyweigth.FabricaMapas;
import WW.Vista.Pantallas.CompositeFlyweigth.Mapa;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

public class PantallaJuego implements Screen {

	// private EnteMagico jugador;
	// private RepresentacionEnteMagico rep_jugador;
	private Controlador controlador;
	private Mapa mapa;
	public static Camara camara;
	public static boolean modo_debug = false;
	int[] fondo = { 0 };
	int[] capados = { 1 };
	int[] capatres = { 2 };

	public PantallaJuego(Controlador c) {
		this.controlador = c;
	}

	@Override
	public void show() {

		Mundo.abrirMundo();

		camara = new Camara();
		// Inicialzar el mapa y la camara organizar el mapa en pantalla
		mapa = FabricaMapas.getMapa(Gdx.files.internal("Mapas/MapaUno.tmx").toString(), 0, 0);

		Gdx.input.setInputProcessor(controlador);

	}

	@Override
	public void render(float delta) {

		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		mapa.getRenderer().setView(camara);
		mapa.dibujarCapa(fondo);
		controlador.getModelo().getRepJugador().dibujar();
		mapa.dibujarCapa(capados);
		mapa.dibujarCapa(capatres);
		camara.actualizar(controlador.getModelo().getRepJugador());
		camara.update();

	}

	@Override
	public void resize(int width, int height) {
		camara.viewportHeight = height;
		camara.viewportWidth = width;
		camara.viewport.update(width, height);
		camara.update();
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}

	@Override
	public void hide() {
		dispose();
	}

	@Override
	public void dispose() {
		mapa.getMap().dispose();
		mapa.getRenderer().dispose();
		Modelo.spritebatch.dispose();
		Modelo.atlas.dispose();
		controlador.getModelo().getRepJugador().getTexture().dispose();
	}

}
