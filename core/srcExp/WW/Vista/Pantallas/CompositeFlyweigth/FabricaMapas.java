package WW.Vista.Pantallas.CompositeFlyweigth;


import java.util.HashMap;

public class FabricaMapas{
	
	private static HashMap<String,Dibujable> listaMapas = new HashMap<String,Dibujable>();
	
	public static Mapa getMapa(String path, int x, int y){
		Mapa m=(Mapa)listaMapas.get(path);
		if(m==null){
			m=new Mapa(path);
			listaMapas.put(path,(Dibujable) m);
		}
		m.setPosX(x);
		m.setPosY(y);
		return m;
	}
}