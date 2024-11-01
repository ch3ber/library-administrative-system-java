package src;

import src.controllers.InventoryController;
import src.controllers.LoanController;

import src.models.LibraryModel;
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

    // Models
    LibraryModel libraryModel = new LibraryModel();

    // Controllers
    InventoryController inventoryController = new InventoryController(libraryModel);
    LoanController loanController = new LoanController();

    while (!parsedSelectedOption.equals("Salir")) {
      try {
        selectedOption = homeMenuViews.selectHomeMenuOption();

        // the user select's cancel button
        if (selectedOption == null) {
          JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
          break;
        }

        parsedSelectedOption = selectedOption.toString();

        switch (parsedSelectedOption) {
          case "Inventario":
            inventoryController.evalOption(inventoryViews.selectMenuOption());
            break;
          case "Usuarios":
            JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
            break;
          case "Préstamos":
//            loanController.evalOption(loanMenuViews.selectMenuOption());
            JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
            break;
          case "Devoluciones":
            JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
            break;
          case "Salir":
            JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
            parsedSelectedOption = "Salir";
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