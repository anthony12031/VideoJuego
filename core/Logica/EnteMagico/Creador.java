package EnteMagico;

import java.util.HashMap;

public class Creador {
	private static HashMap<String, Mago> magos;
	private static String nombre;

	public static Object crear() {
		return crear(nombre);
	}
 
	public static Object crear(String nombr) {
		nombre = nombr;
		Mago objeto = (Mago)magos.get(nombre);
		return objeto != null ? objeto.clonar() : null;
	}

	public static HashMap<String, Mago> getMagos() {
		return magos;
	}
	
	public static void iniciarCreador(){
		magos = new HashMap<String, Mago>();
		magos.put("Gryffindor", new Gryffindor());
		magos.put("Hufflepuff", new Hufflepuff());
		magos.put("Ravenclaw", new Ravenclaw());
		magos.put("Slytherin", new Slytherin());
	}

}
