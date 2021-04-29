
public class StudentManager extends UserManager{
	@Override
	public void login() {
		System.out.println("student login successful");
	}
	@Override
	public void logout() {
		System.out.println("student logout successful");
	}
	@Override
	public void giveStatic() {
		System.out.println("student users statics");
	}
}
