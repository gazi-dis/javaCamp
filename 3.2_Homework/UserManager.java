
public class UserManager {
	public void login() {
		System.out.println("login successful");
	}
	
	public void logout() {
		System.out.println("logout successful");
	}
	
	public void addUser(User user) {
		System.out.println("Add successfully. Name is->"+user.getName());
	}
	
	public void giveStatic() {
		System.out.println("All user statics");
	}
	
	public void giveStatics(UserManager userManager) {
		System.out.println("give statics");
		userManager.giveStatic();
	}
	

}
