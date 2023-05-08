package CaseStudy1;

public abstract class ShareAsset implements Asset{

    //this is redundant coding

    public String symbol;
    public double totalCost;
    public double currentPrice;

    public ShareAsset(String symbol, double currentPrice) {
        this.symbol = symbol;
        this.currentPrice = currentPrice;
        totalCost = 0.0;
    }
    //add a cost of given amount to this asset
    public void addCost(double Cost){
        totalCost+=Cost;
    }

    //return a price per share of this asset


    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getTotalCost() {
        return totalCost;
    }
    //return the current market value of the asset
    public abstract double getMarketValue();

    //return the profit earned on shares of this asset
    public double getProfit(){
        //calls an abstract getMarketValue method
        return getMarketValue() - totalCost;
    }
}
