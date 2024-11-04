package src.controllers;

import javax.swing.*;
import src.models.LoanModel;
import src.models.UserModel;
import src.models.GenericBookModel;
import src.models.LibraryModel;
import src.services.LoanService;
import src.services.UserService;
import src.utils.BookSearchType;
import src.utils.UserSearchType;
import src.views.LoanViews;

public class LoanController {
    private LoanService loanService = LoanService.getInstance();
    private UserService userService = UserService.getInstance();
    private LibraryModel libraryModel = LibraryModel.getInstance();
    private LoanViews loanViews = new LoanViews();

    public void evalOption(Object selectedOption) {
        String parsedSelectedOption = "";

        while (!parsedSelectedOption.equals("Atrás")) {
            if (selectedOption == null) {
                break;
            }

            parsedSelectedOption = selectedOption.toString();

            switch (parsedSelectedOption) {
                case "Realizar un préstamo":
                    realizarPrestamo();
                    parsedSelectedOption = "Atrás"; // Volver al menú después de realizar el préstamo
                    break;

                case "Devolver un libro":
                    devolverLibro();
                    parsedSelectedOption = "Atrás"; // Volver al menú después de devolver el libro
                    break;

                case "Atrás":
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intenta de nuevo.");
                    break;
            }
        }
    }

    private void realizarPrestamo() {
        String userId = JOptionPane.showInputDialog(null, "Ingresa el ID del usuario", "Préstamo", JOptionPane.INFORMATION_MESSAGE);
        UserModel user = userService.findUser(userId, UserSearchType.ID);
        if (user == null) {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
            return;
        }

        String bookId = JOptionPane.showInputDialog(null, "Ingresa el ID del libro", "Préstamo", JOptionPane.INFORMATION_MESSAGE);
        GenericBookModel book = libraryModel.findBook(bookId, BookSearchType.ID);
        if (book == null || book.getCantidadCopias() <= 0) {
            JOptionPane.showMessageDialog(null, "Libro no encontrado o sin copias disponibles.");
            return;
        }

        int durationDays = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la duración del préstamo (días)", "Préstamo", JOptionPane.INFORMATION_MESSAGE));
        LoanModel loan = loanService.registerLoan(user, book, durationDays);
        JOptionPane.showMessageDialog(null, "Préstamo realizado:\n" + loan.getLoanInfo());
    }

    private void devolverLibro() {
        String userId = JOptionPane.showInputDialog(null, "Ingresa el ID del usuario", "Devolución", JOptionPane.INFORMATION_MESSAGE);
        UserModel user = userService.findUser(userId, UserSearchType.ID);
        if (user == null) {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
            return;
        }

        String bookId = JOptionPane.showInputDialog(null, "Ingresa el ID del libro", "Devolución", JOptionPane.INFORMATION_MESSAGE);
        LoanModel loan = loanService.findLoan(user, bookId);
        if (loan == null) {
            JOptionPane.showMessageDialog(null, "No se encontró un préstamo para este libro.");
            return;
        }

        loan.setReturned(true); // Marca el préstamo como devuelto
        JOptionPane.showMessageDialog(null, "Libro devuelto:\n" + loan.getLoanInfo());
    }
}
