package src.models;

public class SerialPostsModel extends GenericBookModel {
	// EQUIVALENTE DE ISBN PARA REVISTAS , PERIODICOS , ETC.

	public SerialPostsModel(String titulo, String autor, String ISSN, String categoria, int cantidadCopias) {
		super(titulo, autor, ISSN, categoria, cantidadCopias);

	}

	public String getAllInfo() {
		return "Titulo: " + titulo + "\n" + "Autor: " + autor + "\n" + "Categoria: " + categoria + "\n"
				+ "Cantidad en Inventario: " + cantidadCopias + "\n" + "ISSN: " + ID;
	}
}
