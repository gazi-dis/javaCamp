package eCommerce;

import java.util.ArrayList;

import eCommerce.business.abstracts.UserService;
import eCommerce.business.concretes.UserManager;
import eCommerce.core.concretes.GoogleServiceAdapter;
import eCommerce.core.concretes.UserInfoVerifyManager;
import eCommerce.core.concretes.UserSessions;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.dataAccess.concretes.HibernateUserDao;
import eCommerce.dataAccess.concretes.UserDatabase;
import eCommerce.entitites.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User("Abdurrahman","Gazi","deneme@gmail.com","parola123");
		
		UserService userService = new UserManager(new UserInfoVerifyManager(),new HibernateUserDao(),new UserSessions());
		userService.register(user);   //Üye kaydý
		userService.verifyLink(user); //Manuel eposta doðrulama
		userService.register(new User("Vera","Molera","deneme@gmail.com","password5464")); //Benzersiz email kontrol
		
		userService.login("deneme@gmail.com","parola1234"); //Hatalý giriþ
		userService.login("deneme@gmail.com","parola123");  //Baþarýlý giriþ
		
		GoogleServiceAdapter.login("deneme2@gmail.com","google123"); //Google ile üyelik & giriþ
		userService.login("deneme2@gmail.com","google123"); 
		
	}

}
