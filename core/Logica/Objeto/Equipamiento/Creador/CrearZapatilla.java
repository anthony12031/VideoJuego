package Objeto.Equipamiento.Creador;

import Objeto.Equipamiento.Productos.Equipable;
import Objeto.Equipamiento.Productos.Zapatilla;

public class CrearZapatilla extends CrearEquipamiento{

	@Override
	public Equipable crearEquipable() {
		return new Zapatilla();
	}
	
}
