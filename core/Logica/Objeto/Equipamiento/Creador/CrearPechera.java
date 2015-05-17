package Objeto.Equipamiento.Creador;

import Objeto.Equipamiento.Productos.Equipable;
import Objeto.Equipamiento.Productos.Pechera;

public class CrearPechera extends CrearEquipamiento {

	@Override
	public Equipable crearEquipable() {
		return new Pechera();
	}

}
