package src.models;

import java.util.ArrayList;

public class LibraryModel {
	ArrayList<BookModel> books = new ArrayList<>();

	public void addBook(BookModel bookModel) {
		books.add(bookModel);
	}

	public BookModel findBookByAuthor(String query, String searchType) {
		BookModel foundedBook = null;

		for (BookModel book : books) {
			if (searchType.equals("Autor")) {
				if (book.getAutor().equals(query)) {
					foundedBook = book;
					break; // Salir del bucle una vez encontrado
				}
			}

			if (searchType.equals("ID")) {
				if (book.getID().equals(query)) {
					foundedBook = book;
					break; // Salir del bucle una vez encontrado
				}
			}

			if (searchType.equals("Titulo")) {
				if (book.getID().equals(query)) {
					foundedBook = book;
					break; // Salir del bucle una vez encontrado
				}
			}

		}

		return foundedBook;
	}

	public void updateBook(String ISBN) {
		

	}
}
