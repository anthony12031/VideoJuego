package WW.Vista.Pantallas;

import WW.Representacion.Producto.RepresentacionGrafica;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.viewport.FillViewport;

public class Camara extends OrthographicCamera{

	public FillViewport viewport;
	
	float world_width = Gdx.graphics.getWidth(), world_height = Gdx.graphics.getHeight();
			
	
	public Camara(){
		this.position.x = world_width * 0.5f;
		this.position.y = world_height * 0.5f;
		viewport = new FillViewport(world_width, world_height, this);
		viewport.apply();
	}
	
	public void actualizar(RepresentacionGrafica repjugador) {

		Vector3 pos = new Vector3(repjugador.getX(),
				repjugador.getY(), 0.0f);
		Vector3 posScreen = this.project(pos);

		if (posScreen.y + repjugador.getHeight() >= Gdx.graphics.getHeight()) {
			this.position.y += (posScreen.y * 0.5 - repjugador.getHeight());
		}

		if (posScreen.x + repjugador.getWidth() >= Gdx.graphics.getWidth()) {
			this.position.x += posScreen.x * 0.5
					- repjugador.getWidth();
		}

		if (posScreen.x - repjugador.getWidth() <= 0.0f) {
			this.position.x -= Gdx.graphics.getWidth() * 0.5;
		}

		if (posScreen.y - repjugador.getHeight() <= 0.0f) {
			this.position.y -= Gdx.graphics.getHeight() * 0.5;
		}

	}
	
	
}
