package edu.umb.cs680.hw13;

public class TableObserver implements DJIAQuoteObserver, StockQuoteObserver {
    public void updateStock(StockEvent obj) {
        StockEvent stockEvent = (StockEvent) obj;
        System.out.println("TableChart: ticker = " + stockEvent.getTicker() + " quote = " + stockEvent.getQuote());
    }
    public void updateDJIA(DJIAEvent obj) {
        DJIAEvent djiaEvent = (DJIAEvent) obj;
        System.out.println("TableChart: " + djiaEvent.getDjia());
    }
}
