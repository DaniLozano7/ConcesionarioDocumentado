
package examenMarzo.concesionarioCoches;

/**
 * Enumeracion de los modelos de coches.
 * Los modelos de coches con sus respectivas marcas son:
 * 
 * -BMW:
 * <ul>
 * <li>Serie 1
 * <li>Serie 2
 * <li>Serie 3
 * <li>Serie 5
 * </ul>
 * 
 * -Seat:
 * <ul>
 * <li>Cordoba
 * <li>Ibiza
 * <li>Toledo
 * </ul>
 * 
 * @author Daniel Lozano Torrico
 * @version 1.0
 */
public enum Modelo {
	/**
	 * Modelo Serie1, BMW
	 */
	SERIE1(Marca.BMW),
	/**
	 * Modelo Serie2, BMW
	 */
	SERIE2(Marca.BMW),
	/**
	 * Modelo Serie3, BMW
	 */
	SERIE3(Marca.BMW),
	/**
	 * Modelo Serie5, BMW
	 */
	SERIE5(Marca.BMW),
	/**
	 * Modelo Cordoba, SEAT
	 */
	CORDOBA(Marca.SEAT),
	/**
	 * Modelo Ibiza, SEAT
	 */
	IBIZA(Marca.SEAT),
	/**
	 * Modelo Toledo, SEAT
	 */
	TOLEDO(Marca.SEAT);
	/**
	 * Marca del coche
	 */
	private Marca marca;
	/**
	 * Crea el Modelo asignandole una Marca
	 * @param marca Marca del coche
	 */
	private Modelo(Marca marca) {
		this.marca = marca;
	}
	/**
	 * Obtiene la marca del coche
	 * @return Marca
	 */
	public Marca getMarca() {
		return marca;
	}
	/**
	 * Muestra el modelo y la marca
	 */
	public String toString() {
		return name() + ", " + getMarca();

	}

	/**
	 * Lista de modelos disponibles
	 */
	private static final Modelo[] VALUES = Modelo.values();
	/**
	 * Metodo para generar las opciones del menu
	 * @return String[] Array con las opciones del Menu
	 */
	static String[] generarOpcionesMenu() {
		String[] opcionesMenu = new String[VALUES.length + 1];
		int i = 0;
		for (Modelo modelo : VALUES) {
			opcionesMenu[i++] = modelo.name();
		}
		opcionesMenu[i] = "Salir";
		return opcionesMenu;
	}
	/**
	 * Devuelve la lista de modelos
	 * @return Array de Modelos
	 */
	public static Modelo[] getValues() {
		return VALUES;
	}
	// -------------------------------------------------

}
