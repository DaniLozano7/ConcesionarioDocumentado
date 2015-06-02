/**
 * Se trata del paquete donde se encuetran las clases:
 * <ul>
 * <li>Teclado
 * <li>Menu
 * </ul>
 */
package examenMarzo.utiles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Permite lectura de datos desde el teclado
 * @author Daniel Lozano Torrico
 * @version 1.0
 */
public class Teclado {

	/**
	 * Lee un carácter desde el teclado
	 * 
	 * @return caracter Carácter introducido por el usuario
	 */
	public static char leerCaracter() {
		char caracter;
		try {
			caracter = leerCadena().charAt(0);
		} catch (Exception e) {
			caracter = 0;
		}
		return caracter;
	}

	/**
	 * Lee un carácter del teclado
	 * 
	 * @param msj
	 *            Mensaje que desea mostrar el usuario
	 * @return carácter introducido por el usuario
	 */
	public static char leerCaracter(String msj) {
		System.out.println(msj);
		return leerCaracter();
	}

	/**
	 * Lee una cadena desde el teclado
	 * 
	 * @param msj
	 *            mensaje que desea mostrar el usuario
	 * @return cadena introducida por el usuario
	 */
	public static String leerCadena(String msj) {
		System.out.println(msj);
		return leerCadena();
	}

	/**
	 * Lee una cadena desde el teclado
	 * 
	 * @return cadena introducida por el usuario
	 */

	public static String leerCadena() {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(
				System.in));
		String cadena;
		try {
			cadena = bReader.readLine(); // Lee una línea de texto (hasta intro)
		} catch (Exception e) {
			cadena = "";
		}
		return cadena;
	}

	/**
	 * Lee un entero desde el teclado
	 * 
	 * 
	 * @return int Entero introducido por el usuario
	 */
	public static int leerEntero() {
		int x;
		try {
			x = Integer.parseInt(leerCadena().trim()); // Quita los espacios del
														// String y convierte a
														// int
		} catch (Exception e) {
			x = 0;
		}
		return x;
	}

	/**
	 * Lee una entero desde el teclado
	 * 
	 * @param msj
	 *            mensaje que desea mostrar el usuario
	 * @return entero introducida por el usuario
	 */
	public static int leerEntero(String msj) {
		System.out.println(msj);
		return leerEntero();
	}

	/**
	 * Lee un decimal desde el teclado
	 * 
	 * @return double Decimal introducido por el usuario
	 */
	public static double leerDecimal() {
		double x;
		try {
			x = Double.parseDouble(leerCadena().trim()); // Quita los espacios
															// del String y
															// convierte a
															// double
		} catch (Exception e) {
			x = 0;
		}
		return x;
	}

	/**
	 * Lee una decimal desde el teclado
	 * 
	 * @param msj mensaje que desea mostrar el usuario
	 * @return decimal introducida por el usuario
	 */
	public static double leerDecimal(String msj) {
		System.out.println(msj);
		return leerDecimal();
	}

}
