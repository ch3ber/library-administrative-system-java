package gestionBiblioteca;

/**
 * Clase que representa un libro específico, se utiliza ISBN como identificador.
 */

public class Libro extends LibroGenerico{

	private String ISBN;
	
    /**
     * Constructor de la clase Libro
     * @param titulo El título del libro
     * @param autor El autor del libro
     * @param ISBN El ISBN del libro
     * @param categoria La categoría del libro
     * @param disponible Indica si el libro está disponible para préstamo
     */


    public Libro(String titulo, String autor, String ISBN, String categoria, boolean disponible) {
        super(titulo, autor, categoria, disponible); 
        this.ISBN = ISBN;
    }

    public String getISBN() {return ISBN;}

    public void setISBN(String ISBN) {this.ISBN = ISBN;}
    
}
