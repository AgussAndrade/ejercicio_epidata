package Model;

import java.util.Date;

public class Fresco extends Producto{
	Date fechaDeEnvasado;
	String paisDeOrigen;
	public Fresco(Date fechaDeCaducidad, int numeroDeLote, Date fechaDeEnvasado, String paisDeOrigen) {
		this.fechaDeCaducidad = fechaDeCaducidad;
		this.numeroDeLote = numeroDeLote;
		this.fechaDeEnvasado = fechaDeEnvasado;
		this.paisDeOrigen = paisDeOrigen;
	}
	public void mostrarInformacion() {
		System.out.println("Fecha de caducidad: " + super.fechaDeCaducidad + "\n"
						+ "Numero de lote: " + super.numeroDeLote + "\n"
						+ "Pais de origen: " + this.paisDeOrigen + "\n"
						+ "Fecha de envasado: " + this.fechaDeEnvasado);
	}
}
