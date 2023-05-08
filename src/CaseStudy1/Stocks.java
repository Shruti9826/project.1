package CaseStudy1;

public class Stocks extends ShareAsset {

    private int totalShare;
    public Stocks(String symbol, double currentPrice) {
        super(symbol, currentPrice);
        totalShare = 0;
    }

    @Override
    public double getMarketValue() {
        return totalShare*currentPrice;
    }



    public Stocks(String symbol, double currentPrice, int totalShare) {
        super(symbol, currentPrice);
        this.totalShare = totalShare;
    }
    //records the purchase of the given number of shares of the stock at the given price per share
    public void purchase(int shares ,int pricePerShares){
        totalShare+=shares;
        addCost(shares*pricePerShares);
    }
}
