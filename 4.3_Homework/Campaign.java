
public class Campaign {
	private int id;
	private String campaignName;
	private double discountPercentage;
	
	public Campaign(int id, String campaignName, double discountPercentage) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discountPercentage = discountPercentage;
	}
	
	public Campaign() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	
	
	
	
	
	
}
