package EnteMagico;

public class Hufflepuff extends Mago{
	
    public Hufflepuff() {
    	super();
		this.armaduraFisica=12;
		this.armaduraMagica=3;
		this.danoFisico=20;
		this.danoMagico=5;
		this.velocidadAtaque=3;
		this.velocidadMovimiento=85;
		this.vidaMaxima=100;
		this.vida=this.vidaMaxima;
		this.visibilidad=(true);
    }

	@Override
	public Object clonar() {
		return new Hufflepuff();
	}

}