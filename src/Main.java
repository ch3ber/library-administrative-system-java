package src;

import javax.swing.JOptionPane;

public class Main {
  public static void mostrarMenuInventario() {
    String opcionInventario = "";

    while (opcionInventario.equals("3. Atrás") != true) {
      Object seleccion = JOptionPane.showInputDialog(
          null, "Escoja una opción", "Menú Inventario", JOptionPane.INFORMATION_MESSAGE,
          null, new Object[]{
              "1. Agregar un nuevo libro",
              "2. Buscar un libro",
              "3. Atrás"
          },
          "1. Agregar un nuevo libro");

      if (seleccion == null) {
        break;
      }

      opcionInventario = seleccion.toString();

      switch (opcionInventario) {
        case "1. Agregar un nuevo libro":
          JOptionPane.showMessageDialog(null, "Opción seleccionada: Agregar un nuevo libro");
          // TODAVIA NO SE IMPLEMENTA LA FUNCION
          break;

        case "2. Buscar un libro":
          JOptionPane.showMessageDialog(null, "Opción seleccionada: Buscar un libro");
          // TODAVIA NO SE IMPLEMENTA LA FUNCION
          break;

        case "3. Atrás":
          // Regresar al menú principal
          break;

        default:
          JOptionPane.showMessageDialog(null, "Opción no válida. Intenta de nuevo.");
          break;
      }
    }
  }

  public static void mostrarMenuPrestamos() {
    String opcionPrestamos = "";

    while (opcionPrestamos.equals("3. Atrás") != true) {
      Object seleccion = JOptionPane.showInputDialog(
          null, "Escoja una opción", "Menú Préstamos", JOptionPane.INFORMATION_MESSAGE,
          null, new Object[]{
              "1. Realizar un préstamo",
              "2. Devolver un libro",
              "3. Atrás"
          },
          "1. Realizar un préstamo");

      if (seleccion == null) {
        break;
      }

      opcionPrestamos = seleccion.toString();

      switch (opcionPrestamos) {
        case "1. Realizar un préstamo":
          JOptionPane.showMessageDialog(null, "Opción seleccionada: Realizar un préstamo");
          // TODAVIA NO SE IMPLEMENTA LA FUNCION
          break;

        case "2. Devolver un libro":
          JOptionPane.showMessageDialog(null, "Opción seleccionada: Devolver un libro");
          // TODAVIA NO SE IMPLEMENTA LA FUNCION
          break;

        case "3. Atrás":
          // Regresar al menú principal
          break;

        default:
          JOptionPane.showMessageDialog(null, "Opción no válida. Intenta de nuevo.");
          break;
      }
    }
  }

  public static void main(String[] args) {

    String opcion = "";

    while (opcion.equals("4. Salir") != true) {
      try {
        Object seleccion = JOptionPane.showInputDialog(
            null, "Escoja una opción", "Menú Biblioteca", JOptionPane.INFORMATION_MESSAGE,
            null, new Object[]{
                "1. Inventario",
                "2. Registrar un nuevo usuario",
                "3. Préstamos",
                "4. Salir"
            },
            "1. Inventario");

        if (seleccion == null) {

          break;
        }

        opcion = seleccion.toString();

        switch (opcion) {
          case "1. Inventario":
            mostrarMenuInventario();
            break;

          case "2. Registrar un nuevo usuario":
            JOptionPane.showMessageDialog(null, "Opción seleccionada: Registrar Usuario");
            // TODAVIA NO SE IMPLEMENTA LA FUNCION
            break;

          case "3. Préstamos":
            mostrarMenuPrestamos();
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