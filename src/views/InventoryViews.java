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
        	"Mostrar Inventario",
            "Buscar por ID",
            "Buscar por titulo",
            "Buscar por categoria",
            "Agregar un nuevo libro",
            "Agregar una publicacion",
            "Actualizar un libro (ID)",
            "Eliminar un libro (ID)",
            "Atrás"
        },
        "Mostrar Inventario");
  }
  
  public void showAllBooks(String infoLibrary) {
		JOptionPane.showMessageDialog(null, infoLibrary, "Lista de Libros", JOptionPane.INFORMATION_MESSAGE);
  }
}
