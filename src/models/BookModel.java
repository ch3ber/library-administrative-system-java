package src.models;

/**
 * Clase que representa un libro específico, se utiliza ISBN como identificador.
 */
public class BookModel extends GenericBookModel {
	/**
	 * Constructor de la clase Libro
	 *
	 * @param titulo     El título del libro
	 * @param autor      El autor del libro
	 * @param ISBN       El ISBN del libro
	 * @param categoria  La categoría del libro
	 * @param disponible Indica si el libro está disponible para préstamo
	 */

	public BookModel(String titulo, String autor, String ISBN, String categoria, int cantidadCopias) {
		super(titulo, autor, ISBN, categoria, cantidadCopias);

	}

	public String getAllInfo() {
		return "Titulo: " + titulo + "\n" + "Autor: " + autor + "\n" + "Categoria: " + categoria + "\n"
				+ "Cantidad en Inventario: " + cantidadCopias + "\n" + "ISBN: " + ID;

	}

}
