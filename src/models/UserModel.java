package src.models;

public class UserModel {
	//WIP WAY TO COUNT LOANED BOOKS
	protected String nombre;
	protected String ID;
	protected double accumulatedFees; 



	public UserModel(String nombre, String ID) {
		this.nombre = nombre;

		this.ID = ID;
		
		this.accumulatedFees=0;

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
	
	public double getAccumulatedFees() {
		return accumulatedFees;
	}
	
	public void setAccumulatedFees(double Fee) {
		this.accumulatedFees += Fee;
	}
	public String getAllInfo() {
		return "Nombre: " + nombre + "\n" + "ID: " + ID+ "\n"+ "Multas Acumuladas: $ "+accumulatedFees+"\n"+"Prestamos: "+"\n";

	}

}
