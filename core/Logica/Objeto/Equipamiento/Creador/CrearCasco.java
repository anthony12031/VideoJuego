package Objeto.Equipamiento.Creador;

import Objeto.Equipamiento.Productos.Casco;
import Objeto.Equipamiento.Productos.Equipable;

public class CrearCasco extends CrearEquipamiento {

	@Override
	public Equipable crearEquipable() {
		return new Casco();
	}
	
}
