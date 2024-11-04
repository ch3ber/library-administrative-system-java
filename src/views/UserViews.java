package src.views;

import javax.swing.JOptionPane;

public class UserViews {

	public void showAllInfo(String bookInfo) {
		JOptionPane.showMessageDialog(null, bookInfo);
	}
	
	public Object selectMenuOption() {
	    return JOptionPane.showInputDialog(
	        null,
	        "Escoja una opción",
	        "Menú de Usuarios",
	        JOptionPane.INFORMATION_MESSAGE,
	        null, new Object[]{
	            "Buscar por ID",
	            "Buscar por Nombre",
	            "Agregar un nuevo usuario",
	            "Actualizar un Usuario (ID)",
	            "Eliminar un Usuario (ID)",
	            "Atrás"
	        },
	        "Buscar por ID");
	  }

}
