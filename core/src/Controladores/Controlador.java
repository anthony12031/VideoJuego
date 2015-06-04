package Controladores;

<<<<<<< HEAD
=======
import WW.Vista.Pantallas.PantallaJuego;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
>>>>>>> 596930794c696359b6f2011f447cf7862a1ad6a7
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.math.Vector3;

<<<<<<< HEAD
import EnteMagico.Mago;
import EnteMagico.Command.ComandoE;
import EnteMagico.Command.ComandoHabilidad;
import EnteMagico.Command.ComandoQ;
import EnteMagico.Command.ComandoW;
import WW.Vista.Modelo;

public class Controlador implements InputProcessor {

	private Modelo modelo;
	boolean control_down = false;

	public Controlador(Modelo mo) {
		this.modelo = mo;
=======
public class Controlador implements InputProcessor {

	private PantallaJuego pantalla;
	boolean control_down = false;

	public Controlador(PantallaJuego pan) {
		setPantalla(pan);
>>>>>>> 596930794c696359b6f2011f447cf7862a1ad6a7
	}

	@Override
	public boolean keyDown(int keycode) {
<<<<<<< HEAD
		ComandoHabilidad comand=null;
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
		case 51: // w
			comand=ComandoW.getinstacia();
			break;
		case 33://E
			comand=ComandoE.getinstancia();
			break;
		case 45: 
			comand=ComandoQ.getinstancia();
			break;
		case 129:
			if (modelo.getRepJugador().isMovaba()
					|| modelo.getRepJugador().isMovarri()
					|| modelo.getRepJugador().isMovdere()
					||modelo.getRepJugador().isMovizq())
				modelo.getUser().getEnte().setVelocidadMovimiento(300.0f);
		}
		if(comand!=null){
			comand.ejecutar((Mago) modelo.getUser().getEnte());
		}
=======

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

>>>>>>> 596930794c696359b6f2011f447cf7862a1ad6a7
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
<<<<<<< HEAD
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
=======

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

>>>>>>> 596930794c696359b6f2011f447cf7862a1ad6a7
		}
		
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
<<<<<<< HEAD
		
=======
		switch (character) {
		case 'z':
			pantalla.modo_debug = !pantalla.modo_debug;
			break;

		}
>>>>>>> 596930794c696359b6f2011f447cf7862a1ad6a7
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
<<<<<<< HEAD
		if(((Mago)modelo.getUser().getEnte()).getHabilidadUsar()!=null){
			Vector3 pos = new Vector3(screenX, screenY, 0.0f);
			Vector3 posScreen = modelo.getPantallaJuego().camara.unproject(pos);
			((Mago)modelo.getUser().getEnte()).getHabilidadUsar().metodoPlantilla(posScreen.x, posScreen.y);
			System.out.println(((Mago)modelo.getUser().getEnte()).getHabilidadUsar().getKeyRep());
			modelo.getUser().getEnte().atacar(((Mago)modelo.getUser().getEnte()).getHabilidadUsar().getKeyRep());
		}
=======

>>>>>>> 596930794c696359b6f2011f447cf7862a1ad6a7
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		//modelo.getUser().getEnte().setAtaque_actual(null);
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

<<<<<<< HEAD
	public Modelo getModelo() {
		return modelo;
	}

	
=======
	public PantallaJuego getPantalla() {
		return pantalla;
	}

	public void setPantalla(PantallaJuego pantalla) {
		this.pantalla = pantalla;
	}
>>>>>>> 596930794c696359b6f2011f447cf7862a1ad6a7

}
