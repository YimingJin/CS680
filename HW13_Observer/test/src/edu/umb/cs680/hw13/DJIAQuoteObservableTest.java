package edu.umb.cs680.hw13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DJIAQuoteObservableTest {
    PiechartObserver PiechartObserver = new PiechartObserver();
    TableObserver TableObserver = new TableObserver();
    ThreeDObserver THREEDObserver = new ThreeDObserver();
    StockQuoteObservable stockMulticast = new StockQuoteObservable();
    DJIAQuoteObservable djiaObserver = new DJIAQuoteObservable();
    @Test
    public void DjiaQuoteTest() {
        djiaObserver.addObserver(PiechartObserver);
        djiaObserver.addObserver(TableObserver);
        djiaObserver.addObserver(THREEDObserver);
        djiaObserver.changeQuote(100);
        djiaObserver.changeQuote(200);
    }
}