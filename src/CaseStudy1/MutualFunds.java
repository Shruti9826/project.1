package CaseStudy1;

public class MutualFunds extends ShareAsset implements Asset{

    private double totalShares;

    public MutualFunds(String symbol, double currentPrice) {
        super(symbol, currentPrice);
        totalShares = 0.0;
    }

    @Override
    public double getMarketValue() {
        return totalShares*currentPrice;
    }

    public double getTotalShares() {
        return totalShares;
    }

    //record purchase at the given share at the given price
    public void Purchase(double shares,double pricePerShares ){
        totalShares +=shares;
        addCost(shares*pricePerShares);
    }
}
