package src.controllers;

import src.models.BookModel;
import src.models.GenericBookModel;
import src.models.LibraryModel;
import src.models.SerialPostsModel;
import src.utils.BookSearchType;
import src.views.BookInfoView;

import javax.swing.*;

/**
 * @author Leonardo y Eber Alejo
 * @version 1.0.0
 * Eval user options from views and execute operations in InventoryModel.
 */
public class InventoryController {
  LibraryModel library;
  public InventoryController (LibraryModel library) {
    this.library = library;
  }

  public void evalOption(Object selectedOption) {
    String parsedSelectedOption = "";

    BookInfoView bookInfoView = new BookInfoView();

    while (!parsedSelectedOption.equals("Atrás")) {
      // the user select's cancel button
      if (selectedOption == null) break;

      // if the user no cancel, parse the option from selected option
      parsedSelectedOption = selectedOption.toString();

      String queryId;
      GenericBookModel foundBook;

      String title;
      String author;
      String category;
      String numCopies;
      int numCopiesParsed;
      String id;
      switch (parsedSelectedOption) {
        case "Buscar por ID":
          queryId = JOptionPane.showInputDialog(null, "Ingresa su ISBN o ISSN", "");
          foundBook = library.findBook(queryId, BookSearchType.ID);
          if (foundBook == null) {
            JOptionPane.showMessageDialog(null, "Libro no encontrado.");
            parsedSelectedOption = "Atrás";
            break;
          }
          bookInfoView.showAllInfo(foundBook.getAllInfo());
          System.out.println(foundBook.getAllInfo());
          parsedSelectedOption = "Atrás";
          break;
        case "Buscar por titulo":
          queryId = JOptionPane.showInputDialog(null, "Ingresa su ISBN o ISSN", "");
          foundBook = library.findBook(queryId, BookSearchType.TITLE);
          if (foundBook != null) {
            System.out.println(foundBook.getAllInfo());
            bookInfoView.showAllInfo(foundBook.getAllInfo());
          }
          parsedSelectedOption = "Atrás";
          break;
        case "Buscar por autor":
          queryId = JOptionPane.showInputDialog(null, "Ingresa su ISBN o ISSN", "");
          foundBook = library.findBook(queryId, BookSearchType.AUTHOR);
          if (foundBook != null) {
            System.out.println(foundBook.getAllInfo());
            bookInfoView.showAllInfo(foundBook.getAllInfo());
          }
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
          library.addBook(new BookModel(title, author, id, category, numCopiesParsed));
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
          library.addSerialPost(new SerialPostsModel(title, author, id, category, numCopiesParsed));
          parsedSelectedOption = "Atrás";
          break;
        case "Actualizar un libro (ID)":
          parsedSelectedOption = "Atrás";
          break;
        case "Eliminar un libro (ID)":
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
