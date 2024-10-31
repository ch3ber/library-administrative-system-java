package src;

import src.controllers.InventoryController;
import src.controllers.LoanController;
import src.views.HomeMenuViews;
import src.views.InventoryViews;
import src.views.LoanMenuViews;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    Object selectedOption;
    String parsedSelectedOption = "";

    // Views
    HomeMenuViews homeMenuViews = new HomeMenuViews();
    InventoryViews inventoryViews = new InventoryViews();
    LoanMenuViews loanMenuViews = new LoanMenuViews();

    // Controllers
    InventoryController inventoryController = new InventoryController();
    LoanController loanController = new LoanController();

    while (!parsedSelectedOption.equals("4. Salir")) {
      try {
        selectedOption = homeMenuViews.selectMenuOption();

        // the user select's cancel button
        if (selectedOption == null) {
          JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
          break;
        }

        parsedSelectedOption = selectedOption.toString();

        switch (parsedSelectedOption) {
          case "1. Inventario":
            inventoryController.evalOption(inventoryViews.selectMenuOption());
            break;
          case "2. Registrar un nuevo usuario":
            JOptionPane.showMessageDialog(null, "Opción seleccionada: Registrar Usuario");
            // TODAVIA NO SE IMPLEMENTA LA FUNCION
            break;
          case "3. Préstamos":
            loanController.evalOption(loanMenuViews.selectMenuOption());
            break;
          case "4. Salir":
            JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
            break;
          default:
            JOptionPane.showMessageDialog(null, "Opción no válida. Intenta de nuevo.");
            break;
        }
      } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e.getMessage());
      }
    }
  }
}