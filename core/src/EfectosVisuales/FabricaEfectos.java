package EfectosVisuales;

import java.util.HashMap;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;

public class FabricaEfectos {

	private HashMap<String,ParticleEffect> lista_efectos;
	private static FabricaEfectos instancia = null;
	
	private FabricaEfectos(){
		lista_efectos = new HashMap<String, ParticleEffect>();
	}
	
	public ParticleEffect getEfecto(String efect){
		ParticleEffect efecto = lista_efectos.get(efect);
		if(efecto == null){
		efecto = new ParticleEffect();
		try{
		efecto.load(Gdx.files.internal("Particulas/"+efect+".particle"), Gdx.files.internal("Particulas"));
		}catch(Exception e){
			return null;
		}
		
		}
		
		return efecto;
	}
	
	public static FabricaEfectos getInstancia(){
		if(instancia == null) instancia = new FabricaEfectos();
		return instancia;
	}
	
	
	
}
