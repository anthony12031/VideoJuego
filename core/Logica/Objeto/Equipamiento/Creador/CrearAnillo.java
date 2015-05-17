package Objeto.Equipamiento.Creador;

import Objeto.Equipamiento.Productos.Anillo;
import Objeto.Equipamiento.Productos.Equipable;

public class CrearAnillo extends CrearEquipamiento{

	@Override
	public Equipable crearEquipable() {
		return new Anillo();
	}

}
