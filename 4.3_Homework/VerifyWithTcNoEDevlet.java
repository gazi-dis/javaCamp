
public class VerifyWithTcNoEDevlet implements Verification {

	@Override
	public void verify(User user) {
		System.out.println("user verification is succesfull with tcNo. user_tcNo->"+user.getTcNo());
		
	}

}
