package Controladores;

import WW.Vista.Pantallas.PantallaJuego;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;

public class Controlador implements InputProcessor{

	private PantallaJuego pantalla;
	
	public Controlador(PantallaJuego pan){
		setPantalla(pan);
	}
	
	@Override
	public boolean keyDown(int keycode) {
	
		
		switch(keycode){
		case 19 : //arriba
			pantalla.getJugador().setMovarri(true);
			//pantalla.getJugador().correr = false;
			break;
		case 20 : //abajo
			pantalla.getJugador().setMovaba(true);
			break;
		case 21 : //izquierda
			pantalla.getJugador().setMovizq(true);
			break;
		case 22 : //derecha
			pantalla.getJugador().setMovdere(true);
			break;
		
		}
		
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		
		switch(keycode){
		case 19 : //arriba
			pantalla.getJugador().setMovarri(false);
			break;
		case 20 : //abajo
			pantalla.getJugador().setMovaba(false);
			break;
		case 21 : //izquierda
			pantalla.getJugador().setMovizq(false);
			break;
		case 22 : //derecha
			pantalla.getJugador().setMovdere(false);
			break;
		
		}
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
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

	private PantallaJuego getPantalla() {
		return pantalla;
	}

	private void setPantalla(PantallaJuego pantalla) {
		this.pantalla = pantalla;
	}

	
	
	
	
	
}
