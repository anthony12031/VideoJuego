package EnteMagico;



import ObserverMediator.Sujeto;
import WW.Representacion.Producto.RepresentacionGrafica;
import WW.Vista.Pantallas.CompositeFlyweigth.Dibujable;


public abstract class EnteMagico extends Sujeto implements Cloneable {
	
	
	protected float posX,posY,ancho,alto;
	protected float velx = 0.0f,vely =0.0f;
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
	
	
	
	public void atacar(String ataque){
	this.setAtaque_actual(ataque);
	notificar();
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
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public int getVidaMaxima() {
		return vidaMaxima;
	}
	public void setVidaMaxima(int vidaMaxima) {
		this.vidaMaxima = vidaMaxima;
	}
	public boolean isVisibilidad() {
		return visibilidad;
	}
	public void setVisibilidad(boolean visibilidad) {
		this.visibilidad = visibilidad;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getDanoFisico() {
		return danoFisico;
	}
	public void setDanoFisico(int danoFisico) {
		this.danoFisico = danoFisico;
	}
	public int getDanoMagico() {
		return danoMagico;
	}
	public void setDanoMagico(int danoMagico) {
		this.danoMagico = danoMagico;
	}
	public int getArmaduraFisica() {
		return armaduraFisica;
	}
	public void setArmaduraFisica(int armaduraFisica) {
		this.armaduraFisica = armaduraFisica;
	}
	public float getArmaduraMagica() {
		return armaduraMagica;
	}
	public void setArmaduraMagica(float armaduraMagica) {
		this.armaduraMagica = armaduraMagica;
	}
	public float getVelocidadAtaque() {
		return velocidadAtaque;
	}
	public void setVelocidadAtaque(float velocidadAtaque) {
		this.velocidadAtaque = velocidadAtaque;
	}
	public float getVelocidadMovimiento() {
		return velocidadMovimiento;
	}
	public void setVelocidadMovimiento(float velocidadMovimiento) {
		this.velocidadMovimiento = velocidadMovimiento;
		notificar();
	}
	
	
	public abstract Object clonar();


	public String getAtaque_actual() {
		return ataque_actual;
	}


	public void setAtaque_actual(String ataque_actual) {
		this.ataque_actual = ataque_actual;
	}
	
}
