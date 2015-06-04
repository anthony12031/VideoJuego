package Controladores;

import com.badlogic.gdx.InputProcessor;

import EnteMagico.Mago;
import EnteMagico.Command.ComandoHabilidad;
import EnteMagico.Command.ComandoQ;
import WW.Vista.Modelo;
import WW.Vista.Pantallas.PantallaJuego;

public class Controlador implements InputProcessor {

	private Modelo modelo;
	boolean control_down = false;

	public Controlador(Modelo mo) {
		this.modelo = mo;
	}

	@Override
	public boolean keyDown(int keycode) {

		switch (keycode) {
		case 19: // arriba
			modelo.getRepJugador().setMovarri(true);
			break;
		case 20: // abajo
			modelo.getRepJugador().setMovaba(true);
			break;
		case 21: // izquierda
			modelo.getRepJugador().setMovizq(true);
			break;
		case 22: // derecha
			modelo.getRepJugador().setMovdere(true);
			break;
		case 131: // Esc finalizar prueba observer
			modelo.getUser().getEnte().setVelocidadMovimiento(85.0f);
			break;
		case 62: // Barra espaciadora ataque de fuego
			modelo.getUser().getEnte().atacar("fuego");
			break;
		case 45: // tecla 'q' ataque de magia
			modelo.getUser().getEnte().atacar("ice");
			break;
		case 129: // tecla control
			if (modelo.getRepJugador().isMovaba()
					|| modelo.getRepJugador().isMovarri()
					|| modelo.getRepJugador().isMovdere()
					||modelo.getRepJugador().isMovizq())
				modelo.getUser().getEnte().setVelocidadMovimiento(300.0f);
		}

		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		ComandoHabilidad comando = null;
		switch (keycode) {
		case 19: // arriba
			modelo.getRepJugador().setMovarri(false);
			return false;
		case 20: // abajo
			modelo.getRepJugador().setMovaba(false);
			return false;
		case 21: // izquierda
			modelo.getRepJugador().setMovizq(false);
			return false;
		case 22: // derecha
			modelo.getRepJugador().setMovdere(false);
			return false;
		case 62:
			break;
		case 45: // tecla 'q' ataque de magia
			comando=new ComandoQ();
			break;
		}
		if(comando!=null){
			comando.ejecutar((Mago)modelo.getUser().getEnte());
		}
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {

		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {

		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

	public Modelo getModelo() {
		return modelo;
	}

	

}
