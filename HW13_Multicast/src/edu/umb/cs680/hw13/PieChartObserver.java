package edu.umb.cs680.hw13;

public class PieChartObserver implements DJIAQuoteObserver, StockQuoteObserver {
    public void updateStock(StockEvent obj) {
        StockEvent stockEvent = (StockEvent) obj;
        System.out.println("PieChart: ticker = " + stockEvent.getTicker() + " quote = " + stockEvent.getQuote());
    }
    public void updateDJIA(DJIAEvent obj) {
        DJIAEvent djiaEvent = (DJIAEvent) obj;
        System.out.println("PieChart: " + djiaEvent.getDjia());
    }
}
