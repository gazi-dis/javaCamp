
public class Main {

	public static void main(String[] args) {
		User user = new User(1,"Abdurrahman Gazi","deneme@gmail.com","123456789");
		User user2 = new User(2,"Junior Sanchez","deneme2@gmail.com","987654321");
		
		Game game = new Game(1,"GTA5",100,0);
		Game game2 = new Game(2,"GTA4",50,0);
		
		GameManager.add(game);
		GameManager.add(game2);
		
		GameManager.update(game2,"Gta3",30,0);
		
		Campaign campaign = new Campaign(1,"Big Gta5 Campaign for Today",50);
		Campaign campaign2 = new Campaign(2,"Small Gta4 Campaign for Today",10);
		
		UserManager userManager = new UserManager(new VerifyWithTcNoEDevlet());
		userManager.registerUser(user);
		userManager.registerUser(user2);
		userManager.updateUser(user2,"Bernardo Felix","deneme2@gmail.com","987654321");
		
		CampaignManager.add(campaign,game);
		CampaignManager.update(campaign2,"Gta3",20);
		CampaignManager.add(campaign2,game2);
		
		SaleManager.pay(user,game);
		SaleManager.pay(user,game2);
		SaleManager.pay(user2,game2);
		
		userManager.deleteUser(user2);
		GameManager.delete(game2);
		CampaignManager.delete(campaign2,game2);
		
		
		
		

	}

}
