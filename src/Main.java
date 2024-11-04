package src;

import src.controllers.*;
import src.views.*;

import javax.swing.JOptionPane;

public class Main {
  /**
   * Constante para la opción de salir del sistema.
   */
  private static final String EXIT_OPTION = "Salir";

  /**
   * Método principal para ejecutar la aplicación de gestión de la biblioteca.
   * @param args Argumentos de la línea de comandos (no se utilizan).
   */
  public static void main(String[] args) {
    Object selectedOption;
    String parsedSelectedOption = "";

    /**
     * Instanciar objetos de vista para interactuar con la interfaz de usuario.
     */
    HomeMenuViews homeMenuViews = new HomeMenuViews();
    InventoryViews inventoryViews = new InventoryViews();
    LoanViews loanMenuViews = new LoanViews();
    UserViews userViews = new UserViews();

    /**
     * Instanciar objetos de controlador para manejar la lógica del negocio y vistas.
     */
    InventoryController inventoryController = new InventoryController();
    LoanController loanController = new LoanController();
    UserController userController = new UserController();

    /**
     * Bucle principal para mantener la aplicación en ejecución hasta que el usuario decida salir.
     */
    while (!parsedSelectedOption.equals(EXIT_OPTION)) {
      try {
        /**
         * Mostrar el menú principal y obtener la opción seleccionada por el usuario.
         */
        selectedOption = homeMenuViews.selectHomeMenuOption();

        /**
         * Verificar si el usuario hizo clic en el botón de cancelar.
         */
        if (selectedOption == null) {
          JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
          break;
        }

        /**
         * Convertir la opción seleccionada a una cadena para facilitar la comparación.
         */
        parsedSelectedOption = selectedOption.toString();

        /**
         * Manejar la opción seleccionada por el usuario.
         */
        switch (parsedSelectedOption) {
          case "Inventario":
            // Llamar al controlador de inventario para evaluar la opción seleccionada del menú de inventario
            inventoryController.evalOption(inventoryViews.selectMenuOption());
            break;
          case "Usuarios":
            // Llamar al controlador de usuarios para evaluar la opción seleccionada del menú de usuarios
            userController.evalOption(userViews.selectMenuOption());
            break;
          case "Préstamos":
            // Llamar al controlador de préstamos para evaluar la opción seleccionada del menú de préstamos
            loanController.evalOption(loanMenuViews.selectMenuOption());
            break;
          case EXIT_OPTION:
            // Salir de la aplicación
            JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
            parsedSelectedOption = EXIT_OPTION;
            break;
          default:
            // Manejar opciones no válidas
            JOptionPane.showMessageDialog(null, "Opción no válida. Intenta de nuevo.");
            break;
        }
      } catch (Exception e) {
        /**
         * Manejar cualquier error inesperado que ocurra durante la ejecución del programa.
         */
        JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e.getMessage());
      }
    }
  }
}
