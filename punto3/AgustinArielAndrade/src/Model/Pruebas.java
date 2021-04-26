package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat; 
import java.util.Date;

public class Pruebas {

	public static void main(String[] args) throws ParseException {
		String stringFechaDeCaducidad="26/04/2023";  
	    Date fechaDeCaducidad = new SimpleDateFormat("dd/MM/yyyy").parse(stringFechaDeCaducidad);
	    String stringFechaDeEnvasado="26/04/2020";  
	    Date fechaDeEnvasado = new SimpleDateFormat("dd/MM/yyyy").parse(stringFechaDeEnvasado);  
		Fresco productoFresco = new Fresco(fechaDeCaducidad, 9, fechaDeEnvasado, "Argentina");
		productoFresco.mostrarInformacion();
	}

}
