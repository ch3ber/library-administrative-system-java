package src.views;

/**
 * @author Eber Alejo
 * Contiene los metodos para la creación de un menú estandar.
 */
public abstract class MenuView {

  /**
   * @author Eber Alejo
   * Este método se usa para mostrar el menú y devolver la opción
   * seleccionada por el usuario.
   * @return {Object} - retorna la opción seleccionada por el usuario.
   */
  public abstract Object selectOption ();
}
