package WW.Vista;


import WW.Vista.Pantallas.PantallaJuego;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;


public class Graficos extends Game {

	public static SpriteBatch spritebatch ;
	public static TextureAtlas atlas;
	private PantallaJuego pantalla_Juego;
	
	@Override
	public void create() {
		spritebatch = new SpriteBatch();
		atlas = new TextureAtlas(Gdx.files.internal("SpriteSheets/Personajes.pack"));
		pantalla_Juego = new PantallaJuego();
		setScreen(pantalla_Juego);
		
	}
}
