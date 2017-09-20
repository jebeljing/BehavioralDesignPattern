package com.pluralsight.state;

/**
 * Created by jingshanyin on 9/8/17.
 */
public class FanLowState extends State {

    private Fan fan;

    public FanLowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to med.");
        fan.setState(fan.getFanMedState());
    }

    public String toString() {
        return "Fan is low.";
    }
}
