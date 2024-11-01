package src.models;

public class UserModel {
	//WIP WAY TO COUNT LOANED BOOKS
	protected String nombre;
	protected String ID;


	public UserModel(String nombre, String ID) {
		this.nombre = nombre;

		this.ID = ID;

	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
	
	public String getAllInfo() {
		return "Nombre: " + nombre + "\n" + "ID: " + ID+ "\n"+ "Prestamos: ";

	}

}
