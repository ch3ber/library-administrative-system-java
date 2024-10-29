package src.utils;

import java.io.*;

public class Entrada {
  public static String inicializar() {
    String buzon = "";
    InputStreamReader flujo = new InputStreamReader(System.in);
    BufferedReader teclado = new BufferedReader(flujo);
    try {
      buzon = teclado.readLine();
    } catch (Exception e) {
      System.out.append("Entrada incorrecta)");
    }
    return buzon;
  }

  public static int entero() {
    return Integer.parseInt(inicializar());
  }

  public static double real() {
    return Double.parseDouble(inicializar());
  }

  public static String cadena() {
    return inicializar();
  }

  public static char caracter() {
    String valor = inicializar();
    return valor.charAt(0);
  }
}
