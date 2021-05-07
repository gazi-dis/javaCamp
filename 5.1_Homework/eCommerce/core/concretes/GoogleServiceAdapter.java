package eCommerce.core.concretes;

import eCommerce.business.abstracts.UserService;
import eCommerce.business.concretes.UserManager;
import eCommerce.dataAccess.concretes.HibernateUserDao;
import eCommerce.entitites.concretes.User;
import eCommerce.loginWithGoogle.LoginWithGoogleService;

public class GoogleServiceAdapter{
	public static void login(String email,String password) {
		LoginWithGoogleService loginWithGoogleService = new LoginWithGoogleService();
		String[] userInfo = loginWithGoogleService.login(email,password);
		UserService userService = new UserManager(new UserInfoVerifyManager(),new HibernateUserDao(),new UserSessions());
		userService.register(new User(userInfo[0],userInfo[1],userInfo[2],userInfo[3]));
	}
}
