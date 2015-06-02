/**
 * Se trata del paquete donde se encuetran las clases:
 * <ul>
 * <li>Teclado
 * <li>Menu
 * </ul>
 */
package examenMarzo.utiles;

/**
 * Clase utilizada para la gestión de un menú. Se dedica a:
 * 
 * Mostrar las opciones del menú
 * 
 * Recoger y devolver las opciones de un menú
 * 
 * @author Daniel Lozano Torrico
 * @version 1.0
 * 
 */
public class Menu {
	/**
	 * Titulo del menu
	 */
	String titulo = null;
	/**
	 * Array con las opciones del menu
	 */
	String opciones[] = null;
	/**
	 * Numero de opciones del menu
	 */
	int numOpciones = 2;

	/**
	 * Metodo que asigna el titulo del menu
	 * @param titulo Titulo del menu;
	 * @param opciones Opciones del menu;
	 */
	public Menu(String titulo, String[] opciones) {
		this.titulo = titulo;
		this.opciones = opciones;
		this.numOpciones = this.opciones.length;
	}

	/**
	 * Gestiona el menu. Consiste en mostrar las opcines y recoger la opcion
	 * seleccionada por el usuario
	 * 
	 * @return opcion valida del menu
	 */
	public int gestionar() {
		mostrar();
		return recogerOpcion();
	}

	/**
	 * Muestra las opciones del menu
	 */
	private void mostrar() {
		int i = 1;
		System.out.println("**" + titulo);
		for (String elemento : opciones)
			System.out.println("(" + (i++) + ") " + elemento);
	}

	/**
	 * Recoge la opcion valida del menu
	 * 
	 * @return opcion valida
	 */
	private int recogerOpcion() {
		int opcion;
		do {
			opcion = Teclado.leerEntero();
		} while (opcion < 1 || opcion > numOpciones);
		return opcion;
	}

}
