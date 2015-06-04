package WW.Representacion.Producto;

import gestoresRecursos.FabricaAnimaciones;

import EfectosVisuales.FabricaEfectos;
import EnteMagico.*;
import ObserverMediator.Observer;
import ObserverMediator.Sujeto;
import State.AtacarState;
import WW.Vista.Modelo;
import WW.Vista.Pantallas.CompositeFlyweigth.Dibujable;

import com.badlogic.gdx.graphics.g2d.Sprite;

public class RepresentacionEnteMagico extends RepresentacionGrafica implements
		Dibujable, Observer {


	public RepresentacionEnteMagico(String identificador) {
		super(new Sprite(Modelo.atlas.findRegion(identificador + "arriba")));
		super.identificador = identificador;
		this.setPosition(100, 100);
		init();
	}


	@Override
	public void dibujar() {
	
		getEstado_actual().dibujar(this);
		
	}

	private void init() {

		String animaciones_[] = { identificador + "arriba",
				identificador + "abajo", identificador + "izquierda",
				identificador + "derecha", identificador + "arribaQuieta",
				identificador + "abajoQuieta", identificador + "derechaQuieta",
				identificador + "izquierdaQuieta" };

		FabricaAnimaciones.getInstancia().cargarAnimaciones(identificador,
				Modelo.atlas, animaciones_,animaciones, duracion_animacion);
		animacion_frame = animaciones.get(identificador + "abajoQuieta")
				.getKeyFrame(0.0f);
		
		
		
	}

	@Override
	public void actualizar(Sujeto subject) {
	
		System.out.println("actualizando observer");
		EnteMagico ente = (EnteMagico) subject;
		this.velocidad = ente.getVelocidadMovimiento();
		System.out.println(((Mago) ente).getHabilidadUsar().getKeyRep());
		this.setEfecto(FabricaEfectos.getInstancia().getEfecto(((Mago) ente).getHabilidadUsar().getKeyRep()));
		
		if (getEfecto() != null) {
			this.getEfecto().setPosition(((Mago) ente).getHabilidadUsar().getFocoX(), ((Mago) ente).getHabilidadUsar().getFocoY());
			this.getEfecto().start();
			this.getEfecto().reset();
			this.setEstado_actual(AtacarState.getInstancia());
		}
		
		
		
	}

}
