package eCommerce.business.concretes;

import eCommerce.business.abstracts.UserService;
import eCommerce.core.abstracts.SendVerifyLinkEmailService;
import eCommerce.core.concretes.UserInfoVerifyManager;
import eCommerce.core.concretes.UserSessions;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.dataAccess.concretes.HibernateUserDao;
import eCommerce.entitites.concretes.User;

public class UserManager implements UserService{
	
	UserInfoVerifyManager userInfoVerifyManager;
	HibernateUserDao hibernateUserDao;
	UserSessions userSessions;
	
	public UserManager(UserInfoVerifyManager userInfoVerifyManager,HibernateUserDao hibernateUserDao,UserSessions userSessions) {
		super();
		this.userInfoVerifyManager = userInfoVerifyManager;
		this.hibernateUserDao = hibernateUserDao;
		this.userSessions = userSessions;
	}

	@Override
	public void register(User user) {
		if (userInfoVerifyManager.checkAll(user)) {
			//System.out.println("Eksiksiz �ye bilgileri girildi");
			hibernateUserDao.add(user);
			SendVerifyLinkEmailService.sendLink(user);
		}
	}

	@Override
	public void login(String email,String password) {
		User session = userSessions.checkLogin(email,password);
		if (session!=null) {
			if (userSessions.checkVerified(session)) {
				System.out.println("Ba�ar�l� bir �ekilde giri� yap�ld�->"+session.getEmail());
			}else {
				System.out.println("E mail do�rulama i�lemi tamamlanmam��");
			}
		}else {
			System.out.println("Hatal� eposta veya �ifre");
		}
	}
	
	@Override
	public void logout(User user) {
		System.out.println("Sistemden ��k�� yap�ld�->"+user.getEmail());
		
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyLink(User user) {
		SendVerifyLinkEmailService.verifyLink(user);
	}

}
