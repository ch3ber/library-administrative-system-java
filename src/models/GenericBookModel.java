package src.models;

public abstract class GenericBookModel {

	private String titulo;
	private String autor;
	private String categoria;
	private int cantidadCopias;
	private String ID;

	public GenericBookModel(String titulo, String autor, String ID, String categoria, int cantidadCopias) {
		this.titulo = titulo;
		this.autor = autor;
		this.ID = ID;
		this.categoria = categoria;
		this.cantidadCopias = cantidadCopias;
	}

	public String getAllInfo() {
		return titulo + "\n" + autor + "\n" + categoria + "\n" + cantidadCopias + "\n" + ID;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getID() {
		return ID;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getCantidadCopias() {
		return cantidadCopias;
	}

	public void setCantidadCopias(int cantidadCopias) {
		this.cantidadCopias = cantidadCopias;
	}
}
