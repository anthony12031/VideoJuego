package Objeto.Equipamiento.Productos.Decorator;

public class DecoradorVelocidad extends DecoradorEquipable{

	private final int velocidad=23;

	@Override
	public void usarObjeto() {
		this.equipable.usarObjeto();
	}

}
