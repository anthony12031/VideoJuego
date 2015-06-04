package Objeto.Equipamiento.Productos.Decorator;

public class DecoradorVisibilidad extends DecoradorEquipable{

	private final boolean visibilidad=false;

	@Override
	public void usarObjeto() {
		this.equipable.usarObjeto();
		
	}

}
