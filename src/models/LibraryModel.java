package src.models;

import java.util.ArrayList;

public class LibraryModel {

	ArrayList<GenericBookModel> books = new ArrayList<>(); // GenericBookModel para soportar ambas subclases

	// Método para agregar un libro o publicación
	public void addBook(GenericBookModel book) {
		books.add(book);
	}

	// Método para encontrar un libro o publicación por autor, ID o título
	public GenericBookModel findBookByAuthor(String query, String searchType) {
		GenericBookModel foundedBook = null;

		for (GenericBookModel book : books) {
			if (searchType.equals("Autor") && book.getAutor().equals(query)) {
				foundedBook = book;
				break; // Salir del bucle una vez encontrado
			}
			if (searchType.equals("ID") && book.getID().equals(query)) {
				foundedBook = book;
				break; // Salir del bucle una vez encontrado
			}
			if (searchType.equals("Titulo") && book.getTitulo().equals(query)) {
				foundedBook = book;
				break; // Salir del bucle una vez encontrado
			}
		}

		return foundedBook; // Retorna null si no se encuentra nada
	}

	public void updateBook(String ID, String nuevoTitulo, String nuevoAutor, String nuevaCategoria,
			boolean nuevaDisponibilidad) {
		for (GenericBookModel book : books) {
			if (book.getID().equals(ID)) {
				// Actualizar los atributos
				book.setTitulo(nuevoTitulo);
				book.setAutor(nuevoAutor);
				book.setCategoria(nuevaCategoria);
				book.setDisponible(nuevaDisponibilidad);
				break; // Salir del bucle una vez encontrado y actualizado
			}
		}
	}
}
