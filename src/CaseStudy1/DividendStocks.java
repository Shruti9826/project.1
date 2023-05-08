package CaseStudy1;

public class DividendStocks extends Stocks{

    private double dividend; //amount of dividend paid

    public DividendStocks(String symbol, double currentPrice) {
        super(symbol, currentPrice);
        dividend = 0.0;
    }

    @Override
    public double getMarketValue() {
        return super.getMarketValue()+dividend;
    }
    //record the dividend of the given amount per share
    public void payDividend(double amountPerShare){
        dividend+= amountPerShare*getTotalCost();
    }
}

