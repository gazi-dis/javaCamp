
public class SaleManager {
	public static void pay(User user,Game game) {
		System.out.println("----------order----------");
		System.out.println("game_name->"+game.getName()+" ,game_price->"+game.getPrice());
		System.out.println("payment successfull");
		System.out.println("added "+game.getName()+" to user_name->"+user.getName()+" libraries");
	}
}
