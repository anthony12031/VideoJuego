package WW.Vista.Pantallas;

import Controladores.Controlador;
import EnteMagico.EnteMagico;
import Fisica.FabricaCuerpos;
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
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;

public class PantallaJuego implements Screen {

	
	
	private EnteMagico jugador;
	private RepresentacionEnteMagico rep_jugador;
	private Controlador controlador;
	private Mapa mapa;
	public static Camara camara;
	public static boolean modo_debug = false;
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
		
		camara = new Camara();
		// Inicialzar el mapa y la camara organizar el mapa en pantalla
		mapa = FabricaMapas.getMapa(Gdx.files.internal("Mapas/MapaUno.tmx")
				.toString(), 0, 0);
		

		controlador = new Controlador(this);
		Gdx.input.setInputProcessor(controlador);
		
	}

	@Override
	public void render(float delta) {

		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		
		mapa.getRenderer().setView(camara);
		mapa.dibujarCapa(fondo);
		rep_jugador.dibujar();
		mapa.dibujarCapa(capados);
		mapa.dibujarCapa(capatres);
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
