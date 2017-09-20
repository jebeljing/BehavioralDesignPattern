package com.pluralsight.state;

/**
 * Created by jingshanyin on 9/8/17.
 */
public abstract class State {

    public void handleRequest() {
        System.out.println("Shouldn't be able to get here.");
    }
}
