package src.views;

import javax.swing.*;

public class HomeMenuViews {
  public Object selectHomeMenuOption() {
    return JOptionPane.showInputDialog(
        null, "Escoja una opción:", "Menú Biblioteca", JOptionPane.INFORMATION_MESSAGE,
        null, new Object[]{
            "Inventario",
            "Usuarios",
            "Préstamos",
            "Devoluciones",
            "Salir"
        },
        "Inventario");
  }
}
