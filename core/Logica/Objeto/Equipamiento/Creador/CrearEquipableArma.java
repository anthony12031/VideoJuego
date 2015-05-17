package Objeto.Equipamiento.Creador;

import Objeto.Equipamiento.Productos.Equipable;
import Objeto.Equipamiento.Productos.EquipableArma;

public class CrearEquipableArma extends CrearEquipamiento {

	@Override
	public Equipable crearEquipable() {
		return new EquipableArma();
	}

}
