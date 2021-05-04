
public class UserManager {
	Verification verification;
	
	public UserManager(Verification verification) {
		this.verification=verification;
	}
	
	public void registerUser(User user) {
		verification.verify(user);
		System.out.println("user register is succesfull. user_name->"+user.getName());
	}
	
	public void deleteUser(User user) {
		user = null;
		System.out.println("user delete proccess is succesfull");
	}
	
	public void updateUser(User user,String name,String email,String tcNo) {
		user.setName(name);
		user.setEmail(email);
		user.setTcNo(tcNo);
	}
}
