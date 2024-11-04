package src.models;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LoanModel {
  private UserModel user;
  private GenericBookModel book;
  private LocalDate loanDate;
  private LocalDate dueDate;
  private boolean returned;
  private String fechaDevolucion = "";

  /**
   * Constructor para crear un nuevo modelo de préstamo.
   * @param user El usuario que realiza el préstamo.
   * @param book El libro que se está prestando.
   * @param durationDays La duración del préstamo en días.
   */
  public LoanModel(UserModel user, GenericBookModel book, int durationDays) {
    this.user = user;
    this.book = book;
    this.loanDate = LocalDate.now();
    this.dueDate = loanDate.plusDays(durationDays);
    this.returned = false;
  }

  /**
   * Obtener el usuario asociado con el préstamo.
   * @return El usuario que realizó el préstamo.
   */
  public UserModel getUser() {
    return user;
  }

  /**
   * Obtener el libro asociado con el préstamo.
   * @return El libro que se prestó.
   */
  public GenericBookModel getBook() {
    return book;
  }

  /**
   * Verificar si el libro ha sido devuelto.
   * @return true si el libro ha sido devuelto, false en caso contrario.
   */
  public boolean isReturned() {
    return returned;
  }

  /**
   * Marcar el libro como devuelto.
   * @param returned Estado de devolución del libro.
   */
  public void setReturned(boolean returned) {
    this.returned = returned;
    this.fechaDevolucion = ", Fecha de Entrega: " + LocalDate.now();
    if (hasLateFee()) {
      double lateFee = calculateLateFee();
      user.addLateFee(lateFee); // Agregar la multa al usuario
    }
  }

  /**
   * Verificar si el préstamo tiene una multa por retraso.
   * @return true si el préstamo tiene una multa, false en caso contrario.
   */
  public boolean hasLateFee() {
    return LocalDate.now().isAfter(dueDate);
  }

  /**
   * Calcular la multa por devolución tardía.
   * @return El monto de la multa por días de retraso.
   */
  public double calculateLateFee() {
    if (!hasLateFee()) {
      return 0;
    }
    long daysLate = ChronoUnit.DAYS.between(dueDate, LocalDate.now());
    return daysLate * 15;
  }

  /**
   * Obtener la información del préstamo.
   * @return Una cadena con la información del préstamo.
   */
  public String getLoanInfo() {
    return "Libro: " + book.getTitulo() + ", Fecha de Préstamo: " + loanDate + ", Fecha Limite de Entrega: " + dueDate + fechaDevolucion
        + ", Devuelto: " + returned + "\n";
  }
}
