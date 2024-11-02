package src.models;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LoanModel {
	private UserModel user;
	private GenericBookModel book;
	private LocalDate loanDate;
	private LocalDate dueDate;
	private boolean returned;
	private String fechaDevolucion="";

	public LoanModel(UserModel user, GenericBookModel book, int durationDays) {
		this.user = user;
		this.book = book;
		this.loanDate = LocalDate.now();
		this.dueDate = loanDate.plusDays(durationDays);
		this.returned = false;
	}

	public UserModel getUser() {
		return user;
	}

	public GenericBookModel getBook() {
		return book;
	}

	public boolean isReturned() {
		return returned;
	}

	public void setReturned(boolean returned) {
		this.returned = returned;
		this.fechaDevolucion=", Fecha de Entrega: " + LocalDate.now();
		if (hasLateFee()) {
			double lateFee = calculateLateFee();
			user.addLateFee(lateFee); // Agregar la multa al usuario
		}
	}

	public boolean hasLateFee() {
		return LocalDate.now().isAfter(dueDate);
	}

	public double calculateLateFee() {
		if (!hasLateFee())
			return 0;
		long daysLate = ChronoUnit.DAYS.between(dueDate, LocalDate.now());
		return daysLate * 15;
	}
	

	public String getLoanInfo() {
		return "Libro: " + book.getTitulo() + ", Fecha de Préstamo: " + loanDate + ", Fecha Limite de Entrega: " + dueDate+fechaDevolucion
				+ ", Devuelto: " + returned+"\n";
	}
}
