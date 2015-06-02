
package examenMarzo.concesionarioCoches;


/**
 * Se limitarán los colores a tres: plata, rojo y azul. Para solicitar el color
 * al dar de alta al coche podrá implementarse un método pedirColor que mediante
 * la gestión de un menú, devolverá el color indicado entre esos tres.
 * 
 * @author Daniel Lozano Torrico
 * 
 */
public enum Color {
	/**
	 * Color Plata
	 */
	PLATA, 
	/**
	 * Color Rojo
	 */
	ROJO, 
	/**
	 * Color Azul
	 */
	AZUL;

	/**
	 * Lista de colores
	 */
	private static final Color[] VALUES = Color.values();

	/**
	 * Metodo para generar las opciones del menu
	 * 
	 * @return String[] Array que engloba todas las opciones
	 */
	public static String[] generarOpcionesMenu() {
		String[] opcionesMenu = new String[getValues().length + 1];
		int i = 0;
		for (Color color : getValues()) {
			opcionesMenu[i++] = color.name();
		}
		opcionesMenu[i] = "Salir";
		return opcionesMenu;
	}

	/**
	 * Devuelve un array de colores con los valores de la enumeracion
	 * 
	 * @return Color[] Array con los valores posibles
	 */
	public static Color[] getValues() {
		return VALUES;
	}

}
