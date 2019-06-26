package org.opensource.demo.observer;

public interface Topic {

    public void addObserver(Observer observer);
    public void deleteObserver(Observer observer);
    public void notifyObservers();
}
