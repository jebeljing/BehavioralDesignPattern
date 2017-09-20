package com.pluralsight.mediator;

/**
 * Created by jingshanyin on 9/7/17.
 */
public class Light {

    private boolean isOn = false;

    private String location = "";

    public Light() {

    }

    public Light(String location) {
        this.location = location;
    }

    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        if (isOn) {
            off();
            isOn = false;
        } else {
            on();
            isOn = true;
        }
    }

    public void off() {
        System.out.println(location + " Light switched off.");
    }

    public void on() {
        System.out.println(location + " Light switched on.");
    }
}
