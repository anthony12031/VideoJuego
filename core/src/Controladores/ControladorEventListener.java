package Controladores;

import EnteMagico.*;
import Habilidades.Builder.DirectorHabilidad;
import Habilidades.Builder.Fuego;
import Habilidades.Builder.MocoMurcielago;
import Memento.Memento;
import Memento.Usuario;
import ObserverMediator.Mediator;
import WW.Representacion.Producto.RepresentacionEnteMagico;
import WW.Vista.Modelo;

import com.badlogic.gdx.scenes.scene2d.Event;
import com.badlogic.gdx.scenes.scene2d.EventListener;

public class ControladorEventListener implements EventListener {

	private Modelo modelo;
	
	public ControladorEventListener(Modelo m) {
		modelo=m;
	}
	
	@Override
	public boolean handle(Event event) {
		if(event.toString().length()>20){
			if(event.getTarget().getName().equals("sesion")){
				Memento memento=modelo.getArchivo().consultar(modelo.getVistaInicial().getNickName().getText(), modelo.getVistaInicial().getPassWord().getText());
				if(memento==null){
					modelo.getVistaInicial().getLabelInforme().setText("Bienvenido a WW: No existe un usario con esos datos");
					return true;
				}
				modelo.getVistaInicial().getLabelInforme().setText("Bienvenido a WW: Loading");
				modelo.setUser(memento.getUsuario());
				modelo.setRepJugador(new RepresentacionEnteMagico(modelo.getUser().getKeyRep()));
				modelo.getRepJugador().setX(modelo.getUser().getPosicionX());
				modelo.getRepJugador().setY(modelo.getUser().getPosicionY());
				Mediator.getInstancia().registrar(modelo.getUser().getEnte(), modelo.getRepJugador());
				modelo.setScreen(modelo.getPantallaJuego());
			}
			else if(event.getTarget().getName().equals("registro")){
				modelo.setScreen(modelo.getVistaRegistro());
			}
			else if(event.getTarget().getName().equals("salir")){
				System.exit(0);
			}
			else if(event.getTarget().getName().equals("cancelar")){
				modelo.setScreen(modelo.getVistaInicial());
			}
			else if(event.getTarget().getName().equals("aceptar")){
				String nick=modelo.getVistaRegistro().getNickName().getText();
				String pass=modelo.getVistaRegistro().getPass().getText();
				if(modelo.getArchivo().consultar(nick)){
					modelo.getVistaRegistro().getLabelInforme().setText("Registro WW: El nickname ya esta ocupado");
					return true;
				}
				Usuario user=new Usuario();
				EnteMagico e=(EnteMagico) Creador.crear(modelo.getVistaRegistro().getKeyEnte().getText());
				if(e==null){
					modelo.getVistaRegistro().getLabelInforme().setText("Registro WW: No existe dicho ente magico");
					return true;
				}
				user.setEnte(e);
				user.setKeyRep(modelo.getVistaRegistro().getKeyRep().getText());
				user.setNickName(nick);
				user.setNombre(modelo.getVistaRegistro().getNombre().getText());
				user.setPassWord(pass);
				user.setPosicionX(100);
				user.setPosicionY(100);
				
				modelo.setUser(user);
				
				
				DirectorHabilidad director=new DirectorHabilidad();
				
				director.setHabilidadBuilder(new Fuego());
				director.contruirHabilidad();
				
				((Mago) modelo.getUser().getEnte()).setHabilidadQ(director.getHabilidad());
				
				director.setHabilidadBuilder(new MocoMurcielago());
				director.contruirHabilidad();
				
				((Mago) modelo.getUser().getEnte()).setHabilidadW(director.getHabilidad());
				
				try {
					modelo.getArchivo().agregar(user.getMemento());
				} catch (CloneNotSupportedException ex) {}
				modelo.setRepJugador(new RepresentacionEnteMagico(modelo.getUser().getKeyRep()));
				
				System.out.println(modelo.getRepJugador());
				Mediator.getInstancia().registrar(modelo.getUser().getEnte(), modelo.getRepJugador());
				modelo.setScreen(modelo.getPantallaJuego());
			}
		}
		return true;
	}

}
