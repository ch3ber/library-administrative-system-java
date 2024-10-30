package src.models;

public class SerialPosts extends GenericBook {
  private String ISSN; //EQUIVALENTE DE ISBN PARA REVISTAS , PERIODICOS , ETC.

  public SerialPosts(String titulo, String autor, String ISSN, String categoria, boolean disponible) {
    super(titulo, autor, categoria, disponible);
    this.ISSN = ISSN;
  }

  public String getISSN() {
    return ISSN;
  }

  public void setISSN(String ISSN) {
    this.ISSN = ISSN;
  }
}
