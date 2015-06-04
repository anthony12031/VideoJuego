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

public class VistaInicial implements Screen {

	private Skin skinControles;
	private Stage contenedor;
	private TextButton iniciarSesion;
	private TextButton registrar;
	private TextButton salir;
	private TextField passWord;
	private TextField nickName;
	private Label labelInforme;
	private Table tabla;

	public VistaInicial(ControladorEventListener CEL) {

		skinControles = new Skin(Gdx.files.internal("uiskin.json"));
		contenedor = new Stage(new StretchViewport(1000, 600));
		tabla = new Table(skinControles);
		tabla.setFillParent(true);

		labelInforme = new Label("Bienvenido a WW", skinControles);
		labelInforme.setBounds(200, 400, 400, 100);
		labelInforme.setName("label informe");

		iniciarSesion = new TextButton("Iniciar Sesion", skinControles);
		iniciarSesion.setBounds(200, 200, 400, 90);
		iniciarSesion.setName("sesion");

		registrar = new TextButton("Registro", skinControles);
		registrar.setBounds(200, 100, 195, 90);
		registrar.setName("registro");

		salir = new TextButton("Salir", skinControles);
		salir.setBounds(405, 100, 195, 90);
		salir.setName("salir");

		passWord = new TextField("", skinControles);
		passWord.setBounds(405, 300, 195, 90);
		passWord.setMessageText("Contraseña");
		passWord.setName("pass");

		nickName = new TextField("", skinControles);
		nickName.setBounds(200, 300, 195, 90);
		nickName.setMessageText("NickName");
		nickName.setName("nick");

		tabla.addActor(labelInforme);
		tabla.addActor(iniciarSesion);
		tabla.addActor(nickName);
		tabla.addActor(passWord);
		tabla.addActor(registrar);
		tabla.addActor(salir);

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
		skinControles.dispose();
		
	}

	public TextField getPassWord() {
		return passWord;
	}

	public TextField getNickName() {
		return nickName;
	}

	public Label getLabelInforme() {
		return labelInforme;
	}

}
