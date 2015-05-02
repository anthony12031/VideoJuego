package WW.Vista.Pantallas.CompositeFlyweigth;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;

public class Mapa implements Dibujable{
	
	private TiledMap map;
	private OrthogonalTiledMapRenderer renderer; 
	private String path;
	private int posX;
	private int posY;

	public Mapa(String path){
		this.path=path;
		TmxMapLoader loader=new TmxMapLoader();
		map=loader.load(this.path);
		setRenderer(new OrthogonalTiledMapRenderer(map));
	}
	
	@Override
	public void dibujar() {
		
		renderer.render();
		
	}
	
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
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
	
	
	
	public void dispose(){
		map.dispose();
	}

	

	public OrthogonalTiledMapRenderer getRenderer() {
		return renderer;
	}

	public void setRenderer(OrthogonalTiledMapRenderer renderer) {
		this.renderer = renderer;
	}
	
}