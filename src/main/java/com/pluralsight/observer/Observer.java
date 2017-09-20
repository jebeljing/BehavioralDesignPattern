package com.pluralsight.observer;

/**
 * Created by jingshanyin on 9/8/17.
 */
public abstract class Observer {

    protected Subject subject;
    abstract void update();
}
