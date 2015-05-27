package WW.Representacion.Producto;

import gestoresRecursos.FabricaAnimaciones;

import java.util.Stack;

import EfectosVisuales.FabricaEfectos;
import EnteMagico.EnteMagico;
import ObserverMediator.Observer;
import ObserverMediator.Sujeto;
import State.AtacarState;
import WW.Vista.Graficos;
import WW.Vista.Pantallas.CompositeFlyweigth.Dibujable;

import com.badlogic.gdx.graphics.g2d.Sprite;

public class RepresentacionEnteMagico extends RepresentacionGrafica implements
		Dibujable, Observer {


	public RepresentacionEnteMagico(String identificador) {
		super(new Sprite(Graficos.atlas.findRegion(identificador + "arriba")));
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
				Graficos.atlas, animaciones_, animaciones, duracion_animacion);
		animacion_frame = animaciones.get(identificador + "abajoQuieta")
				.getKeyFrame(0.0f);
		
		
		
	}

	@Override
	public void actualizar(Sujeto subject) {
	
		System.out.println("actualizando observer");
		EnteMagico ente = (EnteMagico) subject;
		this.velocidad = ente.getVelocidadMovimiento();
		this.efecto = FabricaEfectos.getInstancia().getEfecto(
				ente.getAtaque_actual());
		if (efecto != null) {
			this.efecto.setPosition(this.getX(), this.getY());
			this.efecto.start();
			this.setEstado_actual(AtacarState.getInstancia());
		}
		
		
	}

}
