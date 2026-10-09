import java.util.Scanner;

/**
* Programa para que envie un mensaje de felicitación
* Objetivo Mostrar el uso del objeto System.out
* @author Aarón Palafox Solís
* @version 1.0
*/
public class Saludo {

	public static void main(String[] args){

	Scanner in = new Scanner(System.in);
	String nombre;

	System.out.println("Dame tu nombre");
	nombre = in.nextLine();
	System.out.println("¡Felicidades "+nombre+"!");
	System.out.println("\t Has escrito tu primer programa en Java");
	System.out.println(nombre.charAt(0));
	System.out.println(nombre.equals("Aarón"));
	System.out.println(nombre.indexOf("ar"));
	System.out.println(nombre.length());
	System.out.println(nombre.substring(1,5));
	System.out.println(nombre.toLowerCase());
	System.out.println(nombre.toUpperCase());
	

	}

}
