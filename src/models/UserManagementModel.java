package src.models;

import java.util.ArrayList;

import src.utils.BookSearchType;
import src.utils.UserSearchType;

public class UserManagementModel {
	 private static UserManagementModel instance;
	  private ArrayList<UserModel> users = new ArrayList<>();
	  
	  //Singleton
	  public static UserManagementModel getInstance() {
	    if (instance == null) {
	      instance = new UserManagementModel();
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
	  
	  // Method to update the details of a user by its ID
	  public void updateUser(String newName, String ID, String newID) {
	    // Find the book by ID and if found, update its details
	   UserModel user = findUser(ID, UserSearchType.ID);
	    if (user != null) {
	      user.setNombre(newName); // Update the name
	      user.setID(newID); // Update the ID
	    

	  }
}
}
