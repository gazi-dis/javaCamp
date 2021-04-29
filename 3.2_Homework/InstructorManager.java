
public class InstructorManager extends UserManager {
	@Override
	public void login() {
		System.out.println("instructor login successful");
	}
	@Override
	public void logout() {
		System.out.println("instructor logout successful");
	}
	@Override
	public void giveStatic() {
		System.out.println("instructor users statics");
	}
	
}
