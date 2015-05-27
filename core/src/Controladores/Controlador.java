package Controladores;

import WW.Vista.Pantallas.PantallaJuego;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;

public class Controlador implements InputProcessor {

	private PantallaJuego pantalla;
	boolean control_down = false;

	public Controlador(PantallaJuego pan) {
		setPantalla(pan);
	}

	@Override
	public boolean keyDown(int keycode) {

		switch (keycode) {
		case 19: // arriba
			pantalla.getRep_jugador().setMovarri(true);
			break;
		case 20: // abajo
			pantalla.getRep_jugador().setMovaba(true);
			break;
		case 21: // izquierda
			pantalla.getRep_jugador().setMovizq(true);
			break;
		case 22: // derecha
			pantalla.getRep_jugador().setMovdere(true);
			break;
		case 131: // Esc finalizar prueba observer
			pantalla.getJugador().setVelocidadMovimiento(85.0f);
			break;
		case 62: // Barra espaciadora ataque de fuego
			pantalla.getJugador().atacar("fuego");
			break;
		case 45: // tecla 'q' ataque de magia
			pantalla.getJugador().atacar("magia");
			break;
		case 129: // tecla control
			if (pantalla.getRep_jugador().isMovaba()
					|| pantalla.getRep_jugador().isMovarri()
					|| pantalla.getRep_jugador().isMovdere()
					|| pantalla.getRep_jugador().isMovizq())
				pantalla.getJugador().setVelocidadMovimiento(300.0f);
		}

		return false;
	}

	@Override
	public boolean keyUp(int keycode) {

		switch (keycode) {
		case 19: // arriba
			pantalla.getRep_jugador().setMovarri(false);

			break;
		case 20: // abajo
			pantalla.getRep_jugador().setMovaba(false);

			break;
		case 21: // izquierda
			pantalla.getRep_jugador().setMovizq(false);

			break;
		case 22: // derecha
			pantalla.getRep_jugador().setMovdere(false);
			break;

		}
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		switch (character) {
		case 'z':
			pantalla.modo_debug = !pantalla.modo_debug;
			break;

		}
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

	public PantallaJuego getPantalla() {
		return pantalla;
	}

	public void setPantalla(PantallaJuego pantalla) {
		this.pantalla = pantalla;
	}

}
