package src.controllers;

import javax.swing.*;

/**
 * @author Leonardo y Eber Alejo
 * @version 1.0.0
 * Eval user options from views and execute operations in InventoryModel.
 */
public class InventoryController {
  public void evalOption(Object selectedOption) {
    String parsedSelectedOption = "";

    while (!parsedSelectedOption.equals("3. Atrás")) {
      // the user select's cancel button
      if (selectedOption == null) {
        break;
      }

      parsedSelectedOption = selectedOption.toString();

      switch (parsedSelectedOption) {
        case "1. Agregar un nuevo libro":
          JOptionPane.showMessageDialog(null, "Opción seleccionada: Agregar un nuevo libro");
          // TODAVIA NO SE IMPLEMENTA LA FUNCION
          parsedSelectedOption = "3. Atrás";
          break;

        case "2. Buscar un libro":
          JOptionPane.showMessageDialog(null, "Opción seleccionada: Buscar un libro");
          // TODAVIA NO SE IMPLEMENTA LA FUNCION
          parsedSelectedOption = "3. Atrás";
          break;

        case "3. Atrás":
          break;

        default:
          JOptionPane.showMessageDialog(null, "Opción no válida. Intenta de nuevo.");
          break;
      }
    }
  }
}
