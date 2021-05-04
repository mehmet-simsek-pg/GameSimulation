package entities;

public class Game {
    private int id;
    private double unitPrice, priceAfterCampaign;
    private String gameName;
    private Campaign campaign;

    public Game(int id, double unitPrice, String gameName, Campaign campaign) {
        setId(id);
        setUnitPrice(unitPrice);
        setGameName(gameName);
        setCampaign(campaign);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getPriceAfterCampaign() {
        return this.unitPrice - (this.unitPrice * (this.campaign.getDiscount() / 100));
    }

    public void setPriceAfterCampaign(double priceAfterCampaign) {
        this.priceAfterCampaign = priceAfterCampaign;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public Campaign getCampaign() {
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }
}
