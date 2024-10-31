package src.models;

public abstract class GenericBookModel {

  private String titulo;
  private String autor;
  private String categoria;
  private boolean disponible;
  private String ID;

  public GenericBookModel(String titulo, String autor, String ID, String categoria, boolean disponible) {
    this.titulo = titulo;
    this.autor = autor;
    this.ID = ID;
    this.categoria = categoria;
    this.disponible = disponible;
  }

  public String getTitulo() {
    return titulo;
  }
  
  public String getID() {
	    return ID;
	  }

//  public void setTitulo(String titulo) {
//    this.titulo = titulo;
//  }

  public String getAutor() {
    return autor;
  }

//  public void setAutor(String autor) {
//    this.autor = autor;
//  }

  public String getCategoria() {
    return categoria;
  }

//  public void setCategoria(String categoria) {
//    this.categoria = categoria;
//  }

  public boolean isDisponible() {
    return disponible;
  }

//  public void setDisponible(boolean disponible) {
//    this.disponible = disponible;
//  }
}
