package Objeto.Equipamiento.Creador;

import Objeto.Equipamiento.Productos.Equipable;
import Objeto.Equipamiento.Productos.Pantalon;

public class CrearPantalon extends CrearEquipamiento {

	@Override
	public Equipable crearEquipable() {
		return new Pantalon();
	}

}
