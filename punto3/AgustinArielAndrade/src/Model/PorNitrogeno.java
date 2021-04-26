package Model;

import java.util.Date;

public class PorNitrogeno extends Congelado{
	private String metodoDeCongelacion;
	private int tiempoDeExposicion;
	
	public PorNitrogeno(Date fechaDeCaducidad, int numeroDeLote, String paisDeOrigen, Date fechaDeEnvasado, String metodoDeCongelacion, int tiempoDeExposicion, int temperaturaMantenimiento) {
		this.fechaDeCaducidad = fechaDeCaducidad;
		this.numeroDeLote = numeroDeLote;
		this.paisDeOrigen = paisDeOrigen;
		this.fechaDeEnvasado = fechaDeEnvasado;
		this.metodoDeCongelacion = metodoDeCongelacion;
		this.tiempoDeExposicion = tiempoDeExposicion;
		this.temperaturaMantenimiento = temperaturaMantenimiento;
	}
	
	public void mostrarInformacion() {
		System.out.println("Fecha de caducidad: " + super.fechaDeCaducidad
				+ "Numero de lote: " + super.numeroDeLote
				+ "Pais de origen: " + super.paisDeOrigen
				+ "Fecha de envasado: " + super.fechaDeEnvasado
				+ "Metodo de congelación: " + this.metodoDeCongelacion
				+ "Tiempo de Exposicion: " + this.tiempoDeExposicion + "segundos"
				+ "Temperatura de mantenimiento: " + super.temperaturaMantenimiento);
	}
}
