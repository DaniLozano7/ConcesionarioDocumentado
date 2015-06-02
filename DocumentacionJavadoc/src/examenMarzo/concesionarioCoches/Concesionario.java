
package examenMarzo.concesionarioCoches;

import java.util.ArrayList;


/**
 * Clase en la cual se crea y se gestiona el concesionario "IES Gran Capitán".
 * 
 * <ul>
 * <li>Lógicamente, no podrá añadirse un coche inválido en el almacén del concesinario.
 * <li>Han de conocerse todas sus características (Matr&iacute;cula, Color, Modelo). Ninguno de los valores puede ser por defecto.
 * </ul>
 * 
 * Realiza las siguientes opciones:
 * 
 * <ul>
 * <li>Añadir coche.
 * <li>Eliminar coche.
 * <li>Mostrar coche por matr&iacute;cula.
 * <li>Mostrar concesionario.
 * <li>Contar coches del concesionario.
 * <li>Mostrar coches por color.
 * </ul>
 * 
 * @author Daniel Lozano Torrico
 * @version 1.0
 */
public class Concesionario {
	/**
	 * Colección de coches en un ArrayList. No puede ser null
	 */
	private ArrayList<Coche> almacen = new ArrayList<Coche>();
	/**
	 * Nombre del concesionario
	 */
	private final String nombre = "IES Gran Capitán";

	/**
	 * Añade un coche con matr&iacute;cula, color y modelo. Si el almacen ya contiene
	 * el vehiculo, o los datos son invalidos, no lo añadirá.
	 * 
	 * @param matricula
	 *            Matricula del coche
	 * @param color
	 *            Color del coche
	 * @param modelo
	 *            Modelo del coche
	 * @return boolean Añade el coche al almacen. Si es true, lo añade
	 *         correctamente. En caso contrario, no lo añadira
	 */
	boolean annadir(String matricula, Color color, Modelo modelo) {
		Coche coche = Coche.instanciarCoche(matricula, color, modelo);
		if (coche == null || almacen.contains(coche))
			return false;
		return almacen.add(coche);
	}

	/**
	 * Elimina un coche del concesionario. Si el coche no está en el almacen, no se
	 * podrá eliminar.
	 * 
	 * @param matricula
	 *            Matricula del coche
	 * @return boolean Elimina un coche del almacen. Si devuelve true, lo ha
	 *         hecho con exito. Si devuelve false, no se ha podido eliminar
	 */
	boolean eliminar(String matricula) {
		return almacen.remove(Coche.instanciarCoche(matricula));
	}

	/**
	 * Devuelve el tamaño del almac&eacute;n
	 * 
	 * @return int Tamaño del almacen
	 */
	int size() {
		return almacen.size();
	}

	/**
	 * Devuelve el Coche del almacén indicado por la matrícula. Si no se
	 * encuentra el veh&iacute;culo, indicará que el coche no existe
	 * 
	 * @param matricula
	 *            Matrícula a buscar
	 * @return Coche Coche contenido en el almacén. Null si no existe
	 */
	Coche get(String matricula) {
		Coche coche = Coche.instanciarCoche(matricula);
		int index = almacen.indexOf(coche);
		if (index != -1) {
			return almacen.get(index);
		}
		return null;
	}

	/**
	 * Muestra el concesionario a traves de una cadena
	 * @return Cadena con los valores del concesionario
	 */
	@Override
	public String toString() {
		return "Concesionario " + nombre + "[almacen=" + almacen + "]";
	}

	/**
	 * Muestra coches por color. Crea un arrayList propio para los coches que
	 * sean de ese color.
	 * 
	 * @param color
	 *            Color indicado
	 * @return ArrayList de coches
	 */
	public ArrayList<Coche> getCochesColor(Color color) {
		ArrayList<Coche> arrCochesColor = new ArrayList<Coche>();
		for (Coche coche : almacen) {
			if (coche.getColor() == color)
				arrCochesColor.add(coche);
		}
		return arrCochesColor;
	}

}
