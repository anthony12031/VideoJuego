package EnteMagico;

import java.io.Serializable;

import ObserverMediator.Sujeto;

public abstract class EnteMagico extends Sujeto implements Cloneable,Serializable {

	protected static final long serialVersionUID = 1L;
	
	protected String nombre;
	protected int vida;
	protected int vidaMaxima;
	protected int danoFisico;
	protected int danoMagico;
	protected int armaduraFisica;
	protected float armaduraMagica;
	protected float velocidadAtaque;
	protected float velocidadMovimiento;
	protected boolean visibilidad;
	private String ataque_actual;
	
<<<<<<< HEAD
	public void atacar(String ataque){
		this.setAtaque_actual(ataque);
		notificar();
=======
	
	public void atacar(String ataque){
	this.setAtaque_actual(ataque);
	notificar();
	this.setAtaque_actual(null);
	}
	
	
	public float getVelx() {
		return velx;
	}
	public void setVelx(float velx) {
		this.velx = velx;
	}
	public float getVely() {
		return vely;
	}
	public void setVely(float vely) {
		this.vely = vely;
	}

	
	public float getAncho() {
		return ancho;
	}
	public void setAncho(float ancho) {
		this.ancho = ancho;
	}
	public float getAlto() {
		return alto;
	}
	public void setAlto(float alto) {
		this.alto = alto;
	}
	public float getPosX() {
		return posX;
	}
	public void setPosX(float posX) {
		this.posX = posX;
	}
	public float getPosY() {
		return posY;
	}
	public void setPosY(float posY) {
		this.posY = posY;
>>>>>>> 596930794c696359b6f2011f447cf7862a1ad6a7
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
		notificar();
	}
	
	public int getVidaMaxima() {
		return vidaMaxima;
	}
	public void setVidaMaxima(int vidaMaxima) {
		this.vidaMaxima = vidaMaxima;
		notificar();
	}
	public boolean isVisibilidad() {
		return visibilidad;
	}
	public void setVisibilidad(boolean visibilidad) {
		this.visibilidad = visibilidad;
		notificar();
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
		notificar();
	}
	public int getDanoFisico() {
		return danoFisico;
	}
	public void setDanoFisico(int danoFisico) {
		this.danoFisico = danoFisico;
		notificar();
	}
	public int getDanoMagico() {
		return danoMagico;
	}
	public void setDanoMagico(int danoMagico) {
		this.danoMagico = danoMagico;
		notificar();
	}
	public int getArmaduraFisica() {
		return armaduraFisica;
	}
	public void setArmaduraFisica(int armaduraFisica) {
		this.armaduraFisica = armaduraFisica;
		notificar();
	}
	public float getArmaduraMagica() {
		return armaduraMagica;
	}
	public void setArmaduraMagica(float armaduraMagica) {
		this.armaduraMagica = armaduraMagica;
		notificar();
	}
	public float getVelocidadAtaque() {
		return velocidadAtaque;
	}
	public void setVelocidadAtaque(float velocidadAtaque) {
		this.velocidadAtaque = velocidadAtaque;
		notificar();
	}
	public float getVelocidadMovimiento() {
		return velocidadMovimiento;
	}
	public void setVelocidadMovimiento(float velocidadMovimiento) {
		this.velocidadMovimiento = velocidadMovimiento;
		notificar();
	}

	public String getAtaque_actual() {
		return ataque_actual;
	}

	public void setAtaque_actual(String ataque_actual) {
		this.ataque_actual = ataque_actual;
		notificar();
	}




	
	public abstract Object clonar();
}
