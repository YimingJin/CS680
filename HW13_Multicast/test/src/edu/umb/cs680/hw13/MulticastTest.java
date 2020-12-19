package edu.umb.cs680.hw13;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MulticastTest {
    PieChartObserver piechartObserver = new PieChartObserver();
    TableObserver tableObserver = new TableObserver();
    ThreeDObserver THREEDObserver = new ThreeDObserver();
    StockQuoteObservable stockMulticast = new StockQuoteObservable();
    DJIAQuoteObservable djiaMulticast = new DJIAQuoteObservable();
    @Test
    public void DJIATest() {
        djiaMulticast.addObserver(piechartObserver);
        djiaMulticast.addObserver(tableObserver);
        djiaMulticast.addObserver(THREEDObserver);
        djiaMulticast.changeQuote(100);
        djiaMulticast.changeQuote(200);
    }
    @Test
    public void verifyStock() {
        stockMulticast.addObserver(piechartObserver);
        stockMulticast.addObserver(tableObserver);
        stockMulticast.addObserver(THREEDObserver);
        stockMulticast.changeQuote("Tom", 100);
        stockMulticast.changeQuote("Jim", 200);
    }
}
