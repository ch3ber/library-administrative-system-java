package src.views;

import javax.swing.*;

public class LoanViews {
  public Object selectMenuOption () {
    return JOptionPane.showInputDialog(
        null, "Escoja una opción", "Menú Préstamos", JOptionPane.INFORMATION_MESSAGE,
        null, new Object[]{
            "Realizar un préstamo",
            "Devolver un libro",
            "Atrás"
        },
        "Realizar un préstamo");
  }
}
