package src.controllers;

import javax.swing.JOptionPane;

import src.services.UserService;
import src.models.UserModel;
import src.utils.UserSearchType;
import src.views.UserViews;

public class UserController {
	UserService userService = UserService.getInstance();
	UserViews userView = new UserViews();

	private void handleFind(String queryId, UserSearchType userSearchType) {
		UserModel foundUser = userService.findUser(queryId, userSearchType);
		if (foundUser == null) {
			JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
			return;
		}
		userView.showAllInfo(foundUser.getAllInfo());
	}

	public void evalOption(Object selectedOption) {
		String parsedSelectedOption = "";

		while (!parsedSelectedOption.equals("Atrás")) {
			// the user select's cancel button
			if (selectedOption == null)
				break;

			// if the user no cancel, parse the option from selected option
			parsedSelectedOption = selectedOption.toString();

			// var for find user
			String queryId;

			// vars for add user
			String name;
			String id;
			// vars for update user
			String newName;
			String newID;

			switch (parsedSelectedOption) {
			case "Buscar por ID":
				queryId = JOptionPane.showInputDialog(null, "Ingresa el ID", "");
				this.handleFind(queryId, UserSearchType.ID);
				parsedSelectedOption = "Atrás";
				break;

			case "Buscar por Nombre":
				queryId = JOptionPane.showInputDialog(null, "Ingresa el Nombre", "");
				this.handleFind(queryId, UserSearchType.NAME);
				parsedSelectedOption = "Atrás";
				break;

			case "Agregar un nuevo usuario":
				name = JOptionPane.showInputDialog(null, "Ingresa el Nombre", "");
				id = JOptionPane.showInputDialog(null, "Ingresa el ID", "");

				userService.addUser(new UserModel(name, id));
				parsedSelectedOption = "Atrás";
				break;

			case "Actualizar un Usuario (ID)":
				id = JOptionPane.showInputDialog(null, "Ingresa el ID", "");
				newName = JOptionPane.showInputDialog(null, "Ingresa el Nuevo Nombre", "");
				newID = JOptionPane.showInputDialog(null, "Ingresa el Nuevo ID", "");
				userService.updateUser(newName, id, newID);
				parsedSelectedOption = "Atrás";
				break;
			case "Eliminar un Usuario (ID)":
				id = JOptionPane.showInputDialog(null, "Ingresa el ID", "");
				boolean isUserRemoved = userService.deleteUser(id);
				if (!isUserRemoved) {
					JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
					return;
				}
				JOptionPane.showMessageDialog(null, "Usuario borrado existosamente.");
				parsedSelectedOption = "Atrás";
				break;
			case "Atrás":
				parsedSelectedOption = "Atrás";
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opción no válida. Intenta de nuevo.");
				break;
			}
		}
	}

}
