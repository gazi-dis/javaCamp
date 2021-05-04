
public class Game {
	private int id;
	private String name;
	private double price;
	private int campaignId;
	
	public Game() {}

	public Game(int id, String name, double price, int campaignId) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.campaignId = campaignId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	};
	
	
	
	
	
	
	
	
	
	
}
