package EnteMagico.Command;

import EnteMagico.Mago;

public class ComandoW implements ComandoHabilidad {

	private static ComandoW comando=null;
			
	public static ComandoW getinstacia(){
		if(comando==null){
			comando=new ComandoW();
		}
		return comando;
	}
	
	@Override
	public void ejecutar(Mago mago) {
		mago.setHabilidadUsar(mago.getHabilidadW());
	}

}
