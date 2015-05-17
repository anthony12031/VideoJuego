package EnteMagico;

import ObserverMediator.Mediator;

public abstract class CriaturaMagica extends EnteMagico{
	

	

	protected int direccionMovimiento = 1;
	
	public int getDireccionMovimiento(){
		return direccionMovimiento;
	}
	
	public void setDireccionMovimiento(int direccionMovimiento){
		this.direccionMovimiento=direccionMovimiento;
	}
}
