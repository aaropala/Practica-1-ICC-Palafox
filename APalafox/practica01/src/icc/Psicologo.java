import java.util.Scanner;

/**
* Programa para simular una sesión con Psicológo.
*
* Objetivo Trabajar con objetos de la clase String y la interacción con la consola.
*
*
* @uthor Aarón Palafox Solís
* @version 1
*/
public class Psicologo {

	/**
	* Método principal que ejecuta la simulación de la consulta.
	* Solicita el nombre y el problema del usuario para entablar un diálogo simulado.
	*
	*/

	public static void main(String [] args){
	System.out.println ("Bienvenido, ¿cuál es su nombre?");

	String nombre, problema, respuesta = new String();
	Scanner in = new Scanner (System.in);
	nombre = in.nextLine();

	System.out.println ("Buenas tardes " + nombre + ".");
	System.out.println ("Digame, cuál es su problema en la vida?");
	problema = "\"" + in.nextLine() + "\"";

 	System.out.println ("Mmmm... ya veo");
	System.out.println ("Y digame ...");
	System.out.println ("¿Por qué dice " + problema.toLowerCase() + "?");

	respuesta = in.nextLine();
	System.out.println ("Muy interesante!! Hablaremos de ello con más detalle en la siguiente sesión.");


	}
}
