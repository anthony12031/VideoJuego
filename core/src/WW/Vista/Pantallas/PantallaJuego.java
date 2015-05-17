package WW.Vista.Pantallas;

import Controladores.Controlador;
import EnteMagico.EnteMagico;
import Mundo.Mundo;
import ObserverMediator.Mediator;
import WW.Representacion.Producto.RepresentacionEnteMagico;
import WW.Vista.Graficos;
import WW.Vista.Pantallas.CompositeFlyweigth.FabricaMapas;
import WW.Vista.Pantallas.CompositeFlyweigth.Mapa;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class PantallaJuego implements Screen {

	private EnteMagico jugador;
	private RepresentacionEnteMagico rep_jugador;
	private Mundo mundo;
	private Controlador controlador;
	private Mapa mapa;
	public static Camara camara;

	ShapeRenderer shapeRenderer;

	@Override
	public void show() {

		// Crear el mundo y el jugador principal
		mundo = Mundo.abrirMundo();
		jugador = mundo.crear("mago_Slytherin");
		setRep_jugador(new RepresentacionEnteMagico("mujer"));
		/*
		 * Utilizar patron oberver y mediator entre la logica y su
		 * representacion grafica
		 */
		Mediator.getInstancia().registrar(jugador, getRep_jugador());

		// Inicialzar el mapa y la camara organizar el mapa en pantalla
		mapa = FabricaMapas.getMapa(Gdx.files.internal("Mapas/MapaUno.tmx")
				.toString(), 0, 0);
		camara = new Camara();

		controlador = new Controlador(this);
		Gdx.input.setInputProcessor(controlador);

	}

	@Override
	public void render(float delta) {

		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		mapa.getRenderer().setView(camara);
		mapa.dibujar();
		rep_jugador.dibujar();
		camara.actualizar(rep_jugador);
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
		Graficos.spritebatch.dispose();
		Graficos.atlas.dispose();
		shapeRenderer.dispose();
		getRep_jugador().getTexture().dispose();
	}

	public EnteMagico getJugador() {
		return jugador;
	}

	public void setJugador(EnteMagico jugador) {
		this.jugador = jugador;
	}

	public RepresentacionEnteMagico getRep_jugador() {
		return rep_jugador;
	}

	public void setRep_jugador(RepresentacionEnteMagico rep_jugador) {
		this.rep_jugador = rep_jugador;
	}

}
