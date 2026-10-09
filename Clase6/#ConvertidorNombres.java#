import java.util.Scanner;

/**
* Programa para convertir nombres de una persona de un formato a otro
* Objetivo Trabajar con objetos de la clase String
* @uthor Aarón Palafox Solís
* @version 1
*/

public class ConvertidorNombres {
	public static void main(String [] pps){

		Scanner in = new Scanner (System.in);
		String nombreCompleto = new String();
		String nombre, aPaterno, aMaterno;

		System.out.println("Dame el nombre completo de una persona.");
		System.out.println("Separando el nombre de los apellidos con una coma");
		nombreCompleto = in.nextLine();

		nombreCompleto = nombreCompleto.trim();
		int posición = nombreCompleto.indexOf(",");
		nombre = nombreCompleto.substring(0,posición);
		nombreCompleto = nombreCompleto.substring(posición+2,nombreCompleto.length());

		posición = nombreCompleto.indexOf(" ");
		aPaterno = nombreCompleto.substring(0, posición);

		nombreCompleto = nombreCompleto.substring(posición+1);
		aMaterno = nombreCompleto;

		String nombreNuevo = aMaterno + " " + aPaterno + " " + nombre;
		System.out.println("("+nombreNuevo+ ") en el formato solicitado.");
	}


}

