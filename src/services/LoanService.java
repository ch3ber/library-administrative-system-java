package src.services;

import java.util.ArrayList;

import javax.swing.*;

import src.models.GenericBookModel;
import src.models.LoanModel;
import src.models.UserModel;


public class LoanService {

	private static LoanService instance;
	private ArrayList<LoanModel> loans = new ArrayList<>();

	// Singleton
	public static LoanService getInstance() {
		if (instance == null) {
			instance = new LoanService();
		}
		return instance;
	}

	public LoanModel registerLoan(UserModel user, GenericBookModel book, int durationDays) {
		if (book.getCantidadCopias() <= 0) {
        JOptionPane.showMessageDialog(null, "No es posible realizar el prestamo");
		}

		book.setCantidadCopias(book.getCantidadCopias() - 1);

		LoanModel newLoan = new LoanModel(user, book, durationDays);
		loans.add(newLoan);

		user.addLoan(newLoan); // Asocia el préstamo al usuario
		return newLoan;
	}
	
	 public LoanModel findLoan(UserModel user, String bookId) {
	        for (LoanModel loan : loans) {
	            // Comprobar si el préstamo pertenece al usuario y si el libro coincide
	            if (loan.getUser().getID().equals(user.getID()) && loan.getBook().getID().equals(bookId)) {
	                return loan; // Retornar el préstamo encontrado
	            }
	        }
	        return null; // Retornar null si no se encuentra el préstamo
	    }

	public boolean returnBook(UserModel user, GenericBookModel book) {
		for (LoanModel loan : loans) {
			if (loan.getUser().equals(user) && loan.getBook().equals(book) && !loan.isReturned()) {
				loan.setReturned(true);

				book.setCantidadCopias(book.getCantidadCopias() + 1);

				if (loan.hasLateFee()) {
					double lateFee = loan.calculateLateFee();
					user.addLateFee(lateFee);
				}

				return true;
			}
		}
		return false;
	}
	

}
