package src.services;

import java.util.ArrayList;

import src.models.UserModel;
import src.utils.UserSearchType;



public class UserService {

	 private static UserService instance;
	  private ArrayList<UserModel> users = new ArrayList<>();
	  
  //Singleton
  public static UserService getInstance() {
    if (instance == null) {
      instance = new UserService();
    }
    return instance;
  }

  // Method to add a book or publication to the library
  public void addUser(UserModel user) {
    users.add(user);
  }

  // Method to find a book or publication by author, ID, or title
  public UserModel findUser(String query, UserSearchType searchType) {
    for (UserModel user : users) {
      switch (searchType) {
        case NAME:
          if (user.getNombre().equals(query)) {
            return user; // Match by author
          }
          break;
        case ID:
          if (user.getID().equals(query)) {
            return user; // Match by ID
          }
          break;
        default:
          break; // Default case, should not be reached
      }
    }
    return null; // Return null if no match is found
  }

	private boolean findUserByIndex (String userIdToFind) {
		UserModel user = findUser(userIdToFind, UserSearchType.ID);
		if (user == null) return false;
		return users.remove(user);
	}

  // Method to update the details of a user by its ID
  public void updateUser(String newName, String ID, String newID) {
    // Find the book by ID and if found, update its details
    UserModel user = findUser(ID, UserSearchType.ID);
    if (user != null) {
      user.setNombre(newName); // Update the name
      user.setID(newID); // Update the ID


    }
  }

	public boolean deleteUser(String ID) {
		// Find the book by ID and if found delete the user
		return findUserByIndex(ID);

	}
}
