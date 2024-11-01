package src.models;

import java.awt.print.Book;
import java.util.ArrayList;
import src.utils.BookSearchType;

public class LibraryModel {
  // List to store all the books in the library
  private ArrayList<GenericBookModel> books = new ArrayList<>();

  BookModel bookDomie = new BookModel("Title test", "tester", "777", "category test", 7);
  public LibraryModel() {
    books.add(bookDomie);
  }

  // Method to add a book or publication to the library
  public void addBook(BookModel book) {
    books.add(book);
  }

  public void addSerialPost(SerialPostsModel book) {
    books.add(book);
  }

  // Method to find a book or publication by author, ID, or title
  public GenericBookModel findBook(String query, BookSearchType searchType) {
    for (GenericBookModel book : books) {
      switch (searchType) {
        case AUTHOR:
          if (book.getAutor().equals(query)) {
            return book; // Match by author
          }
          break;
        case ID:
          if (book.getID().equals(query)) {
            return book; // Match by ID
          }
          break;
        case TITLE:
          if (book.getTitulo().equals(query)) {
            return book; // Match by title
          }
          break;
        default:
          break; // Default case, should not be reached
      }
    }
    return null; // Return null if no match is found
  }

  // Method to update the details of a book by its ID
  public void updateBook(String ID, String newTitle, String newAuthor, String newCategory, int newAvailability) {
    // Find the book by ID and if found, update its details
    GenericBookModel book = findBook(ID, BookSearchType.ID);
    if (book != null) {
      book.setTitulo(newTitle); // Update the title
      book.setAutor(newAuthor); // Update the author
      book.setCategoria(newCategory); // Update the category
      book.setCantidadCopias(newAvailability); // Update the availability status
    }
  }
}
