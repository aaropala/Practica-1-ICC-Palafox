/**
*Representa la información y operaciones 
*/

import java.util.Scanner;
public class Alumno{

	/**
	* Identificador único de alumno
	*/
	int numCuenta;

	String nombre;

	String carrera;

	int calificacion;

	/**
	*Constructor que inicializa los datos de un alumno
	*@ 
	*/
	public Alumno(int numC, String nombre, String car){
	numCuenta = numC;
	this.nombre = nombre;
	carrera = car;

	}

	public void ponerCalificación(int cal){
	calificacion = cal;

	}

	public String situacionAsignatura(){
	String situacion;
	situacion = null;
	if (calificacion<6){
	situacion = "Reprobaste";
	}else{
		if (calificacion==6){
			situacion="Panzaste";
			}else{
				situacion="Aprobaste";
			}
	}
	return situacion;

	}

	public static void main(String []args){
	Alumno alumno1 = new Alumno(123456789,"Cosme Fulanito", "CC");
	alumno1.ponerCalificación(7);
	System.out.println(alumno1.situacionAsignatura());


	}

}
