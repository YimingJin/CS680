package edu.umb.cs680.hw13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockQuoteObservableTest {
    PiechartObserver PiechartObserver = new PiechartObserver();
    TableObserver TableObserver = new TableObserver();
    ThreeDObserver THREEDObserver = new ThreeDObserver();
    StockQuoteObservable stockObserver = new StockQuoteObservable();
    DJIAQuoteObservable djiaObserver = new DJIAQuoteObservable();
    @Test
    public void DstockQuoteTest() {
        stockObserver.addObserver(PiechartObserver);
        stockObserver.addObserver(TableObserver);
        stockObserver.addObserver(THREEDObserver);
        stockObserver.changeQuote("Tom", 100);
        stockObserver.changeQuote("Jim", 200);
    }
}