package Model;

import java.util.Date;

public class PorAire extends Congelado{
	private int porcentajeNitrogeno;
	private int porcentajeOxigeno;
	private int porcentajeDioxidoDeCarbono;
	private int porcentajeVaporDeAgua;
	
	public PorAire(Date fechaDeCaducidad, int numeroDeLote, String paisDeOrigen, Date fechaDeEnvasado, int temperaturaMantenimiento, int pcjNitrogeno, int pcjOxigeno, int pcjDioxidoDeCarbono, int pcjVaporDeAgua) {
		this.fechaDeCaducidad = fechaDeCaducidad;
		this.numeroDeLote = numeroDeLote;
		this.paisDeOrigen = paisDeOrigen;
		this.fechaDeEnvasado = fechaDeEnvasado;
		this.temperaturaMantenimiento = temperaturaMantenimiento;
		this.porcentajeNitrogeno = pcjNitrogeno;
		this.porcentajeOxigeno = pcjOxigeno;
		this.porcentajeDioxidoDeCarbono = pcjDioxidoDeCarbono;
		this.porcentajeVaporDeAgua = pcjVaporDeAgua;
	}
	
	public void mostrarInformacion() {
		System.out.println("Fecha de caducidad: " + super.fechaDeCaducidad
						+  "Numero de lote: " + super.numeroDeLote
						+  "Pais de origen: " + super.paisDeOrigen
						+  "Fecha de envasado: " + super.fechaDeEnvasado
						+  "Temperatura de mantenimiento recomendada: " + super.temperaturaMantenimiento
						+  "Porcentaje de Nitrogeno: " + this.porcentajeNitrogeno
						+  "Porcentaje de Oxigeno: " + this.porcentajeOxigeno
						+  "Porcentaje de Dioxido de Carbono: " + this.porcentajeDioxidoDeCarbono
						+  "Porcentaje de vapor de agua: " + this.porcentajeVaporDeAgua);
	}
}
