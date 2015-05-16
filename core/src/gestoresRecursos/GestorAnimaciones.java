package gestoresRecursos;

import java.util.HashMap;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Animation.PlayMode;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;

public class GestorAnimaciones {

	private static GestorAnimaciones instancia = null;
	
	
	private GestorAnimaciones(){
		
	}
	
	public void cargarAnimaciones(TextureAtlas atlas,String[] nombres,HashMap<String,Animation> estructura_datos,float duracion_animacion){
		
		
		for(int i= 0;i<nombres.length;i++){
			
			Array<AtlasRegion> frames = new Array<AtlasRegion>(atlas.findRegions(nombres[i]));
			Animation animacion = new Animation(duracion_animacion,
					frames, PlayMode.LOOP);
			estructura_datos.put(nombres[i], animacion);
		
		}
		
		
	}
	
	
	
	public static GestorAnimaciones getInstancia(){
		if(instancia == null) instancia = new GestorAnimaciones();
		return instancia;
	}
	
}
