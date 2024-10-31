package src.views;

import javax.swing.*;

public class LoanMenuViews {
  public Object selectMenuOption () {
    return JOptionPane.showInputDialog(
        null, "Escoja una opción", "Menú Préstamos", JOptionPane.INFORMATION_MESSAGE,
        null, new Object[]{
            "1. Realizar un préstamo",
            "2. Devolver un libro",
            "3. Atrás"
        },
        "1. Realizar un préstamo");
  }
}
