package eCommerce.business.abstracts;

import eCommerce.entitites.concretes.User;

public interface UserService {
	void register(User user);
	void login(String email,String password);
	void logout(User user);
	void deleteUser(User user);
	void updateUser(User user);
	void verifyLink(User user);
}
