package src.views;

import javax.swing.*;

public class InventoryMenuView extends MenuView {
  public Object selectOption() {
    return JOptionPane.showInputDialog(
        null,
        "Escoja una opción",
        "Menú Inventario",
        JOptionPane.INFORMATION_MESSAGE,
        null, new Object[]{
            "1. Agregar un nuevo libro",
            "2. Buscar un libro",
            "3. Atrás"
        },
        "1. Agregar un nuevo libro");
  }
}
