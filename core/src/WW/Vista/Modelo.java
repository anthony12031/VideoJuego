package WW.Vista;


import Controladores.Controlador;
import Controladores.ControladorEventListener;
import EnteMagico.Creador;
import Memento.Archivo;
import Memento.Usuario;
import WW.Representacion.Producto.RepresentacionEnteMagico;
import WW.Vista.Pantallas.PantallaJuego;
import WW.Vista.Pantallas.VistaInicial;
import WW.Vista.Pantallas.VistaRegistro;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;


public class Modelo extends Game {

	public static SpriteBatch spritebatch ;
	public static TextureAtlas atlas;
	
	private PantallaJuego pantallaJuego;
	private VistaInicial vistaInicial;
	private VistaRegistro vistaRegistro;
	
	private Controlador control;
	private ControladorEventListener CEL;
	
	private Archivo archivo;
	
	private Usuario user;
	private RepresentacionEnteMagico repJugador;
	
	@Override
	public void create() {
		Creador.iniciarCreador();
		
		spritebatch = new SpriteBatch();
		atlas = new TextureAtlas(Gdx.files.internal("SpriteSheets/Personajes.pack"));

		CEL=new ControladorEventListener(this);
		vistaInicial=new VistaInicial(CEL);
		vistaRegistro=new VistaRegistro(CEL);
		
		control=new Controlador(this);
		pantallaJuego = new PantallaJuego(control);
		
		archivo=Archivo.getPersistencia();
		
		setScreen(vistaInicial);
	}
	//--------------------------------------------------------------
	public PantallaJuego getPantallaJuego() {
		return pantallaJuego;
	}

	public VistaInicial getVistaInicial() {
		return vistaInicial;
	}
	
	public VistaRegistro getVistaRegistro() {
		return vistaRegistro;
	}
	//--------------------------------------------------------------
	public Archivo getArchivo(){
		return archivo;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	public RepresentacionEnteMagico getRepJugador() {
		return repJugador;
	}

	public void setRepJugador(RepresentacionEnteMagico repJugador) {
		this.repJugador = repJugador;
	}
	
}
