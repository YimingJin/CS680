package edu.umb.cs680.hw13;

public class ThreeDObserver implements DJIAQuoteObserver, StockQuoteObserver {
    public void updateStock(StockEvent arg) {
        StockEvent stockEvent = (StockEvent) arg;
        System.out.println("3DObserver: ticker = " + stockEvent.getTicker() + " quote = " + stockEvent.getQuote());
    }
    public void updateDJIA(DJIAEvent arg) {
        DJIAEvent djiaEvent = (DJIAEvent) arg;
        System.out.println("3DObserver: " + djiaEvent.getDjia());
    }
}
