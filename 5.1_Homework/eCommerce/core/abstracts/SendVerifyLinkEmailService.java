package eCommerce.core.abstracts;

import eCommerce.entitites.concretes.User;

public interface SendVerifyLinkEmailService {
	public static void sendLink(User user) {
		System.out.println("E maile doğrulama linki gönderildi->"+user.getEmail());
	}

	public static  void verifyLink(User user) {
		user.setVerified(true);
		System.out.println("Hesap onaylandı->"+user.getEmail());
	}
	
}
