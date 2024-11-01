package src.views;

import javax.swing.*;

public class InventoryViews {
  public Object selectMenuOption() {
    return JOptionPane.showInputDialog(
        null,
        "Escoja una opción",
        "Menú Inventario",
        JOptionPane.INFORMATION_MESSAGE,
        null, new Object[]{
            "Buscar por ID",
            "Buscar por titulo",
            "Buscar por autor",
            "Agregar un nuevo libro",
            "Agregar una publicacion",
            "Actualizar un libro (ID)",
            "Eliminar un libro (ID)",
            "Atrás"
        },
        "Buscar por ID");
  }
}
