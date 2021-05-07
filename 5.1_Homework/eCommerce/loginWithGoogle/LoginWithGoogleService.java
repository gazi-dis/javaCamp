package eCommerce.loginWithGoogle;

public class LoginWithGoogleService {
	public String[] login(String email,String password) {
		String name = "Alex De",surName = "Morgan"; //Google login api Simule ediliyor
		String[] userInfo = {name,surName,email,password};
		return userInfo;
	}
}
