package src.views;

import javax.swing.*;

public class HomeMenuView extends MenuView{
  public Object selectMenuOption() {
    return JOptionPane.showInputDialog(
        null, "Escoja una opción", "Menú Biblioteca", JOptionPane.INFORMATION_MESSAGE,
        null, new Object[]{
            "1. Inventario",
            "2. Registrar un nuevo usuario",
            "3. Préstamos",
            "4. Salir"
        },
        "1. Inventario");
  }
}
