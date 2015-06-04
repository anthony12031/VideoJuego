package Objeto.Equipamiento.Productos.Decorator;

import Objeto.Equipamiento.Productos.Equipable;

public abstract class DecoradorEquipable extends Equipable {
	
	protected Equipable equipable;

	public Equipable getEquipable() {
		return equipable;
	}

	public void setEquipable(Equipable equipable) {
		this.equipable = equipable;
		this.equipable.setEnte(this.getEnte());
	}

}
