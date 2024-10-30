package gestionBiblioteca;

public class PublicacionSerial extends LibroGenerico {

	private String ISSN; //EQUIVALENTE DE ISBN PARA REVISTAS , PERIODICOS , ETC.

    public PublicacionSerial(String titulo, String autor, String ISSN, String categoria, boolean disponible) {
        super(titulo, autor, categoria, disponible); 
        this.ISSN = ISSN;
    }

    public String getISSN() {return ISSN;}

    public void setISSN(String ISSN) {this.ISSN = ISSN;}
}
