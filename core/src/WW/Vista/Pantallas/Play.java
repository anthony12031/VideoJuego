package WW.Vista.Pantallas;

import WW.Representacion.Producto.RepresentacionEnteMagico;
import WW.Vista.Graficos;
import WW.Vista.Pantallas.CompositeFlyweigth.Mapa;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Vector2;

public class Play implements Screen {

	private Mapa mapa;
	private RepresentacionEnteMagico jugador;
	private OrthographicCamera camara;
	Vector2 pos = new Vector2(0.2f, 0.0f);
	
	
	@Override
	public void show() {
	
		//Inicialzar el mapa y la camara organiza el mapa en pantalla
		mapa = new Mapa("Mapas/MapaUno.tmx");
		camara = new OrthographicCamera();
		camara.translate((float) Graficos.ANCHO/2,(float)Graficos.ALTO/2);
	}

	@Override
	public void render(float delta) {
	
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		mapa.getRenderer().setView(camara);
		mapa.dibujar();
		camara.update();
		/*mapa.getRenderer().getBatch().begin();
		jugador.draw(mapa.getRenderer().getBatch());
		mapa.getRenderer().getBatch().end();*/
	}

	@Override
	public void resize(int width, int height) {
		camara.viewportHeight=height;
		camara.viewportWidth=width;
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
	}

}
