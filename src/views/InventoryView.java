package src.views;

import javax.swing.*;

public class InventoryView extends MenuView {
  public Object selectMenuOption() {
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
