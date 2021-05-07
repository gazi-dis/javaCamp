package eCommerce.core.concretes;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerce.core.abstracts.UserInfoVerify;
import eCommerce.dataAccess.concretes.HibernateUserDao;
import eCommerce.dataAccess.concretes.UserDatabase;
import eCommerce.entitites.concretes.User;

public class UserInfoVerifyManager implements UserInfoVerify {
	static ArrayList<User> users;
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);
	
	public UserInfoVerifyManager() {
		super();
		users = UserDatabase.getUsers();
	}
	

	@Override
	public boolean checkInputs(User user) {
		if (user.getName().isBlank() || user.getSurName().isBlank() || user.getEmail().isBlank() || user.getPassword().isBlank()) {
			System.out.println("Lütfen tüm üye bilgileri eksiksiz giriniz");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkNameSurname(User user) {
		if (user.getName().length()<2 || user.getSurName().length()<2) {
			System.out.println("Ýsim ve soyisim en az 2 karakter olmalý");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkPassword(User user) {
		if(user.getPassword().length()<6) {
			System.out.println("Parola en az 6 karakter olmalý");
			return false;
		}	
		return true;
	}

	@Override
	public boolean checkEmail(User user1) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(user1.getEmail());
		if (!matcher.find()) {
			System.out.println("Hatalý eposta formatý");
			return false;
		}
		for (User user : users) {
			if (user.getEmail().equals(user1.getEmail())) {
				System.out.println("Bu email zaten kullanýmda");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkAll(User user) {
		if (checkInputs(user) && checkNameSurname(user) && checkEmail(user) && checkPassword(user)) {
			return true;
		}
		return false;
	}
	
	


}
