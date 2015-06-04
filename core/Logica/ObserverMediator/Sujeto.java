package ObserverMediator;



public abstract class Sujeto {

	private Mediator mediador;
	
	public Sujeto(){
	
	}
	
	public Sujeto(Mediator me){
		mediador = me;
	}
	
	public void agregarObserver(Observer observer) {
		getMediador().registrar(this, observer);
	}

	public void eliminarObserver(Observer observer) {
		getMediador().eliminarObserver(this, observer);
	}

	public void notificar() {
		getMediador().notificar(this);
	}

	public Mediator getMediador() {
		return mediador;
	}

	public void setMediador(Mediator mediador) {
		this.mediador = mediador;
	}
}
