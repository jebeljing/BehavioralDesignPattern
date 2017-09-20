package com.pluralsight.command;

/**
 * Created by jingshanyin on 9/6/17.
 */
public class OnCommand implements Command {

    private Light light;

    public OnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
