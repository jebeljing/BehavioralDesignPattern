package com.pluralsight.mediator;

/**
 * Created by jingshanyin on 9/7/17.
 */
public class TurnOffAllLightsCommand implements Command {

    private Mediator med;

    public TurnOffAllLightsCommand(Mediator med) {
        this.med = med;
    }

    @Override
    public void execute() {
        med.turnOffAllLights();
    }
}
