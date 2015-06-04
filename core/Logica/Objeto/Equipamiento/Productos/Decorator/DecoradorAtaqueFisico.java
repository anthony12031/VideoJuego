package Objeto.Equipamiento.Productos.Decorator;

public class DecoradorAtaqueFisico extends DecoradorEquipable {

	private final int ataqueFisico=12;

	@Override
	public void usarObjeto() {
		this.equipable.usarObjeto();
	}

}
