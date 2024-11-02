package src.models;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javax.swing.JOptionPane;

public class LoanModel {
	private GenericBookModel book; // El libro prestado
	private UserModel user; // El usuario que solicita el prestamo
	private LocalDate loanDate; // Fecha en que se realizo el préstamo
	private LocalDate dueDate; // Fecha de entrega del libro
	private boolean isReturned; // Estado del prestamo
	private double lateFeePerDay; // Multa por dia de retraso
	private double totalLateFees; // Total de multas acumuladas

	public LocalDate getLoanDate() {
		return loanDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public boolean isReturned() {
		return isReturned;
	}

	public double getTotalLateFees() {
		return totalLateFees;
	}

	public LoanModel(GenericBookModel book, UserModel user, int loanPeriodInDays) {
		try{if (book.getCantidadCopias() <= 0) {
			throw new Exception();
		}}catch (Exception e){JOptionPane.showMessageDialog(null, "No hay copias disponibles de este libro: " + e.getMessage());}
		this.book = book;
		this.user = user;
		this.loanDate = LocalDate.now();
		this.dueDate = loanDate.plusDays(loanPeriodInDays);
		this.isReturned = false;
		this.lateFeePerDay = 15; // tarifa arbitraria
		this.totalLateFees = 0.0;

		// Restar una copia al momento de prestar
		book.setCantidadCopias(book.getCantidadCopias() - 1);
	}

	public void registerReturn() {
		if (!isReturned) {
			isReturned = true;
			calculateLateFees(); // Calcula multas si corresponde
			// Restablecer el número de copias disponibles del libro
			book.setCantidadCopias(book.getCantidadCopias() + 1);

		}
	}

	public void calculateLateFees() {
		long daysLate = ChronoUnit.DAYS.between(dueDate, LocalDate.now());
		if (daysLate > 0) {
			totalLateFees = daysLate * lateFeePerDay;
		}
	}

}
