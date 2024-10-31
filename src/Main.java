package src;

import src.controllers.InventoryController;
import src.controllers.LoanController;
import src.views.HomeMenuView;
import src.views.InventoryView;
import src.views.LoanMenuView;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    Object selectedOption;
    String parsedSelectedOption = "";

    // Views
    HomeMenuView homeMenuView = new HomeMenuView();
    InventoryView inventoryView = new InventoryView();
    LoanMenuView loanMenuView = new LoanMenuView();

    // Controllers
    InventoryController inventoryController = new InventoryController();
    LoanController loanController = new LoanController();

    while (!parsedSelectedOption.equals("4. Salir")) {
      try {
        selectedOption = homeMenuView.selectMenuOption();

        // the user select's cancel button
        if (selectedOption == null) {
          JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
          break;
        }

        parsedSelectedOption = selectedOption.toString();

        switch (parsedSelectedOption) {
          case "1. Inventario":
            inventoryController.evalOption(inventoryView.selectMenuOption());
            break;
          case "2. Registrar un nuevo usuario":
            JOptionPane.showMessageDialog(null, "Opción seleccionada: Registrar Usuario");
            // TODAVIA NO SE IMPLEMENTA LA FUNCION
            break;
          case "3. Préstamos":
            loanController.evalOption(loanMenuView.selectMenuOption());
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