package Model;

import java.util.Date;

public abstract class Producto{
	protected Date fechaDeCaducidad;
	protected int numeroDeLote;
	public abstract void mostrarInformacion();
}
