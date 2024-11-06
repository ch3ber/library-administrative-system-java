package src.models;

import java.util.ArrayList;

import src.utils.BookSearchType;

import javax.swing.*;

public class LibraryModel {
	private static LibraryModel instance;
	private ArrayList<GenericBookModel> books = new ArrayList<>();

	/**
	 * Constructor privado para implementar el Patrón Singleton.
	 */
	private LibraryModel() {
	}

	/**
	 * Obtener la instancia única de LibraryModel (Singleton).
	 * @return instancia de LibraryModel.
	 */
	public static LibraryModel getInstance() {
		if (instance == null) {
			instance = new LibraryModel();
		}
		return instance;
	}

	/**
	 * Método para agregar un libro a la biblioteca.
	 * @param book Objeto BookModel que representa el libro a agregar.
	 */
	public void addBook(BookModel book) {
		books.add(book);
	}

	/**
	 * Método para agregar una publicación seriada a la biblioteca.
	 * @param book Objeto SerialPostsModel que representa la publicación a agregar.
	 */
	public void addSerialPost(SerialPostsModel book) {
		books.add(book);
	}

	/**
	 * Método para encontrar un libro o publicación por autor, ID o título.
	 * @param query La consulta que se desea buscar (autor, ID o título).
	 * @param searchType El tipo de búsqueda a realizar (autor, ID, título).
	 * @return El libro o publicación encontrada, o null si no se encuentra ninguna coincidencia.
	 */
	public GenericBookModel findBook(String query, BookSearchType searchType) {
		for (GenericBookModel book : books) {
			switch (searchType) {
				case CATEGORY:
					if (book.getCategoria().equals(query)) {
						return book;
					}
					break;
				case ID:
					if (book.getID().equals(query)) {
						return book;
					}
					break;
				case TITLE:
					if (book.getTitulo().equals(query)) {
						return book;
					}
					break;
				default:
					break; // Caso por defecto, no debe alcanzarse
			}
		}
		return null; // Retorna null si no se encuentra ninguna coincidencia
	}

	/**
	 * Método para actualizar los detalles de un libro por su ID.
	 * @param ID El ID del libro a actualizar.
	 * @param newTitle El nuevo título del libro.
	 * @param newAuthor El nuevo autor del libro.
	 * @param newCategory La nueva categoría del libro.
	 * @param newAvailability La nueva cantidad de copias disponibles.
	 */
	public void updateBook(String ID, String newTitle, String newAuthor, String newCategory, int newAvailability) {
		GenericBookModel book = findBook(ID, BookSearchType.ID);
		if (book != null) {
			book.setTitulo(newTitle);
			book.setAutor(newAuthor);
			book.setCategoria(newCategory);
			book.setCantidadCopias(newAvailability);
		}
	}

	/**
	 * Obtener la información de todos los libros de la biblioteca.
	 * @return Una cadena con la información de todos los libros.
	 */
	public String getAllBooks() {
		StringBuilder infoLibrary = new StringBuilder();
		if (books.isEmpty()) {
			infoLibrary.append("No hay libros en la biblioteca");
		} else {
			for (GenericBookModel book : books) {
				infoLibrary.append(book.getAllInfo()).append("\n\n");
			}
		}

		return infoLibrary.toString();
	}

	public String getAllBooksByCategory(String category) {
		StringBuilder infoLibrary = new StringBuilder();
		if (books.isEmpty()) return infoLibrary.append("No hay libros en la biblioteca").toString();

		for (GenericBookModel book : books) {
			if (book.getCategoria().equals(category)) {
				infoLibrary.append(book.getAllInfo()).append("\n\n");
			}
		}

		if (infoLibrary.isEmpty()) return infoLibrary.append("No hay libros con la categoria: " + category).toString();
		return infoLibrary.toString();
	}
}
