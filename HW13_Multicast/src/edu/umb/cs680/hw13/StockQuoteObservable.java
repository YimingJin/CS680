package edu.umb.cs680.hw13;

import java.util.ArrayList;

public class StockQuoteObservable {
    public ArrayList<StockQuoteObserver> observers = new ArrayList<StockQuoteObserver>();
    private boolean changed;
    public void addObserver(StockQuoteObserver observer) {
        this.observers.add(observer);
    }
    public void setChanged() {
        this.changed = true;
    }
    public boolean hasChanged() {
        return this.changed;
    }
    public void clearChanged() {
        this.changed = false;
    }
    public void notifyObservers(StockEvent obj) {
        if (hasChanged()) {
            for (StockQuoteObserver stock : this.observers) {
                stock.updateStock(obj);
            }
            clearChanged();
        }
    }
    public void changeQuote(String t, float q) {
        setChanged();
        notifyObservers(new StockEvent(t, q));
    }
}
