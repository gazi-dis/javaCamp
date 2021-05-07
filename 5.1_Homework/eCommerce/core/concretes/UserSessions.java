package eCommerce.core.concretes;

import java.util.ArrayList;

import eCommerce.core.abstracts.Session;
import eCommerce.dataAccess.concretes.UserDatabase;
import eCommerce.entitites.concretes.User;

public class UserSessions implements Session {
	
	ArrayList<User> users = UserDatabase.getUsers();

	@Override
	public User checkLogin(String email, String password) {
		for (User user : users) {
			if (email.equals(user.getEmail())) {
				if (password.equals(user.getPassword()))
					return user;
			}
		}
		return null;
	}

	@Override
	public boolean checkVerified(User user) {
		return user.getisVerified();	
	}
	 

}
