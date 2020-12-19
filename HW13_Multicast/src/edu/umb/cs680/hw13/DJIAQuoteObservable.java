package edu.umb.cs680.hw13;

import java.util.LinkedList;

public class DJIAQuoteObservable {
    public LinkedList<DJIAQuoteObserver> observer = new LinkedList<DJIAQuoteObserver>();
    private boolean changed;
    public void addObserver(DJIAQuoteObserver observer) {
        this.observer.add(observer);
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
    public void notifyObservers(DJIAEvent obj) {
        if (hasChanged()) {
            for (DJIAQuoteObserver DJIA: this.observer) {
                DJIA.updateDJIA(obj);
            }
            clearChanged();
        }
    }
    public void changeQuote(float q) {
        setChanged();
        notifyObservers(new DJIAEvent(q));
    }
}
