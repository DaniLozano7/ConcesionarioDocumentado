
package examenMarzo.concesionarioCoches;

import examenMarzo.utiles.Menu;
import examenMarzo.utiles.Teclado;
import examenMarzo.concesionarioCoches.Color;
import examenMarzo.concesionarioCoches.Modelo;

/**
 * Queremos modelar un concesionario de coches en Java. Nos limitaremos a las
 * siguientes opciones: 
 * 
 * <ul>
 * <li>Añadir un coche (se pedirá matricula, color y modelo)
 * <li>Eliminar un coche (por matrícula)
 * <li>Mostrar un coche (por matrícula)
 * <li>Mostrar coches (todo el concesionario)
 * <li>Mostrar coches (por color)
 * </ul>
 * 
 * @author Daniel Lozano Torrico
 * @version 1.0
 */
public class TestConcesionario extends Concesionario {
	/**
	 * Menu principal
	 */
	static Menu menu = new Menu("Concesionario de coches", new String[] {
			"Alta Coche", "Baja Coche", "Mostrar Coche",
			"Mostrar concesionario", "Contar coches del concesionario",
			"Mostrar coches de un color", "Salir" });
	/**
	 * Menu para los colores
	 */
	private static Menu menuColores = new Menu("Colores de los coches",
			Color.generarOpcionesMenu());
	/**
	 * Menu para los modelos
	 */
	private static Menu menuModelos = new Menu("Modelos de los coches",
			Modelo.generarOpcionesMenu());
	/**
	 * Instanciaci&oacute;n del concesionario
	 */
	static Concesionario concesionario = new Concesionario();

	/**
	 * Lanzador del programa
	 * @param args Array de cadenas
	 */
	public static void main(String[] args) {
		do {
			switch (menu.gestionar()) {
			case 1:// "Añadir Coche
				annadirCoche();
				break;
			case 2:// Eliminar Coche
				eliminarCoche();
				break;
			case 3:// Obtener Coche
				getCoche();
				break;
			case 4:// Mostrar lista
				System.out.println(concesionario);
				break;
			case 5:// Contar coches
				System.out.println("Número de coches en el concesionario: "
						+ concesionario.size());
				break;
			case 6:// Mostrar coches de un color
				System.out.println(concesionario.getCochesColor(pedirColor()));
				break;

			default:// Salir
				System.out.println("Aaaaaaaaaaaaaaaaaaaaadios");
				return;
			}
		} while (true);
	}

	/**
	 * Devuelve un coche determinado buscando la matricula. Indica si
	 * la operacion ha sido exitosa o no.
	 */
	private static void getCoche() {
		Coche coche = concesionario.get(Teclado
				.leerCadena("Introduce la matrícula"));
		if (coche == null)
			System.out.println("No existe el coche en el concesionario.");
		else
			System.out.println(coche);
	}

	/**
	 * Elimina un coche usando la matricula. Indica si la operacion ha
	 * sido exitosa o no
	 */
	private static void eliminarCoche() {
		if (concesionario
				.eliminar(Teclado.leerCadena("Introduce la matrícula")))
			System.out.println("Coche eliminado");
		else
			System.out.println("No se ha podido eliminar");
	}

	/**
	 * Añade un coche con matricula, color y modelo. Indica
	 * si la operacion ha sido exitosa o no
	 */
	private static void annadirCoche() {
		if (concesionario.annadir(Teclado.leerCadena("Introduce la matrícula"),
				pedirColor(), pedirModelo()))
			System.out.println("Coche añadido con éxito");
		else
			System.out.println("No se ha podido añadir");
	}

	/**
	 * Selecciona el modelo del coche. Utiliza la enumeracion de modelos para almacenar los datos en un arrayList
	 * 
	 * @return Modelo Si hay mas modelos, los mostrara. En caso contrario, devolvera null
	 */
	private static Modelo pedirModelo() {
		int opcion = menuModelos.gestionar();
		Modelo[] arrModelos = Modelo.getValues();
		if (opcion == arrModelos.length + 1)
			return null;
		return arrModelos[opcion - 1];
	}

	/**
	 * Selecciona el color del coche. Utiliza la enumeracion de colores para almacenar los datos en un arrayList
	 * 
	 * @return Color Si hay mas colores, los mostrara. En caso contrario, devolvera null
	 */
	private static Color pedirColor() {
		int opcion = menuColores.gestionar();
		Color[] arrColores = Color.getValues();
		if (opcion == arrColores.length + 1)
			return null;
		return arrColores[opcion - 1];
	}
}
