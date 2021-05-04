
public class CampaignManager {
	public static void add(Campaign campaign,Game game) {
		game.setCampaignId(campaign.getId());
		game.setPrice(CampaignManager.calculateDiscount(game.getPrice(),campaign.getDiscountPercentage()));
		System.out.println("added campaign succesfully to "+game.getName()+". campaign_name->"+campaign.getCampaignName());
		System.out.println(game.getName()+" game new price with campaign->"+game.getPrice());
	}
	
	public static void update(Campaign campaign,String name,int discountPercentage) {
		campaign.setCampaignName(name);
		campaign.setDiscountPercentage(discountPercentage);
	}
	
	public static void delete(Campaign campaign,Game game) {
		game.setCampaignId(0);
		System.out.println("campaign deleted successfully");
	}
	
	public static double calculateDiscount(double price,double discountPercentage) {
		return price-(price*(discountPercentage/100));
	}
}
