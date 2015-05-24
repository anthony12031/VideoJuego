package State;

import WW.Representacion.Producto.RepresentacionGrafica;

public interface RepGraficaState {

	/*
	 * define la interface para los distintos estados en los que puede esta el
	 * objeto la clase representacion grafica mantiene una referencia al estado
	 * actual y pasa sus solicitudes de actualizacion al objeto estado_actual.
	 */

	public void actualizar(RepresentacionGrafica rep);

}
