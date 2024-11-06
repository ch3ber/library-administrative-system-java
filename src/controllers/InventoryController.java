package src.controllers;

import src.models.BookModel;
import src.models.GenericBookModel;
import src.models.LibraryModel;
import src.models.SerialPostsModel;
import src.utils.BookSearchType;
import src.views.BookInfoView;
import src.views.InventoryViews;

import javax.swing.*;

/**
 * @author Leonardo y Eber Alejo
 * @version 1.0.0 Eval user options from views and execute operations in
 *          InventoryModel.
 */
public class InventoryController {
	LibraryModel libraryModel = LibraryModel.getInstance();
	BookInfoView bookInfoView = new BookInfoView();
	InventoryViews inventoryViews = new InventoryViews();

	private void handleFind(String queryId, BookSearchType bookSearchType) {
	    try {
	        GenericBookModel foundBook = libraryModel.findBook(queryId, bookSearchType);
	        
	        if (foundBook == null) {
	            JOptionPane.showMessageDialog(null, "Libro no encontrado.");
	            return;
	        }
	        
	        bookInfoView.showAllInfo(foundBook.getAllInfo());
	        
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Ocurrió un error al buscar el libro: " + e.getMessage());
	    }
	}

	public void evalOption(Object selectedOption) {
		String parsedSelectedOption = "";

		while (!parsedSelectedOption.equals("Atrás")) {
			// the user select's cancel button
			if (selectedOption == null)
				break;

			// if the user no cancel, parse the option from selected option
			parsedSelectedOption = selectedOption.toString();

			// var for find book
			String queryId;

			// vars for add book
			String title;
			String author;
			String category;
			String numCopies;
			int numCopiesParsed;
			String id;

			// vars for update book
			String newTitle;
			String newAuthor;
			String newCategory;
			String newNumCopies;
			int newNumCopiesParsed;

			switch (parsedSelectedOption) {
			case "Mostrar Inventario":
				String infoLibrary=libraryModel.getAllBooks();
				inventoryViews.showAllBooks(infoLibrary);
				parsedSelectedOption = "Atrás";
				break;
			case "Buscar por ID":
				queryId = JOptionPane.showInputDialog(null, "Ingresa su ISBN o ISSN", "");
				this.handleFind(queryId, BookSearchType.ID);
				parsedSelectedOption = "Atrás";
				break;

			case "Buscar por titulo":
				queryId = JOptionPane.showInputDialog(null, "Ingresa su titulo", "");
				this.handleFind(queryId, BookSearchType.TITLE);
				parsedSelectedOption = "Atrás";
				break;

			case "Buscar por autor":
				queryId = JOptionPane.showInputDialog(null, "Ingresa el nombre del autor", "");
				this.handleFind(queryId, BookSearchType.AUTHOR);
				parsedSelectedOption = "Atrás";
				break;

			case "Agregar un nuevo libro":
				title = JOptionPane.showInputDialog(null, "Ingresa su titulo", "");
				author = JOptionPane.showInputDialog(null, "Ingresa su autor", "");
				category = JOptionPane.showInputDialog(null, "Ingresa su categoria", "");
				// TODO: validate number
				numCopies = JOptionPane.showInputDialog(null, "Ingresa la cantidad de copias", "");
				id = JOptionPane.showInputDialog(null, "Ingresa su ISBN", "");

				numCopiesParsed = Integer.parseInt(numCopies);
				libraryModel.addBook(new BookModel(title, author, id, category, numCopiesParsed));
				parsedSelectedOption = "Atrás";
				break;
			case "Agregar una publicacion":
				title = JOptionPane.showInputDialog(null, "Ingresa su titulo", "");
				author = JOptionPane.showInputDialog(null, "Ingresa su autor", "");
				category = JOptionPane.showInputDialog(null, "Ingresa su categoria", "");
				// TODO: validate number
				numCopies = JOptionPane.showInputDialog(null, "Ingresa la cantidad de copias", "");
				id = JOptionPane.showInputDialog(null, "Ingresa su ISSN", "");

				numCopiesParsed = Integer.parseInt(numCopies);
				libraryModel.addSerialPost(new SerialPostsModel(title, author, id, category, numCopiesParsed));
				parsedSelectedOption = "Atrás";
				break;
			case "Actualizar un libro (ID)":
				id = JOptionPane.showInputDialog(null, "Ingresa su ID", "");
				newTitle = JOptionPane.showInputDialog(null, "Ingresa el nuevo titulo", "");
				newAuthor = JOptionPane.showInputDialog(null, "Ingresa el nuevo autor", "");
				newCategory = JOptionPane.showInputDialog(null, "Ingresa la nueva categoría", "");
				newNumCopies = JOptionPane.showInputDialog(null, "Ingresa la nueva cantidad de copias totales: ", "");
				// TODO: validate number
				newNumCopiesParsed = Integer.parseInt(newNumCopies);
				libraryModel.updateBook(id, newTitle, newAuthor, newCategory, newNumCopiesParsed);
				
				parsedSelectedOption = "Atrás";
				break;
			case "Eliminar un libro (ID)":
				id = JOptionPane.showInputDialog(null, "Ingresa ID del libro a eliminar", "");
				libraryModel.deleteBook(id);
				JOptionPane.showMessageDialog(null, "Libro Eliminado Exitosamente");
				parsedSelectedOption = "Atrás";
				break;
			case "Atrás":
				parsedSelectedOption = "Atrás";
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opción no válida. Intenta de nuevo.");
				break;
			}
		}
	}
}
