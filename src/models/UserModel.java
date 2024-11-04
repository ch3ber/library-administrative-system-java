package src.models;

import java.util.ArrayList;

public class UserModel {
	protected String nombre;
	protected String ID;
	protected double totalLateFees;
	private ArrayList<LoanModel> prestamos;  // Lista de préstamos

	public UserModel(String nombre, String ID) {
		this.nombre = nombre;
		this.ID = ID;
		this.totalLateFees = 0;
		this.prestamos = new ArrayList<>();
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

	public double getTotalLateFees() {
		return totalLateFees;
	}

	public void addLateFee(double fee) {
		this.totalLateFees += fee;
	}

	public void addLoan(LoanModel loan) {
		prestamos.add(loan);
	}

	public String getAllInfo() {
		String info = "Nombre: " + nombre + "\n" + "ID: " + ID + "\n" + "Multas Acumuladas: " + totalLateFees + "\n" + "Préstamos: \n";
		for (LoanModel loan : prestamos) {
			info += loan.getLoanInfo();
		}
		return info;
	}
}
