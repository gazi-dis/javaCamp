
public class VerifyWithNameEDevlet implements Verification{

	@Override
	public void verify(User user) {
		System.out.println("user verification is succesfull with name. user_name->"+user.getName());
	}

}
