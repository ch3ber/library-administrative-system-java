package src.models;

public class SerialPostsModel extends GenericBookModel {
  //EQUIVALENTE DE ISBN PARA REVISTAS , PERIODICOS , ETC.

  public SerialPostsModel(String titulo, String autor, String ISSN, String categoria, boolean disponible) {
    super(titulo, autor, ISSN, categoria, disponible);

  }
}
