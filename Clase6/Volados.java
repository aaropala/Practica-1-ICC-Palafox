import java.util.Scanner;

public class Volados{
	public static void main(String[] pps){
	Moneda centenario = new Moneda();
	Scanner in = new Scanner(System.in);
	String nombre, pidio, cayo;

	System.out.println("Dame tu nombre ");
	nombre = in.nextLine();

	System.out.print(nombre + ", ¿qué pides: aguila o sol?");
	pidio = in.nextLine();
	pidio = pidio.toLowerCase();
	pidio = pidio.trim();
	cayo = centenario.lanzar();

	System.out.println("Cayó " + cayo);

	}


}
