package EnteMagico.Command;

import EnteMagico.Mago;

public class ComandoE implements ComandoHabilidad {

	private static ComandoE comando=null;
	
	public static ComandoE getinstancia(){
		if(comando==null){
			comando=new ComandoE();
		}
		return comando;
	}
	
	@Override
	public void ejecutar(Mago mago) {
		mago.setHabilidadUsar(mago.getHabilidadE());
	}

}
