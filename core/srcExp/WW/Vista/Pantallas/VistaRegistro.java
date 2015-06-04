package WW.Vista.Pantallas;

import Controladores.ControladorEventListener;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.utils.viewport.StretchViewport;

public class VistaRegistro implements Screen{

	private Skin skinControles;
	private Stage contenedor;
	private Table tabla;
	private TextField nombre;
	private TextField nickName;
	private TextField pass;
	private TextField keyRep;
	private TextField keyEnte;
	private TextButton aceptar;
	private TextButton cancelar;
	private Label labelInforme;
	
	public VistaRegistro(ControladorEventListener CEL) {
		skinControles = new Skin(Gdx.files.internal("uiskin.json"));
		contenedor = new Stage(new StretchViewport(1000, 600));
		tabla=new Table(skinControles);
		tabla.setFillParent(true);
		
		labelInforme=new Label("Registro WW", skinControles);
		labelInforme.setBounds(200, 500, 400, 100);
		labelInforme.setName("label informe");
		
		nombre= new TextField("", skinControles);
		nombre.setBounds(200, 400, 400, 100);
		nombre.setMessageText("Nombre del jugador");
		nombre.setName("nombre");
		
		nickName=new TextField("", skinControles);
		nickName.setBounds(200, 300, 200, 100);
		nickName.setMessageText("NickName");
		nickName.setName("nickName");
		
		pass=new TextField("",skinControles);
		pass.setBounds(400, 300, 200, 100);
		pass.setMessageText("PassWord");
		pass.setName("passWord");
		
		keyEnte=new TextField("", skinControles);
		keyEnte.setBounds(200, 200, 200, 100);
		keyEnte.setMessageText("Ente a usar");
		keyEnte.setName("keyEnte");
		
		keyRep=new TextField("", skinControles);
		keyRep.setBounds(400, 200, 200, 100);
		keyRep.setMessageText("Skin a usar");
		keyRep.setName("keyRep");
		
		aceptar=new TextButton("Registrarme", skinControles);
		aceptar.setBounds(200, 100, 200, 100);
		aceptar.setName("aceptar");
		
		cancelar=new TextButton("Cancelar", skinControles);
		cancelar.setBounds(400, 100, 200, 100);
		cancelar.setName("cancelar");
		
		tabla.addActor(aceptar);
		tabla.addActor(cancelar);
		tabla.addActor(keyEnte);
		tabla.addActor(keyRep);
		tabla.addActor(labelInforme);
		tabla.addActor(nickName);
		tabla.addActor(nombre);
		tabla.addActor(pass);
		
		contenedor.addActor(tabla);
		contenedor.addListener(CEL);
	}
	
	@Override
	public void show() {
		Gdx.input.setInputProcessor(contenedor);
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		contenedor.act(delta);
		contenedor.draw();
	}

	@Override
	public void resize(int width, int height) {
		contenedor.getViewport().update(width, height, false);
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {

	}

	@Override
	public void hide() {
		Gdx.input.setInputProcessor(null);
	}

	@Override
	public void dispose() {
		contenedor.dispose();
	}

	public TextField getNombre() {
		return nombre;
	}

	public TextField getNickName() {
		return nickName;
	}

	public TextField getPass() {
		return pass;
	}

	public TextField getKeyRep() {
		return keyRep;
	}

	public TextField getKeyEnte() {
		return keyEnte;
	}

	public Label getLabelInforme() {
		return labelInforme;
	}

}
