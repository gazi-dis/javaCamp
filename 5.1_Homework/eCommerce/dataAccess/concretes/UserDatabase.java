package eCommerce.dataAccess.concretes;

import java.util.ArrayList;

import eCommerce.entitites.concretes.User;

public class UserDatabase {
	static ArrayList<User> users = new ArrayList<User>();

	public static ArrayList<User> getUsers() {
		return users;
	}

	public static void setUsers(ArrayList<User> users) {
		UserDatabase.users = users;
	}
	
	
}
