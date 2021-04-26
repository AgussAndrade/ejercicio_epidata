package Model;

import java.util.Date;

public class Refrigerado extends Producto{
	Date fechaDeEnvasado;
	int temperaturaMantenimiento;
	String paisDeOrigen;
	int codigoSupervision;
	
	public Refrigerado(Date fechaDeCaducidad, int numeroDeLote, Date fechaDeEnvasado, String paisDeOrigen, int temperaturaMantenimiento, int codigoSupervision) {
		this.fechaDeCaducidad = fechaDeCaducidad;
		this.numeroDeLote = numeroDeLote;
		this.fechaDeEnvasado = fechaDeEnvasado;
		this.paisDeOrigen = paisDeOrigen;
		this.temperaturaMantenimiento = temperaturaMantenimiento;
		this.codigoSupervision = codigoSupervision;
	}
	@Override
	
	public void mostrarInformacion() {
		System.out.println("Fecha de caducidad: " + super.fechaDeCaducidad
				+ "Numero de lote: " + super.numeroDeLote
				+ "Pais de origen: " + this.paisDeOrigen
				+ "Fecha de envasado: " + this.fechaDeEnvasado
				+ "Temperatura de mantenimiento: " + this.temperaturaMantenimiento
				+ "Codigo del organismo de supervision alimentaria: " + this.codigoSupervision);
	}
}
