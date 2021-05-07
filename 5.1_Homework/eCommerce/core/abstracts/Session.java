package eCommerce.core.abstracts;

import eCommerce.entitites.concretes.User;

public interface Session {
	User checkLogin(String email,String password);
	boolean checkVerified(User user);
	
}
