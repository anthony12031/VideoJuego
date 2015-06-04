package Habilidades.Fabricas;

import Habilidades.Productos.HabilidadPuntual;
import Habilidades.Productos.HabilidadZona;

public interface FabricaHabilidad {
	
	public HabilidadZona crearHabilidadZona();
	public HabilidadPuntual crearHabilidadPuntual();
	
}
