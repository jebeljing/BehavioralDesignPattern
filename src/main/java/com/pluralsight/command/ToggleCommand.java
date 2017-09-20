package com.pluralsight.command;

/**
 * Created by jingshanyin on 9/6/17.
 */
public class ToggleCommand implements Command {

    private Light light;

    public ToggleCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.toggle();
    }
}
