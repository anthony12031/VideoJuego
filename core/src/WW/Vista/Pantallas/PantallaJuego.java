package WW.Vista.Pantallas;

import Controladores.Controlador;
import EfectosVisuales.FabricaEfectos;
import Mundo.Mundo;
import WW.Vista.Modelo;
import WW.Vista.Pantallas.CompositeFlyweigth.FabricaMapas;
import WW.Vista.Pantallas.CompositeFlyweigth.Mapa;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

public class PantallaJuego implements Screen {

<<<<<<< HEAD
	// private EnteMagico jugador;
	// private RepresentacionEnteMagico rep_jugador;
=======
	
	
	private EnteMagico jugador;
	private RepresentacionEnteMagico rep_jugador;
>>>>>>> 596930794c696359b6f2011f447cf7862a1ad6a7
	private Controlador controlador;
	private Mapa mapa;
	public static Camara camara;
	public static boolean modo_debug = false;
<<<<<<< HEAD
	int[] fondo = { 0 };
	int[] capados = { 1 };
	int[] capatres = { 2 };

	public PantallaJuego(Controlador c) {
		this.controlador = c;
	}

	@Override
	public void show() {

		Mundo.abrirMundo();

=======
	int[] fondo ={0};
	int[] capados ={1};
	int[] capatres ={2};
	
	@Override
	public void show() {
		
		
		Mundo.abrirMundo();
		jugador = Mundo.mundoMagico.crear("mago_Slytherin");
		rep_jugador = new RepresentacionEnteMagico("mujer");
		/*
		 * Utilizar patron oberver y mediator entre la logica y su
		 * representacion grafica
		 */
		Mediator.getInstancia().registrar(jugador, getRep_jugador());

		jugador.setVelocidadMovimiento(85.0f);
		
>>>>>>> 596930794c696359b6f2011f447cf7862a1ad6a7
		camara = new Camara();
		// Inicialzar el mapa y la camara organizar el mapa en pantalla
		mapa = FabricaMapas.getMapa(Gdx.files.internal("Mapas/MapaUno.tmx").toString(), 0, 0);

		Gdx.input.setInputProcessor(controlador);
		
		FabricaEfectos.getInstancia().getEfecto("magia");
		FabricaEfectos.getInstancia().getEfecto("fuego");

	}

	@Override
	public void render(float delta) {

		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		mapa.getRenderer().setView(camara);
		mapa.dibujarCapa(fondo);
		mapa.dibujarCapa(capados);
		mapa.dibujarCapa(capatres);
<<<<<<< HEAD
		controlador.getModelo().getRepJugador().dibujar();
		camara.actualizar(controlador.getModelo().getRepJugador());
=======
		camara.actualizar(rep_jugador);
>>>>>>> 596930794c696359b6f2011f447cf7862a1ad6a7
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
<<<<<<< HEAD
		Modelo.spritebatch.dispose();
		Modelo.atlas.dispose();
		controlador.getModelo().getRepJugador().getTexture().dispose();
=======
		Graficos.spritebatch.dispose();
		Graficos.atlas.dispose();
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
>>>>>>> 596930794c696359b6f2011f447cf7862a1ad6a7
	}

}
