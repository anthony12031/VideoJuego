package Mundo;

import java.util.HashMap;

import EnteMagico.Centauro;
import EnteMagico.EnteMagico;
import EnteMagico.Unicornio;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

public class Mundo {
	
	public static Mundo mundoMagico=null;
	private static World mundofisico = null;
	
	private HashMap<String, EnteMagico> criaturas;
	private String nombre;
	
	private Mundo(){
		criaturas=new HashMap<String, EnteMagico>();
		criaturas.put("Unicornio", new Unicornio());
		criaturas.put("Centauro", new Centauro());
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static Mundo abrirMundo(){
		if(mundoMagico==null){
			mundoMagico=new Mundo();
		}
		return mundoMagico;
	}
 
	public Object crear() {
		return crear(nombre);
	}
 
	public EnteMagico crear(String nombre) {
		this.nombre = nombre;
		EnteMagico objeto = (EnteMagico)criaturas.get(nombre);
		return (EnteMagico) (objeto != null ? objeto.clonar() : null);
	}

	public static World getMundoFisico() {
		if(mundofisico == null) mundofisico = new World(new Vector2(0,0),true);
		return mundofisico;
	}

	public static void setMundoFisico(World mundo_fisico) {
		Mundo.mundofisico = mundo_fisico;
	}
	
}
