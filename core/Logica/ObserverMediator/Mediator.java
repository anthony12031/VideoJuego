package ObserverMediator;

import java.util.ArrayList;
import java.util.HashMap;

import javax.security.auth.Subject;

public class Mediator {
	
	private HashMap<Sujeto,ArrayList<Observer>> colleagues;
	private static Mediator instancia;
	
	
	private Mediator(){
		colleagues = new HashMap<Sujeto, ArrayList<Observer>>();
	}

	
	public void notificar(Sujeto sujeto) {
		
		ArrayList<Observer> observers = colleagues.get(sujeto);
		for(int i = 0;i<observers.size();i++){
			observers.get(i).actualizar(sujeto);
		}
		
	}
	
	public void eliminarObserver(Sujeto sujeto, Observer observer) {
		ArrayList<Observer> observers = colleagues.get(sujeto);
		if(observers != null && observers.contains(observer)){
			observers.remove(observer);
		}
		
	}

	public void registrar(Sujeto sujeto, Observer observer) {
		ArrayList<Observer> observers = colleagues.get(sujeto);
		if(observers == null ){
			observers = new ArrayList<Observer>();
		}
		observers.add(observer);
		colleagues.put(sujeto, observers);
		sujeto.setMediador(this);
		
		
	}

	public static Mediator getInstancia() {
		if(instancia == null) instancia = new Mediator();
		return instancia;
	}

	public static void setInstancia(Mediator mediador) {
		Mediator.instancia = mediador;
	}

	

}
