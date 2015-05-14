package WW.Vista.Pantallas;

import Controladores.Controlador;
import WW.Representacion.Producto.RepresentacionEnteMagico;
import WW.Vista.Graficos;
import WW.Vista.Pantallas.CompositeFlyweigth.FabricaMapas;
import WW.Vista.Pantallas.CompositeFlyweigth.Mapa;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Vector3;

public class PantallaJuego implements Screen {

	private Controlador controlador;
	private Mapa mapa;
	private static RepresentacionEnteMagico jugador;
	public static OrthographicCamera camara;

	@Override
	public void show() {
		// Inicialzar el mapa y la camara organizar el mapa en pantalla
		mapa = FabricaMapas.getMapa(Gdx.files.internal("Mapas/MapaUno.tmx")
				.toString(), 0, 0);
		jugador = new RepresentacionEnteMagico(new Sprite(
				Graficos.atlas.findRegion("mujerarriba")), 100, 100);
		camara = new OrthographicCamera();
		camara.position.x = Graficos.ANCHO * 0.5f;
		camara.position.y = Graficos.ALTO * 0.5f;
		controlador = new Controlador(this);
		Gdx.input.setInputProcessor(controlador);
	}

	@Override
	public void render(float delta) {

		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		mapa.getRenderer().setView(camara);
		mapa.dibujar();
		jugador.dibujar();
		actualizarCamara();
		camara.update();
	}

	private void actualizarCamara() {

		Vector3 pos = new Vector3(jugador.getX(), jugador.getY(), 0.0f);
		Vector3 posScreen = camara.project(pos);

		if (posScreen.y + jugador.getHeight() >= Graficos.ALTO) {
			camara.position.y += (posScreen.y * 0.5 - jugador.getHeight());
		}

		if (posScreen.x + jugador.getWidth() >= Graficos.ANCHO) {
			camara.position.x += posScreen.x * 0.5 - jugador.getWidth();
		}

		if (posScreen.x - jugador.getWidth() <= 0.0f) {
			camara.position.x -= Graficos.ANCHO * 0.5;
		}

		if (posScreen.y - jugador.getHeight() <= 0.0f) {
			camara.position.y -= Graficos.ALTO * 0.5;
		}


	}

	@Override
	public void resize(int width, int height) {
		camara.viewportHeight = height;
		camara.viewportWidth = width;
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

	}

	@Override
	public void dispose() {
		mapa.getMap().dispose();
		mapa.getRenderer().dispose();
		Graficos.spritebatch.dispose();
		Graficos.atlas.dispose();
	}

	public RepresentacionEnteMagico getJugador() {
		return jugador;
	}

	public void setJugador(RepresentacionEnteMagico jugador) {
		this.jugador = jugador;
	}

}
