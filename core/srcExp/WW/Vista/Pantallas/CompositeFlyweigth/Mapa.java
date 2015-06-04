package WW.Vista.Pantallas.CompositeFlyweigth;

import Fisica.FabricaCuerpos;
import Mundo.Mundo;
import WW.Vista.Pantallas.PantallaJuego;

import com.badlogic.gdx.maps.MapLayer;
import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.MapObjects;
import com.badlogic.gdx.maps.objects.RectangleMapObject;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;

public class Mapa implements Dibujable {

	private TiledMap map;
	private OrthogonalTiledMapRenderer renderer;
	private String path;
	private int posX;
	private int posY;
	float tilewidth = 32;

	public Mapa(String path) {
		this.path = path;
		TmxMapLoader loader = new TmxMapLoader();
		map = loader.load(this.path);
		setRenderer(new OrthogonalTiledMapRenderer(map));
	}

	@Override
	public void dibujar() {
		renderer.render();

	}

	public void dibujarCapa(int[] indice) {
		renderer.render(indice);
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX =posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public TiledMap getMap() {
		return map;
	}

	public void dispose() {
		map.dispose();
	}

	public OrthogonalTiledMapRenderer getRenderer() {
		return renderer;
	}

	public void setRenderer(OrthogonalTiledMapRenderer renderer) {
		this.renderer = renderer;
	}

}