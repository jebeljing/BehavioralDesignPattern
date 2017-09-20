package com.pluralsight.mediator;

/**
 * Created by jingshanyin on 9/7/17.
 */
public class TurnOnAllLightsCommand implements Command {

    private Mediator med;

    public TurnOnAllLightsCommand(Mediator med) {
        this.med = med;
    }

    @Override
    public void execute() {
        med.turnOnAllLights();
    }
}
