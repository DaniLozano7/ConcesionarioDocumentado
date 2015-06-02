package examenMarzo.concesionarioCoches;

import java.util.regex.Pattern;

/**
 * Clase que trabaja directamente con los elemento del Coche de forma individual
 * 
 * @author Daniel Lozano Torrico
 * @version 1.0
 */

public class Coche {
	/**
	 * Matricula del coche.
	 */
	private String matricula;
	/**
	 * Color del coche.
	 */
	private Color color;
	/**
	 * Modelo del coche.
	 */
	private Modelo modelo;
	/**
	 * Patron para verificar la matricula. Para que sea v&aacute;lida debe estar
	 * formada por 4 d&iacute;gitos y 3 letras may&uacute;sculas que no sean
	 * vocal ni Q. Los d&iacute;gitos y las letras pueden estar separadas por un
	 * -, por un espacio en blanco, o no estar separadas.
	 */
	static final private Pattern patternMatricula = Pattern
			.compile("^\\d{4}[ -]?[[B-Z]&&[^QEIOU]]{3}$");

	/**
	 * Crea el coche con una matr&iacute;cula, un color y un modelo.
	 * 
	 * @param matricula
	 *            Matricula del coche
	 * @param color
	 *            Color del coche
	 * @param modelo
	 *            Modelo del coche
	 */
	private Coche(String matricula, Color color, Modelo modelo) {
		super();
		setMatricula(matricula);
		setColor(color);
		setModelo(modelo);
	}

	/**
	 * Crea el coche con una matr&iacute;cula.
	 * 
	 * @param matricula
	 *            Matricula del coche
	 */
	private Coche(String matricula) {
		setMatricula(matricula);
	}

	/**
	 * Instancia un coche con una matr&iacute;cula, color y modelo.
	 * 
	 * @param matricula
	 *            Matricula del coche
	 * @param color
	 *            Color del coche
	 * @param modelo
	 *            Modelo del coche
	 * @return Coche Si todos los valores son v&aacute;lidos, crea un coche. En
	 *         caso contrario devolverá null.
	 */
	static Coche instanciarCoche(String matricula, Color color, Modelo modelo) {
		if (esValida(matricula) && color != null && modelo != null)
			return new Coche(matricula, color, modelo);
		return null;
	}

	/**
	 * Instancia un coche con una matr&iacute;cula
	 * 
	 * @param matricula
	 *            Matr&iacute;cula del coche
	 * @return Coche Si los parametros son v&aacute;lidos, crea un coche. En
	 *         caso contrario, devolvera null.
	 */
	static Coche instanciarCoche(String matricula) {
		if (esValida(matricula))
			return new Coche(matricula);
		return null;
	}

	/**
	 * Comprueba la validez de la matricula a trav&eacute;s de un patr&oacute;n.
	 * 
	 * @param matricula
	 *            Matr&iacute;cula del coche
	 * @return boolean Devuelve true si es valida. En caso contrario, devuelve
	 *         false
	 */
	private static boolean esValida(String matricula) {
		return patternMatricula.matcher(matricula).matches();
	}

	/**
	 * Establece la matricula
	 * 
	 * @param matricula
	 *            Matricula del coche
	 */
	private void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * Devuelve el color
	 * 
	 * @return Color del coche
	 */
	Color getColor() {
		return color;
	}

	/**
	 * Establece el color
	 * 
	 * @param color
	 *            Color indicado
	 */
	private void setColor(Color color) {
		this.color = color;
	}

	/**
	 * Establece el modelo
	 * 
	 * @param modelo
	 *            Modelo indicado
	 */
	private void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	/**
	 * Si los objetos son iguales segun el metodo equals, tendrán el mismo valor
	 * hash
	 * 
	 * @return Valor hash
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}

	/**
	 * Indica si otro coche es igual a este
	 * 
	 * @param obj
	 *            Coche que vamos a comparar.
	 * @return boolean True si son iguales y False en caso contrario.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}

	/**
	 * Muestra los elementos del vehiculo en una cadena
	 */
	@Override
	public String toString() {
		return "\nCoche [matricula=" + matricula + ", color=" + color
				+ ", modelo=" + modelo + "]";
	}

}
