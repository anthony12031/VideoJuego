package gestoresRecursos;

import java.util.HashMap;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Animation.PlayMode;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;

public class FabricaAnimaciones {

	private static FabricaAnimaciones instancia = null;
	private HashMap<String,HashMap<String,Animation>> lista_animaciones;
	
	
	private FabricaAnimaciones(){
		lista_animaciones = new HashMap<String, HashMap<String,Animation>>();
	}
	
	public HashMap<String,Animation> getAnimaciones(String identificador){
		HashMap<String,Animation> animaciones = lista_animaciones.get(identificador);
		if(animaciones == null)
			System.out.println("animacion "+identificador+" no ha sido cargada");
		return animaciones;
	}
	
	
	public void cargarAnimaciones(String identificador,TextureAtlas atlas,String[] nombres,HashMap<String,Animation> estructura_datos,float duracion_animacion){
		
		
		for(int i= 0;i<nombres.length;i++){
			
			Array<AtlasRegion> frames = new Array<AtlasRegion>(atlas.findRegions(nombres[i]));
			Animation animacion = new Animation(duracion_animacion,
					frames, PlayMode.LOOP);
			estructura_datos.put(nombres[i], animacion);
			
		}
		
		lista_animaciones.put(identificador, estructura_datos);
		
	}
	
	
	
	public static FabricaAnimaciones getInstancia(){
		if(instancia == null) instancia = new FabricaAnimaciones();
		return instancia;
	}
	
}
