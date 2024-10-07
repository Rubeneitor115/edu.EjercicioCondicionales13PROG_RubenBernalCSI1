/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

/**
 * Clase controladora de la aplicación
 * rbr - 071024
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 071024
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		double numeroDecimal;
		
		//Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		//Pido por consola el número al usuario y lo guardo en su variable
		System.out.println("Introduzca un número decimal: ");
		numeroDecimal = sc.nextDouble();
		
		//Controlo que el número introducido sea casi cero
		if(numeroDecimal<1.0 && numeroDecimal>-1.0) {
			System.out.println("El número decimal introducido es casi cero");
		}else {
			System.err.println("El número decimal introducido no es casi cero");
		}

	}

}