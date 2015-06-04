package EnteMagico.Command;

import EnteMagico.Mago;

public class ComandoQ implements ComandoHabilidad {

	private static ComandoQ comando=null;
	
	public static ComandoQ getinstancia(){
		if(comando==null){
			comando=new ComandoQ();
		}
		return comando;
	}
	
	@Override
	public void ejecutar(Mago mago) {
		mago.setHabilidadUsar(mago.getHabilidadQ());
		System.out.println("Asignado habilidad Q");
	}

}
