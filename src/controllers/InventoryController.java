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
  BookInfoView bookInfoView = new BookInfoView();

  public InventoryController(LibraryModel library) {
    this.library = library;
  }

  private void hanldeFind(String queryId, BookSearchType bookSearchType) {
    GenericBookModel foundBook = library.findBook(queryId, bookSearchType);
    if (foundBook == null) {
      JOptionPane.showMessageDialog(null, "Libro no encontrado.");
      return;
    }
    bookInfoView.showAllInfo(foundBook.getAllInfo());
  }

  public void evalOption(Object selectedOption) {
    String parsedSelectedOption = "";

    while (!parsedSelectedOption.equals("Atrás")) {
      // the user select's cancel button
      if (selectedOption == null) break;

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

      switch (parsedSelectedOption) {
        case "Buscar por ID":
          queryId = JOptionPane.showInputDialog(null, "Ingresa su ISBN o ISSN", "");
          this.hanldeFind(queryId, BookSearchType.ID);
          parsedSelectedOption = "Atrás";
          break;

        case "Buscar por titulo":
          queryId = JOptionPane.showInputDialog(null, "Ingresa su titulo", "");
          this.hanldeFind(queryId, BookSearchType.TITLE);
          parsedSelectedOption = "Atrás";
          break;

        case "Buscar por autor":
          queryId = JOptionPane.showInputDialog(null, "Ingresa el nombre del autor", "");
          this.hanldeFind(queryId, BookSearchType.AUTHOR);
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
