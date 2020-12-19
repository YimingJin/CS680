package edu.umb.cs680.hw13;

public class StockEvent {
    private String ticker;
    private float quote;
    public StockEvent(String t, float q) {
        this.ticker = t;
        this.quote = q;
    }

    public void setQuote(float quote) {
        this.quote = quote;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public float getQuote()
    {
        return quote;
    }

    public String getTicker()
    {
        return ticker;
    }
}
