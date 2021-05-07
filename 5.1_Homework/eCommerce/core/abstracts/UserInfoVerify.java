package eCommerce.core.abstracts;

import eCommerce.entitites.concretes.User;

public interface UserInfoVerify {
	boolean checkInputs(User user);
	boolean checkNameSurname(User user);
	boolean checkPassword(User user);
	boolean checkEmail(User user);
	boolean checkAll(User user);
}
