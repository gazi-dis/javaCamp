
public class GameManager {
	public static void add(Game game) {
		System.out.println("added game to store. game_name->"+game.getName());
	}
	
	public static void delete(Game game) {
		game=null;
		System.out.println("deleted game in store");
	}
	
	public static void update(Game game,String name,int price,int campaignId) {
		game.setName(name);
		game.setPrice(price);
		game.setCampaignId(campaignId);
	}
}
