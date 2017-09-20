package com.pluralsight.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jingshanyin on 9/8/17.
 */
public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    abstract void setState(String state);
    abstract String getState();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
