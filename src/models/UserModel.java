package src.models;

import src.services.LoanService;

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
	 public String getAllInfo() { /////PASARLO AL SERVICIO
	        String info = "Nombre: " + nombre + "\n";
	        info += "ID: " + ID + "\n";
	        info += "Multas Acumuladas: $ " + accumulatedFees + "\n";
	        info += "Préstamos:\n";

	        List<LoanModel> userLoans = LoanService.getInstance().getLoansByUser(this);
	        if (userLoans.isEmpty()) {
	            info += "No hay préstamos activos.\n";
	        } else {
	            for (LoanModel loan : userLoans) {
	                info += "- Libro: " + loan.getBook().getTitulo() +
	                        ", Fecha de Préstamo: " + loan.getLoanDate() +
	                        ", Fecha de Devolución: " + loan.getDueDate() +
	                        ", Devuelto: " + (loan.isReturned() ? "Sí" : "No") +
	                        ", Multas: $" + loan.getTotalLateFees() + "\n";
	            }
	        }

	        return info;
	    }

}
