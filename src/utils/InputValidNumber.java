package src.utils;

public class InputValidNumber extends Entrada {
  private static boolean isValid;

  public static int typeInt () {
    isValid = false;
    int number = 0;

    while (!isValid) {
      try {
        number = Entrada.entero();
        isValid = true;
      } catch (Exception e) {
        System.out.println("[ERROR] El valor ingresado no es un numero entero.");
        System.out.print("Intenta de nuevo: ");
      }
    }

    return number;
  }

  public static double typeDouble () {
    isValid = false;
    double number = 0;

    while (!isValid) {
      try {
        number = Entrada.real();
        isValid = true;
      } catch (Exception e) {
        System.out.println("[ERROR] El valor ingresado no es un numero con o sin decimales.");
        System.out.print("Intenta de nuevo: ");
      }
    }

    return number;
  }
}
