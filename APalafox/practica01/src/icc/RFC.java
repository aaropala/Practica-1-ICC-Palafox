import java.util.Scanner;

/**
* Programa para calcular una clave RFC a partir de datos personales.
*
* Objetivo: Trabajar con objetos de la clase String.
*
*
* @author Aarón Palafox Solís
* @version 1.0
*/

public class RFC {

	/**
	* Método principal que ejecuta el programa.
	* Solicita el nombre completo y la fecha de nacimiento del usuario.
	* procesa las cadenas de texto para extraer iniciales y dar formato  a la fecha de nacimiento (aa/mm/dd)
	* e imprime el RFC generado.
	*
	*/
	public static void main (String [] args){

	String nombreCompleto, fechanacimiento = new String();
	String letrasP, inicialM, inicialnombre;
	String año, mes, día;
	String RFC;
	Scanner in = new Scanner (System.in);

	System.out.println ("Dame tu nombre completo");
	nombreCompleto = in.nextLine();

	System.out.println ("Dime tu fecha de nacimiento en formato dd/mm/aa");
	fechanacimiento = in.nextLine();

	nombreCompleto = nombreCompleto.trim();

	int posicion = nombreCompleto.indexOf(" ");
	letrasP = nombreCompleto.substring(posicion+1, posicion+3);
	System.out.println(letrasP);

	inicialnombre = nombreCompleto.substring(0,1);

	nombreCompleto = nombreCompleto.substring(posicion+1);
	posicion = nombreCompleto.indexOf(" ");
	nombreCompleto = nombreCompleto.substring(posicion+1, posicion+2);
	inicialM = nombreCompleto;

	String nuevonombre = letrasP + inicialM + inicialnombre;
	nuevonombre = nuevonombre.toUpperCase();

	fechanacimiento = fechanacimiento.trim();
	año = fechanacimiento.substring(6 , 8);
	mes = fechanacimiento.substring(3 , 5);
	día = fechanacimiento.substring(0 , 2);

	String nuevafecha = año + mes + día;

	System.out.println("Su RFC es: " + nuevonombre + nuevafecha);

	}


}
