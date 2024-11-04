package src.models;

public abstract class GenericBookModel {

	protected String titulo;
	protected String autor;
	protected String categoria;
	protected int cantidadCopias;
	protected String ID;

	public GenericBookModel(String titulo, String autor, String ID, String categoria, int cantidadCopias) {
		this.titulo = titulo;
		this.autor = autor;
		this.ID = ID;
		this.categoria = categoria;
		this.cantidadCopias = cantidadCopias;
	}

	public abstract String getAllInfo(); 
	

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
